/**
 */
package com.example.xai.model.explainableAI;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.User#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.User#getExpertise <em>Expertise</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.User#getFormat <em>Format</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.User#getDetails <em>Details</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.User#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonBlankDetailsIfSpecified'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expertise</em>' attribute.
	 * @see #setExpertise(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser_Expertise()
	 * @model required="true"
	 * @generated
	 */
	String getExpertise();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.User#getExpertise <em>Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expertise</em>' attribute.
	 * @see #getExpertise()
	 * @generated
	 */
	void setExpertise(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute list.
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser_Format()
	 * @model
	 * @generated
	 */
	EList<String> getFormat();

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.User#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see com.example.xai.model.explainableAI.explainableAIPackage#getUser_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link com.example.xai.model.explainableAI.User#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  not expertise.oclIsUndefined() and expertise &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankExpertise(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  purpose.oclIsUndefined() or purpose &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankPurposeIfSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  format-&gt;forAll(f | not f.oclIsUndefined() and f &lt;&gt; \'\')'"
	 * @generated
	 */
	boolean NonBlankFormats(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  format-&gt;collect(f | f.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueFormatsCaseInsensitive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  details.oclIsUndefined() or details &lt;&gt; \'\''"
	 * @generated
	 */
	boolean NonBlankDetailsIfSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

} // User
