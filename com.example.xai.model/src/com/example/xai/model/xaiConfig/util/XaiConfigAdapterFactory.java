/**
 */
package com.example.xai.model.xaiConfig.util;

import com.example.xai.model.xaiConfig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage
 * @generated
 */
public class XaiConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XaiConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XaiConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XaiConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XaiConfigSwitch<Adapter> modelSwitch =
		new XaiConfigSwitch<Adapter>() {
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseExpertiseLevel(ExpertiseLevel object) {
				return createExpertiseLevelAdapter();
			}
			@Override
			public Adapter caseDetailsLevel(DetailsLevel object) {
				return createDetailsLevelAdapter();
			}
			@Override
			public Adapter caseOutputFormat(OutputFormat object) {
				return createOutputFormatAdapter();
			}
			@Override
			public Adapter casePurpose(Purpose object) {
				return createPurposeAdapter();
			}
			@Override
			public Adapter caseDebugTechnique(DebugTechnique object) {
				return createDebugTechniqueAdapter();
			}
			@Override
			public Adapter caseDatasetType(DatasetType object) {
				return createDatasetTypeAdapter();
			}
			@Override
			public Adapter caseTrainingPolicy(TrainingPolicy object) {
				return createTrainingPolicyAdapter();
			}
			@Override
			public Adapter caseAIModel(AIModel object) {
				return createAIModelAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseExplanationMethod(ExplanationMethod object) {
				return createExplanationMethodAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.ExpertiseLevel <em>Expertise Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.ExpertiseLevel
	 * @generated
	 */
	public Adapter createExpertiseLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.DetailsLevel <em>Details Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.DetailsLevel
	 * @generated
	 */
	public Adapter createDetailsLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.OutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.OutputFormat
	 * @generated
	 */
	public Adapter createOutputFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.Purpose
	 * @generated
	 */
	public Adapter createPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.DebugTechnique <em>Debug Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.DebugTechnique
	 * @generated
	 */
	public Adapter createDebugTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.DatasetType
	 * @generated
	 */
	public Adapter createDatasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.TrainingPolicy <em>Training Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.TrainingPolicy
	 * @generated
	 */
	public Adapter createTrainingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.AIModel <em>AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.AIModel
	 * @generated
	 */
	public Adapter createAIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.xai.model.xaiConfig.ExplanationMethod <em>Explanation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.xai.model.xaiConfig.ExplanationMethod
	 * @generated
	 */
	public Adapter createExplanationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XaiConfigAdapterFactory
