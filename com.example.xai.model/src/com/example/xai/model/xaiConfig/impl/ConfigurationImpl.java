/**
 */
package com.example.xai.model.xaiConfig.impl;

import com.example.xai.model.xaiConfig.AIModel;
import com.example.xai.model.xaiConfig.Configuration;
import com.example.xai.model.xaiConfig.DatasetType;
import com.example.xai.model.xaiConfig.DebugTechnique;
import com.example.xai.model.xaiConfig.DetailsLevel;
import com.example.xai.model.xaiConfig.ExpertiseLevel;
import com.example.xai.model.xaiConfig.ExplanationMethod;
import com.example.xai.model.xaiConfig.OutputFormat;
import com.example.xai.model.xaiConfig.Purpose;
import com.example.xai.model.xaiConfig.TrainingPolicy;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import com.example.xai.model.xaiConfig.XaiConfigTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getExpertiseLevels <em>Expertise Levels</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getDetailsLevels <em>Details Levels</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getDebugTechniques <em>Debug Techniques</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getDatasetTypes <em>Dataset Types</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getTrainingPolicies <em>Training Policies</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link com.example.xai.model.xaiConfig.impl.ConfigurationImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getExpertiseLevels() <em>Expertise Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertiseLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpertiseLevel> expertiseLevels;

	/**
	 * The cached value of the '{@link #getDetailsLevels() <em>Details Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<DetailsLevel> detailsLevels;

	/**
	 * The cached value of the '{@link #getOutputFormats() <em>Output Formats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputFormat> outputFormats;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purposes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Purpose> purposes;

	/**
	 * The cached value of the '{@link #getDebugTechniques() <em>Debug Techniques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugTechniques()
	 * @generated
	 * @ordered
	 */
	protected EList<DebugTechnique> debugTechniques;

	/**
	 * The cached value of the '{@link #getDatasetTypes() <em>Dataset Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetType> datasetTypes;

	/**
	 * The cached value of the '{@link #getTrainingPolicies() <em>Training Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingPolicy> trainingPolicies;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModel> models;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationMethod> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XaiConfigPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpertiseLevel> getExpertiseLevels() {
		if (expertiseLevels == null) {
			expertiseLevels = new EObjectContainmentEList<ExpertiseLevel>(ExpertiseLevel.class, this, XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS);
		}
		return expertiseLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetailsLevel> getDetailsLevels() {
		if (detailsLevels == null) {
			detailsLevels = new EObjectContainmentEList<DetailsLevel>(DetailsLevel.class, this, XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS);
		}
		return detailsLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputFormat> getOutputFormats() {
		if (outputFormats == null) {
			outputFormats = new EObjectContainmentEList<OutputFormat>(OutputFormat.class, this, XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS);
		}
		return outputFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Purpose> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectContainmentEList<Purpose>(Purpose.class, this, XaiConfigPackage.CONFIGURATION__PURPOSES);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DebugTechnique> getDebugTechniques() {
		if (debugTechniques == null) {
			debugTechniques = new EObjectContainmentEList<DebugTechnique>(DebugTechnique.class, this, XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES);
		}
		return debugTechniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetType> getDatasetTypes() {
		if (datasetTypes == null) {
			datasetTypes = new EObjectContainmentEList<DatasetType>(DatasetType.class, this, XaiConfigPackage.CONFIGURATION__DATASET_TYPES);
		}
		return datasetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainingPolicy> getTrainingPolicies() {
		if (trainingPolicies == null) {
			trainingPolicies = new EObjectContainmentEList<TrainingPolicy>(TrainingPolicy.class, this, XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES);
		}
		return trainingPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModel> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<AIModel>(AIModel.class, this, XaiConfigPackage.CONFIGURATION__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<ExplanationMethod>(ExplanationMethod.class, this, XaiConfigPackage.CONFIGURATION__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueModelNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueModelNames";
		try {
			/**
			 *
			 * inv UniqueModelNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = models->collect(m | m.name.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_MODEL_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AIModel> models = this.getModels();
				final /*@NonInvalid*/ OrderedSetValue BOXED_models = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_AIModel, models);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_m = BOXED_models.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ AIModel m = (AIModel)ITERATOR_m.next();
					/**
					 * m.name.toLower()
					 */
					final /*@NonInvalid*/ String name = m.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
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
	public boolean UniqueExpertiseRanks(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueExpertiseRanks";
		try {
			/**
			 *
			 * inv UniqueExpertiseRanks:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = expertiseLevels->isUnique(e | e.rank)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_EXPERTISE_RANKS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<ExpertiseLevel> expertiseLevels = this.getExpertiseLevels();
				final /*@NonInvalid*/ OrderedSetValue BOXED_expertiseLevels = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_ExpertiseLevel, expertiseLevels);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(XaiConfigTables.ORD_CLSSid_ExpertiseLevel);
				Iterator<Object> ITERATOR_e_0 = BOXED_expertiseLevels.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ ExpertiseLevel e_0 = (ExpertiseLevel)ITERATOR_e_0.next();
					/**
					 * e.rank
					 */
					final /*@NonInvalid*/ int rank = e_0.getRank();
					final /*@NonInvalid*/ IntegerValue BOXED_rank = ValueUtil.integerValueOf(rank);
					//
					if (accumulator.includes(BOXED_rank) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(BOXED_rank);
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
	public boolean UniqueDatasetTypeNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueDatasetTypeNames";
		try {
			/**
			 *
			 * inv UniqueDatasetTypeNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = datasetTypes->collect(d | d.name.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_DATASET_TYPE_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<DatasetType> datasetTypes = this.getDatasetTypes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_datasetTypes = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_DatasetType, datasetTypes);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_d = BOXED_datasetTypes.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_d.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ DatasetType d = (DatasetType)ITERATOR_d.next();
					/**
					 * d.name.toLower()
					 */
					final /*@NonInvalid*/ String name = d.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
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
	public boolean UniquePurposeNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniquePurposeNames";
		try {
			/**
			 *
			 * inv UniquePurposeNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = purposes->collect(p | p.name.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_PURPOSE_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Purpose> purposes = this.getPurposes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_purposes = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_Purpose, purposes);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_p = BOXED_purposes.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Purpose p = (Purpose)ITERATOR_p.next();
					/**
					 * p.name.toLower()
					 */
					final /*@NonInvalid*/ String name = p.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
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
	public boolean UniqueOutputFormatNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueOutputFormatNames";
		try {
			/**
			 *
			 * inv UniqueOutputFormatNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = outputFormats->collect(f | f.name.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_OUTPUT_FORMAT_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<OutputFormat> outputFormats = this.getOutputFormats();
				final /*@NonInvalid*/ OrderedSetValue BOXED_outputFormats = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_OutputFormat, outputFormats);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_f = BOXED_outputFormats.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_f.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ OutputFormat f = (OutputFormat)ITERATOR_f.next();
					/**
					 * f.name.toLower()
					 */
					final /*@NonInvalid*/ String name = f.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
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
	public boolean UniqueMethodNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueMethodNames";
		try {
			/**
			 *
			 * inv UniqueMethodNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = methods->collect(m | m.name.toLower())
			 *         ->isUnique(x | x)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_METHOD_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<ExplanationMethod> methods = this.getMethods();
				final /*@NonInvalid*/ OrderedSetValue BOXED_methods = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_ExplanationMethod, methods);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(XaiConfigTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_m = BOXED_methods.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ ExplanationMethod m = (ExplanationMethod)ITERATOR_m.next();
					/**
					 * m.name.toLower()
					 */
					final /*@NonInvalid*/ String name = m.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
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
	public boolean UniqueDetailsRanks(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Configuration::UniqueDetailsRanks";
		try {
			/**
			 *
			 * inv UniqueDetailsRanks:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = detailsLevels->isUnique(d | d.rank)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, XaiConfigPackage.Literals.CONFIGURATION___UNIQUE_DETAILS_RANKS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, XaiConfigTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<DetailsLevel> detailsLevels = this.getDetailsLevels();
				final /*@NonInvalid*/ OrderedSetValue BOXED_detailsLevels = idResolver.createOrderedSetOfAll(XaiConfigTables.ORD_CLSSid_DetailsLevel, detailsLevels);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(XaiConfigTables.ORD_CLSSid_DetailsLevel);
				Iterator<Object> ITERATOR_d = BOXED_detailsLevels.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_d.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ DetailsLevel d = (DetailsLevel)ITERATOR_d.next();
					/**
					 * d.rank
					 */
					final /*@NonInvalid*/ int rank = d.getRank();
					final /*@NonInvalid*/ IntegerValue BOXED_rank = ValueUtil.integerValueOf(rank);
					//
					if (accumulator.includes(BOXED_rank) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(BOXED_rank);
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
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
				return ((InternalEList<?>)getExpertiseLevels()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
				return ((InternalEList<?>)getDetailsLevels()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
				return ((InternalEList<?>)getOutputFormats()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
				return ((InternalEList<?>)getDebugTechniques()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
				return ((InternalEList<?>)getDatasetTypes()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
				return ((InternalEList<?>)getTrainingPolicies()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case XaiConfigPackage.CONFIGURATION__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
				return getExpertiseLevels();
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
				return getDetailsLevels();
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
				return getOutputFormats();
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
				return getPurposes();
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
				return getDebugTechniques();
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
				return getDatasetTypes();
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
				return getTrainingPolicies();
			case XaiConfigPackage.CONFIGURATION__MODELS:
				return getModels();
			case XaiConfigPackage.CONFIGURATION__METHODS:
				return getMethods();
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
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
				getExpertiseLevels().clear();
				getExpertiseLevels().addAll((Collection<? extends ExpertiseLevel>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
				getDetailsLevels().clear();
				getDetailsLevels().addAll((Collection<? extends DetailsLevel>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
				getOutputFormats().clear();
				getOutputFormats().addAll((Collection<? extends OutputFormat>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Purpose>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
				getDebugTechniques().clear();
				getDebugTechniques().addAll((Collection<? extends DebugTechnique>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
				getDatasetTypes().clear();
				getDatasetTypes().addAll((Collection<? extends DatasetType>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
				getTrainingPolicies().clear();
				getTrainingPolicies().addAll((Collection<? extends TrainingPolicy>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends AIModel>)newValue);
				return;
			case XaiConfigPackage.CONFIGURATION__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends ExplanationMethod>)newValue);
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
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
				getExpertiseLevels().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
				getDetailsLevels().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
				getOutputFormats().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
				getPurposes().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
				getDebugTechniques().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
				getDatasetTypes().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
				getTrainingPolicies().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__MODELS:
				getModels().clear();
				return;
			case XaiConfigPackage.CONFIGURATION__METHODS:
				getMethods().clear();
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
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
				return expertiseLevels != null && !expertiseLevels.isEmpty();
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
				return detailsLevels != null && !detailsLevels.isEmpty();
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
				return outputFormats != null && !outputFormats.isEmpty();
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
				return purposes != null && !purposes.isEmpty();
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
				return debugTechniques != null && !debugTechniques.isEmpty();
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
				return datasetTypes != null && !datasetTypes.isEmpty();
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
				return trainingPolicies != null && !trainingPolicies.isEmpty();
			case XaiConfigPackage.CONFIGURATION__MODELS:
				return models != null && !models.isEmpty();
			case XaiConfigPackage.CONFIGURATION__METHODS:
				return methods != null && !methods.isEmpty();
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
			case XaiConfigPackage.CONFIGURATION___UNIQUE_MODEL_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueModelNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_EXPERTISE_RANKS__DIAGNOSTICCHAIN_MAP:
				return UniqueExpertiseRanks((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_DATASET_TYPE_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueDatasetTypeNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_PURPOSE_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniquePurposeNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_OUTPUT_FORMAT_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueOutputFormatNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_METHOD_NAMES__DIAGNOSTICCHAIN_MAP:
				return UniqueMethodNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case XaiConfigPackage.CONFIGURATION___UNIQUE_DETAILS_RANKS__DIAGNOSTICCHAIN_MAP:
				return UniqueDetailsRanks((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConfigurationImpl
