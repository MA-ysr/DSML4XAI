/**
 */
package com.example.xai.model.explainableAI.impl;

import com.example.xai.model.explainableAI.Dataset;
import com.example.xai.model.explainableAI.explainableAIPackage;

import com.example.xai.model.explainableAI.explainableAITables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.explainableAI.impl.DatasetImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.DatasetImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.example.xai.model.explainableAI.impl.DatasetImpl#getTargetColumn <em>Target Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends MinimalEObjectImpl.Container implements Dataset {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetColumn() <em>Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetColumn() <em>Target Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected String targetColumn = TARGET_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return explainableAIPackage.Literals.DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.DATASET__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.DATASET__FORMAT, oldFormat,
					format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetColumn() {
		return targetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetColumn(String newTargetColumn) {
		String oldTargetColumn = targetColumn;
		targetColumn = newTargetColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, explainableAIPackage.DATASET__TARGET_COLUMN,
					oldTargetColumn, targetColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonBlankPath(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Dataset::NonBlankPath";
		try {
			/**
			 *
			 * inv NonBlankPath:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not path.oclIsUndefined() and path <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.DATASET___NON_BLANK_PATH__DIAGNOSTICCHAIN_MAP);
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
						final /*@NonInvalid*/ String path = this.getPath();
						final /*@NonInvalid*/ boolean ne = !path.equals(explainableAITables.STR_);
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
	public boolean NonBlankTargetIfSpecified(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Dataset::NonBlankTargetIfSpecified";
		try {
			/**
			 *
			 * inv NonBlankTargetIfSpecified:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = targetColumn.oclIsUndefined() or targetColumn <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.DATASET___NON_BLANK_TARGET_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, explainableAITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ String targetColumn_0 = this.getTargetColumn();
				final /*@NonInvalid*/ boolean oclIsUndefined = targetColumn_0 == null;
				final /*@NonInvalid*/ Boolean result;
				if (oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean ne = !explainableAITables.STR_.equals(targetColumn_0);
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
	public boolean NonBlankFormat(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Dataset::NonBlankFormat";
		try {
			/**
			 *
			 * inv NonBlankFormat:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not format.oclIsUndefined() and format <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					explainableAIPackage.Literals.DATASET___NON_BLANK_FORMAT__DIAGNOSTICCHAIN_MAP);
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
						final /*@NonInvalid*/ String format = this.getFormat();
						final /*@NonInvalid*/ boolean ne = !format.equals(explainableAITables.STR_);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case explainableAIPackage.DATASET__PATH:
			return getPath();
		case explainableAIPackage.DATASET__FORMAT:
			return getFormat();
		case explainableAIPackage.DATASET__TARGET_COLUMN:
			return getTargetColumn();
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
		case explainableAIPackage.DATASET__PATH:
			setPath((String) newValue);
			return;
		case explainableAIPackage.DATASET__FORMAT:
			setFormat((String) newValue);
			return;
		case explainableAIPackage.DATASET__TARGET_COLUMN:
			setTargetColumn((String) newValue);
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
		case explainableAIPackage.DATASET__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case explainableAIPackage.DATASET__FORMAT:
			setFormat(FORMAT_EDEFAULT);
			return;
		case explainableAIPackage.DATASET__TARGET_COLUMN:
			setTargetColumn(TARGET_COLUMN_EDEFAULT);
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
		case explainableAIPackage.DATASET__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case explainableAIPackage.DATASET__FORMAT:
			return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		case explainableAIPackage.DATASET__TARGET_COLUMN:
			return TARGET_COLUMN_EDEFAULT == null ? targetColumn != null : !TARGET_COLUMN_EDEFAULT.equals(targetColumn);
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
		case explainableAIPackage.DATASET___NON_BLANK_PATH__DIAGNOSTICCHAIN_MAP:
			return NonBlankPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.DATASET___NON_BLANK_TARGET_IF_SPECIFIED__DIAGNOSTICCHAIN_MAP:
			return NonBlankTargetIfSpecified((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case explainableAIPackage.DATASET___NON_BLANK_FORMAT__DIAGNOSTICCHAIN_MAP:
			return NonBlankFormat((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (path: ");
		result.append(path);
		result.append(", format: ");
		result.append(format);
		result.append(", targetColumn: ");
		result.append(targetColumn);
		result.append(')');
		return result.toString();
	}

} //DatasetImpl
