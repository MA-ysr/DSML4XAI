/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.TrainingPolicy;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import com.example.xai.model.xaiConfig.XaiConfigTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl#isEnableNormalization <em>Enable Normalization</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl#getScalerClassPath <em>Scaler Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl#isUseStratification <em>Use Stratification</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.TrainingPolicyImpl#getRequiredPackages <em>Required Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingPolicyImpl extends MinimalEObjectImpl.Container implements TrainingPolicy {
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
	 * The default value of the '{@link #isEnableNormalization() <em>Enable Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNormalization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_NORMALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableNormalization() <em>Enable Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNormalization()
	 * @generated
	 * @ordered
	 */
	protected boolean enableNormalization = ENABLE_NORMALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalerClassPath() <em>Scaler Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalerClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALER_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalerClassPath() <em>Scaler Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalerClassPath()
	 * @generated
	 * @ordered
	 */
	protected String scalerClassPath = SCALER_CLASS_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseStratification() <em>Use Stratification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStratification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_STRATIFICATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseStratification() <em>Use Stratification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStratification()
	 * @generated
	 * @ordered
	 */
	protected boolean useStratification = USE_STRATIFICATION_EDEFAULT;

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
	protected TrainingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XaiConfigPackage.Literals.TRAINING_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.TRAINING_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableNormalization() {
		return enableNormalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableNormalization(boolean newEnableNormalization) {
		boolean oldEnableNormalization = enableNormalization;
		enableNormalization = newEnableNormalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.TRAINING_POLICY__ENABLE_NORMALIZATION, oldEnableNormalization, enableNormalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScalerClassPath() {
		return scalerClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalerClassPath(String newScalerClassPath) {
		String oldScalerClassPath = scalerClassPath;
		scalerClassPath = newScalerClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.TRAINING_POLICY__SCALER_CLASS_PATH, oldScalerClassPath, scalerClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseStratification() {
		return useStratification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseStratification(boolean newUseStratification) {
		boolean oldUseStratification = useStratification;
		useStratification = newUseStratification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.TRAINING_POLICY__USE_STRATIFICATION, oldUseStratification, useStratification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredPackages() {
		if (requiredPackages == null) {
			requiredPackages = new EDataTypeUniqueEList<String>(String.class, this, XaiConfigPackage.TRAINING_POLICY__REQUIRED_PACKAGES);
		}
		return requiredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ScalerRequiredWhenNormalizationEnabled(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TrainingPolicy::ScalerRequiredWhenNormalizationEnabled";
		try {
			/**
			 *
			 * inv ScalerRequiredWhenNormalizationEnabled:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = enableNormalization implies
			 *         not scalerClassPath.oclIsUndefined() and scalerClassPath <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.TRAINING_POLICY___SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean enableNormalization = this.isEnableNormalization();
					final /*@Thrown*/ Boolean result;
					if (!enableNormalization) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ String scalerClassPath_0 = this.getScalerClassPath();
							final /*@NonInvalid*/ boolean oclIsUndefined = scalerClassPath_0 == null;
							final /*@NonInvalid*/ Boolean not;
							if (!oclIsUndefined) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (oclIsUndefined) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							final /*@Thrown*/ Boolean and;
							if (not == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean ne = !XaiConfigTables.STR_.equals(scalerClassPath_0);
								if (!ne) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (not == null) {
										and = null;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, XaiConfigTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XaiConfigPackage.TRAINING_POLICY__NAME:
				return getName();
			case XaiConfigPackage.TRAINING_POLICY__ENABLE_NORMALIZATION:
				return isEnableNormalization();
			case XaiConfigPackage.TRAINING_POLICY__SCALER_CLASS_PATH:
				return getScalerClassPath();
			case XaiConfigPackage.TRAINING_POLICY__USE_STRATIFICATION:
				return isUseStratification();
			case XaiConfigPackage.TRAINING_POLICY__REQUIRED_PACKAGES:
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
			case XaiConfigPackage.TRAINING_POLICY__NAME:
				setName((String)newValue);
				return;
			case XaiConfigPackage.TRAINING_POLICY__ENABLE_NORMALIZATION:
				setEnableNormalization((Boolean)newValue);
				return;
			case XaiConfigPackage.TRAINING_POLICY__SCALER_CLASS_PATH:
				setScalerClassPath((String)newValue);
				return;
			case XaiConfigPackage.TRAINING_POLICY__USE_STRATIFICATION:
				setUseStratification((Boolean)newValue);
				return;
			case XaiConfigPackage.TRAINING_POLICY__REQUIRED_PACKAGES:
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
			case XaiConfigPackage.TRAINING_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XaiConfigPackage.TRAINING_POLICY__ENABLE_NORMALIZATION:
				setEnableNormalization(ENABLE_NORMALIZATION_EDEFAULT);
				return;
			case XaiConfigPackage.TRAINING_POLICY__SCALER_CLASS_PATH:
				setScalerClassPath(SCALER_CLASS_PATH_EDEFAULT);
				return;
			case XaiConfigPackage.TRAINING_POLICY__USE_STRATIFICATION:
				setUseStratification(USE_STRATIFICATION_EDEFAULT);
				return;
			case XaiConfigPackage.TRAINING_POLICY__REQUIRED_PACKAGES:
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
			case XaiConfigPackage.TRAINING_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XaiConfigPackage.TRAINING_POLICY__ENABLE_NORMALIZATION:
				return enableNormalization != ENABLE_NORMALIZATION_EDEFAULT;
			case XaiConfigPackage.TRAINING_POLICY__SCALER_CLASS_PATH:
				return SCALER_CLASS_PATH_EDEFAULT == null ? scalerClassPath != null : !SCALER_CLASS_PATH_EDEFAULT.equals(scalerClassPath);
			case XaiConfigPackage.TRAINING_POLICY__USE_STRATIFICATION:
				return useStratification != USE_STRATIFICATION_EDEFAULT;
			case XaiConfigPackage.TRAINING_POLICY__REQUIRED_PACKAGES:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XaiConfigPackage.TRAINING_POLICY___SCALER_REQUIRED_WHEN_NORMALIZATION_ENABLED__DIAGNOSTICCHAIN_MAP:
				return ScalerRequiredWhenNormalizationEnabled((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", enableNormalization: ");
		result.append(enableNormalization);
		result.append(", scalerClassPath: ");
		result.append(scalerClassPath);
		result.append(", useStratification: ");
		result.append(useStratification);
		result.append(", requiredPackages: ");
		result.append(requiredPackages);
		result.append(')');
		return result.toString();
	}

} //TrainingPolicyImpl
