/**
 */
package com.example.xai.model.xaiConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debug Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.DebugTechnique#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDebugTechnique()
 * @model
 * @generated
 */
public interface DebugTechnique extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDebugTechnique_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.DebugTechnique#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DebugTechnique
