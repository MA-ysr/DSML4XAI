/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XaiConfigFactoryImpl extends EFactoryImpl implements XaiConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XaiConfigFactory init() {
		try {
			XaiConfigFactory theXaiConfigFactory = (XaiConfigFactory)EPackage.Registry.INSTANCE.getEFactory(XaiConfigPackage.eNS_URI);
			if (theXaiConfigFactory != null) {
				return theXaiConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XaiConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XaiConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XaiConfigPackage.CONFIGURATION: return createConfiguration();
			case XaiConfigPackage.EXPERTISE_LEVEL: return createExpertiseLevel();
			case XaiConfigPackage.DETAILS_LEVEL: return createDetailsLevel();
			case XaiConfigPackage.OUTPUT_FORMAT: return createOutputFormat();
			case XaiConfigPackage.PURPOSE: return createPurpose();
			case XaiConfigPackage.DEBUG_TECHNIQUE: return createDebugTechnique();
			case XaiConfigPackage.DATASET_TYPE: return createDatasetType();
			case XaiConfigPackage.TRAINING_POLICY: return createTrainingPolicy();
			case XaiConfigPackage.AI_MODEL: return createAIModel();
			case XaiConfigPackage.PARAMETER: return createParameter();
			case XaiConfigPackage.EXPLANATION_METHOD: return createExplanationMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpertiseLevel createExpertiseLevel() {
		ExpertiseLevelImpl expertiseLevel = new ExpertiseLevelImpl();
		return expertiseLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsLevel createDetailsLevel() {
		DetailsLevelImpl detailsLevel = new DetailsLevelImpl();
		return detailsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputFormat createOutputFormat() {
		OutputFormatImpl outputFormat = new OutputFormatImpl();
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Purpose createPurpose() {
		PurposeImpl purpose = new PurposeImpl();
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DebugTechnique createDebugTechnique() {
		DebugTechniqueImpl debugTechnique = new DebugTechniqueImpl();
		return debugTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType createDatasetType() {
		DatasetTypeImpl datasetType = new DatasetTypeImpl();
		return datasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingPolicy createTrainingPolicy() {
		TrainingPolicyImpl trainingPolicy = new TrainingPolicyImpl();
		return trainingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModel createAIModel() {
		AIModelImpl aiModel = new AIModelImpl();
		return aiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationMethod createExplanationMethod() {
		ExplanationMethodImpl explanationMethod = new ExplanationMethodImpl();
		return explanationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XaiConfigPackage getXaiConfigPackage() {
		return (XaiConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XaiConfigPackage getPackage() {
		return XaiConfigPackage.eINSTANCE;
	}

} //XaiConfigFactoryImpl
