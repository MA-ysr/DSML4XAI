/**
 */
package com.example.xai.model.xaiConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.DatasetType#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.DatasetType#isRequiresTargetColumn <em>Requires Target Column</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.DatasetType#getRequiredPackages <em>Required Packages</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDatasetType()
 * @model
 * @generated
 */
public interface DatasetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDatasetType_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.DatasetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requires Target Column</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Target Column</em>' attribute.
	 * @see #setRequiresTargetColumn(boolean)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDatasetType_RequiresTargetColumn()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequiresTargetColumn();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.DatasetType#isRequiresTargetColumn <em>Requires Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Target Column</em>' attribute.
	 * @see #isRequiresTargetColumn()
	 * @generated
	 */
	void setRequiresTargetColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Required Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Packages</em>' attribute list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getDatasetType_RequiredPackages()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredPackages();

} // DatasetType
