/**
 */
package com.example.xai.model.xaiConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.example.xai.model.xaiConfig.XaiConfigFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface XaiConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xaiConfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/xaiConfig";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xaiConfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XaiConfigPackage eINSTANCE = com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.ConfigurationImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Expertise Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__EXPERTISE_LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Details Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DETAILS_LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Output Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OUTPUT_FORMATS = 2;

	/**
	 * The feature id for the '<em><b>Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PURPOSES = 3;

	/**
	 * The feature id for the '<em><b>Debug Techniques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DEBUG_TECHNIQUES = 4;

	/**
	 * The feature id for the '<em><b>Dataset Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DATASET_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Training Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TRAINING_POLICIES = 6;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MODELS = 7;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__METHODS = 8;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Unique Model Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_MODEL_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Expertise Ranks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_EXPERTISE_RANKS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Unique Dataset Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_DATASET_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Purpose Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_PURPOSE_NAMES__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Unique Output Format Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_OUTPUT_FORMAT_NAMES__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Unique Method Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_METHOD_NAMES__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Unique Details Ranks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___UNIQUE_DETAILS_RANKS__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.ExpertiseLevelImpl <em>Expertise Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.ExpertiseLevelImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getExpertiseLevel()
	 * @generated
	 */
	int EXPERTISE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERTISE_LEVEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERTISE_LEVEL__RANK = 1;

	/**
	 * The number of structural features of the '<em>Expertise Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERTISE_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Positive Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERTISE_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Expertise Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERTISE_LEVEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.DetailsLevelImpl <em>Details Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.DetailsLevelImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDetailsLevel()
	 * @generated
	 */
	int DETAILS_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL__RANK = 1;

	/**
	 * The number of structural features of the '<em>Details Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Positive Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Details Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.OutputFormatImpl <em>Output Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.OutputFormatImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getOutputFormat()
	 * @generated
	 */
	int OUTPUT_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Output Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.PurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.PurposeImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getPurpose()
	 * @generated
	 */
	int PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.DebugTechniqueImpl <em>Debug Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.DebugTechniqueImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDebugTechnique()
	 * @generated
	 */
	int DEBUG_TECHNIQUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TECHNIQUE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Debug Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TECHNIQUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Debug Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TECHNIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.DatasetTypeImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDatasetType()
	 * @generated
	 */
	int DATASET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requires Target Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__REQUIRES_TARGET_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Required Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__REQUIRED_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl <em>Training Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getTrainingPolicy()
	 * @generated
	 */
	int TRAINING_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enable Normalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY__ENABLE_NORMALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Scaler Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY__SCALER_CLASS_PATH = 2;

	/**
	 * The feature id for the '<em><b>Use Stratification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY__USE_STRATIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Required Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY__REQUIRED_PACKAGES = 4;

	/**
	 * The number of structural features of the '<em>Training Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Scaler Required When Normalization Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY___SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Training Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_POLICY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.AIModelImpl <em>AI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.AIModelImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getAIModel()
	 * @generated
	 */
	int AI_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__CLASS_PATH = 1;

	/**
	 * The feature id for the '<em><b>Required Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__REQUIRED_PACKAGES = 2;

	/**
	 * The feature id for the '<em><b>Training Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__TRAINING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Accepted Dataset Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__ACCEPTED_DATASET_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Allowed Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__ALLOWED_METHODS = 6;

	/**
	 * The number of structural features of the '<em>AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Accepted Dataset Types Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL___ACCEPTED_DATASET_TYPES_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Allowed Methods Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL___ALLOWED_METHODS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Unique Parameter Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL___UNIQUE_PARAMETER_KEYS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.ParameterImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl <em>Explanation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl
	 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getExplanationMethod()
	 * @generated
	 */
	int EXPLANATION_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Implementation Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH = 2;

	/**
	 * The feature id for the '<em><b>Required Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__REQUIRED_PACKAGES = 3;

	/**
	 * The feature id for the '<em><b>Min Expertise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__MIN_EXPERTISE = 4;

	/**
	 * The feature id for the '<em><b>Supported Formats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__SUPPORTED_FORMATS = 5;

	/**
	 * The feature id for the '<em><b>Default Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__DEFAULT_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Recommended Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__RECOMMENDED_PURPOSES = 7;

	/**
	 * The feature id for the '<em><b>Debug Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD__DEBUG_TECHNIQUES = 8;

	/**
	 * The number of structural features of the '<em>Explanation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Supported Formats Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD___SUPPORTED_FORMATS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Debug Purpose Expected When Debug Techniques Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD___DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Default Format Must Be Supported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD___DEFAULT_FORMAT_MUST_BE_SUPPORTED__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Scope Value Is Controlled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD___SCOPE_VALUE_IS_CONTROLLED__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Explanation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLANATION_METHOD_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getExpertiseLevels <em>Expertise Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expertise Levels</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getExpertiseLevels()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ExpertiseLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getDetailsLevels <em>Details Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details Levels</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getDetailsLevels()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DetailsLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getOutputFormats <em>Output Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Formats</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getOutputFormats()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_OutputFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getPurposes <em>Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Purposes</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getPurposes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Purposes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getDebugTechniques <em>Debug Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debug Techniques</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getDebugTechniques()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DebugTechniques();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getDatasetTypes <em>Dataset Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset Types</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getDatasetTypes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DatasetTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getTrainingPolicies <em>Training Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training Policies</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getTrainingPolicies()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_TrainingPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getModels()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.Configuration#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see com.example.xai.model.xaiConfig.Configuration#getMethods()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Methods();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueModelNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Model Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Model Names</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueModelNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueModelNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueExpertiseRanks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Expertise Ranks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Expertise Ranks</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueExpertiseRanks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueExpertiseRanks__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueDatasetTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Dataset Type Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Dataset Type Names</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueDatasetTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueDatasetTypeNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniquePurposeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Purpose Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Purpose Names</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniquePurposeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniquePurposeNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueOutputFormatNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Output Format Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Output Format Names</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueOutputFormatNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueOutputFormatNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueMethodNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Method Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Method Names</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueMethodNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueMethodNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.Configuration#UniqueDetailsRanks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Details Ranks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Details Ranks</em>' operation.
	 * @see com.example.xai.model.xaiConfig.Configuration#UniqueDetailsRanks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__UniqueDetailsRanks__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.ExpertiseLevel <em>Expertise Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expertise Level</em>'.
	 * @see com.example.xai.model.xaiConfig.ExpertiseLevel
	 * @generated
	 */
	EClass getExpertiseLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.ExpertiseLevel#getName()
	 * @see #getExpertiseLevel()
	 * @generated
	 */
	EAttribute getExpertiseLevel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see com.example.xai.model.xaiConfig.ExpertiseLevel#getRank()
	 * @see #getExpertiseLevel()
	 * @generated
	 */
	EAttribute getExpertiseLevel_Rank();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.ExpertiseLevel#PositiveRank(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Rank</em>' operation.
	 * @see com.example.xai.model.xaiConfig.ExpertiseLevel#PositiveRank(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExpertiseLevel__PositiveRank__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.DetailsLevel <em>Details Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Level</em>'.
	 * @see com.example.xai.model.xaiConfig.DetailsLevel
	 * @generated
	 */
	EClass getDetailsLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.DetailsLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.DetailsLevel#getName()
	 * @see #getDetailsLevel()
	 * @generated
	 */
	EAttribute getDetailsLevel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.DetailsLevel#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see com.example.xai.model.xaiConfig.DetailsLevel#getRank()
	 * @see #getDetailsLevel()
	 * @generated
	 */
	EAttribute getDetailsLevel_Rank();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.DetailsLevel#PositiveRank(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Rank</em>' operation.
	 * @see com.example.xai.model.xaiConfig.DetailsLevel#PositiveRank(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDetailsLevel__PositiveRank__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.OutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Format</em>'.
	 * @see com.example.xai.model.xaiConfig.OutputFormat
	 * @generated
	 */
	EClass getOutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.OutputFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.OutputFormat#getName()
	 * @see #getOutputFormat()
	 * @generated
	 */
	EAttribute getOutputFormat_Name();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see com.example.xai.model.xaiConfig.Purpose
	 * @generated
	 */
	EClass getPurpose();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.Purpose#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.Purpose#getName()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_Name();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.DebugTechnique <em>Debug Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debug Technique</em>'.
	 * @see com.example.xai.model.xaiConfig.DebugTechnique
	 * @generated
	 */
	EClass getDebugTechnique();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.DebugTechnique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.DebugTechnique#getName()
	 * @see #getDebugTechnique()
	 * @generated
	 */
	EAttribute getDebugTechnique_Name();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Type</em>'.
	 * @see com.example.xai.model.xaiConfig.DatasetType
	 * @generated
	 */
	EClass getDatasetType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.DatasetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.DatasetType#getName()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.DatasetType#isRequiresTargetColumn <em>Requires Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Target Column</em>'.
	 * @see com.example.xai.model.xaiConfig.DatasetType#isRequiresTargetColumn()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_RequiresTargetColumn();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.xai.model.xaiConfig.DatasetType#getRequiredPackages <em>Required Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Packages</em>'.
	 * @see com.example.xai.model.xaiConfig.DatasetType#getRequiredPackages()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_RequiredPackages();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.TrainingPolicy <em>Training Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Policy</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy
	 * @generated
	 */
	EClass getTrainingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.TrainingPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#getName()
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	EAttribute getTrainingPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.TrainingPolicy#isEnableNormalization <em>Enable Normalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Normalization</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#isEnableNormalization()
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	EAttribute getTrainingPolicy_EnableNormalization();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.TrainingPolicy#getScalerClassPath <em>Scaler Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaler Class Path</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#getScalerClassPath()
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	EAttribute getTrainingPolicy_ScalerClassPath();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.TrainingPolicy#isUseStratification <em>Use Stratification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Stratification</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#isUseStratification()
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	EAttribute getTrainingPolicy_UseStratification();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.xai.model.xaiConfig.TrainingPolicy#getRequiredPackages <em>Required Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Packages</em>'.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#getRequiredPackages()
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	EAttribute getTrainingPolicy_RequiredPackages();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.TrainingPolicy#ScalerRequiredWhenNormalizationEnabled(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scaler Required When Normalization Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scaler Required When Normalization Enabled</em>' operation.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy#ScalerRequiredWhenNormalizationEnabled(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrainingPolicy__ScalerRequiredWhenNormalizationEnabled__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.AIModel <em>AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel
	 * @generated
	 */
	EClass getAIModel();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.AIModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getName()
	 * @see #getAIModel()
	 * @generated
	 */
	EAttribute getAIModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.AIModel#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Path</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getClassPath()
	 * @see #getAIModel()
	 * @generated
	 */
	EAttribute getAIModel_ClassPath();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.xai.model.xaiConfig.AIModel#getRequiredPackages <em>Required Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Packages</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getRequiredPackages()
	 * @see #getAIModel()
	 * @generated
	 */
	EAttribute getAIModel_RequiredPackages();

	/**
	 * Returns the meta object for the reference '{@link com.example.xai.model.xaiConfig.AIModel#getTrainingPolicy <em>Training Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Training Policy</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getTrainingPolicy()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_TrainingPolicy();

	/**
	 * Returns the meta object for the reference list '{@link com.example.xai.model.xaiConfig.AIModel#getAcceptedDatasetTypes <em>Accepted Dataset Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accepted Dataset Types</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getAcceptedDatasetTypes()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_AcceptedDatasetTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.xai.model.xaiConfig.AIModel#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getParameters()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link com.example.xai.model.xaiConfig.AIModel#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Methods</em>'.
	 * @see com.example.xai.model.xaiConfig.AIModel#getAllowedMethods()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_AllowedMethods();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.AIModel#AcceptedDatasetTypesNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Accepted Dataset Types Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accepted Dataset Types Not Empty</em>' operation.
	 * @see com.example.xai.model.xaiConfig.AIModel#AcceptedDatasetTypesNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAIModel__AcceptedDatasetTypesNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.AIModel#AllowedMethodsNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allowed Methods Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allowed Methods Not Empty</em>' operation.
	 * @see com.example.xai.model.xaiConfig.AIModel#AllowedMethodsNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAIModel__AllowedMethodsNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.AIModel#UniqueParameterKeys(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Parameter Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Parameter Keys</em>' operation.
	 * @see com.example.xai.model.xaiConfig.AIModel#UniqueParameterKeys(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAIModel__UniqueParameterKeys__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.example.xai.model.xaiConfig.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.example.xai.model.xaiConfig.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.example.xai.model.xaiConfig.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.xaiConfig.ExplanationMethod <em>Explanation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explanation Method</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod
	 * @generated
	 */
	EClass getExplanationMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getName()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EAttribute getExplanationMethod_Name();

	/**
	 * Returns the meta object for the reference '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getMinExpertise <em>Min Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Expertise</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getMinExpertise()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EReference getExplanationMethod_MinExpertise();

	/**
	 * Returns the meta object for the reference list '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getSupportedFormats <em>Supported Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Formats</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getSupportedFormats()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EReference getExplanationMethod_SupportedFormats();

	/**
	 * Returns the meta object for the reference '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getDefaultFormat <em>Default Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Format</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getDefaultFormat()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EReference getExplanationMethod_DefaultFormat();

	/**
	 * Returns the meta object for the reference list '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getRecommendedPurposes <em>Recommended Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommended Purposes</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getRecommendedPurposes()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EReference getExplanationMethod_RecommendedPurposes();

	/**
	 * Returns the meta object for the reference list '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getDebugTechniques <em>Debug Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Debug Techniques</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getDebugTechniques()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EReference getExplanationMethod_DebugTechniques();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#SupportedFormatsNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supported Formats Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supported Formats Not Empty</em>' operation.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#SupportedFormatsNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExplanationMethod__SupportedFormatsNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#DebugPurposeExpectedWhenDebugTechniquesExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Debug Purpose Expected When Debug Techniques Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Debug Purpose Expected When Debug Techniques Exist</em>' operation.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#DebugPurposeExpectedWhenDebugTechniquesExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExplanationMethod__DebugPurposeExpectedWhenDebugTechniquesExist__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#DefaultFormatMustBeSupported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Default Format Must Be Supported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default Format Must Be Supported</em>' operation.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#DefaultFormatMustBeSupported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExplanationMethod__DefaultFormatMustBeSupported__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#ScopeValueIsControlled(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scope Value Is Controlled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scope Value Is Controlled</em>' operation.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#ScopeValueIsControlled(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExplanationMethod__ScopeValueIsControlled__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getScope()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EAttribute getExplanationMethod_Scope();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getImplementationClassPath <em>Implementation Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class Path</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getImplementationClassPath()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EAttribute getExplanationMethod_ImplementationClassPath();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getRequiredPackages <em>Required Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Packages</em>'.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod#getRequiredPackages()
	 * @see #getExplanationMethod()
	 * @generated
	 */
	EAttribute getExplanationMethod_RequiredPackages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XaiConfigFactory getXaiConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.ConfigurationImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Expertise Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__EXPERTISE_LEVELS = eINSTANCE.getConfiguration_ExpertiseLevels();

		/**
		 * The meta object literal for the '<em><b>Details Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DETAILS_LEVELS = eINSTANCE.getConfiguration_DetailsLevels();

		/**
		 * The meta object literal for the '<em><b>Output Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__OUTPUT_FORMATS = eINSTANCE.getConfiguration_OutputFormats();

		/**
		 * The meta object literal for the '<em><b>Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PURPOSES = eINSTANCE.getConfiguration_Purposes();

		/**
		 * The meta object literal for the '<em><b>Debug Techniques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DEBUG_TECHNIQUES = eINSTANCE.getConfiguration_DebugTechniques();

		/**
		 * The meta object literal for the '<em><b>Dataset Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DATASET_TYPES = eINSTANCE.getConfiguration_DatasetTypes();

		/**
		 * The meta object literal for the '<em><b>Training Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__TRAINING_POLICIES = eINSTANCE.getConfiguration_TrainingPolicies();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MODELS = eINSTANCE.getConfiguration_Models();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__METHODS = eINSTANCE.getConfiguration_Methods();

		/**
		 * The meta object literal for the '<em><b>Unique Model Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_MODEL_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueModelNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Expertise Ranks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_EXPERTISE_RANKS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueExpertiseRanks__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Dataset Type Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_DATASET_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueDatasetTypeNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Purpose Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_PURPOSE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniquePurposeNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Output Format Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_OUTPUT_FORMAT_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueOutputFormatNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Method Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_METHOD_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueMethodNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Details Ranks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___UNIQUE_DETAILS_RANKS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__UniqueDetailsRanks__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.ExpertiseLevelImpl <em>Expertise Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.ExpertiseLevelImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getExpertiseLevel()
		 * @generated
		 */
		EClass EXPERTISE_LEVEL = eINSTANCE.getExpertiseLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERTISE_LEVEL__NAME = eINSTANCE.getExpertiseLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERTISE_LEVEL__RANK = eINSTANCE.getExpertiseLevel_Rank();

		/**
		 * The meta object literal for the '<em><b>Positive Rank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPERTISE_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExpertiseLevel__PositiveRank__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.DetailsLevelImpl <em>Details Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.DetailsLevelImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDetailsLevel()
		 * @generated
		 */
		EClass DETAILS_LEVEL = eINSTANCE.getDetailsLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_LEVEL__NAME = eINSTANCE.getDetailsLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_LEVEL__RANK = eINSTANCE.getDetailsLevel_Rank();

		/**
		 * The meta object literal for the '<em><b>Positive Rank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DETAILS_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDetailsLevel__PositiveRank__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.OutputFormatImpl <em>Output Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.OutputFormatImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getOutputFormat()
		 * @generated
		 */
		EClass OUTPUT_FORMAT = eINSTANCE.getOutputFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FORMAT__NAME = eINSTANCE.getOutputFormat_Name();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.PurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.PurposeImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getPurpose()
		 * @generated
		 */
		EClass PURPOSE = eINSTANCE.getPurpose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__NAME = eINSTANCE.getPurpose_Name();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.DebugTechniqueImpl <em>Debug Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.DebugTechniqueImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDebugTechnique()
		 * @generated
		 */
		EClass DEBUG_TECHNIQUE = eINSTANCE.getDebugTechnique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBUG_TECHNIQUE__NAME = eINSTANCE.getDebugTechnique_Name();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.DatasetTypeImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getDatasetType()
		 * @generated
		 */
		EClass DATASET_TYPE = eINSTANCE.getDatasetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__NAME = eINSTANCE.getDatasetType_Name();

		/**
		 * The meta object literal for the '<em><b>Requires Target Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__REQUIRES_TARGET_COLUMN = eINSTANCE.getDatasetType_RequiresTargetColumn();

		/**
		 * The meta object literal for the '<em><b>Required Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__REQUIRED_PACKAGES = eINSTANCE.getDatasetType_RequiredPackages();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl <em>Training Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getTrainingPolicy()
		 * @generated
		 */
		EClass TRAINING_POLICY = eINSTANCE.getTrainingPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_POLICY__NAME = eINSTANCE.getTrainingPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Enable Normalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_POLICY__ENABLE_NORMALIZATION = eINSTANCE.getTrainingPolicy_EnableNormalization();

		/**
		 * The meta object literal for the '<em><b>Scaler Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_POLICY__SCALER_CLASS_PATH = eINSTANCE.getTrainingPolicy_ScalerClassPath();

		/**
		 * The meta object literal for the '<em><b>Use Stratification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_POLICY__USE_STRATIFICATION = eINSTANCE.getTrainingPolicy_UseStratification();

		/**
		 * The meta object literal for the '<em><b>Required Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_POLICY__REQUIRED_PACKAGES = eINSTANCE.getTrainingPolicy_RequiredPackages();

		/**
		 * The meta object literal for the '<em><b>Scaler Required When Normalization Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAINING_POLICY___SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrainingPolicy__ScalerRequiredWhenNormalizationEnabled__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.AIModelImpl <em>AI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.AIModelImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getAIModel()
		 * @generated
		 */
		EClass AI_MODEL = eINSTANCE.getAIModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_MODEL__NAME = eINSTANCE.getAIModel_Name();

		/**
		 * The meta object literal for the '<em><b>Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_MODEL__CLASS_PATH = eINSTANCE.getAIModel_ClassPath();

		/**
		 * The meta object literal for the '<em><b>Required Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_MODEL__REQUIRED_PACKAGES = eINSTANCE.getAIModel_RequiredPackages();

		/**
		 * The meta object literal for the '<em><b>Training Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__TRAINING_POLICY = eINSTANCE.getAIModel_TrainingPolicy();

		/**
		 * The meta object literal for the '<em><b>Accepted Dataset Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__ACCEPTED_DATASET_TYPES = eINSTANCE.getAIModel_AcceptedDatasetTypes();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__PARAMETERS = eINSTANCE.getAIModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Allowed Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__ALLOWED_METHODS = eINSTANCE.getAIModel_AllowedMethods();

		/**
		 * The meta object literal for the '<em><b>Accepted Dataset Types Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_MODEL___ACCEPTED_DATASET_TYPES_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAIModel__AcceptedDatasetTypesNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Allowed Methods Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_MODEL___ALLOWED_METHODS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAIModel__AllowedMethodsNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Parameter Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_MODEL___UNIQUE_PARAMETER_KEYS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAIModel__UniqueParameterKeys__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.ParameterImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl <em>Explanation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl
		 * @see com.example.xai.model.xaiConfig.impl.XaiConfigPackageImpl#getExplanationMethod()
		 * @generated
		 */
		EClass EXPLANATION_METHOD = eINSTANCE.getExplanationMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLANATION_METHOD__NAME = eINSTANCE.getExplanationMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Min Expertise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLANATION_METHOD__MIN_EXPERTISE = eINSTANCE.getExplanationMethod_MinExpertise();

		/**
		 * The meta object literal for the '<em><b>Supported Formats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLANATION_METHOD__SUPPORTED_FORMATS = eINSTANCE.getExplanationMethod_SupportedFormats();

		/**
		 * The meta object literal for the '<em><b>Default Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLANATION_METHOD__DEFAULT_FORMAT = eINSTANCE.getExplanationMethod_DefaultFormat();

		/**
		 * The meta object literal for the '<em><b>Recommended Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLANATION_METHOD__RECOMMENDED_PURPOSES = eINSTANCE.getExplanationMethod_RecommendedPurposes();

		/**
		 * The meta object literal for the '<em><b>Debug Techniques</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLANATION_METHOD__DEBUG_TECHNIQUES = eINSTANCE.getExplanationMethod_DebugTechniques();

		/**
		 * The meta object literal for the '<em><b>Supported Formats Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPLANATION_METHOD___SUPPORTED_FORMATS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExplanationMethod__SupportedFormatsNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Debug Purpose Expected When Debug Techniques Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPLANATION_METHOD___DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExplanationMethod__DebugPurposeExpectedWhenDebugTechniquesExist__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Default Format Must Be Supported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPLANATION_METHOD___DEFAULT_FORMAT_MUST_BE_SUPPORTED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExplanationMethod__DefaultFormatMustBeSupported__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Scope Value Is Controlled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPLANATION_METHOD___SCOPE_VALUE_IS_CONTROLLED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExplanationMethod__ScopeValueIsControlled__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLANATION_METHOD__SCOPE = eINSTANCE.getExplanationMethod_Scope();

		/**
		 * The meta object literal for the '<em><b>Implementation Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH = eINSTANCE.getExplanationMethod_ImplementationClassPath();

		/**
		 * The meta object literal for the '<em><b>Required Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLANATION_METHOD__REQUIRED_PACKAGES = eINSTANCE.getExplanationMethod_RequiredPackages();

	}

} //XaiConfigPackage
