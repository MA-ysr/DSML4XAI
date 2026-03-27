/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.DatasetType;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.DatasetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.DatasetTypeImpl#isRequiresTargetColumn <em>Requires Target Column</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.DatasetTypeImpl#getRequiredPackages <em>Required Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetTypeImpl extends MinimalEObjectImpl.Container implements DatasetType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresTargetColumn() <em>Requires Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_TARGET_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresTargetColumn() <em>Requires Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresTargetColumn = REQUIRES_TARGET_COLUMN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredPackages() <em>Required Packages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XaiConfigPackage.Literals.DATASET_TYPE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.DATASET_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequiresTargetColumn() {
		return requiresTargetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresTargetColumn(boolean newRequiresTargetColumn) {
		boolean oldRequiresTargetColumn = requiresTargetColumn;
		requiresTargetColumn = newRequiresTargetColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.DATASET_TYPE__REQUIRES_TARGET_COLUMN, oldRequiresTargetColumn, requiresTargetColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredPackages() {
		if (requiredPackages == null) {
			requiredPackages = new EDataTypeUniqueEList<String>(String.class, this, XaiConfigPackage.DATASET_TYPE__REQUIRED_PACKAGES);
		}
		return requiredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XaiConfigPackage.DATASET_TYPE__NAME:
				return getName();
			case XaiConfigPackage.DATASET_TYPE__REQUIRES_TARGET_COLUMN:
				return isRequiresTargetColumn();
			case XaiConfigPackage.DATASET_TYPE__REQUIRED_PACKAGES:
				return getRequiredPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XaiConfigPackage.DATASET_TYPE__NAME:
				setName((String)newValue);
				return;
			case XaiConfigPackage.DATASET_TYPE__REQUIRES_TARGET_COLUMN:
				setRequiresTargetColumn((Boolean)newValue);
				return;
			case XaiConfigPackage.DATASET_TYPE__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				getRequiredPackages().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XaiConfigPackage.DATASET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XaiConfigPackage.DATASET_TYPE__REQUIRES_TARGET_COLUMN:
				setRequiresTargetColumn(REQUIRES_TARGET_COLUMN_EDEFAULT);
				return;
			case XaiConfigPackage.DATASET_TYPE__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XaiConfigPackage.DATASET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XaiConfigPackage.DATASET_TYPE__REQUIRES_TARGET_COLUMN:
				return requiresTargetColumn != REQUIRES_TARGET_COLUMN_EDEFAULT;
			case XaiConfigPackage.DATASET_TYPE__REQUIRED_PACKAGES:
				return requiredPackages != null && !requiredPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", requiresTargetColumn: ");
		result.append(requiresTargetColumn);
		result.append(", requiredPackages: ");
		result.append(requiredPackages);
		result.append(')');
		return result.toString();
	}

} //DatasetTypeImpl
