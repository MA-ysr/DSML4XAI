/**
 */
package com.example.xai.model.xaiConfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage
 * @generated
 */
public interface XaiConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XaiConfigFactory eINSTANCE = com.example.xai.model.xaiConfig.impl.XaiConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Expertise Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expertise Level</em>'.
	 * @generated
	 */
	ExpertiseLevel createExpertiseLevel();

	/**
	 * Returns a new object of class '<em>Details Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Level</em>'.
	 * @generated
	 */
	DetailsLevel createDetailsLevel();

	/**
	 * Returns a new object of class '<em>Output Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Format</em>'.
	 * @generated
	 */
	OutputFormat createOutputFormat();

	/**
	 * Returns a new object of class '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose</em>'.
	 * @generated
	 */
	Purpose createPurpose();

	/**
	 * Returns a new object of class '<em>Debug Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debug Technique</em>'.
	 * @generated
	 */
	DebugTechnique createDebugTechnique();

	/**
	 * Returns a new object of class '<em>Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Type</em>'.
	 * @generated
	 */
	DatasetType createDatasetType();

	/**
	 * Returns a new object of class '<em>Training Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training Policy</em>'.
	 * @generated
	 */
	TrainingPolicy createTrainingPolicy();

	/**
	 * Returns a new object of class '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model</em>'.
	 * @generated
	 */
	AIModel createAIModel();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Explanation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Method</em>'.
	 * @generated
	 */
	ExplanationMethod createExplanationMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XaiConfigPackage getXaiConfigPackage();

} //XaiConfigFactory
