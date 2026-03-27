/**
 */
package com.example.xai.model.explainableAI;

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
 * @see com.example.xai.model.explainableAI.explainableAIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface explainableAIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "explainableAI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/explainableAI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "explainableAI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	explainableAIPackage eINSTANCE = com.example.xai.model.explainableAI.impl.explainableAIPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.xai.model.explainableAI.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.explainableAI.impl.ModelImpl
	 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METHOD = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__USER = 3;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATASET = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.xai.model.explainableAI.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.explainableAI.impl.UserImpl
	 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EXPERTISE = 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PURPOSE = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Non Blank Expertise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___NON_BLANK_EXPERTISE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Non Blank Purpose If Specified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___NON_BLANK_PURPOSE_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Non Blank Formats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___NON_BLANK_FORMATS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Formats Case Insensitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_FORMATS_CASE_INSENSITIVE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Non Blank Details If Specified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___NON_BLANK_DETAILS_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.example.xai.model.explainableAI.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.xai.model.explainableAI.impl.DatasetImpl
	 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PATH = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Target Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TARGET_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Non Blank Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET___NON_BLANK_PATH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Non Blank Target If Specified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET___NON_BLANK_TARGET_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Non Blank Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET___NON_BLANK_FORMAT__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.explainableAI.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.example.xai.model.explainableAI.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.explainableAI.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Model#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see com.example.xai.model.explainableAI.Model#getModelType()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Model#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see com.example.xai.model.explainableAI.Model#getMethod()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Method();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.xai.model.explainableAI.Model#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see com.example.xai.model.explainableAI.Model#getUser()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_User();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.xai.model.explainableAI.Model#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see com.example.xai.model.explainableAI.Model#getDataset()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Dataset();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.explainableAI.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.example.xai.model.explainableAI.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.xai.model.explainableAI.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.User#getExpertise <em>Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expertise</em>'.
	 * @see com.example.xai.model.explainableAI.User#getExpertise()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Expertise();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.xai.model.explainableAI.User#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see com.example.xai.model.explainableAI.User#getFormat()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Format();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.User#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see com.example.xai.model.explainableAI.User#getDetails()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Details();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.User#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see com.example.xai.model.explainableAI.User#getPurpose()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Purpose();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.User#NonBlankExpertise(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Expertise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Expertise</em>' operation.
	 * @see com.example.xai.model.explainableAI.User#NonBlankExpertise(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__NonBlankExpertise__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.User#NonBlankPurposeIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Purpose If Specified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Purpose If Specified</em>' operation.
	 * @see com.example.xai.model.explainableAI.User#NonBlankPurposeIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__NonBlankPurposeIfSpecified__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.User#NonBlankFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Formats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Formats</em>' operation.
	 * @see com.example.xai.model.explainableAI.User#NonBlankFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__NonBlankFormats__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.User#UniqueFormatsCaseInsensitive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Formats Case Insensitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Formats Case Insensitive</em>' operation.
	 * @see com.example.xai.model.explainableAI.User#UniqueFormatsCaseInsensitive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__UniqueFormatsCaseInsensitive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.User#NonBlankDetailsIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Details If Specified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Details If Specified</em>' operation.
	 * @see com.example.xai.model.explainableAI.User#NonBlankDetailsIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__NonBlankDetailsIfSpecified__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.example.xai.model.explainableAI.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see com.example.xai.model.explainableAI.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Dataset#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.example.xai.model.explainableAI.Dataset#getPath()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Dataset#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.example.xai.model.explainableAI.Dataset#getFormat()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Format();

	/**
	 * Returns the meta object for the attribute '{@link com.example.xai.model.explainableAI.Dataset#getTargetColumn <em>Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Column</em>'.
	 * @see com.example.xai.model.explainableAI.Dataset#getTargetColumn()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_TargetColumn();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.Dataset#NonBlankPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Path</em>' operation.
	 * @see com.example.xai.model.explainableAI.Dataset#NonBlankPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataset__NonBlankPath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.Dataset#NonBlankTargetIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Target If Specified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Target If Specified</em>' operation.
	 * @see com.example.xai.model.explainableAI.Dataset#NonBlankTargetIfSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataset__NonBlankTargetIfSpecified__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.example.xai.model.explainableAI.Dataset#NonBlankFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Blank Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Blank Format</em>' operation.
	 * @see com.example.xai.model.explainableAI.Dataset#NonBlankFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataset__NonBlankFormat__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	explainableAIFactory getexplainableAIFactory();

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
		 * The meta object literal for the '{@link com.example.xai.model.explainableAI.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.explainableAI.impl.ModelImpl
		 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_TYPE = eINSTANCE.getModel_ModelType();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__METHOD = eINSTANCE.getModel_Method();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__USER = eINSTANCE.getModel_User();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATASET = eINSTANCE.getModel_Dataset();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.explainableAI.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.explainableAI.impl.UserImpl
		 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Expertise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EXPERTISE = eINSTANCE.getUser_Expertise();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FORMAT = eINSTANCE.getUser_Format();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DETAILS = eINSTANCE.getUser_Details();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PURPOSE = eINSTANCE.getUser_Purpose();

		/**
		 * The meta object literal for the '<em><b>Non Blank Expertise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___NON_BLANK_EXPERTISE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__NonBlankExpertise__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Blank Purpose If Specified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___NON_BLANK_PURPOSE_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__NonBlankPurposeIfSpecified__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Blank Formats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___NON_BLANK_FORMATS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__NonBlankFormats__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Formats Case Insensitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UNIQUE_FORMATS_CASE_INSENSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__UniqueFormatsCaseInsensitive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Blank Details If Specified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___NON_BLANK_DETAILS_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__NonBlankDetailsIfSpecified__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.example.xai.model.explainableAI.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.xai.model.explainableAI.impl.DatasetImpl
		 * @see com.example.xai.model.explainableAI.impl.explainableAIPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__PATH = eINSTANCE.getDataset_Path();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__FORMAT = eINSTANCE.getDataset_Format();

		/**
		 * The meta object literal for the '<em><b>Target Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__TARGET_COLUMN = eINSTANCE.getDataset_TargetColumn();

		/**
		 * The meta object literal for the '<em><b>Non Blank Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET___NON_BLANK_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDataset__NonBlankPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Blank Target If Specified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET___NON_BLANK_TARGET_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDataset__NonBlankTargetIfSpecified__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Blank Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET___NON_BLANK_FORMAT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDataset__NonBlankFormat__DiagnosticChain_Map();

	}

} //explainableAIPackage
