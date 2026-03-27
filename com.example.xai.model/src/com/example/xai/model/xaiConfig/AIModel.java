/**
 */
package com.example.xai.model.xaiConfig;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getRequiredPackages <em>Required Packages</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getTrainingPolicy <em>Training Policy</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getAcceptedDatasetTypes <em>Accepted Dataset Types</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.AIModel#getAllowedMethods <em>Allowed Methods</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterKeys'"
 * @generated
 */
public interface AIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.AIModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute.
	 * @see #setClassPath(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_ClassPath()
	 * @model required="true"
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.AIModel#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Required Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Packages</em>' attribute list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_RequiredPackages()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredPackages();

	/**
	 * Returns the value of the '<em><b>Training Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Policy</em>' reference.
	 * @see #setTrainingPolicy(TrainingPolicy)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_TrainingPolicy()
	 * @model
	 * @generated
	 */
	TrainingPolicy getTrainingPolicy();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.AIModel#getTrainingPolicy <em>Training Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Policy</em>' reference.
	 * @see #getTrainingPolicy()
	 * @generated
	 */
	void setTrainingPolicy(TrainingPolicy value);

	/**
	 * Returns the value of the '<em><b>Accepted Dataset Types</b></em>' reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.DatasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Dataset Types</em>' reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_AcceptedDatasetTypes()
	 * @model
	 * @generated
	 */
	EList<DatasetType> getAcceptedDatasetTypes();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Allowed Methods</b></em>' reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.ExplanationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Methods</em>' reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getAIModel_AllowedMethods()
	 * @model
	 * @generated
	 */
	EList<ExplanationMethod> getAllowedMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  acceptedDatasetTypes-&gt;notEmpty()'"
	 * @generated
	 */
	boolean AcceptedDatasetTypesNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  allowedMethods-&gt;notEmpty()'"
	 * @generated
	 */
	boolean AllowedMethodsNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  parameters-&gt;collect(p | p.key.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueParameterKeys(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AIModel
