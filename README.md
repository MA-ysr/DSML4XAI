# DSML4XAI — A Model-Driven Framework for User-Parameterized XAI Workflow Generation

DSML4XAI is a textual domain-specific modeling language and model-driven framework that generates user-aware, executable XAI (Explainable AI) workflows from high-level specifications. Users declare an AI model, a dataset, a user context (expertise level, preferred output format, explanation purpose, detail level), and optionally an explicit explanation method. The framework validates the specification against a configuration repository, auto-selects a compatible explanation method when needed, and generates a ready-to-run Jupyter Notebook tailored to the declared user profile.

---

## Repository Structure

```
DSML4XAI/
├── com.example.xai.model/          # Ecore metamodels: DSML syntax + configuration
├── com.example.xai.model.edit/     # EMF-generated item providers for metamodel
├── com.example.xai.model.editor/   # EMF tree editor for metamodel instances
├── com.example.xai.model.tests/    # EMF model unit tests
├── com.example.xai.dsl/            # Core DSL: grammar, generator, verification
├── com.example.xai.dsl.ide/        # IDE integration (content assist, navigation)
├── com.example.xai.dsl.ui/         # Eclipse editor UI plugin
├── com.example.xai.dsl.ui.tests/   # Eclipse UI integration tests
├── com.example.xai.dsl.tests/      # DSL parsing and grammar tests
├── com.example.xai.dsl.edit/       # Xtext-generated EMF edit support
├── com.example.xai.dsl.editor/     # Xtext-generated EMF editor
└── evaluation-scenarios/           # Evaluation artefacts (see its own README)
```


---

## Detailed Project Reference

### `com.example.xai.model` — Metamodels

This project defines the two Ecore metamodels that govern the language and its domain knowledge.

#### DSML Metamodel (`model/xai.ecore`)

Defines the abstract syntax of the language. Contains three EClasses:

| EClass | Key attributes | Role |
|--------|---------------|------|
| `Model` | `name`, `modelType` (mandatory), `method` (optional) | Root concept: the AI model to be explained |
| `User` | `name`, `expertise` (mandatory), `format[]` (optional, multi-valued), `details` (optional), `purpose` (optional) | User profile driving method selection and output style |
| `Dataset` | `path` (mandatory), `format` (mandatory), `targetColumn` (optional) | Data source for the generated workflow |

All domain-valued attributes are `EString` (not `EEnum`) to keep the grammar stable when the supported domain vocabulary evolves. Structural correctness is enforced by **declarative OCL invariants**:

| Invariant | Class | Constraint |
|-----------|-------|-----------|
| `NonBlankExpertise` | `User` | expertise is not null or empty |
| `NonBlankFormats` | `User` | every element of format[] is non-blank |
| `UniqueFormatsCaseInsensitive` | `User` | no duplicate format values |
| `NonBlankDetailsIfSpecified` | `User` | details, if present, is non-blank |
| `NonBlankPurposeIfSpecified` | `User` | purpose, if present, is non-blank |
| `NonBlankPath` | `Dataset` | path is not null or empty |
| `NonBlankFormat` | `Dataset` | format is not null or empty |
| `NonBlankTargetIfSpecified` | `Dataset` | targetColumn, if present, is non-blank |

#### Configuration Metamodel (`model/config.ecore`)

Defines the structure of the domain knowledge repository. Key EClasses:

| EClass | Key attributes | Role |
|--------|---------------|------|
| `Configuration` | (root) | Container for all domain knowledge |
| `ExpertiseLevel` | `name`, `rank` (int) | Named proficiency tier with ordinal rank |
| `DetailsLevel` | `name`, `rank` (int) | Named detail granularity tier |
| `OutputFormat` | `name` | Supported output modality (plainText, table, visual) |
| `Purpose` | `name` | Explanation purpose (learning, debugging, justification, general) |
| `DebugTechnique` | `name` | Diagnostic technique (confusion matrix, classification report, etc.) |
| `DatasetType` | `name`, `requiresTargetColumn`, `requiredPackages[]` | Supported dataset format with loading policy |
| `TrainingPolicy` | `name`, `enableNormalization`, `scalerClassPath`, `useStratification`, `requiredPackages[]` | Preprocessing policy per model |
| `AIModel` | `name`, `classPath`, `requiredPackages[]`, `trainingPolicy`, `acceptedDatasetTypes[]`, `allowedMethods[]`, `parameters[]` | Supported AI model with compatibility rules |
| `ExplanationMethod` | `name`, `scope`, `implementationClassPath`, `requiredPackages[]`, `minExpertise`, `supportedFormats[]`, `defaultFormat`, `recommendedPurposes[]`, `debugTechniques[]` | Explanation method with format and expertise constraints |
| `Parameter` | `key`, `value` | Hyperparameter key-value pair |

