/**
 */
package com.example.xai.model.xaiConfig;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.TrainingPolicy#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.TrainingPolicy#isEnableNormalization <em>Enable Normalization</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.TrainingPolicy#getScalerClassPath <em>Scaler Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.TrainingPolicy#isUseStratification <em>Use Stratification</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.TrainingPolicy#getRequiredPackages <em>Required Packages</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ScalerRequiredWhenNormalizationEnabled'"
 * @generated
 */
public interface TrainingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.TrainingPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enable Normalization</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Normalization</em>' attribute.
	 * @see #setEnableNormalization(boolean)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy_EnableNormalization()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEnableNormalization();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.TrainingPolicy#isEnableNormalization <em>Enable Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Normalization</em>' attribute.
	 * @see #isEnableNormalization()
	 * @generated
	 */
	void setEnableNormalization(boolean value);

	/**
	 * Returns the value of the '<em><b>Scaler Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaler Class Path</em>' attribute.
	 * @see #setScalerClassPath(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy_ScalerClassPath()
	 * @model
	 * @generated
	 */
	String getScalerClassPath();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.TrainingPolicy#getScalerClassPath <em>Scaler Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaler Class Path</em>' attribute.
	 * @see #getScalerClassPath()
	 * @generated
	 */
	void setScalerClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Use Stratification</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Stratification</em>' attribute.
	 * @see #setUseStratification(boolean)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy_UseStratification()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUseStratification();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.TrainingPolicy#isUseStratification <em>Use Stratification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Stratification</em>' attribute.
	 * @see #isUseStratification()
	 * @generated
	 */
	void setUseStratification(boolean value);

	/**
	 * Returns the value of the '<em><b>Required Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Packages</em>' attribute list.
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getTrainingPolicy_RequiredPackages()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  enableNormalization implies\n\t\t    (not scalerClassPath.oclIsUndefined() and scalerClassPath &lt;&gt; \'\')'"
	 * @generated
	 */
	boolean ScalerRequiredWhenNormalizationEnabled(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TrainingPolicy
