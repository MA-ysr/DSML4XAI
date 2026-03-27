/**
 */
package com.example.xai.model.explainableAI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dataset Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.xai.model.explainableAI.explainableAIPackage#getDatasetFormat()
 * @model
 * @generated
 */
public enum DatasetFormat implements Enumerator {
	/**
	 * The '<em><b>CSV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV_VALUE
	 * @generated
	 * @ordered
	 */
	CSV(0, "CSV", "CSV"),

	/**
	 * The '<em><b>PARQUET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARQUET_VALUE
	 * @generated
	 * @ordered
	 */
	PARQUET(1, "PARQUET", "PARQUET"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(2, "JSON", "JSON"),

	/**
	 * The '<em><b>LIBSVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBSVM_VALUE
	 * @generated
	 * @ordered
	 */
	LIBSVM(3, "LIBSVM", "LIBSVM"),

	/**
	 * The '<em><b>IMAGE DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DIR_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_DIR(4, "IMAGE_DIR", "IMAGE_DIR");

	/**
	 * The '<em><b>CSV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSV_VALUE = 0;

	/**
	 * The '<em><b>PARQUET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARQUET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARQUET_VALUE = 1;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 2;

	/**
	 * The '<em><b>LIBSVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBSVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIBSVM_VALUE = 3;

	/**
	 * The '<em><b>IMAGE DIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_DIR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dataset Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatasetFormat[] VALUES_ARRAY = new DatasetFormat[] { CSV, PARQUET, JSON, LIBSVM, IMAGE_DIR, };

	/**
	 * A public read-only list of all the '<em><b>Dataset Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatasetFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dataset Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatasetFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dataset Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatasetFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dataset Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetFormat get(int value) {
		switch (value) {
		case CSV_VALUE:
			return CSV;
		case PARQUET_VALUE:
			return PARQUET;
		case JSON_VALUE:
			return JSON;
		case LIBSVM_VALUE:
			return LIBSVM;
		case IMAGE_DIR_VALUE:
			return IMAGE_DIR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DatasetFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DatasetFormat
