/**
 */
package com.example.xai.model.explainableAI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.Model#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Model#getModelType <em>Model Type</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Model#getMethod <em>Method</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Model#getUser <em>User</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Model#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see #setModelType(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel_ModelType()
	 * @model required="true"
	 * @generated
	 */
	String getModelType();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Model#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Model#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Model#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(Dataset)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getModel_Dataset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Model#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);

} // Model
