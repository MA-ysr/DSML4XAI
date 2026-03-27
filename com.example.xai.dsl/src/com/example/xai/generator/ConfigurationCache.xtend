package com.example.xai.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import com.example.xai.model.xaiConfig.Configuration
import com.example.xai.model.xaiConfig.AIModel
import com.example.xai.model.xaiConfig.DetailsLevel
import com.example.xai.model.xaiConfig.ExpertiseLevel
import com.example.xai.model.xaiConfig.ExplanationMethod
import com.example.xai.model.xaiConfig.OutputFormat
import com.example.xai.model.xaiConfig.Purpose
import com.example.xai.model.xaiConfig.DatasetType
import java.util.List
import com.example.xai.verification.OCLVerificationSupport

class ConfigurationCache {

  static var Configuration cached

  def static synchronized Configuration get(Resource resource) {
    if (cached === null) {
      val configUri = URI.createPlatformPluginURI("com.example.xai.dsl/resources/config.xmi", true)
      val configRes = resource.resourceSet.getResource(configUri, true)
      cached = configRes.contents.head as Configuration
      OCLVerificationSupport.throwIfInvalid(cached, "Configuration repository")
    }
    cached
  }

  def static synchronized void reset() {
    cached = null
  }

  def static AIModel findModel(Configuration config, String name) {
    if (config === null || name === null) return null
    config.models.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static ExplanationMethod findMethod(Configuration config, String name) {
    if (config === null || name === null) return null
    config.methods.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static ExpertiseLevel findExpertise(Configuration config, String name) {
    if (config === null || name === null) return null
    config.expertiseLevels.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static DetailsLevel findDetails(Configuration config, String name) {
    if (config === null || name === null) return null
    config.detailsLevels.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static OutputFormat findOutputFormat(Configuration config, String name) {
    if (config === null || name === null) return null
    val wanted = name.trim
    config.outputFormats.findFirst[it.name.equalsIgnoreCase(wanted)]
  }

  def static Purpose findPurpose(Configuration config, String name) {
    if (config === null || name === null) return null
    config.purposes.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static DatasetType findDatasetType(Configuration config, String name) {
    if (config === null || name === null) return null
    config.datasetTypes.findFirst[it.name.equalsIgnoreCase(name.trim)]
  }

  def static int expertiseRank(Configuration config, String expertiseName) {
    val lvl = findExpertise(config, expertiseName)
    if (lvl === null) -1 else lvl.rank
  }

  def static int expertiseRank(ExpertiseLevel level) {
    if (level === null) -1 else level.rank
  }

  def static int detailsRank(Configuration config, String detailsName) {
    val lvl = findDetails(config, detailsName)
    if (lvl === null) -1 else lvl.rank
  }

  def static String defaultPurposeName(Configuration config) {
    val p = findPurpose(config, "general")
    if (p !== null) p.name else "general"
  }

  def static String defaultDetailsName(Configuration config, String expertiseName) {
    val expRank = expertiseRank(config, expertiseName)
    if (expRank != -1) {
      val exact = config.detailsLevels.findFirst[it.rank == expRank]
      if (exact !== null) return exact.name
    }
    val medium = findDetails(config, "medium")
    if (medium !== null) return medium.name
    if (config !== null && !config.detailsLevels.empty) return config.detailsLevels.head.name
    "medium"
  }

  def static List<String> defaultFormats(ExplanationMethod method) {
    val result = newArrayList
    if (method !== null && method.defaultFormat !== null) {
      result.add(method.defaultFormat.name)
    } else {
      result.add("plainText")
    }
    result
  }

  def static List<String> normalizeFormats(Iterable<String> rawFormats) {
    val result = newArrayList
    if (rawFormats === null) return result
    for (f : rawFormats) {
      if (f !== null && !f.trim.empty) {
        val trimmed = f.trim
        if (!result.exists[it.equalsIgnoreCase(trimmed)]) {
          result.add(trimmed)
        }
      }
    }
    result
  }

  def static boolean supportsAllFormats(ExplanationMethod method, Iterable<String> requestedFormats) {
    if (method === null) return false
    val supported = method.supportedFormats.map[name].toList
    for (f : normalizeFormats(requestedFormats)) {
      if (!supported.exists[it.equalsIgnoreCase(f)]) {
        return false
      }
    }
    true
  }

  def static boolean isRecommendedPurpose(ExplanationMethod method, String purposeName) {
    if (method === null || purposeName === null || purposeName.trim.empty) return true
    if (method.recommendedPurposes.empty) return true
    method.recommendedPurposes.exists[it.name.equalsIgnoreCase(purposeName.trim)]
  }

  def static boolean hasDebugTechniques(ExplanationMethod method) {
    method !== null && !method.debugTechniques.empty
  }

  def static List<String> debugTechniqueNames(ExplanationMethod method) {
    val result = newArrayList
    if (method === null) return result
    for (dt : method.debugTechniques) {
      if (dt !== null && dt.name !== null && !dt.name.trim.empty) {
        result.add(dt.name.trim)
      }
    }
    result
  }

  def static boolean hasDebugTechnique(ExplanationMethod method, String name) {
    if (method === null || name === null) return false
    method.debugTechniques.exists[it.name.equalsIgnoreCase(name.trim)]
  }

  def static boolean datasetTypeRequiresTargetColumn(Configuration config, String datasetTypeName) {
    val dt = findDatasetType(config, datasetTypeName)
    if (dt === null) false else dt.requiresTargetColumn
  }

  def static boolean modelSupportsDatasetType(AIModel model, String datasetTypeName) {
    if (model === null || datasetTypeName === null) return false
    if (model.acceptedDatasetTypes === null || model.acceptedDatasetTypes.empty) return true
    model.acceptedDatasetTypes.exists[it.name.equalsIgnoreCase(datasetTypeName.trim)]
  }

  def static List<String> collectRequiredPackages(Configuration config, AIModel model, ExplanationMethod method, String datasetTypeName) {
    val result = new java.util.LinkedHashSet<String>

    addPackages(result, if (model !== null) model.requiredPackages else null)
    addPackages(result, if (model !== null && model.trainingPolicy !== null) model.trainingPolicy.requiredPackages else null)

    val dt = findDatasetType(config, datasetTypeName)
    if (dt !== null) {
      addPackages(result, dt.requiredPackages)
    }

    addPackages(result, if (method !== null) method.requiredPackages else null)

    newArrayList(result)
  }

  def private static void addPackages(java.util.LinkedHashSet<String> result, Iterable<String> pkgs) {
    for (p : pkgs) {
      if (p !== null && !p.trim.empty) {
        result.add(p.trim)
      }
    }
  }
}