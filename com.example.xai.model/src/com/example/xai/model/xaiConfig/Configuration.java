/**
 */
package com.example.xai.model.xaiConfig;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getExpertiseLevels <em>Expertise Levels</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getDetailsLevels <em>Details Levels</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getDebugTechniques <em>Debug Techniques</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getDatasetTypes <em>Dataset Types</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getTrainingPolicies <em>Training Policies</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getModels <em>Models</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.Configuration#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueDetailsRanks'"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Expertise Levels</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.ExpertiseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expertise Levels</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_ExpertiseLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpertiseLevel> getExpertiseLevels();

	/**
	 * Returns the value of the '<em><b>Details Levels</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.DetailsLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details Levels</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_DetailsLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DetailsLevel> getDetailsLevels();

	/**
	 * Returns the value of the '<em><b>Output Formats</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.OutputFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Formats</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_OutputFormats()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputFormat> getOutputFormats();

	/**
	 * Returns the value of the '<em><b>Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purposes</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_Purposes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Purpose> getPurposes();

	/**
	 * Returns the value of the '<em><b>Debug Techniques</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.DebugTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Techniques</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_DebugTechniques()
	 * @model containment="true"
	 * @generated
	 */
	EList<DebugTechnique> getDebugTechniques();

	/**
	 * Returns the value of the '<em><b>Dataset Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.DatasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Types</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_DatasetTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasetType> getDatasetTypes();

	/**
	 * Returns the value of the '<em><b>Training Policies</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.TrainingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Policies</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_TrainingPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainingPolicy> getTrainingPolicies();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.AIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<AIModel> getModels();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.xai.model.xaiConfig.ExplanationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getConfiguration_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationMethod> getMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  models-&gt;collect(m | m.name.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueModelNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  expertiseLevels-&gt;isUnique(e | e.rank)'"
	 * @generated
	 */
	boolean UniqueExpertiseRanks(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  datasetTypes-&gt;collect(d | d.name.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueDatasetTypeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  purposes-&gt;collect(p | p.name.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniquePurposeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  outputFormats-&gt;collect(f | f.name.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueOutputFormatNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  methods-&gt;collect(m | m.name.toLower())-&gt;isUnique(x | x)'"
	 * @generated
	 */
	boolean UniqueMethodNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  detailsLevels-&gt;isUnique(d | d.rank)'"
	 * @generated
	 */
	boolean UniqueDetailsRanks(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Configuration