OCL invariants on the configuration metamodel:

| Invariant | Class | Constraint |
|-----------|-------|-----------|
| `UniqueModelNames` | `Configuration` | AI model names are unique (case-insensitive) |
| `UniqueMethodNames` | `Configuration` | Method names are unique (case-insensitive) |
| `UniqueDatasetTypeNames` | `Configuration` | Dataset type names are unique |
| `UniqueOutputFormatNames` | `Configuration` | Output format names are unique |
| `UniquePurposeNames` | `Configuration` | Purpose names are unique |
| `UniqueExpertiseRanks` | `Configuration` | No two expertise levels share a rank |
| `UniqueDetailsRanks` | `Configuration` | No two detail levels share a rank |
| `PositiveRank` | `ExpertiseLevel`, `DetailsLevel` | Rank must be > 0 |
| `ScalerRequiredWhenNormalizationEnabled` | `TrainingPolicy` | scalerClassPath must be set if enableNormalization is true |
| `AllowedMethodsNotEmpty` | `AIModel` | Every model must declare at least one allowed method |
| `AcceptedDatasetTypesNotEmpty` | `AIModel` | Every model must accept at least one dataset type |
| `UniqueParameterKeys` | `AIModel` | Parameter keys are unique per model |
| `DefaultFormatMustBeSupported` | `ExplanationMethod` | defaultFormat must be in supportedFormats |
| `SupportedFormatsNotEmpty` | `ExplanationMethod` | Every method must declare at least one supported format |
| `DebugPurposeExpectedWhenDebugTechniquesExist` | `ExplanationMethod` | Methods with debug techniques should have debugging in recommendedPurposes |
| `ScopeValueIsControlled` | `ExplanationMethod` | scope must be one of: local, global, both |

#### Configuration Repository Instance

| File | Description |
|------|-------------|
| `com.example.xai.dsl/resources/config.xmi` | The live XMI instance conforming to `config.ecore`. Declares 6 AI models (DecisionTree, RandomForest, SVM, MLPClassifier, KNN, LogisticRegression), 5 explanation methods (LIME, SHAP, PDP, ICE, FeatureImportance), 3 expertise levels (Beginner/1, Intermediate/2, Advanced/3), 3 detail levels, 3 output formats, 4 purposes, 4 dataset types (CSV, JSON, PARQUET, LIBSVM), 2 training policies, and associated debug techniques and parameters. This is the **single source of truth** for all domain knowledge. |

---

### `com.example.xai.dsl` — Core DSL Project

#### Grammar

| File | Description |
|------|-------------|
| `src/com/example/xai/dsl/XAIModel.xtext` | Xtext grammar. Defines `ModelSpec` (name, type, mandatory `UserSpec`, mandatory `DatasetSpec`, optional method), `UserSpec` (name, mandatory expertise, optional format[], details, purpose), `DatasetSpec` (mandatory path and format, optional target). All domain-valued attributes are free-text identifiers. |
| `src/com/example/xai/dsl/GenerateXAIModel.mwe2` | MWE2 workflow — regenerates all `src-gen/` files from the grammar. Run as *MWE2 Workflow* after any grammar change. |
| `model/generated/XAIModel.ecore` | Auto-generated Ecore for the DSL structural types (only `Root` with one `Model` reference). |
| `model/generated/XAIModel.genmodel` | GenModel configuration for `XAIModel.ecore`. |

#### Generator

