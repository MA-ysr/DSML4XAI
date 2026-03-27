/**
 */
package com.example.xai.model.explainableAI.impl;

import com.example.xai.model.explainableAI.Dataset;
import com.example.xai.model.explainableAI.Model;
import com.example.xai.model.explainableAI.User;
import com.example.xai.model.explainableAI.explainableAIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.ModelImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.ModelImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.ModelImpl#getUser <em>User</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.ModelImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected String modelType = MODEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected Dataset dataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return explainableAIPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelType() {
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelType(String newModelType) {
		String oldModelType = modelType;
		modelType = newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.MODEL__MODEL_TYPE, oldModelType,
					modelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.MODEL__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					explainableAIPackage.MODEL__USER, oldUser, newUser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - explainableAIPackage.MODEL__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - explainableAIPackage.MODEL__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.MODEL__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dataset getDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(Dataset newDataset, NotificationChain msgs) {
		Dataset oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					explainableAIPackage.MODEL__DATASET, oldDataset, newDataset);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataset(Dataset newDataset) {
		if (newDataset != dataset) {
			NotificationChain msgs = null;
			if (dataset != null)
				msgs = ((InternalEObject) dataset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - explainableAIPackage.MODEL__DATASET, null, msgs);
			if (newDataset != null)
				msgs = ((InternalEObject) newDataset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - explainableAIPackage.MODEL__DATASET, null, msgs);
			msgs = basicSetDataset(newDataset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.MODEL__DATASET, newDataset,
					newDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case explainableAIPackage.MODEL__USER:
			return basicSetUser(null, msgs);
		case explainableAIPackage.MODEL__DATASET:
			return basicSetDataset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case explainableAIPackage.MODEL__NAME:
			return getName();
		case explainableAIPackage.MODEL__MODEL_TYPE:
			return getModelType();
		case explainableAIPackage.MODEL__METHOD:
			return getMethod();
		case explainableAIPackage.MODEL__USER:
			return getUser();
		case explainableAIPackage.MODEL__DATASET:
			return getDataset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case explainableAIPackage.MODEL__NAME:
			setName((String) newValue);
			return;
		case explainableAIPackage.MODEL__MODEL_TYPE:
			setModelType((String) newValue);
			return;
		case explainableAIPackage.MODEL__METHOD:
			setMethod((String) newValue);
			return;
		case explainableAIPackage.MODEL__USER:
			setUser((User) newValue);
			return;
		case explainableAIPackage.MODEL__DATASET:
			setDataset((Dataset) newValue);
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
		case explainableAIPackage.MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case explainableAIPackage.MODEL__MODEL_TYPE:
			setModelType(MODEL_TYPE_EDEFAULT);
			return;
		case explainableAIPackage.MODEL__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case explainableAIPackage.MODEL__USER:
			setUser((User) null);
			return;
		case explainableAIPackage.MODEL__DATASET:
			setDataset((Dataset) null);
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
		case explainableAIPackage.MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case explainableAIPackage.MODEL__MODEL_TYPE:
			return MODEL_TYPE_EDEFAULT == null ? modelType != null : !MODEL_TYPE_EDEFAULT.equals(modelType);
		case explainableAIPackage.MODEL__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case explainableAIPackage.MODEL__USER:
			return user != null;
		case explainableAIPackage.MODEL__DATASET:
			return dataset != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", modelType: ");
		result.append(modelType);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
