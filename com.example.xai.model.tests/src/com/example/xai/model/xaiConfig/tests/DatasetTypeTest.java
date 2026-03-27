/**
 */
package com.example.xai.model.xaiConfig.tests;

import com.example.xai.model.xaiConfig.DatasetType;
import com.example.xai.model.xaiConfig.XaiConfigFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetTypeTest extends TestCase {

	/**
	 * The fixture for this Dataset Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetTypeTest.class);
	}

	/**
	 * Constructs a new Dataset Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dataset Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DatasetType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dataset Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XaiConfigFactory.eINSTANCE.createDatasetType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DatasetTypeTest
