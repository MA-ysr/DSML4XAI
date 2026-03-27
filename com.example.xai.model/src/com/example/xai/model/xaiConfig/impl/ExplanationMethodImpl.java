/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.DebugTechnique;
import com.example.xai.model.xaiConfig.ExpertiseLevel;
import com.example.xai.model.xaiConfig.ExplanationMethod;
import com.example.xai.model.xaiConfig.OutputFormat;
import com.example.xai.model.xaiConfig.Purpose;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import com.example.xai.model.xaiConfig.XaiConfigTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getImplementationClassPath <em>Implementation Class Path</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getRequiredPackages <em>Required Packages</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getMinExpertise <em>Min Expertise</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getSupportedFormats <em>Supported Formats</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getDefaultFormat <em>Default Format</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getRecommendedPurposes <em>Recommended Purposes</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ExplanationMethodImpl#getDebugTechniques <em>Debug Techniques</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationMethodImpl extends MinimalEObjectImpl.Container implements ExplanationMethod {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationClassPath() <em>Implementation Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationClassPath() <em>Implementation Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClassPath()
	 * @generated
	 * @ordered
	 */
	protected String implementationClassPath = IMPLEMENTATION_CLASS_PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getMinExpertise() <em>Min Expertise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExpertise()
	 * @generated
	 * @ordered
	 */
	protected ExpertiseLevel minExpertise;

	/**
	 * The cached value of the '{@link #getSupportedFormats() <em>Supported Formats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputFormat> supportedFormats;

	/**
	 * The cached value of the '{@link #getDefaultFormat() <em>Default Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormat()
	 * @generated
	 * @ordered
	 */
	protected OutputFormat defaultFormat;

	/**
	 * The cached value of the '{@link #getRecommendedPurposes() <em>Recommended Purposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Purpose> recommendedPurposes;

	/**
	 * The cached value of the '{@link #getDebugTechniques() <em>Debug Techniques</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugTechniques()
	 * @generated
	 * @ordered
	 */
	protected EList<DebugTechnique> debugTechniques;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XaiConfigPackage.Literals.EXPLANATION_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.EXPLANATION_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpertiseLevel getMinExpertise() {
		if (minExpertise != null && minExpertise.eIsProxy()) {
			InternalEObject oldMinExpertise = (InternalEObject)minExpertise;
			minExpertise = (ExpertiseLevel)eResolveProxy(oldMinExpertise);
			if (minExpertise != oldMinExpertise) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE, oldMinExpertise, minExpertise));
			}
		}
		return minExpertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpertiseLevel basicGetMinExpertise() {
		return minExpertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExpertise(ExpertiseLevel newMinExpertise) {
		ExpertiseLevel oldMinExpertise = minExpertise;
		minExpertise = newMinExpertise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE, oldMinExpertise, minExpertise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputFormat> getSupportedFormats() {
		if (supportedFormats == null) {
			supportedFormats = new EObjectResolvingEList<OutputFormat>(OutputFormat.class, this, XaiConfigPackage.EXPLANATION_METHOD__SUPPORTED_FORMATS);
		}
		return supportedFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputFormat getDefaultFormat() {
		if (defaultFormat != null && defaultFormat.eIsProxy()) {
			InternalEObject oldDefaultFormat = (InternalEObject)defaultFormat;
			defaultFormat = (OutputFormat)eResolveProxy(oldDefaultFormat);
			if (defaultFormat != oldDefaultFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT, oldDefaultFormat, defaultFormat));
			}
		}
		return defaultFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFormat basicGetDefaultFormat() {
		return defaultFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFormat(OutputFormat newDefaultFormat) {
		OutputFormat oldDefaultFormat = defaultFormat;
		defaultFormat = newDefaultFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT, oldDefaultFormat, defaultFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Purpose> getRecommendedPurposes() {
		if (recommendedPurposes == null) {
			recommendedPurposes = new EObjectResolvingEList<Purpose>(Purpose.class, this, XaiConfigPackage.EXPLANATION_METHOD__RECOMMENDED_PURPOSES);
		}
		return recommendedPurposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DebugTechnique> getDebugTechniques() {
		if (debugTechniques == null) {
			debugTechniques = new EObjectResolvingEList<DebugTechnique>(DebugTechnique.class, this, XaiConfigPackage.EXPLANATION_METHOD__DEBUG_TECHNIQUES);
		}
		return debugTechniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SupportedFormatsNotEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExplanationMethod::SupportedFormatsNotEmpty";
		try {
			/**
			 *
			 * inv SupportedFormatsNotEmpty:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = supportedFormats->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.EXPLANATION_METHOD___SUPPORTED_FORMATS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<OutputFormat> supportedFormats = this.getSupportedFormats();
				final /*@NonInvalid*/ OrderedSetValue BOXED_supportedFormats = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_OutputFormat_0, supportedFormats);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_supportedFormats).booleanValue();
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
	public boolean DebugPurposeExpectedWhenDebugTechniquesExist(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExplanationMethod::DebugPurposeExpectedWhenDebugTechniquesExist";
		try {
			/**
			 *
			 * inv DebugPurposeExpectedWhenDebugTechniquesExist:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = debugTechniques->notEmpty() implies
			 *         recommendedPurposes->exists(p | p.name.toLower() = 'debugging')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.EXPLANATION_METHOD___DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<DebugTechnique> debugTechniques = this.getDebugTechniques();
					final /*@NonInvalid*/ OrderedSetValue BOXED_debugTechniques = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_DebugTechnique, debugTechniques);
					final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_debugTechniques).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!notEmpty) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Purpose> recommendedPurposes = this.getRecommendedPurposes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_recommendedPurposes = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_Purpose, recommendedPurposes);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_p = BOXED_recommendedPurposes.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_p.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Purpose p = (Purpose)ITERATOR_p.next();
							/**
							 * p.name.toLower() = 'debugging'
							 */
							final /*@NonInvalid*/ String name = p.getName();
							final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
							final /*@NonInvalid*/ boolean eq = toLower.equals(XaiConfigTables.STR_debugging);
							//
							if (eq) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (!eq) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (exists == null) {
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
	public boolean DefaultFormatMustBeSupported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExplanationMethod::DefaultFormatMustBeSupported";
		try {
			/**
			 *
			 * inv DefaultFormatMustBeSupported:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = supportedFormats->includes(defaultFormat)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.EXPLANATION_METHOD___DEFAULT_FORMAT_MUST_BE_SUPPORTED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<OutputFormat> supportedFormats = this.getSupportedFormats();
				final /*@NonInvalid*/ OrderedSetValue BOXED_supportedFormats = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_OutputFormat_0, supportedFormats);
				final /*@NonInvalid*/ OutputFormat defaultFormat = this.getDefaultFormat();
				final /*@NonInvalid*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_supportedFormats, defaultFormat).booleanValue();
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
	public boolean ScopeValueIsControlled(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExplanationMethod::ScopeValueIsControlled";
		try {
			/**
			 *
			 * inv ScopeValueIsControlled:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = scope = 'local' or scope = 'global' or scope = 'local+global'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.EXPLANATION_METHOD___SCOPE_VALUE_IS_CONTROLLED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String scope_1 = this.getScope();
					final /*@NonInvalid*/ boolean eq = scope_1.equals(XaiConfigTables.STR_local);
					final /*@NonInvalid*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_0 = scope_1.equals(XaiConfigTables.STR_global);
						if (eq_0) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (or == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_1 = scope_1.equals(XaiConfigTables.STR_local_p_global);
						if (eq_1) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (or == null) {
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
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.EXPLANATION_METHOD__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationClassPath() {
		return implementationClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationClassPath(String newImplementationClassPath) {
		String oldImplementationClassPath = implementationClassPath;
		implementationClassPath = newImplementationClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH, oldImplementationClassPath, implementationClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredPackages() {
		if (requiredPackages == null) {
			requiredPackages = new EDataTypeUniqueEList<String>(String.class, this, XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES);
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
			case XaiConfigPackage.EXPLANATION_METHOD__NAME:
				return getName();
			case XaiConfigPackage.EXPLANATION_METHOD__SCOPE:
				return getScope();
			case XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH:
				return getImplementationClassPath();
			case XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES:
				return getRequiredPackages();
			case XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE:
				if (resolve) return getMinExpertise();
				return basicGetMinExpertise();
			case XaiConfigPackage.EXPLANATION_METHOD__SUPPORTED_FORMATS:
				return getSupportedFormats();
			case XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT:
				if (resolve) return getDefaultFormat();
				return basicGetDefaultFormat();
			case XaiConfigPackage.EXPLANATION_METHOD__RECOMMENDED_PURPOSES:
				return getRecommendedPurposes();
			case XaiConfigPackage.EXPLANATION_METHOD__DEBUG_TECHNIQUES:
				return getDebugTechniques();
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
			case XaiConfigPackage.EXPLANATION_METHOD__NAME:
				setName((String)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__SCOPE:
				setScope((String)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH:
				setImplementationClassPath((String)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				getRequiredPackages().addAll((Collection<? extends String>)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE:
				setMinExpertise((ExpertiseLevel)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__SUPPORTED_FORMATS:
				getSupportedFormats().clear();
				getSupportedFormats().addAll((Collection<? extends OutputFormat>)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT:
				setDefaultFormat((OutputFormat)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__RECOMMENDED_PURPOSES:
				getRecommendedPurposes().clear();
				getRecommendedPurposes().addAll((Collection<? extends Purpose>)newValue);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__DEBUG_TECHNIQUES:
				getDebugTechniques().clear();
				getDebugTechniques().addAll((Collection<? extends DebugTechnique>)newValue);
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
			case XaiConfigPackage.EXPLANATION_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH:
				setImplementationClassPath(IMPLEMENTATION_CLASS_PATH_EDEFAULT);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES:
				getRequiredPackages().clear();
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE:
				setMinExpertise((ExpertiseLevel)null);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__SUPPORTED_FORMATS:
				getSupportedFormats().clear();
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT:
				setDefaultFormat((OutputFormat)null);
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__RECOMMENDED_PURPOSES:
				getRecommendedPurposes().clear();
				return;
			case XaiConfigPackage.EXPLANATION_METHOD__DEBUG_TECHNIQUES:
				getDebugTechniques().clear();
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
			case XaiConfigPackage.EXPLANATION_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XaiConfigPackage.EXPLANATION_METHOD__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH:
				return IMPLEMENTATION_CLASS_PATH_EDEFAULT == null ? implementationClassPath != null : !IMPLEMENTATION_CLASS_PATH_EDEFAULT.equals(implementationClassPath);
			case XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES:
				return requiredPackages != null && !requiredPackages.isEmpty();
			case XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE:
				return minExpertise != null;
			case XaiConfigPackage.EXPLANATION_METHOD__SUPPORTED_FORMATS:
				return supportedFormats != null && !supportedFormats.isEmpty();
			case XaiConfigPackage.EXPLANATION_METHOD__DEFAULT_FORMAT:
				return defaultFormat != null;
			case XaiConfigPackage.EXPLANATION_METHOD__RECOMMENDED_PURPOSES:
				return recommendedPurposes != null && !recommendedPurposes.isEmpty();
			case XaiConfigPackage.EXPLANATION_METHOD__DEBUG_TECHNIQUES:
				return debugTechniques != null && !debugTechniques.isEmpty();
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
			case XaiConfigPackage.EXPLANATION_METHOD___SUPPORTED_FORMATS_NOT_EMPTY__DIAGNOSTICCHAIN_MAP:
				return SupportedFormatsNotEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.EXPLANATION_METHOD___DEBUG_PURPOSE_EXPECTED_WHEN_DEBUG_TECHNIQUES_EXIST__DIAGNOSTICCHAIN_MAP:
				return DebugPurposeExpectedWhenDebugTechniquesExist((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.EXPLANATION_METHOD___DEFAULT_FORMAT_MUST_BE_SUPPORTED__DIAGNOSTICCHAIN_MAP:
				return DefaultFormatMustBeSupported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.EXPLANATION_METHOD___SCOPE_VALUE_IS_CONTROLLED__DIAGNOSTICCHAIN_MAP:
				return ScopeValueIsControlled((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", scope: ");
		result.append(scope);
		result.append(", implementationClassPath: ");
		result.append(implementationClassPath);
		result.append(", requiredPackages: ");
		result.append(requiredPackages);
		result.append(')');
		return result.toString();
	}

} //ExplanationMethodImpl
