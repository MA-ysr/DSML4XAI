/**
 */
package com.example.xai.model.explainableAI.impl;

import com.example.xai.model.explainableAI.User;
import com.example.xai.model.explainableAI.explainableAIPackage;

import com.example.xai.model.explainableAI.explainableAITables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.UserImpl#getExpertise <em>Expertise</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.UserImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.UserImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.UserImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getExpertise() <em>Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertise()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPERTISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpertise() <em>Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertise()
	 * @generated
	 * @ordered
	 */
	protected String expertise = EXPERTISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<String> format;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return explainableAIPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpertise() {
		return expertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpertise(String newExpertise) {
		String oldExpertise = expertise;
		expertise = newExpertise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.USER__EXPERTISE, oldExpertise,
					expertise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFormat() {
		if (format == null) {
			format = new EDataTypeUniqueEList<String>(String.class, this, explainableAIPackage.USER__FORMAT);
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.USER__DETAILS, oldDetails,
					details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.USER__PURPOSE, oldPurpose,
					purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonBlankExpertise(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::NonBlankExpertise";
		try {
			/**
			 *
			 * inv NonBlankExpertise:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not expertise.oclIsUndefined() and expertise <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.USER___NON_BLANK_EXPERTISE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ String expertise = this.getExpertise();
						final /*@NonInvalid*/ boolean ne = !expertise.equals(explainableAITables.STR_);
						if (!ne) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, explainableAITables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonBlankPurposeIfSpecified(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::NonBlankPurposeIfSpecified";
		try {
			/**
			 *
			 * inv NonBlankPurposeIfSpecified:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = purpose.oclIsUndefined() or purpose <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.USER___NON_BLANK_PURPOSE_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ String purpose_0 = this.getPurpose();
				final /*@NonInvalid*/ boolean oclIsUndefined = purpose_0 == null;
				final /*@NonInvalid*/ Boolean result;
				if (oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean ne = !explainableAITables.STR_.equals(purpose_0);
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, explainableAITables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonBlankFormats(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::NonBlankFormats";
		try {
			/**
			 *
			 * inv NonBlankFormats:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = format->forAll(f |
			 *           not f.oclIsUndefined() and f <> '')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.USER___NON_BLANK_FORMATS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<String> format = this.getFormat();
					final /*@NonInvalid*/ OrderedSetValue BOXED_format = idResolver
							.createOrderedSetOfAll(explainableAITables.ORD_PRIMid_String, format);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_f = BOXED_format.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_f.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ String f = (String) ITERATOR_f.next();
						/**
						 * not f.oclIsUndefined() and f <> ''
						 */
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
							final /*@Thrown*/ Boolean and;
							if (not == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean ne = !f.equals(explainableAITables.STR_);
								if (!ne) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (not == null) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_and; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, explainableAITables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueFormatsCaseInsensitive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::UniqueFormatsCaseInsensitive";
		try {
			/**
			 *
			 * inv UniqueFormatsCaseInsensitive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = format->collect(f | f.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.USER___UNIQUE_FORMATS_CASE_INSENSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<String> format = this.getFormat();
				final /*@NonInvalid*/ OrderedSetValue BOXED_format = idResolver
						.createOrderedSetOfAll(explainableAITables.ORD_PRIMid_String, format);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(explainableAITables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_f = BOXED_format.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_f.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ String f = (String) ITERATOR_f.next();
					/**
					 * f.toLower()
					 */
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(f);
					//
					accumulator.add(toLower);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
						.createSetAccumulatorValue(explainableAITables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_x = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ String x = (String) ITERATOR_x.next();
					/**
					 * x
					 */
					//
					if (accumulator_0.includes(x) == ValueUtil.TRUE_VALUE) {
						result = false;
						break; // Abort after second find
					} else {
						accumulator_0.add(x);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, explainableAITables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonBlankDetailsIfSpecified(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::NonBlankDetailsIfSpecified";
		try {
			/**
			 *
			 * inv NonBlankDetailsIfSpecified:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = details.oclIsUndefined() or details <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.USER___NON_BLANK_DETAILS_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ String details_0 = this.getDetails();
				final /*@NonInvalid*/ boolean oclIsUndefined = details_0 == null;
				final /*@NonInvalid*/ Boolean result;
				if (oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean ne = !explainableAITables.STR_.equals(details_0);
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, explainableAITables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
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
		case explainableAIPackage.USER__NAME:
			return getName();
		case explainableAIPackage.USER__EXPERTISE:
			return getExpertise();
		case explainableAIPackage.USER__FORMAT:
			return getFormat();
		case explainableAIPackage.USER__DETAILS:
			return getDetails();
		case explainableAIPackage.USER__PURPOSE:
			return getPurpose();
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
		case explainableAIPackage.USER__NAME:
			setName((String) newValue);
			return;
		case explainableAIPackage.USER__EXPERTISE:
			setExpertise((String) newValue);
			return;
		case explainableAIPackage.USER__FORMAT:
			getFormat().clear();
			getFormat().addAll((Collection<? extends String>) newValue);
			return;
		case explainableAIPackage.USER__DETAILS:
			setDetails((String) newValue);
			return;
		case explainableAIPackage.USER__PURPOSE:
			setPurpose((String) newValue);
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
		case explainableAIPackage.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case explainableAIPackage.USER__EXPERTISE:
			setExpertise(EXPERTISE_EDEFAULT);
			return;
		case explainableAIPackage.USER__FORMAT:
			getFormat().clear();
			return;
		case explainableAIPackage.USER__DETAILS:
			setDetails(DETAILS_EDEFAULT);
			return;
		case explainableAIPackage.USER__PURPOSE:
			setPurpose(PURPOSE_EDEFAULT);
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
		case explainableAIPackage.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case explainableAIPackage.USER__EXPERTISE:
			return EXPERTISE_EDEFAULT == null ? expertise != null : !EXPERTISE_EDEFAULT.equals(expertise);
		case explainableAIPackage.USER__FORMAT:
			return format != null && !format.isEmpty();
		case explainableAIPackage.USER__DETAILS:
			return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
		case explainableAIPackage.USER__PURPOSE:
			return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		case explainableAIPackage.USER___NON_BLANK_EXPERTISE__DIAGNOSTICCHAIN_MAP:
			return NonBlankExpertise((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.USER___NON_BLANK_PURPOSE_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP:
			return NonBlankPurposeIfSpecified((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.USER___NON_BLANK_FORMATS__DIAGNOSTICCHAIN_MAP:
			return NonBlankFormats((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.USER___UNIQUE_FORMATS_CASE_INSENSITIVE__DIAGNOSTICCHAIN_MAP:
			return UniqueFormatsCaseInsensitive((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.USER___NON_BLANK_DETAILS_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP:
			return NonBlankDetailsIfSpecified((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", expertise: ");
		result.append(expertise);
		result.append(", format: ");
		result.append(format);
		result.append(", details: ");
		result.append(details);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //UserImpl
