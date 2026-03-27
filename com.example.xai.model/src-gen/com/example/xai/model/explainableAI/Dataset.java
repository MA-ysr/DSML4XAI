/**
 */
package com.example.xai.model.explainableAI;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.Dataset#getPath <em>Path</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Dataset#getFormat <em>Format</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.Dataset#getTargetColumn <em>Target Column</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.explainableAI.explainableAIPackage#getDataset()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonBlankFormat'"
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getDataset_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Dataset#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getDataset_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Dataset#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Target Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column</em>' attribute.
	 * @see #setTargetColumn(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getDataset_TargetColumn()
	 * @model
	 * @generated
	 */
	String getTargetColumn();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.Dataset#getTargetColumn <em>Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column</em>' attribute.
	 * @see #getTargetColumn()
	 * @generated
	 */
	void setTargetColumn(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  not path.oclIsUndefined() and path &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankPath(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  targetColumn.oclIsUndefined() or targetColumn &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankTargetIfSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  not format.oclIsUndefined() and format &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankFormat(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Dataset