| File | Description |
|------|-------------|
| `src/com/example/xai/generator/XAIModelGenerator.xtend` | Main entry point. Iterates `Model` instances, invokes `ConfigurationCache` for validation and method resolution, calls `NotebookBuilder` to produce `.ipynb`, writes the `_generation_report.log`. |
| `src/com/example/xai/generator/ConfigurationCache.xtend` | Singleton. Loads `config.xmi` once via the EMF resource set. Exposes lookup methods: `findModel`, `findMethod`, `findExpertise`, `expertiseRank`, `autoPickMethodEntry` (auto-selection logic: filters candidates by format → purpose → expertise rank), `collectRequiredPackages`, etc. |
| `src/com/example/xai/generator/NotebookBuilder.xtend` | Assembles `.ipynb` JSON from ordered lists of Markdown and code cell strings. |
| `src/com/example/xai/generator/GenerationReport.xtend` | Accumulates `[INFO]` / `[WARN]` / `[ERROR]` log lines and writes the `_generation_report.log` file. |

#### Templates

One Xtend class per supported explanation method plus shared utilities:

| File | Description |
|------|-------------|
| `templates/UserPrefs.xtend` | Resolved user preference value object (expertise, format list, purpose, detail level, expertise rank, debug technique names, default flags). Passed to every template method. |
| `templates/LimeTemplate.xtend` | Generates LIME explanation cells. Adapts output to expertise (beginner plain-language mode, advanced diagnostic mode) and activates debugging blocks when purpose = debugging. |
| `templates/ShapTemplate.xtend` | Generates SHAP explanation cells (summary plots, force plots, waterfall for advanced). |
| `templates/PdpTemplate.xtend` | Generates Partial Dependence Plot cells with feature selection adapted to detail level. |
| `templates/IceTemplate.xtend` | Generates Individual Conditional Expectation plot cells. |
| `templates/FeatureImportanceTemplate.xtend` | Generates feature importance ranking cells (text, table, bar chart depending on requested formats). |
| `templates/TemplateCommons.xtend` | Shared utilities: plain-text section headers, table cell builders, visual block helpers, import cell generator, dataset loading cell generator per dataset type. |

#### Verification

| File | Description |
|------|-------------|
| `src/com/example/xai/validation/XAIModelValidator.java` | Xtext `@Check` validators (Layer 2). Two rules: (1) `checkUserAgainstRepository` — validates expertise, details, purpose, each format value against `config.xmi`; rejects duplicates. (2) `checkModelAndRepositoryConsistency` — validates model type, dataset type, target-column policy, method existence, method-model compatibility, format support, and expertise rank ≥ method minimum rank. Errors surface directly in the DSL editor. |
| `src/com/example/xai/verification/Z3VerificationService.java` | Formal verification (Layer 4). Encodes the configuration repository into Z3 constraints and proves three structural properties: P1 — selection completeness (every model + every expertise level has at least one compatible method); P2 — format coverage (every method's supported formats are a non-empty subset of the repository vocabulary); P3 — expertise rank well-ordering (all ranks are distinct positive integers). Also verifies each individual user specification for satisfiability. |
| `src/com/example/xai/verification/Z3NativeLoader.java` | Loads the Z3 native library using a three-strategy cascade: (1) `java.library.path`, (2) code-source path traversal for development mode, (3) classloader stream extraction for deployed plugin mode. |
| `src/com/example/xai/verification/Z3VerificationResult.java` | Value object carrying the outcome of one verification check: status (`PROVED` / `VIOLATED` / `SKIPPED` / `ERROR`), property name, and optional counterexample message. |
| `src/com/example/xai/verification/OCLVerificationSupport.java` | Invokes EMF OCL/Pivot validation to surface OCL invariant violations from `xai.ecore` and `config.ecore` at runtime. |
| `lib/com.microsoft.z3.jar` | Z3 Java API JAR. |
| `lib/libz3.dll` + `lib/libz3java.dll` | Z3 native libraries for Windows. For Linux add `libz3.so` + `libz3java.so`; for macOS add `libz3.dylib` + `libz3java.dylib`. |

---

## Prerequisites

| Requirement | Version |
|-------------|---------|
| Eclipse IDE for Java and DSL Developers | 2024-06 or later |
| Xtext | 2.35 or later |
| EMF OCL | installed via Eclipse update site |
| Java | 17 or later |
| Python | 3.8 or later |
| Jupyter, scikit-learn, pandas, lime, shap, matplotlib | latest stable |

---

## Evaluation scenarios

See [`evaluation-scenarios/README.md`](evaluation-scenarios/README.md) for the full scenario table, dataset provenance, and execution instructions.

---
