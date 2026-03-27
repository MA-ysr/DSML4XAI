/**
 */
package com.example.xai.model.xaiConfig.util;

import com.example.xai.model.xaiConfig.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage
 * @generated
 */
public class XaiConfigValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XaiConfigValidator INSTANCE = new XaiConfigValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.example.xai.model.xaiConfig";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Model Names' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_MODEL_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Expertise Ranks' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_EXPERTISE_RANKS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Dataset Type Names' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_DATASET_TYPE_NAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Purpose Names' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_PURPOSE_NAMES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Output Format Names' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_OUTPUT_FORMAT_NAMES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Method Names' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_METHOD_NAMES = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Details Ranks' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__UNIQUE_DETAILS_RANKS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Rank' of 'Expertise Level'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPERTISE_LEVEL__POSITIVE_RANK = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Rank' of 'Details Level'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DETAILS_LEVEL__POSITIVE_RANK = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scaler Required When Normalization Enabled' of 'Training Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAINING_POLICY__SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Accepted Dataset Types Not Empty' of 'AI Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AI_MODEL__ACCEPTED_DATASET_TYPES_NOT_EMPTY = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allowed Methods Not Empty' of 'AI Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AI_MODEL__ALLOWED_METHODS_NOT_EMPTY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Parameter Keys' of 'AI Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AI_MODEL__UNIQUE_PARAMETER_KEYS = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supported Formats Not Empty' of 'Explanation Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPLANATION_METHOD__SUPPORTED_FORMATS_NOT_EMPTY = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Debug Purpose Expected When Debug Techniques Exist' of 'Explanation Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPLANATION_METHOD__DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Default Format Must Be Supported' of 'Explanation Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPLANATION_METHOD__DEFAULT_FORMAT_MUST_BE_SUPPORTED = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scope Value Is Controlled' of 'Explanation Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPLANATION_METHOD__SCOPE_VALUE_IS_CONTROLLED = 17;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 17;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XaiConfigValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XaiConfigPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XaiConfigPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case XaiConfigPackage.EXPERTISE_LEVEL:
				return validateExpertiseLevel((ExpertiseLevel)value, diagnostics, context);
			case XaiConfigPackage.DETAILS_LEVEL:
				return validateDetailsLevel((DetailsLevel)value, diagnostics, context);
			case XaiConfigPackage.OUTPUT_FORMAT:
				return validateOutputFormat((OutputFormat)value, diagnostics, context);
			case XaiConfigPackage.PURPOSE:
				return validatePurpose((Purpose)value, diagnostics, context);
			case XaiConfigPackage.DEBUG_TECHNIQUE:
				return validateDebugTechnique((DebugTechnique)value, diagnostics, context);
			case XaiConfigPackage.DATASET_TYPE:
				return validateDatasetType((DatasetType)value, diagnostics, context);
			case XaiConfigPackage.TRAINING_POLICY:
				return validateTrainingPolicy((TrainingPolicy)value, diagnostics, context);
			case XaiConfigPackage.AI_MODEL:
				return validateAIModel((AIModel)value, diagnostics, context);
			case XaiConfigPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case XaiConfigPackage.EXPLANATION_METHOD:
				return validateExplanationMethod((ExplanationMethod)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configuration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueDetailsRanks(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueModelNames(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueExpertiseRanks(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueDatasetTypeNames(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniquePurposeNames(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueOutputFormatNames(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_UniqueMethodNames(configuration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueDetailsRanks constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueDetailsRanks(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueDetailsRanks(diagnostics, context);
	}

	/**
	 * Validates the UniqueModelNames constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueModelNames(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueModelNames(diagnostics, context);
	}

	/**
	 * Validates the UniqueExpertiseRanks constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueExpertiseRanks(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueExpertiseRanks(diagnostics, context);
	}

	/**
	 * Validates the UniqueDatasetTypeNames constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueDatasetTypeNames(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueDatasetTypeNames(diagnostics, context);
	}

	/**
	 * Validates the UniquePurposeNames constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniquePurposeNames(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniquePurposeNames(diagnostics, context);
	}

	/**
	 * Validates the UniqueOutputFormatNames constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueOutputFormatNames(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueOutputFormatNames(diagnostics, context);
	}

	/**
	 * Validates the UniqueMethodNames constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_UniqueMethodNames(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.UniqueMethodNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpertiseLevel(ExpertiseLevel expertiseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expertiseLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expertiseLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpertiseLevel_PositiveRank(expertiseLevel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveRank constraint of '<em>Expertise Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpertiseLevel_PositiveRank(ExpertiseLevel expertiseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return expertiseLevel.PositiveRank(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsLevel(DetailsLevel detailsLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detailsLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detailsLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailsLevel_PositiveRank(detailsLevel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveRank constraint of '<em>Details Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsLevel_PositiveRank(DetailsLevel detailsLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return detailsLevel.PositiveRank(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFormat(OutputFormat outputFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputFormat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose(Purpose purpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(purpose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebugTechnique(DebugTechnique debugTechnique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(debugTechnique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetType(DatasetType datasetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainingPolicy(TrainingPolicy trainingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trainingPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trainingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainingPolicy_ScalerRequiredWhenNormalizationEnabled(trainingPolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ScalerRequiredWhenNormalizationEnabled constraint of '<em>Training Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainingPolicy_ScalerRequiredWhenNormalizationEnabled(TrainingPolicy trainingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trainingPolicy.ScalerRequiredWhenNormalizationEnabled(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAIModel(AIModel aiModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aiModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAIModel_UniqueParameterKeys(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAIModel_AcceptedDatasetTypesNotEmpty(aiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAIModel_AllowedMethodsNotEmpty(aiModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueParameterKeys constraint of '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAIModel_UniqueParameterKeys(AIModel aiModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aiModel.UniqueParameterKeys(diagnostics, context);
	}

	/**
	 * Validates the AcceptedDatasetTypesNotEmpty constraint of '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAIModel_AcceptedDatasetTypesNotEmpty(AIModel aiModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aiModel.AcceptedDatasetTypesNotEmpty(diagnostics, context);
	}

	/**
	 * Validates the AllowedMethodsNotEmpty constraint of '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAIModel_AllowedMethodsNotEmpty(AIModel aiModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aiModel.AllowedMethodsNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationMethod(ExplanationMethod explanationMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(explanationMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateExplanationMethod_ScopeValueIsControlled(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateExplanationMethod_SupportedFormatsNotEmpty(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateExplanationMethod_DebugPurposeExpectedWhenDebugTechniquesExist(explanationMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateExplanationMethod_DefaultFormatMustBeSupported(explanationMethod, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ScopeValueIsControlled constraint of '<em>Explanation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationMethod_ScopeValueIsControlled(ExplanationMethod explanationMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return explanationMethod.ScopeValueIsControlled(diagnostics, context);
	}

	/**
	 * Validates the SupportedFormatsNotEmpty constraint of '<em>Explanation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationMethod_SupportedFormatsNotEmpty(ExplanationMethod explanationMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return explanationMethod.SupportedFormatsNotEmpty(diagnostics, context);
	}

	/**
	 * Validates the DebugPurposeExpectedWhenDebugTechniquesExist constraint of '<em>Explanation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationMethod_DebugPurposeExpectedWhenDebugTechniquesExist(ExplanationMethod explanationMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return explanationMethod.DebugPurposeExpectedWhenDebugTechniquesExist(diagnostics, context);
	}

	/**
	 * Validates the DefaultFormatMustBeSupported constraint of '<em>Explanation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationMethod_DefaultFormatMustBeSupported(ExplanationMethod explanationMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return explanationMethod.DefaultFormatMustBeSupported(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XaiConfigValidator
