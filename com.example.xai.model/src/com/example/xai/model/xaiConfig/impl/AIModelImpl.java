/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.AIModel;
import com.example.xai.model.xaiConfig.DatasetType;
import com.example.xai.model.xaiConfig.ExplanationMethod;
import com.example.xai.model.xaiConfig.Parameter;
import com.example.xai.model.xaiConfig.TrainingPolicy;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import com.example.xai.model.xaiConfig.XaiConfigTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getRequiredPackages <em>Required Packages</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getTrainingPolicy <em>Training Policy</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getAcceptedDatasetTypes <em>Accepted Dataset Types</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.AIModelImpl#getAllowedMethods <em>Allowed Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelImpl extends MinimalEObjectImpl.Container implements AIModel {
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
	 * The default value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected String classPath = CLASS_PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getTrainingPolicy() <em>Training Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingPolicy()
	 * @generated
	 * @ordered
	 */
	protected TrainingPolicy trainingPolicy;

	/**
	 * The cached value of the '{@link #getAcceptedDatasetTypes() <em>Accepted Dataset Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedDatasetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetType> acceptedDatasetTypes;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getAllowedMethods() <em>Allowed Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationMethod> allowedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XaiConfigPackage.Literals.AI_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.AI_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassPath() {
		return classPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassPath(String newClassPath) {
		String oldClassPath = classPath;
		classPath = newClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.AI_MODEL__CLASS_PATH, oldClassPath, classPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredPackages() {
		if (requiredPackages == null) {
			requiredPackages = new EDataTypeUniqueEList<String>(String.class, this, XaiConfigPackage.AI_MODEL__REQUIRED_PACKAGES);
		}
		return requiredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingPolicy getTrainingPolicy() {
		if (trainingPolicy != null && trainingPolicy.eIsProxy()) {
			InternalEObject oldTrainingPolicy = (InternalEObject)trainingPolicy;
			trainingPolicy = (TrainingPolicy)eResolveProxy(oldTrainingPolicy);
			if (trainingPolicy != oldTrainingPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XaiConfigPackage.AI_MODEL__TRAINING_POLICY, oldTrainingPolicy, trainingPolicy));
			}
		}
		return trainingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingPolicy basicGetTrainingPolicy() {
		return trainingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingPolicy(TrainingPolicy newTrainingPolicy) {
		TrainingPolicy oldTrainingPolicy = trainingPolicy;
		trainingPolicy = newTrainingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.AI_MODEL__TRAINING_POLICY, oldTrainingPolicy, trainingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetType> getAcceptedDatasetTypes() {
		if (acceptedDatasetTypes == null) {
			acceptedDatasetTypes = new EObjectResolvingEList<DatasetType>(DatasetType.class, this, XaiConfigPackage.AI_MODEL__ACCEPTED_DATASET_TYPES);
		}
		return acceptedDatasetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, XaiConfigPackage.AI_MODEL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationMethod> getAllowedMethods() {
		if (allowedMethods == null) {
			allowedMethods = new EObjectResolvingEList<ExplanationMethod>(ExplanationMethod.class, this, XaiConfigPackage.AI_MODEL__ALLOWED_METHODS);
		}
		return allowedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AcceptedDatasetTypesNotEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AIModel::AcceptedDatasetTypesNotEmpty";
		try {
			/**
			 *
			 * inv AcceptedDatasetTypesNotEmpty:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = acceptedDatasetTypes->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.AI_MODEL___ACCEPTED_DATASET_TYPES_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<DatasetType> acceptedDatasetTypes = this.getAcceptedDatasetTypes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_acceptedDatasetTypes = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_DatasetType, acceptedDatasetTypes);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_acceptedDatasetTypes).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, XaiConfigTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AllowedMethodsNotEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AIModel::AllowedMethodsNotEmpty";
		try {
			/**
			 *
			 * inv AllowedMethodsNotEmpty:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = allowedMethods->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.AI_MODEL___ALLOWED_METHODS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<ExplanationMethod> allowedMethods = this.getAllowedMethods();
				final /*@NonInvalid*/ OrderedSetValue BOXED_allowedMethods = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_ExplanationMethod, allowedMethods);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_allowedMethods).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, XaiConfigTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueParameterKeys(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AIModel::UniqueParameterKeys";
		try {
			/**
			 *
			 * inv UniqueParameterKeys:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = parameters->collect(p | p.key.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.AI_MODEL___UNIQUE_PARAMETER_KEYS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Parameter> parameters = this.getParameters();
				final /*@NonInvalid*/ OrderedSetValue BOXED_parameters = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_Parameter, parameters);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_p = BOXED_parameters.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Parameter p = (Parameter)ITERATOR_p.next();
					/**
					 * p.key.toLower()
					 */
					final /*@NonInvalid*/ String key = p.getKey();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(key);
					//
					accumulator.add(toLower);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_x = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ String x = (String)ITERATOR_x.next();
					/**
					 * x
					 */
					//
					if (accumulator_0.includes(x) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(x);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, XaiConfigTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XaiConfigPackage.AI_MODEL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case XaiConfigPackage.AI_MODEL__NAME:
				return getName();
			case XaiConfigPackage.AI_MODEL__CLASS_PATH:
				return getClassPath();
			case XaiConfigPackage.AI_MODEL__REQUIRED_PACKAGES:
				return getRequiredPackages();
			case XaiConfigPackage.AI_MODEL__TRAINING_POLICY:
				if (resolve) return getTrainingPolicy();
				return basicGetTrainingPolicy();
			case XaiConfigPackage.AI_MODEL__ACCEPTED_DATASET_TYPES:
				return getAcceptedDatasetTypes();
			case XaiConfigPackage.AI_MODEL__PARAMETERS:
				return getParameters();
			case XaiConfigPackage.AI_MODEL__ALLOWED_METHODS:
				return getAllowedMethods();
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
			case XaiConfigPackage.AI_MODEL__NAME:
				setName((String)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__CLASS_PATH:
				setClassPath((String)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				getRequiredPackages().addAll((Collection<? extends String>)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__TRAINING_POLICY:
				setTrainingPolicy((TrainingPolicy)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__ACCEPTED_DATASET_TYPES:
				getAcceptedDatasetTypes().clear();
				getAcceptedDatasetTypes().addAll((Collection<? extends DatasetType>)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case XaiConfigPackage.AI_MODEL__ALLOWED_METHODS:
				getAllowedMethods().clear();
				getAllowedMethods().addAll((Collection<? extends ExplanationMethod>)newValue);
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
			case XaiConfigPackage.AI_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XaiConfigPackage.AI_MODEL__CLASS_PATH:
				setClassPath(CLASS_PATH_EDEFAULT);
				return;
			case XaiConfigPackage.AI_MODEL__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				return;
			case XaiConfigPackage.AI_MODEL__TRAINING_POLICY:
				setTrainingPolicy((TrainingPolicy)null);
				return;
			case XaiConfigPackage.AI_MODEL__ACCEPTED_DATASET_TYPES:
				getAcceptedDatasetTypes().clear();
				return;
			case XaiConfigPackage.AI_MODEL__PARAMETERS:
				getParameters().clear();
				return;
			case XaiConfigPackage.AI_MODEL__ALLOWED_METHODS:
				getAllowedMethods().clear();
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
			case XaiConfigPackage.AI_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XaiConfigPackage.AI_MODEL__CLASS_PATH:
				return CLASS_PATH_EDEFAULT == null ? classPath != null : !CLASS_PATH_EDEFAULT.equals(classPath);
			case XaiConfigPackage.AI_MODEL__REQUIRED_PACKAGES:
				return requiredPackages != null && !requiredPackages.isEmpty();
			case XaiConfigPackage.AI_MODEL__TRAINING_POLICY:
				return trainingPolicy != null;
			case XaiConfigPackage.AI_MODEL__ACCEPTED_DATASET_TYPES:
				return acceptedDatasetTypes != null && !acceptedDatasetTypes.isEmpty();
			case XaiConfigPackage.AI_MODEL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XaiConfigPackage.AI_MODEL__ALLOWED_METHODS:
				return allowedMethods != null && !allowedMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XaiConfigPackage.AI_MODEL___ACCEPTED_DATASET_TYPES_NOT_EMPTY__DIAGNOSTICCHAIN_MAP:
				return AcceptedDatasetTypesNotEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.AI_MODEL___ALLOWED_METHODS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP:
				return AllowedMethodsNotEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.AI_MODEL___UNIQUE_PARAMETER_KEYS__DIAGNOSTICCHAIN_MAP:
				return UniqueParameterKeys((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", classPath: ");
		result.append(classPath);
		result.append(", requiredPackages: ");
		result.append(requiredPackages);
		result.append(')');
		return result.toString();
	}

} //AIModelImpl
