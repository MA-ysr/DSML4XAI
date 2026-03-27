/**
 */
package com.example.xai.model.xaiConfig;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getScope <em>Scope</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getImplementationClassPath <em>Implementation Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getRequiredPackages <em>Required Packages</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getMinExpertise <em>Min Expertise</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getSupportedFormats <em>Supported Formats</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getDefaultFormat <em>Default Format</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getRecommendedPurposes <em>Recommended Purposes</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExplanationMethod#getDebugTechniques <em>Debug Techniques</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ScopeValueIsControlled'"
 * @generated
 */
public interface ExplanationMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Expertise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Expertise</em>' reference.
	 * @see #setMinExpertise(ExpertiseLevel)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_MinExpertise()
	 * @model required="true"
	 * @generated
	 */
	ExpertiseLevel getMinExpertise();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getMinExpertise <em>Min Expertise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Expertise</em>' reference.
	 * @see #getMinExpertise()
	 * @generated
	 */
	void setMinExpertise(ExpertiseLevel value);

	/**
	 * Returns the value of the '<em><b>Supported Formats</b></em>' reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.OutputFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Formats</em>' reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_SupportedFormats()
	 * @model required="true"
	 * @generated
	 */
	EList<OutputFormat> getSupportedFormats();

	/**
	 * Returns the value of the '<em><b>Default Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Format</em>' reference.
	 * @see #setDefaultFormat(OutputFormat)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_DefaultFormat()
	 * @model required="true"
	 * @generated
	 */
	OutputFormat getDefaultFormat();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getDefaultFormat <em>Default Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Format</em>' reference.
	 * @see #getDefaultFormat()
	 * @generated
	 */
	void setDefaultFormat(OutputFormat value);

	/**
	 * Returns the value of the '<em><b>Recommended Purposes</b></em>' reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Purposes</em>' reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_RecommendedPurposes()
	 * @model
	 * @generated
	 */
	EList<Purpose> getRecommendedPurposes();

	/**
	 * Returns the value of the '<em><b>Debug Techniques</b></em>' reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.DebugTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Techniques</em>' reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_DebugTechniques()
	 * @model
	 * @generated
	 */
	EList<DebugTechnique> getDebugTechniques();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  supportedFormats-&gt;notEmpty()'"
	 * @generated
	 */
	boolean SupportedFormatsNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  debugTechniques-&gt;notEmpty() implies\n\t\t    recommendedPurposes-&gt;exists(p | p.name.toLower() = \'debugging\')'"
	 * @generated
	 */
	boolean DebugPurposeExpectedWhenDebugTechniquesExist(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  supportedFormats-&gt;includes(defaultFormat)'"
	 * @generated
	 */
	boolean DefaultFormatMustBeSupported(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  scope = \'local\' or scope = \'global\' or scope = \'local+global\''"
	 * @generated
	 */
	boolean ScopeValueIsControlled(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_Scope()
	 * @model required="true"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class Path</em>' attribute.
	 * @see #setImplementationClassPath(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_ImplementationClassPath()
	 * @model required="true"
	 * @generated
	 */
	String getImplementationClassPath();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExplanationMethod#getImplementationClassPath <em>Implementation Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class Path</em>' attribute.
	 * @see #getImplementationClassPath()
	 * @generated
	 */
	void setImplementationClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Required Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Packages</em>' attribute list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExplanationMethod_RequiredPackages()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredPackages();

} // ExplanationMethod
