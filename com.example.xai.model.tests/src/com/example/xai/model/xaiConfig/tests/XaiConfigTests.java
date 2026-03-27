/**
 */
package com.example.xai.model.xaiConfig.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>xaiConfig</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class XaiConfigTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new XaiConfigTests("xaiConfig Tests");
		suite.addTestSuite(ConfigurationTest.class);
		suite.addTestSuite(ExpertiseLevelTest.class);
		suite.addTestSuite(DetailsLevelTest.class);
		suite.addTestSuite(TrainingPolicyTest.class);
		suite.addTestSuite(AIModelTest.class);
		suite.addTestSuite(ExplanationMethodTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XaiConfigTests(String name) {
		super(name);
	}

} //XaiConfigTests
