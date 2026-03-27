/**
 */
package com.example.xai.model.explainableAI.impl;

import com.example.xai.model.explainableAI.Dataset;
import com.example.xai.model.explainableAI.Model;
import com.example.xai.model.explainableAI.User;
import com.example.xai.model.explainableAI.explainableAIFactory;
import com.example.xai.model.explainableAI.explainableAIPackage;

import com.example.xai.model.explainableAI.util.explainableAIValidator;
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
public class explainableAIPackageImpl extends EPackageImpl implements explainableAIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

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
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private explainableAIPackageImpl() {
		super(eNS_URI, explainableAIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link explainableAIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static explainableAIPackage init() {
		if (isInited)
			return (explainableAIPackage) EPackage.Registry.INSTANCE.getEPackage(explainableAIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredexplainableAIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		explainableAIPackageImpl theexplainableAIPackage = registeredexplainableAIPackage instanceof explainableAIPackageImpl
				? (explainableAIPackageImpl) registeredexplainableAIPackage
				: new explainableAIPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theexplainableAIPackage.createPackageContents();

		// Initialize created meta-data
		theexplainableAIPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theexplainableAIPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return explainableAIValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theexplainableAIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(explainableAIPackage.eNS_URI, theexplainableAIPackage);
		return theexplainableAIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Name() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_ModelType() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Method() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_User() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Dataset() {
		return (EReference) modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Expertise() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Format() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Details() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Purpose() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__NonBlankExpertise__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__NonBlankPurposeIfSpecified__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__NonBlankFormats__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__UniqueFormatsCaseInsensitive__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__NonBlankDetailsIfSpecified__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Path() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Format() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_TargetColumn() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataset__NonBlankPath__DiagnosticChain_Map() {
		return datasetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataset__NonBlankTargetIfSpecified__DiagnosticChain_Map() {
		return datasetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataset__NonBlankFormat__DiagnosticChain_Map() {
		return datasetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public explainableAIFactory getexplainableAIFactory() {
		return (explainableAIFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__MODEL_TYPE);
		createEAttribute(modelEClass, MODEL__METHOD);
		createEReference(modelEClass, MODEL__USER);
		createEReference(modelEClass, MODEL__DATASET);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__EXPERTISE);
		createEAttribute(userEClass, USER__FORMAT);
		createEAttribute(userEClass, USER__DETAILS);
		createEAttribute(userEClass, USER__PURPOSE);
		createEOperation(userEClass, USER___NON_BLANK_EXPERTISE__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___NON_BLANK_PURPOSE_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___NON_BLANK_FORMATS__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___UNIQUE_FORMATS_CASE_INSENSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___NON_BLANK_DETAILS_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__PATH);
		createEAttribute(datasetEClass, DATASET__FORMAT);
		createEAttribute(datasetEClass, DATASET__TARGET_COLUMN);
		createEOperation(datasetEClass, DATASET___NON_BLANK_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(datasetEClass, DATASET___NON_BLANK_TARGET_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(datasetEClass, DATASET___NON_BLANK_FORMAT__DIAGNOSTICCHAIN_MAP);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ModelType(), ecorePackage.getEString(), "modelType", null, 1, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Method(), ecorePackage.getEString(), "method", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_User(), this.getUser(), null, "user", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModel_Dataset(), this.getDataset(), null, "dataset", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Expertise(), ecorePackage.getEString(), "expertise", null, 1, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Format(), ecorePackage.getEString(), "format", null, 0, -1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Details(), ecorePackage.getEString(), "details", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUser__NonBlankExpertise__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankExpertise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__NonBlankPurposeIfSpecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankPurposeIfSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__NonBlankFormats__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankFormats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__UniqueFormatsCaseInsensitive__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueFormatsCaseInsensitive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__NonBlankDetailsIfSpecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankDetailsIfSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Path(), ecorePackage.getEString(), "path", null, 1, 1, Dataset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Format(), ecorePackage.getEString(), "format", null, 1, 1, Dataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_TargetColumn(), ecorePackage.getEString(), "targetColumn", null, 0, 1, Dataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataset__NonBlankPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NonBlankPath",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataset__NonBlankTargetIfSpecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankTargetIfSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataset__NonBlankFormat__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonBlankFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		addAnnotation(this, source, new String[] {});
		addAnnotation(userEClass, source, new String[] { "constraints", "NonBlankDetailsIfSpecified" });
		addAnnotation(datasetEClass, source, new String[] { "constraints", "NonBlankFormat" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getUser__NonBlankExpertise__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  not expertise.oclIsUndefined() and expertise <> \'\'" });
		addAnnotation(getUser__NonBlankPurposeIfSpecified__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  purpose.oclIsUndefined() or purpose <> \'\'" });
		addAnnotation(getUser__NonBlankFormats__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  format->forAll(f | not f.oclIsUndefined() and f <> \'\')" });
		addAnnotation(getUser__UniqueFormatsCaseInsensitive__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  format->collect(f | f.toLower())->isUnique(x | x)" });
		addAnnotation(getUser__NonBlankDetailsIfSpecified__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  details.oclIsUndefined() or details <> \'\'" });
		addAnnotation(getDataset__NonBlankPath__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  not path.oclIsUndefined() and path <> \'\'" });
		addAnnotation(getDataset__NonBlankTargetIfSpecified__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  targetColumn.oclIsUndefined() or targetColumn <> \'\'" });
		addAnnotation(getDataset__NonBlankFormat__DiagnosticChain_Map(), source,
				new String[] { "body", "\n\t\t  not format.oclIsUndefined() and format <> \'\'" });
	}

} //explainableAIPackageImpl
