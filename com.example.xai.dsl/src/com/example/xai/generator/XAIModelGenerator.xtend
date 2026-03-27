package com.example.xai.generator

import com.example.xai.model.explainableAI.Model
import com.example.xai.model.explainableAI.Dataset
import com.example.xai.model.xaiConfig.Configuration
import com.example.xai.model.xaiConfig.AIModel
import com.example.xai.model.xaiConfig.ExplanationMethod
import com.example.xai.generator.templates.UserPrefs
import com.example.xai.generator.templates.LimeTemplate
import com.example.xai.generator.templates.ShapTemplate
import com.example.xai.generator.templates.PdpTemplate
import com.example.xai.generator.templates.IceTemplate
import com.example.xai.generator.templates.FeatureImportanceTemplate
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.List
import java.text.SimpleDateFormat
import java.util.Date
import com.example.xai.verification.OCLVerificationSupport

class XAIModelGenerator extends AbstractGenerator {

  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val configModel = ConfigurationCache.get(resource)

    for (m : resource.allContents.toIterable.filter(Model)) {
      val startTime = System.currentTimeMillis
      val report = new GenerationReport(m.name)
      report.info("Generation start: " + formatTimestamp(startTime))
	  OCLVerificationSupport.throwIfInvalid(m, "DSL model '" + m.name + "'")
		
      try {
        val modelName = m.name
        val modelTypeName = m.modelType
        val userSpec = m.user
        val userName = userSpec.name

        val modelConfig = ConfigurationCache.findModel(configModel, modelTypeName)
        if (modelConfig === null) {
          throw new IllegalArgumentException(
            "Unknown model type: " + modelTypeName + ". Please ensure it is defined in the configuration repository."
          )
        }
        report.info("Resolved AI model: " + modelConfig.name)
        if (modelConfig.trainingPolicy !== null) {
          report.info("Training policy: " + modelConfig.trainingPolicy.name)
        }

        val requestedFormats = ConfigurationCache.normalizeFormats(userSpec.format)
        val explicitMethod = m.method !== null && !m.method.trim.isEmpty
        val methodEntry =
          if (explicitMethod) {
            val found = ConfigurationCache.findMethod(configModel, m.method)
            if (found === null) {
              throw new IllegalArgumentException("Unknown explanation method: " + m.method)
            }
            found
          } else {
            val found = autoPickMethodEntry(modelConfig, userSpec.expertise, requestedFormats, userSpec.purpose, configModel)
            if (found === null) {
              throw new IllegalArgumentException(
                autoPickFailureMessage(modelConfig, userSpec.expertise, requestedFormats, userSpec.purpose, configModel)
              )
            }
            found
          }

        report.info(
          "Resolved explanation method: " + methodEntry.name + (if (explicitMethod) " (explicit)" else " (auto-selected)")
        )
        report.info("Implementation binding: " + methodEntry.implementationClassPath)

        val effectiveFormats =
          if (requestedFormats.empty) ConfigurationCache.defaultFormats(methodEntry) else requestedFormats

        val formatDefaulted = requestedFormats.empty
        for (fmt : effectiveFormats) {
          if (ConfigurationCache.findOutputFormat(configModel, fmt) === null) {
            throw new IllegalArgumentException("Unknown output format: " + fmt)
          }
        }
        if (!ConfigurationCache.supportsAllFormats(methodEntry, effectiveFormats)) {
          throw new IllegalArgumentException(
            "Requested output format(s) " + effectiveFormats.join(", ") +
            " are not supported by method '" + methodEntry.name + "'."
          )
        }

        val purposeDefaulted = userSpec.purpose === null || userSpec.purpose.trim.empty
        val effectivePurpose =
          if (purposeDefaulted) ConfigurationCache.defaultPurposeName(configModel) else userSpec.purpose.trim

        if (ConfigurationCache.findPurpose(configModel, effectivePurpose) === null) {
          throw new IllegalArgumentException("Unknown purpose: " + effectivePurpose)
        }

        val detailsDefaulted = userSpec.details === null || userSpec.details.trim.empty
        val effectiveDetails =
          if (detailsDefaulted) ConfigurationCache.defaultDetailsName(configModel, userSpec.expertise)
          else userSpec.details.trim

        val detailsRank = ConfigurationCache.detailsRank(configModel, effectiveDetails)
        if (detailsRank == -1) {
          throw new IllegalArgumentException("Unknown details level: " + effectiveDetails)
        }

        val debugTechniqueNames = ConfigurationCache.debugTechniqueNames(methodEntry)

        val prefs = new UserPrefs(
          userSpec.expertise,
          effectiveFormats,
          effectivePurpose,
          effectiveDetails,
          detailsRank,
          debugTechniqueNames,
          false,
          formatDefaulted,
          purposeDefaulted,
          detailsDefaulted
        )

        if (formatDefaulted) report.info("Default format applied: " + prefs.formatSummary)
        if (detailsDefaulted) report.info("Default details applied: " + prefs.details)
        if (purposeDefaulted) report.info("Default purpose applied: " + prefs.purpose)

        if (explicitMethod && !modelConfig.allowedMethods.contains(methodEntry)) {
          report.warn(
            "The chosen explanation method '" + methodEntry.name +
            "' is not listed as compatible with model type '" + modelConfig.name + "'."
          )
        }

        val userRank = ConfigurationCache.expertiseRank(configModel, userSpec.expertise)
        val minRank = ConfigurationCache.expertiseRank(methodEntry.minExpertise)
        if (userRank != -1 && minRank != -1 && userRank < minRank) {
          report.warn(
            "User expertise '" + userSpec.expertise +
            "' is lower than the minimum expertise required by method '" +
            methodEntry.name + "' (" + methodEntry.minExpertise.name + ")."
          )
        }

        if (!ConfigurationCache.isRecommendedPurpose(methodEntry, effectivePurpose)) {
          report.warn(
            "Purpose '" + effectivePurpose +
            "' is not listed as a recommended purpose for method '" +
            methodEntry.name + "'."
          )
        }

        if (prefs.isDebuggingPurpose && !ConfigurationCache.hasDebugTechniques(methodEntry)) {
          report.warn(
            "Purpose 'debugging' was requested, but method '" +
            methodEntry.name + "' has no debug techniques declared in the configuration repository."
          )
        }

        val effectiveDatasetType =
          if (m.dataset === null) null else m.dataset.format

        if (m.dataset !== null) {
          val datasetType = ConfigurationCache.findDatasetType(configModel, effectiveDatasetType)
          if (datasetType === null) {
            throw new IllegalArgumentException("Unknown dataset type: " + effectiveDatasetType)
          }
          if (!ConfigurationCache.modelSupportsDatasetType(modelConfig, effectiveDatasetType)) {
            throw new IllegalArgumentException(
              "Dataset type '" + effectiveDatasetType + "' is not supported by model '" + modelConfig.name + "'."
            )
          }
          if (ConfigurationCache.datasetTypeRequiresTargetColumn(configModel, effectiveDatasetType) &&
              (m.dataset.targetColumn === null || m.dataset.targetColumn.trim.empty)) {
            throw new IllegalArgumentException(
              "Dataset type '" + effectiveDatasetType + "' requires a target column."
            )
          }
        }

        val nb = new NotebookBuilder
        nb.addMarkdown(
          "# Explanation Notebook for " + modelName,
          "*Model Type:* **" + modelTypeName + "**",
          "*User:* " + userName +
            " (Expertise: " + userSpec.expertise +
            ", Formats: " + prefs.formatSummary +
            ", Details: " + prefs.details +
            ", Purpose: " + prefs.purpose + ")",
          "*Explanation Method:* " + methodEntry.name + (if (explicitMethod) "" else " *(auto-selected)*")
        )

        nb.addMarkdown(
          "## Training the " + modelTypeName + " Model",
          "We train a **" + modelTypeName + "** model" +
            (if (m.dataset === null)
              " on a sample dataset (using an sklearn built-in dataset)."
             else
              " on the provided dataset.")
        )

        val trainLines = newArrayList("import warnings; warnings.filterwarnings('ignore')")

        val requiredPackages = ConfigurationCache.collectRequiredPackages(configModel, modelConfig, methodEntry, effectiveDatasetType)
        if (!requiredPackages.empty) {
          trainLines.add("!pip install -q " + requiredPackages.join(" "))
          report.info("Required Python packages: " + requiredPackages.join(", "))
        }

        if (m.dataset === null) {
          trainLines.addAll(defaultDatasetLines(modelConfig).toList)
        } else {
          trainLines.addAll(loadDatasetLines(m.dataset, modelConfig, configModel).toList)
        }

        trainLines.addAll(buildModelInstantiationLines(modelConfig).toList)
        trainLines.add("model.fit(X_train, y_train)")
        trainLines.add("print('Accuracy: " + modelTypeName + " = ' + format(model.score(X_test, y_test), '.2f'))")
        nb.addCode(trainLines.toArray(newArrayOfSize(trainLines.size)))

        nb.addMarkdown(
          "## Explaining the model using " + methodEntry.name,
          explanationBlurb(methodEntry.name)
        )
        nb.addCode(explanationLines(methodEntry.name, prefs))

        fsa.generateFile(modelName + ".ipynb", nb.build)

        val endTime = System.currentTimeMillis
        val elapsed = endTime - startTime
        report.info("Notebook generated successfully: " + modelName + ".ipynb")
        report.info("Generation end: " + formatTimestamp(endTime))
        report.info("Generation time (ms): " + elapsed)
        fsa.generateFile(modelName + "_generation_report.log", report.render)

      } catch (Exception e) {
        val endTime = System.currentTimeMillis
        val elapsed = endTime - startTime
        report.error(if (e.message !== null) e.message else e.toString)
        report.info("Generation aborted.")
        report.info("Generation end: " + formatTimestamp(endTime))
        report.info("Generation time (ms): " + elapsed)
        fsa.generateFile(m.name + "_generation_report.log", report.render)
        throw e
      }
    }
  }

  def String formatTimestamp(long millis) {
    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(millis))
  }

  def ExplanationMethod autoPickMethodEntry(
    AIModel modelConfig,
    String userExpertise,
    List<String> requestedFormats,
    String purposePref,
    Configuration configModel
  ) {
    val allowedMethods = modelConfig.allowedMethods
    if (allowedMethods === null || allowedMethods.empty) return null

    val userRank = ConfigurationCache.expertiseRank(configModel, userExpertise)
    var List<ExplanationMethod> candidates = allowedMethods.toList

    if (requestedFormats !== null && !requestedFormats.empty) {
      val filtered = candidates.filter[ConfigurationCache.supportsAllFormats(it, requestedFormats)].toList
      if (!filtered.empty) {
        candidates = filtered
      } else {
        return null
      }
    }

    if (purposePref !== null && !purposePref.trim.empty) {
      val recommended = candidates.filter[ConfigurationCache.isRecommendedPurpose(it, purposePref)].toList
      if (!recommended.empty) {
        candidates = recommended
      } else if (purposePref.equalsIgnoreCase("debugging")) {
        val debugReady = candidates.filter[ConfigurationCache.hasDebugTechniques(it)].toList
        if (!debugReady.empty) {
          candidates = debugReady
        }
      }
    }

    var ExplanationMethod bestMethod = null
    var bestRank = -1
    for (method : candidates) {
      val reqRank = ConfigurationCache.expertiseRank(method.minExpertise)
      if (userRank != -1 && reqRank <= userRank && reqRank > bestRank) {
        bestRank = reqRank
        bestMethod = method
      }
    }

    return bestMethod
  }

  def String autoPickFailureMessage(
    AIModel modelConfig,
    String userExpertise,
    List<String> requestedFormats,
    String purposePref,
    Configuration configModel
  ) {
    val allowedMethods = modelConfig.allowedMethods
    if (allowedMethods === null || allowedMethods.empty) {
      return "No explanation method could be selected because model '" + modelConfig.name +
        "' has no allowed methods configured."
    }

    var List<ExplanationMethod> candidates = allowedMethods.toList

    if (requestedFormats !== null && !requestedFormats.empty) {
      val filtered = candidates.filter[ConfigurationCache.supportsAllFormats(it, requestedFormats)].toList
      if (filtered.empty) {
        return "No explanation method could be selected for model '" + modelConfig.name +
          "' because none of its allowed methods support the requested output format(s): [" +
          requestedFormats.join(", ") + "]."
      }
      candidates = filtered
    }

    if (purposePref !== null && !purposePref.trim.empty) {
      val recommended = candidates.filter[ConfigurationCache.isRecommendedPurpose(it, purposePref)].toList
      if (!recommended.empty) {
        candidates = recommended
      } else if (purposePref.equalsIgnoreCase("debugging")) {
        val debugReady = candidates.filter[ConfigurationCache.hasDebugTechniques(it)].toList
        if (!debugReady.empty) {
          candidates = debugReady
        }
      }
    }

    val userRank = ConfigurationCache.expertiseRank(configModel, userExpertise)
    val eligible = candidates.filter[
      val reqRank = ConfigurationCache.expertiseRank(minExpertise)
      userRank != -1 && reqRank != -1 && reqRank <= userRank
    ].toList

    if (eligible.empty) {
      return "No explanation method could be selected for model '" + modelConfig.name +
        "' because none of the remaining compatible methods match user expertise '" + userExpertise + "'."
    }

    "No explanation method could be selected for the requested configuration."
  }

  def boolean useStratification(AIModel modelConfig) {
    val policy = modelConfig.trainingPolicy
    if (policy === null) true else policy.useStratification
  }

  def String[] defaultDatasetLines(AIModel modelConfig) {
    val stratified = useStratification(modelConfig)

    if (stratified) #[
      "from sklearn.datasets import load_breast_cancer",
      "from sklearn.model_selection import train_test_split",
      "data = load_breast_cancer()",
      "X, y = data.data, data.target",
      "try:",
      "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0, stratify=y)",
      "    print('[Info] Used stratified split to preserve class proportions in train/test.')",
      "except Exception:",
      "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
      "    print('[Info] Used non-stratified split (stratification not applicable).')"
    ] else #[
      "from sklearn.datasets import load_breast_cancer",
      "from sklearn.model_selection import train_test_split",
      "data = load_breast_cancer()",
      "X, y = data.data, data.target",
      "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
      "print('[Info] Stratification disabled by training policy.')"
    ]
  }

  def String[] buildModelInstantiationLines(AIModel modelConfig) {
    val classPath = modelConfig.classPath
    val lastDot = classPath.lastIndexOf('.')
    val module = if (lastDot != -1) classPath.substring(0, lastDot) else classPath
    val className = if (lastDot != -1) classPath.substring(lastDot + 1) else classPath
    val paramStr = modelConfig.parameters.map[p | p.key + "=" + p.value].join(", ")

    val policy = modelConfig.trainingPolicy
    if (policy !== null && policy.enableNormalization) {
      val scalerPath =
        if (policy.scalerClassPath !== null && !policy.scalerClassPath.trim.empty)
          policy.scalerClassPath
        else
          "sklearn.preprocessing.StandardScaler"

      val sDot = scalerPath.lastIndexOf('.')
      val scalerModule = if (sDot != -1) scalerPath.substring(0, sDot) else scalerPath
      val scalerClass = if (sDot != -1) scalerPath.substring(sDot + 1) else scalerPath

      #[
        "from " + module + " import " + className,
        "from sklearn.pipeline import make_pipeline",
        "from " + scalerModule + " import " + scalerClass,
        "base_model = " + className + "(" + paramStr + ")",
        "model = make_pipeline(" + scalerClass + "(), base_model)",
        "print('[Info] Normalization enabled by training policy: using " + scalerClass + " in a pipeline.')"
      ]
    } else {
      #[
        "from " + module + " import " + className,
        "model = " + className + "(" + paramStr + ")",
        "print('[Info] Normalization disabled by training policy.')"
      ]
    }
  }

  def String explanationBlurb(String methodName) {
    switch methodName {
      case "LIME": "LIME explains individual predictions by fitting a simple local surrogate model around the instance."
      case "SHAP": "SHAP computes additive feature attributions and can support both local and global views."
      case "PDP": "Partial Dependence Plot (PDP) shows how a feature affects the model's predictions on average."
      case "ICE": "Individual Conditional Expectation (ICE) plots show prediction trajectories per instance for a feature."
      case "FeatureImportance": "Feature Importance ranks features by their overall influence on the model’s predictions."
      default: ""
    }
  }

  def String[] explanationLines(String methodName, UserPrefs prefs) {
    switch methodName {
      case "LIME": new LimeTemplate().lines(prefs)
      case "SHAP": new ShapTemplate().lines(prefs)
      case "PDP": new PdpTemplate().lines(prefs)
      case "ICE": new IceTemplate().lines(prefs)
      case "FeatureImportance": new FeatureImportanceTemplate().lines(prefs)
      default: #["print('No explanation available for the selected method.')"]
    }
  }

  def String[] loadDatasetLines(Dataset d, AIModel modelConfig, Configuration configModel) {
    val tgt = if (d.targetColumn !== null && d.targetColumn.trim.length > 0) d.targetColumn.trim else ""
    val dtype = if (d.format !== null) d.format.trim.toUpperCase else ""
    val stratified = useStratification(modelConfig)
    val targetRequired = ConfigurationCache.datasetTypeRequiresTargetColumn(configModel, dtype)

    switch dtype {
      case "CSV":
        if (stratified) #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_csv(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type CSV; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "try:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0, stratify=y)",
          "    print('[Info] Used stratified split to preserve class proportions in train/test.')",
          "except Exception:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "    print('[Info] Used non-stratified split (stratification not applicable).')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ] else #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_csv(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type CSV; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "print('[Info] Stratification disabled by training policy.')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ]

      case "PARQUET":
        if (stratified) #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_parquet(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type PARQUET; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "try:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0, stratify=y)",
          "    print('[Info] Used stratified split to preserve class proportions in train/test.')",
          "except Exception:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "    print('[Info] Used non-stratified split (stratification not applicable).')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ] else #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_parquet(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type PARQUET; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "print('[Info] Stratification disabled by training policy.')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ]

      case "JSON":
        if (stratified) #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_json(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type JSON; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "try:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0, stratify=y)",
          "    print('[Info] Used stratified split to preserve class proportions in train/test.')",
          "except Exception:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "    print('[Info] Used non-stratified split (stratification not applicable).')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ] else #[
          "import pandas as pd",
          "from sklearn.model_selection import train_test_split",
          "df = pd.read_json(r\"" + d.path + "\")",
          if (targetRequired && tgt.length > 0) "y = df['" + tgt + "']" else "raise Exception('target column is required for dataset type JSON; set with target = \"<column>\"')",
          if (targetRequired && tgt.length > 0) "X = df.drop(columns=['" + tgt + "']).values" else "#",
          "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "print('[Info] Stratification disabled by training policy.')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = list(df.drop(columns=['" + (if (tgt.length > 0) tgt else "TARGET") + "']).columns)"
        ]

      case "LIBSVM":
        if (stratified) #[
          "from sklearn.datasets import load_svmlight_file",
          "from sklearn.model_selection import train_test_split",
          "X_sparse, y = load_svmlight_file(r\"" + d.path + "\")",
          "X = X_sparse.toarray()",
          "try:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0, stratify=y)",
          "    print('[Info] Used stratified split to preserve class proportions in train/test.')",
          "except Exception:",
          "    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "    print('[Info] Used non-stratified split (stratification not applicable).')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = ['f{}'.format(j) for j in range(X.shape[1])]"
        ] else #[
          "from sklearn.datasets import load_svmlight_file",
          "from sklearn.model_selection import train_test_split",
          "X_sparse, y = load_svmlight_file(r\"" + d.path + "\")",
          "X = X_sparse.toarray()",
          "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)",
          "print('[Info] Stratification disabled by training policy.')",
          "class Dummy: pass",
          "data = Dummy(); data.feature_names = ['f{}'.format(j) for j in range(X.shape[1])]"
        ]

      case "IMAGE_DIR":
        #[
          "raise Exception('IMAGE_DIR format is not supported in this generator yet.')"
        ]

      default:
        #[
          "raise Exception('Unknown dataset type: " + dtype + "')"
        ]
    }
  }
}