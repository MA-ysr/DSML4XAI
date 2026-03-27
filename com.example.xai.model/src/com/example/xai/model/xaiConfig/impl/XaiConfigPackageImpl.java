/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.AIModel;
import com.example.xai.model.xaiConfig.Configuration;
import com.example.xai.model.xaiConfig.DatasetType;
import com.example.xai.model.xaiConfig.DebugTechnique;
import com.example.xai.model.xaiConfig.DetailsLevel;
import com.example.xai.model.xaiConfig.ExpertiseLevel;
import com.example.xai.model.xaiConfig.ExplanationMethod;
import com.example.xai.model.xaiConfig.OutputFormat;
import com.example.xai.model.xaiConfig.Parameter;
import com.example.xai.model.xaiConfig.Purpose;
import com.example.xai.model.xaiConfig.TrainingPolicy;
import com.example.xai.model.xaiConfig.XaiConfigFactory;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import com.example.xai.model.xaiConfig.util.XaiConfigValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XaiConfigPackageImpl extends EPackageImpl implements XaiConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expertiseLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debugTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XaiConfigPackageImpl() {
		super(eNS_URI, XaiConfigFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link XaiConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XaiConfigPackage init() {
		if (isInited) return (XaiConfigPackage)EPackage.Registry.INSTANCE.getEPackage(XaiConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXaiConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XaiConfigPackageImpl theXaiConfigPackage = registeredXaiConfigPackage instanceof XaiConfigPackageImpl ? (XaiConfigPackageImpl)registeredXaiConfigPackage : new XaiConfigPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theXaiConfigPackage.createPackageContents();

		// Initialize created meta-data
		theXaiConfigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXaiConfigPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return XaiConfigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXaiConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XaiConfigPackage.eNS_URI, theXaiConfigPackage);
		return theXaiConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_ExpertiseLevels() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_DetailsLevels() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_OutputFormats() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Purposes() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_DebugTechniques() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_DatasetTypes() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_TrainingPolicies() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Models() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Methods() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueModelNames__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueExpertiseRanks__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueDatasetTypeNames__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniquePurposeNames__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueOutputFormatNames__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueMethodNames__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfiguration__UniqueDetailsRanks__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpertiseLevel() {
		return expertiseLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpertiseLevel_Name() {
		return (EAttribute)expertiseLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpertiseLevel_Rank() {
		return (EAttribute)expertiseLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpertiseLevel__PositiveRank__DiagnosticChain_Map() {
		return expertiseLevelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailsLevel() {
		return detailsLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailsLevel_Name() {
		return (EAttribute)detailsLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailsLevel_Rank() {
		return (EAttribute)detailsLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDetailsLevel__PositiveRank__DiagnosticChain_Map() {
		return detailsLevelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputFormat() {
		return outputFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputFormat_Name() {
		return (EAttribute)outputFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPurpose() {
		return purposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPurpose_Name() {
		return (EAttribute)purposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebugTechnique() {
		return debugTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDebugTechnique_Name() {
		return (EAttribute)debugTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetType() {
		return datasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_Name() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_RequiresTargetColumn() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_RequiredPackages() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainingPolicy() {
		return trainingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingPolicy_Name() {
		return (EAttribute)trainingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingPolicy_EnableNormalization() {
		return (EAttribute)trainingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingPolicy_ScalerClassPath() {
		return (EAttribute)trainingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingPolicy_UseStratification() {
		return (EAttribute)trainingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingPolicy_RequiredPackages() {
		return (EAttribute)trainingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTrainingPolicy__ScalerRequiredWhenNormalizationEnabled__DiagnosticChain_Map() {
		return trainingPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModel() {
		return aiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIModel_Name() {
		return (EAttribute)aiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIModel_ClassPath() {
		return (EAttribute)aiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIModel_RequiredPackages() {
		return (EAttribute)aiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_TrainingPolicy() {
		return (EReference)aiModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_AcceptedDatasetTypes() {
		return (EReference)aiModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_Parameters() {
		return (EReference)aiModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_AllowedMethods() {
		return (EReference)aiModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAIModel__AcceptedDatasetTypesNotEmpty__DiagnosticChain_Map() {
		return aiModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAIModel__AllowedMethodsNotEmpty__DiagnosticChain_Map() {
		return aiModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAIModel__UniqueParameterKeys__DiagnosticChain_Map() {
		return aiModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExplanationMethod() {
		return explanationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplanationMethod_Name() {
		return (EAttribute)explanationMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplanationMethod_MinExpertise() {
		return (EReference)explanationMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplanationMethod_SupportedFormats() {
		return (EReference)explanationMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplanationMethod_DefaultFormat() {
		return (EReference)explanationMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplanationMethod_RecommendedPurposes() {
		return (EReference)explanationMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplanationMethod_DebugTechniques() {
		return (EReference)explanationMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExplanationMethod__SupportedFormatsNotEmpty__DiagnosticChain_Map() {
		return explanationMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExplanationMethod__DebugPurposeExpectedWhenDebugTechniquesExist__DiagnosticChain_Map() {
		return explanationMethodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExplanationMethod__DefaultFormatMustBeSupported__DiagnosticChain_Map() {
		return explanationMethodEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExplanationMethod__ScopeValueIsControlled__DiagnosticChain_Map() {
		return explanationMethodEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplanationMethod_Scope() {
		return (EAttribute)explanationMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplanationMethod_ImplementationClassPath() {
		return (EAttribute)explanationMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplanationMethod_RequiredPackages() {
		return (EAttribute)explanationMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XaiConfigFactory getXaiConfigFactory() {
		return (XaiConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__EXPERTISE_LEVELS);
		createEReference(configurationEClass, CONFIGURATION__DETAILS_LEVELS);
		createEReference(configurationEClass, CONFIGURATION__OUTPUT_FORMATS);
		createEReference(configurationEClass, CONFIGURATION__PURPOSES);
		createEReference(configurationEClass, CONFIGURATION__DEBUG_TECHNIQUES);
		createEReference(configurationEClass, CONFIGURATION__DATASET_TYPES);
		createEReference(configurationEClass, CONFIGURATION__TRAINING_POLICIES);
		createEReference(configurationEClass, CONFIGURATION__MODELS);
		createEReference(configurationEClass, CONFIGURATION__METHODS);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_MODEL_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_EXPERTISE_RANKS__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_DATASET_TYPE_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_PURPOSE_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_OUTPUT_FORMAT_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_METHOD_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___UNIQUE_DETAILS_RANKS__DIAGNOSTICCHAIN_MAP);

		expertiseLevelEClass = createEClass(EXPERTISE_LEVEL);
		createEAttribute(expertiseLevelEClass, EXPERTISE_LEVEL__NAME);
		createEAttribute(expertiseLevelEClass, EXPERTISE_LEVEL__RANK);
		createEOperation(expertiseLevelEClass, EXPERTISE_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP);

		detailsLevelEClass = createEClass(DETAILS_LEVEL);
		createEAttribute(detailsLevelEClass, DETAILS_LEVEL__NAME);
		createEAttribute(detailsLevelEClass, DETAILS_LEVEL__RANK);
		createEOperation(detailsLevelEClass, DETAILS_LEVEL___POSITIVE_RANK__DIAGNOSTICCHAIN_MAP);

		outputFormatEClass = createEClass(OUTPUT_FORMAT);
		createEAttribute(outputFormatEClass, OUTPUT_FORMAT__NAME);

		purposeEClass = createEClass(PURPOSE);
		createEAttribute(purposeEClass, PURPOSE__NAME);

		debugTechniqueEClass = createEClass(DEBUG_TECHNIQUE);
		createEAttribute(debugTechniqueEClass, DEBUG_TECHNIQUE__NAME);

		datasetTypeEClass = createEClass(DATASET_TYPE);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__NAME);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__REQUIRES_TARGET_COLUMN);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__REQUIRED_PACKAGES);

		trainingPolicyEClass = createEClass(TRAINING_POLICY);
		createEAttribute(trainingPolicyEClass, TRAINING_POLICY__NAME);
		createEAttribute(trainingPolicyEClass, TRAINING_POLICY__ENABLE_NORMALIZATION);
		createEAttribute(trainingPolicyEClass, TRAINING_POLICY__SCALER_CLASS_PATH);
		createEAttribute(trainingPolicyEClass, TRAINING_POLICY__USE_STRATIFICATION);
		createEAttribute(trainingPolicyEClass, TRAINING_POLICY__REQUIRED_PACKAGES);
		createEOperation(trainingPolicyEClass, TRAINING_POLICY___SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED__DIAGNOSTICCHAIN_MAP);

		aiModelEClass = createEClass(AI_MODEL);
		createEAttribute(aiModelEClass, AI_MODEL__NAME);
		createEAttribute(aiModelEClass, AI_MODEL__CLASS_PATH);
		createEAttribute(aiModelEClass, AI_MODEL__REQUIRED_PACKAGES);
		createEReference(aiModelEClass, AI_MODEL__TRAINING_POLICY);
		createEReference(aiModelEClass, AI_MODEL__ACCEPTED_DATASET_TYPES);
		createEReference(aiModelEClass, AI_MODEL__PARAMETERS);
		createEReference(aiModelEClass, AI_MODEL__ALLOWED_METHODS);
		createEOperation(aiModelEClass, AI_MODEL___ACCEPTED_DATASET_TYPES_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(aiModelEClass, AI_MODEL___ALLOWED_METHODS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(aiModelEClass, AI_MODEL___UNIQUE_PARAMETER_KEYS__DIAGNOSTICCHAIN_MAP);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		explanationMethodEClass = createEClass(EXPLANATION_METHOD);
		createEAttribute(explanationMethodEClass, EXPLANATION_METHOD__NAME);
		createEAttribute(explanationMethodEClass, EXPLANATION_METHOD__SCOPE);
		createEAttribute(explanationMethodEClass, EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH);
		createEAttribute(explanationMethodEClass, EXPLANATION_METHOD__REQUIRED_PACKAGES);
		createEReference(explanationMethodEClass, EXPLANATION_METHOD__MIN_EXPERTISE);
		createEReference(explanationMethodEClass, EXPLANATION_METHOD__SUPPORTED_FORMATS);
		createEReference(explanationMethodEClass, EXPLANATION_METHOD__DEFAULT_FORMAT);
		createEReference(explanationMethodEClass, EXPLANATION_METHOD__RECOMMENDED_PURPOSES);
		createEReference(explanationMethodEClass, EXPLANATION_METHOD__DEBUG_TECHNIQUES);
		createEOperation(explanationMethodEClass, EXPLANATION_METHOD___SUPPORTED_FORMATS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(explanationMethodEClass, EXPLANATION_METHOD___DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST__DIAGNOSTICCHAIN_MAP);
		createEOperation(explanationMethodEClass, EXPLANATION_METHOD___DEFAULT_FORMAT_MUST_BE_SUPPORTED__DIAGNOSTICCHAIN_MAP);
		createEOperation(explanationMethodEClass, EXPLANATION_METHOD___SCOPE_VALUE_IS_CONTROLLED__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_ExpertiseLevels(), this.getExpertiseLevel(), null, "expertiseLevels", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_DetailsLevels(), this.getDetailsLevel(), null, "detailsLevels", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_OutputFormats(), this.getOutputFormat(), null, "outputFormats", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Purposes(), this.getPurpose(), null, "purposes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_DebugTechniques(), this.getDebugTechnique(), null, "debugTechniques", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_DatasetTypes(), this.getDatasetType(), null, "datasetTypes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_TrainingPolicies(), this.getTrainingPolicy(), null, "trainingPolicies", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Models(), this.getAIModel(), null, "models", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Methods(), this.getExplanationMethod(), null, "methods", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getConfiguration__UniqueModelNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueModelNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniqueExpertiseRanks__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueExpertiseRanks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniqueDatasetTypeNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueDatasetTypeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniquePurposeNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniquePurposeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniqueOutputFormatNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueOutputFormatNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniqueMethodNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueMethodNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfiguration__UniqueDetailsRanks__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueDetailsRanks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expertiseLevelEClass, ExpertiseLevel.class, "ExpertiseLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpertiseLevel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExpertiseLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpertiseLevel_Rank(), ecorePackage.getEInt(), "rank", null, 1, 1, ExpertiseLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExpertiseLevel__PositiveRank__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PositiveRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(detailsLevelEClass, DetailsLevel.class, "DetailsLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailsLevel_Name(), ecorePackage.getEString(), "name", null, 1, 1, DetailsLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailsLevel_Rank(), ecorePackage.getEInt(), "rank", null, 1, 1, DetailsLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDetailsLevel__PositiveRank__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PositiveRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputFormatEClass, OutputFormat.class, "OutputFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputFormat_Name(), ecorePackage.getEString(), "name", null, 1, 1, OutputFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(purposeEClass, Purpose.class, "Purpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurpose_Name(), ecorePackage.getEString(), "name", null, 1, 1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(debugTechniqueEClass, DebugTechnique.class, "DebugTechnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDebugTechnique_Name(), ecorePackage.getEString(), "name", null, 1, 1, DebugTechnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetTypeEClass, DatasetType.class, "DatasetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_RequiresTargetColumn(), ecorePackage.getEBoolean(), "requiresTargetColumn", "false", 1, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_RequiredPackages(), ecorePackage.getEString(), "requiredPackages", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingPolicyEClass, TrainingPolicy.class, "TrainingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainingPolicy_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrainingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingPolicy_EnableNormalization(), ecorePackage.getEBoolean(), "enableNormalization", "false", 1, 1, TrainingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingPolicy_ScalerClassPath(), ecorePackage.getEString(), "scalerClassPath", null, 0, 1, TrainingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingPolicy_UseStratification(), ecorePackage.getEBoolean(), "useStratification", "true", 1, 1, TrainingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingPolicy_RequiredPackages(), ecorePackage.getEString(), "requiredPackages", null, 0, -1, TrainingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTrainingPolicy__ScalerRequiredWhenNormalizationEnabled__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ScalerRequiredWhenNormalizationEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aiModelEClass, AIModel.class, "AIModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIModel_ClassPath(), ecorePackage.getEString(), "classPath", null, 1, 1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIModel_RequiredPackages(), ecorePackage.getEString(), "requiredPackages", null, 0, -1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_TrainingPolicy(), this.getTrainingPolicy(), null, "trainingPolicy", null, 0, 1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_AcceptedDatasetTypes(), this.getDatasetType(), null, "acceptedDatasetTypes", null, 0, -1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_AllowedMethods(), this.getExplanationMethod(), null, "allowedMethods", null, 0, -1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAIModel__AcceptedDatasetTypesNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AcceptedDatasetTypesNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAIModel__AllowedMethodsNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AllowedMethodsNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAIModel__UniqueParameterKeys__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueParameterKeys", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explanationMethodEClass, ExplanationMethod.class, "ExplanationMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplanationMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExplanationMethod_Scope(), ecorePackage.getEString(), "scope", null, 1, 1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExplanationMethod_ImplementationClassPath(), ecorePackage.getEString(), "implementationClassPath", null, 1, 1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExplanationMethod_RequiredPackages(), ecorePackage.getEString(), "requiredPackages", null, 0, -1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplanationMethod_MinExpertise(), this.getExpertiseLevel(), null, "minExpertise", null, 1, 1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplanationMethod_SupportedFormats(), this.getOutputFormat(), null, "supportedFormats", null, 1, -1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplanationMethod_DefaultFormat(), this.getOutputFormat(), null, "defaultFormat", null, 1, 1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplanationMethod_RecommendedPurposes(), this.getPurpose(), null, "recommendedPurposes", null, 0, -1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplanationMethod_DebugTechniques(), this.getDebugTechnique(), null, "debugTechniques", null, 0, -1, ExplanationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExplanationMethod__SupportedFormatsNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SupportedFormatsNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExplanationMethod__DebugPurposeExpectedWhenDebugTechniquesExist__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DebugPurposeExpectedWhenDebugTechniquesExist", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExplanationMethod__DefaultFormatMustBeSupported__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DefaultFormatMustBeSupported", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExplanationMethod__ScopeValueIsControlled__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ScopeValueIsControlled", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (configurationEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueDetailsRanks"
		   });
		addAnnotation
		  (expertiseLevelEClass,
		   source,
		   new String[] {
			   "constraints", "PositiveRank"
		   });
		addAnnotation
		  (detailsLevelEClass,
		   source,
		   new String[] {
			   "constraints", "PositiveRank"
		   });
		addAnnotation
		  (trainingPolicyEClass,
		   source,
		   new String[] {
			   "constraints", "ScalerRequiredWhenNormalizationEnabled"
		   });
		addAnnotation
		  (aiModelEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueParameterKeys"
		   });
		addAnnotation
		  (explanationMethodEClass,
		   source,
		   new String[] {
			   "constraints", "ScopeValueIsControlled"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getConfiguration__UniqueModelNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  models->collect(m | m.name.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getConfiguration__UniqueExpertiseRanks__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  expertiseLevels->isUnique(e | e.rank)"
		   });
		addAnnotation
		  (getConfiguration__UniqueDatasetTypeNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  datasetTypes->collect(d | d.name.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getConfiguration__UniquePurposeNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  purposes->collect(p | p.name.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getConfiguration__UniqueOutputFormatNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  outputFormats->collect(f | f.name.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getConfiguration__UniqueMethodNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  methods->collect(m | m.name.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getConfiguration__UniqueDetailsRanks__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  detailsLevels->isUnique(d | d.rank)"
		   });
		addAnnotation
		  (getExpertiseLevel__PositiveRank__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n  \t\t\trank > 0"
		   });
		addAnnotation
		  (getDetailsLevel__PositiveRank__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n  \t\t\trank > 0"
		   });
		addAnnotation
		  (getTrainingPolicy__ScalerRequiredWhenNormalizationEnabled__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  enableNormalization implies\n\t\t    (not scalerClassPath.oclIsUndefined() and scalerClassPath <> \'\')"
		   });
		addAnnotation
		  (getAIModel__AcceptedDatasetTypesNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  acceptedDatasetTypes->notEmpty()"
		   });
		addAnnotation
		  (getAIModel__AllowedMethodsNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  allowedMethods->notEmpty()"
		   });
		addAnnotation
		  (getAIModel__UniqueParameterKeys__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  parameters->collect(p | p.key.toLower())->isUnique(x | x)"
		   });
		addAnnotation
		  (getExplanationMethod__SupportedFormatsNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  supportedFormats->notEmpty()"
		   });
		addAnnotation
		  (getExplanationMethod__DebugPurposeExpectedWhenDebugTechniquesExist__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  debugTechniques->notEmpty() implies\n\t\t    recommendedPurposes->exists(p | p.name.toLower() = \'debugging\')"
		   });
		addAnnotation
		  (getExplanationMethod__DefaultFormatMustBeSupported__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  supportedFormats->includes(defaultFormat)"
		   });
		addAnnotation
		  (getExplanationMethod__ScopeValueIsControlled__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  scope = \'local\' or scope = \'global\' or scope = \'local+global\'"
		   });
	}

} //XaiConfigPackageImpl
