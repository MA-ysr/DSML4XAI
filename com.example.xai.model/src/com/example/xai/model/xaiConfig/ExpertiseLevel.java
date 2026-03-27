/**
 */
package com.example.xai.model.xaiConfig;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expertise Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExpertiseLevel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveRank'"
 * @generated
 */
public interface ExpertiseLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExpertiseLevel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see com.example.xai.model.xaiConfig.XaiConfigPackage#getExpertiseLevel_Rank()
	 * @model required="true"
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link com.example.xai.model.xaiConfig.ExpertiseLevel#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n  \t\t\trank &gt; 0'"
	 * @generated
	 */
	boolean PositiveRank(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExpertiseLevel
