/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /com.example.xai.model/model/config.ecore
 * using:
 *   /com.example.xai.model/model/config.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package com.example.xai.model.xaiConfig;

// import com.example.xai.model.xaiConfig.XaiConfigPackage;
// import com.example.xai.model.xaiConfig.XaiConfigTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * XaiConfigTables provides the dispatch tables for the xaiConfig for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class XaiConfigTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(XaiConfigPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_example_org_s_xaiConfig = IdManager.getNsURIPackageId("http://example.org/xaiConfig", null, XaiConfigPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AIModel = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("AIModel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Configuration = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("Configuration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DatasetType = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("DatasetType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DebugTechnique = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("DebugTechnique", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DetailsLevel = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("DetailsLevel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExpertiseLevel = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("ExpertiseLevel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExplanationMethod = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("ExplanationMethod", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OutputFormat = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("OutputFormat", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Purpose = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("Purpose", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TrainingPolicy = XaiConfigTables.PACKid_http_c_s_s_example_org_s_xaiConfig.getClassId("TrainingPolicy", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = XaiConfigTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ String STR_debugging = "debugging";
	public static final /*@NonInvalid*/ String STR_global = "global";
	public static final /*@NonInvalid*/ String STR_local = "local";
	public static final /*@NonInvalid*/ String STR_local_p_global = "local+global";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AIModel = TypeId.BAG.getSpecializedId(XaiConfigTables.CLSSid_AIModel, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ExplanationMethod = TypeId.BAG.getSpecializedId(XaiConfigTables.CLSSid_ExplanationMethod, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AIModel = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_AIModel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DatasetType = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_DatasetType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DebugTechnique = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_DebugTechnique, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DetailsLevel = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_DetailsLevel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExpertiseLevel = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_ExpertiseLevel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExplanationMethod = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_ExplanationMethod, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OutputFormat = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_OutputFormat, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OutputFormat_0 = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_OutputFormat, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_Parameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Purpose = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_Purpose, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TrainingPolicy = TypeId.ORDERED_SET.getSpecializedId(XaiConfigTables.CLSSid_TrainingPolicy, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			XaiConfigTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AIModel = new EcoreExecutorType(XaiConfigPackage.Literals.AI_MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Configuration = new EcoreExecutorType(XaiConfigPackage.Literals.CONFIGURATION, PACKAGE, 0);
		public static final EcoreExecutorType _DatasetType = new EcoreExecutorType(XaiConfigPackage.Literals.DATASET_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _DebugTechnique = new EcoreExecutorType(XaiConfigPackage.Literals.DEBUG_TECHNIQUE, PACKAGE, 0);
		public static final EcoreExecutorType _DetailsLevel = new EcoreExecutorType(XaiConfigPackage.Literals.DETAILS_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _ExpertiseLevel = new EcoreExecutorType(XaiConfigPackage.Literals.EXPERTISE_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _ExplanationMethod = new EcoreExecutorType(XaiConfigPackage.Literals.EXPLANATION_METHOD, PACKAGE, 0);
		public static final EcoreExecutorType _OutputFormat = new EcoreExecutorType(XaiConfigPackage.Literals.OUTPUT_FORMAT, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(XaiConfigPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Purpose = new EcoreExecutorType(XaiConfigPackage.Literals.PURPOSE, PACKAGE, 0);
		public static final EcoreExecutorType _TrainingPolicy = new EcoreExecutorType(XaiConfigPackage.Literals.TRAINING_POLICY, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AIModel,
			_Configuration,
			_DatasetType,
			_DebugTechnique,
			_DetailsLevel,
			_ExpertiseLevel,
			_ExplanationMethod,
			_OutputFormat,
			_Parameter,
			_Purpose,
			_TrainingPolicy
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AIModel__AIModel = new ExecutorFragment(Types._AIModel, XaiConfigTables.Types._AIModel);
		private static final ExecutorFragment _AIModel__OclAny = new ExecutorFragment(Types._AIModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AIModel__OclElement = new ExecutorFragment(Types._AIModel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Configuration__Configuration = new ExecutorFragment(Types._Configuration, XaiConfigTables.Types._Configuration);
		private static final ExecutorFragment _Configuration__OclAny = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Configuration__OclElement = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DatasetType__DatasetType = new ExecutorFragment(Types._DatasetType, XaiConfigTables.Types._DatasetType);
		private static final ExecutorFragment _DatasetType__OclAny = new ExecutorFragment(Types._DatasetType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DatasetType__OclElement = new ExecutorFragment(Types._DatasetType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DebugTechnique__DebugTechnique = new ExecutorFragment(Types._DebugTechnique, XaiConfigTables.Types._DebugTechnique);
		private static final ExecutorFragment _DebugTechnique__OclAny = new ExecutorFragment(Types._DebugTechnique, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DebugTechnique__OclElement = new ExecutorFragment(Types._DebugTechnique, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DetailsLevel__DetailsLevel = new ExecutorFragment(Types._DetailsLevel, XaiConfigTables.Types._DetailsLevel);
		private static final ExecutorFragment _DetailsLevel__OclAny = new ExecutorFragment(Types._DetailsLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DetailsLevel__OclElement = new ExecutorFragment(Types._DetailsLevel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExpertiseLevel__ExpertiseLevel = new ExecutorFragment(Types._ExpertiseLevel, XaiConfigTables.Types._ExpertiseLevel);
		private static final ExecutorFragment _ExpertiseLevel__OclAny = new ExecutorFragment(Types._ExpertiseLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExpertiseLevel__OclElement = new ExecutorFragment(Types._ExpertiseLevel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExplanationMethod__ExplanationMethod = new ExecutorFragment(Types._ExplanationMethod, XaiConfigTables.Types._ExplanationMethod);
		private static final ExecutorFragment _ExplanationMethod__OclAny = new ExecutorFragment(Types._ExplanationMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExplanationMethod__OclElement = new ExecutorFragment(Types._ExplanationMethod, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OutputFormat__OclAny = new ExecutorFragment(Types._OutputFormat, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OutputFormat__OclElement = new ExecutorFragment(Types._OutputFormat, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OutputFormat__OutputFormat = new ExecutorFragment(Types._OutputFormat, XaiConfigTables.Types._OutputFormat);

		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, XaiConfigTables.Types._Parameter);

		private static final ExecutorFragment _Purpose__OclAny = new ExecutorFragment(Types._Purpose, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Purpose__OclElement = new ExecutorFragment(Types._Purpose, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Purpose__Purpose = new ExecutorFragment(Types._Purpose, XaiConfigTables.Types._Purpose);

		private static final ExecutorFragment _TrainingPolicy__OclAny = new ExecutorFragment(Types._TrainingPolicy, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TrainingPolicy__OclElement = new ExecutorFragment(Types._TrainingPolicy, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TrainingPolicy__TrainingPolicy = new ExecutorFragment(Types._TrainingPolicy, XaiConfigTables.Types._TrainingPolicy);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AIModel__acceptedDatasetTypes = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__ACCEPTED_DATASET_TYPES, Types._AIModel, 0);
		public static final ExecutorProperty _AIModel__allowedMethods = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__ALLOWED_METHODS, Types._AIModel, 1);
		public static final ExecutorProperty _AIModel__classPath = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__CLASS_PATH, Types._AIModel, 2);
		public static final ExecutorProperty _AIModel__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__NAME, Types._AIModel, 3);
		public static final ExecutorProperty _AIModel__parameters = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__PARAMETERS, Types._AIModel, 4);
		public static final ExecutorProperty _AIModel__requiredPackages = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__REQUIRED_PACKAGES, Types._AIModel, 5);
		public static final ExecutorProperty _AIModel__trainingPolicy = new EcoreExecutorProperty(XaiConfigPackage.Literals.AI_MODEL__TRAINING_POLICY, Types._AIModel, 6);
		public static final ExecutorProperty _AIModel__Configuration__models = new ExecutorPropertyWithImplementation("Configuration", Types._AIModel, 7, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__MODELS));

		public static final ExecutorProperty _Configuration__datasetTypes = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__DATASET_TYPES, Types._Configuration, 0);
		public static final ExecutorProperty _Configuration__debugTechniques = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__DEBUG_TECHNIQUES, Types._Configuration, 1);
		public static final ExecutorProperty _Configuration__detailsLevels = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__DETAILS_LEVELS, Types._Configuration, 2);
		public static final ExecutorProperty _Configuration__expertiseLevels = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__EXPERTISE_LEVELS, Types._Configuration, 3);
		public static final ExecutorProperty _Configuration__methods = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__METHODS, Types._Configuration, 4);
		public static final ExecutorProperty _Configuration__models = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__MODELS, Types._Configuration, 5);
		public static final ExecutorProperty _Configuration__outputFormats = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__OUTPUT_FORMATS, Types._Configuration, 6);
		public static final ExecutorProperty _Configuration__purposes = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__PURPOSES, Types._Configuration, 7);
		public static final ExecutorProperty _Configuration__trainingPolicies = new EcoreExecutorProperty(XaiConfigPackage.Literals.CONFIGURATION__TRAINING_POLICIES, Types._Configuration, 8);

		public static final ExecutorProperty _DatasetType__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.DATASET_TYPE__NAME, Types._DatasetType, 0);
		public static final ExecutorProperty _DatasetType__requiredPackages = new EcoreExecutorProperty(XaiConfigPackage.Literals.DATASET_TYPE__REQUIRED_PACKAGES, Types._DatasetType, 1);
		public static final ExecutorProperty _DatasetType__requiresTargetColumn = new EcoreExecutorProperty(XaiConfigPackage.Literals.DATASET_TYPE__REQUIRES_TARGET_COLUMN, Types._DatasetType, 2);
		public static final ExecutorProperty _DatasetType__AIModel__acceptedDatasetTypes = new ExecutorPropertyWithImplementation("AIModel", Types._DatasetType, 3, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.AI_MODEL__ACCEPTED_DATASET_TYPES));
		public static final ExecutorProperty _DatasetType__Configuration__datasetTypes = new ExecutorPropertyWithImplementation("Configuration", Types._DatasetType, 4, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__DATASET_TYPES));

		public static final ExecutorProperty _DebugTechnique__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.DEBUG_TECHNIQUE__NAME, Types._DebugTechnique, 0);
		public static final ExecutorProperty _DebugTechnique__Configuration__debugTechniques = new ExecutorPropertyWithImplementation("Configuration", Types._DebugTechnique, 1, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__DEBUG_TECHNIQUES));
		public static final ExecutorProperty _DebugTechnique__ExplanationMethod__debugTechniques = new ExecutorPropertyWithImplementation("ExplanationMethod", Types._DebugTechnique, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__DEBUG_TECHNIQUES));

		public static final ExecutorProperty _DetailsLevel__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.DETAILS_LEVEL__NAME, Types._DetailsLevel, 0);
		public static final ExecutorProperty _DetailsLevel__rank = new EcoreExecutorProperty(XaiConfigPackage.Literals.DETAILS_LEVEL__RANK, Types._DetailsLevel, 1);
		public static final ExecutorProperty _DetailsLevel__Configuration__detailsLevels = new ExecutorPropertyWithImplementation("Configuration", Types._DetailsLevel, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__DETAILS_LEVELS));

		public static final ExecutorProperty _ExpertiseLevel__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPERTISE_LEVEL__NAME, Types._ExpertiseLevel, 0);
		public static final ExecutorProperty _ExpertiseLevel__rank = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPERTISE_LEVEL__RANK, Types._ExpertiseLevel, 1);
		public static final ExecutorProperty _ExpertiseLevel__Configuration__expertiseLevels = new ExecutorPropertyWithImplementation("Configuration", Types._ExpertiseLevel, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__EXPERTISE_LEVELS));
		public static final ExecutorProperty _ExpertiseLevel__ExplanationMethod__minExpertise = new ExecutorPropertyWithImplementation("ExplanationMethod", Types._ExpertiseLevel, 3, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__MIN_EXPERTISE));

		public static final ExecutorProperty _ExplanationMethod__debugTechniques = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__DEBUG_TECHNIQUES, Types._ExplanationMethod, 0);
		public static final ExecutorProperty _ExplanationMethod__defaultFormat = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__DEFAULT_FORMAT, Types._ExplanationMethod, 1);
		public static final ExecutorProperty _ExplanationMethod__implementationClassPath = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH, Types._ExplanationMethod, 2);
		public static final ExecutorProperty _ExplanationMethod__minExpertise = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__MIN_EXPERTISE, Types._ExplanationMethod, 3);
		public static final ExecutorProperty _ExplanationMethod__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__NAME, Types._ExplanationMethod, 4);
		public static final ExecutorProperty _ExplanationMethod__recommendedPurposes = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__RECOMMENDED_PURPOSES, Types._ExplanationMethod, 5);
		public static final ExecutorProperty _ExplanationMethod__requiredPackages = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__REQUIRED_PACKAGES, Types._ExplanationMethod, 6);
		public static final ExecutorProperty _ExplanationMethod__scope = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__SCOPE, Types._ExplanationMethod, 7);
		public static final ExecutorProperty _ExplanationMethod__supportedFormats = new EcoreExecutorProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__SUPPORTED_FORMATS, Types._ExplanationMethod, 8);
		public static final ExecutorProperty _ExplanationMethod__AIModel__allowedMethods = new ExecutorPropertyWithImplementation("AIModel", Types._ExplanationMethod, 9, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.AI_MODEL__ALLOWED_METHODS));
		public static final ExecutorProperty _ExplanationMethod__Configuration__methods = new ExecutorPropertyWithImplementation("Configuration", Types._ExplanationMethod, 10, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__METHODS));

		public static final ExecutorProperty _OutputFormat__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.OUTPUT_FORMAT__NAME, Types._OutputFormat, 0);
		public static final ExecutorProperty _OutputFormat__Configuration__outputFormats = new ExecutorPropertyWithImplementation("Configuration", Types._OutputFormat, 1, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__OUTPUT_FORMATS));
		public static final ExecutorProperty _OutputFormat__ExplanationMethod__defaultFormat = new ExecutorPropertyWithImplementation("ExplanationMethod", Types._OutputFormat, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__DEFAULT_FORMAT));
		public static final ExecutorProperty _OutputFormat__ExplanationMethod__supportedFormats = new ExecutorPropertyWithImplementation("ExplanationMethod", Types._OutputFormat, 3, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__SUPPORTED_FORMATS));

		public static final ExecutorProperty _Parameter__key = new EcoreExecutorProperty(XaiConfigPackage.Literals.PARAMETER__KEY, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__value = new EcoreExecutorProperty(XaiConfigPackage.Literals.PARAMETER__VALUE, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__AIModel__parameters = new ExecutorPropertyWithImplementation("AIModel", Types._Parameter, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.AI_MODEL__PARAMETERS));

		public static final ExecutorProperty _Purpose__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.PURPOSE__NAME, Types._Purpose, 0);
		public static final ExecutorProperty _Purpose__Configuration__purposes = new ExecutorPropertyWithImplementation("Configuration", Types._Purpose, 1, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__PURPOSES));
		public static final ExecutorProperty _Purpose__ExplanationMethod__recommendedPurposes = new ExecutorPropertyWithImplementation("ExplanationMethod", Types._Purpose, 2, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.EXPLANATION_METHOD__RECOMMENDED_PURPOSES));

		public static final ExecutorProperty _TrainingPolicy__enableNormalization = new EcoreExecutorProperty(XaiConfigPackage.Literals.TRAINING_POLICY__ENABLE_NORMALIZATION, Types._TrainingPolicy, 0);
		public static final ExecutorProperty _TrainingPolicy__name = new EcoreExecutorProperty(XaiConfigPackage.Literals.TRAINING_POLICY__NAME, Types._TrainingPolicy, 1);
		public static final ExecutorProperty _TrainingPolicy__requiredPackages = new EcoreExecutorProperty(XaiConfigPackage.Literals.TRAINING_POLICY__REQUIRED_PACKAGES, Types._TrainingPolicy, 2);
		public static final ExecutorProperty _TrainingPolicy__scalerClassPath = new EcoreExecutorProperty(XaiConfigPackage.Literals.TRAINING_POLICY__SCALER_CLASS_PATH, Types._TrainingPolicy, 3);
		public static final ExecutorProperty _TrainingPolicy__useStratification = new EcoreExecutorProperty(XaiConfigPackage.Literals.TRAINING_POLICY__USE_STRATIFICATION, Types._TrainingPolicy, 4);
		public static final ExecutorProperty _TrainingPolicy__AIModel__trainingPolicy = new ExecutorPropertyWithImplementation("AIModel", Types._TrainingPolicy, 5, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.AI_MODEL__TRAINING_POLICY));
		public static final ExecutorProperty _TrainingPolicy__Configuration__trainingPolicies = new ExecutorPropertyWithImplementation("Configuration", Types._TrainingPolicy, 6, new EcoreLibraryOppositeProperty(XaiConfigPackage.Literals.CONFIGURATION__TRAINING_POLICIES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AIModel =
			{
				Fragments._AIModel__OclAny /* 0 */,
				Fragments._AIModel__OclElement /* 1 */,
				Fragments._AIModel__AIModel /* 2 */
			};
		private static final int /*@NonNull*/ [] __AIModel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Configuration =
			{
				Fragments._Configuration__OclAny /* 0 */,
				Fragments._Configuration__OclElement /* 1 */,
				Fragments._Configuration__Configuration /* 2 */
			};
		private static final int /*@NonNull*/ [] __Configuration = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DatasetType =
			{
				Fragments._DatasetType__OclAny /* 0 */,
				Fragments._DatasetType__OclElement /* 1 */,
				Fragments._DatasetType__DatasetType /* 2 */
			};
		private static final int /*@NonNull*/ [] __DatasetType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DebugTechnique =
			{
				Fragments._DebugTechnique__OclAny /* 0 */,
				Fragments._DebugTechnique__OclElement /* 1 */,
				Fragments._DebugTechnique__DebugTechnique /* 2 */
			};
		private static final int /*@NonNull*/ [] __DebugTechnique = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DetailsLevel =
			{
				Fragments._DetailsLevel__OclAny /* 0 */,
				Fragments._DetailsLevel__OclElement /* 1 */,
				Fragments._DetailsLevel__DetailsLevel /* 2 */
			};
		private static final int /*@NonNull*/ [] __DetailsLevel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExpertiseLevel =
			{
				Fragments._ExpertiseLevel__OclAny /* 0 */,
				Fragments._ExpertiseLevel__OclElement /* 1 */,
				Fragments._ExpertiseLevel__ExpertiseLevel /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExpertiseLevel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExplanationMethod =
			{
				Fragments._ExplanationMethod__OclAny /* 0 */,
				Fragments._ExplanationMethod__OclElement /* 1 */,
				Fragments._ExplanationMethod__ExplanationMethod /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExplanationMethod = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OutputFormat =
			{
				Fragments._OutputFormat__OclAny /* 0 */,
				Fragments._OutputFormat__OclElement /* 1 */,
				Fragments._OutputFormat__OutputFormat /* 2 */
			};
		private static final int /*@NonNull*/ [] __OutputFormat = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__Parameter /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Purpose =
			{
				Fragments._Purpose__OclAny /* 0 */,
				Fragments._Purpose__OclElement /* 1 */,
				Fragments._Purpose__Purpose /* 2 */
			};
		private static final int /*@NonNull*/ [] __Purpose = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TrainingPolicy =
			{
				Fragments._TrainingPolicy__OclAny /* 0 */,
				Fragments._TrainingPolicy__OclElement /* 1 */,
				Fragments._TrainingPolicy__TrainingPolicy /* 2 */
			};
		private static final int /*@NonNull*/ [] __TrainingPolicy = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AIModel.initFragments(_AIModel, __AIModel);
			Types._Configuration.initFragments(_Configuration, __Configuration);
			Types._DatasetType.initFragments(_DatasetType, __DatasetType);
			Types._DebugTechnique.initFragments(_DebugTechnique, __DebugTechnique);
			Types._DetailsLevel.initFragments(_DetailsLevel, __DetailsLevel);
			Types._ExpertiseLevel.initFragments(_ExpertiseLevel, __ExpertiseLevel);
			Types._ExplanationMethod.initFragments(_ExplanationMethod, __ExplanationMethod);
			Types._OutputFormat.initFragments(_OutputFormat, __OutputFormat);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Purpose.initFragments(_Purpose, __Purpose);
			Types._TrainingPolicy.initFragments(_TrainingPolicy, __TrainingPolicy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AIModel__AIModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AIModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AIModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Configuration__Configuration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Configuration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Configuration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DatasetType__DatasetType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DatasetType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DatasetType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DebugTechnique__DebugTechnique = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DebugTechnique__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DebugTechnique__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DetailsLevel__DetailsLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DetailsLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DetailsLevel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExpertiseLevel__ExpertiseLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpertiseLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpertiseLevel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExplanationMethod__ExplanationMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExplanationMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExplanationMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OutputFormat__OutputFormat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputFormat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputFormat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__Purpose = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TrainingPolicy__TrainingPolicy = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrainingPolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrainingPolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AIModel__AIModel.initOperations(_AIModel__AIModel);
			Fragments._AIModel__OclAny.initOperations(_AIModel__OclAny);
			Fragments._AIModel__OclElement.initOperations(_AIModel__OclElement);

			Fragments._Configuration__Configuration.initOperations(_Configuration__Configuration);
			Fragments._Configuration__OclAny.initOperations(_Configuration__OclAny);
			Fragments._Configuration__OclElement.initOperations(_Configuration__OclElement);

			Fragments._DatasetType__DatasetType.initOperations(_DatasetType__DatasetType);
			Fragments._DatasetType__OclAny.initOperations(_DatasetType__OclAny);
			Fragments._DatasetType__OclElement.initOperations(_DatasetType__OclElement);

			Fragments._DebugTechnique__DebugTechnique.initOperations(_DebugTechnique__DebugTechnique);
			Fragments._DebugTechnique__OclAny.initOperations(_DebugTechnique__OclAny);
			Fragments._DebugTechnique__OclElement.initOperations(_DebugTechnique__OclElement);

			Fragments._DetailsLevel__DetailsLevel.initOperations(_DetailsLevel__DetailsLevel);
			Fragments._DetailsLevel__OclAny.initOperations(_DetailsLevel__OclAny);
			Fragments._DetailsLevel__OclElement.initOperations(_DetailsLevel__OclElement);

			Fragments._ExpertiseLevel__ExpertiseLevel.initOperations(_ExpertiseLevel__ExpertiseLevel);
			Fragments._ExpertiseLevel__OclAny.initOperations(_ExpertiseLevel__OclAny);
			Fragments._ExpertiseLevel__OclElement.initOperations(_ExpertiseLevel__OclElement);

			Fragments._ExplanationMethod__ExplanationMethod.initOperations(_ExplanationMethod__ExplanationMethod);
			Fragments._ExplanationMethod__OclAny.initOperations(_ExplanationMethod__OclAny);
			Fragments._ExplanationMethod__OclElement.initOperations(_ExplanationMethod__OclElement);

			Fragments._OutputFormat__OclAny.initOperations(_OutputFormat__OclAny);
			Fragments._OutputFormat__OclElement.initOperations(_OutputFormat__OclElement);
			Fragments._OutputFormat__OutputFormat.initOperations(_OutputFormat__OutputFormat);

			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Purpose__OclAny.initOperations(_Purpose__OclAny);
			Fragments._Purpose__OclElement.initOperations(_Purpose__OclElement);
			Fragments._Purpose__Purpose.initOperations(_Purpose__Purpose);

			Fragments._TrainingPolicy__OclAny.initOperations(_TrainingPolicy__OclAny);
			Fragments._TrainingPolicy__OclElement.initOperations(_TrainingPolicy__OclElement);
			Fragments._TrainingPolicy__TrainingPolicy.initOperations(_TrainingPolicy__TrainingPolicy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AIModel = {
			XaiConfigTables.Properties._AIModel__acceptedDatasetTypes,
			XaiConfigTables.Properties._AIModel__allowedMethods,
			XaiConfigTables.Properties._AIModel__classPath,
			XaiConfigTables.Properties._AIModel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._AIModel__parameters,
			XaiConfigTables.Properties._AIModel__requiredPackages,
			XaiConfigTables.Properties._AIModel__trainingPolicy
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Configuration = {
			XaiConfigTables.Properties._Configuration__datasetTypes,
			XaiConfigTables.Properties._Configuration__debugTechniques,
			XaiConfigTables.Properties._Configuration__detailsLevels,
			XaiConfigTables.Properties._Configuration__expertiseLevels,
			XaiConfigTables.Properties._Configuration__methods,
			XaiConfigTables.Properties._Configuration__models,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._Configuration__outputFormats,
			XaiConfigTables.Properties._Configuration__purposes,
			XaiConfigTables.Properties._Configuration__trainingPolicies
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DatasetType = {
			XaiConfigTables.Properties._DatasetType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._DatasetType__requiredPackages,
			XaiConfigTables.Properties._DatasetType__requiresTargetColumn
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DebugTechnique = {
			XaiConfigTables.Properties._DebugTechnique__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DetailsLevel = {
			XaiConfigTables.Properties._DetailsLevel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._DetailsLevel__rank
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExpertiseLevel = {
			XaiConfigTables.Properties._ExpertiseLevel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._ExpertiseLevel__rank
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExplanationMethod = {
			XaiConfigTables.Properties._ExplanationMethod__debugTechniques,
			XaiConfigTables.Properties._ExplanationMethod__defaultFormat,
			XaiConfigTables.Properties._ExplanationMethod__implementationClassPath,
			XaiConfigTables.Properties._ExplanationMethod__minExpertise,
			XaiConfigTables.Properties._ExplanationMethod__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._ExplanationMethod__recommendedPurposes,
			XaiConfigTables.Properties._ExplanationMethod__requiredPackages,
			XaiConfigTables.Properties._ExplanationMethod__scope,
			XaiConfigTables.Properties._ExplanationMethod__supportedFormats
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OutputFormat = {
			XaiConfigTables.Properties._OutputFormat__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			XaiConfigTables.Properties._Parameter__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._Parameter__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Purpose = {
			XaiConfigTables.Properties._Purpose__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TrainingPolicy = {
			XaiConfigTables.Properties._TrainingPolicy__enableNormalization,
			XaiConfigTables.Properties._TrainingPolicy__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			XaiConfigTables.Properties._TrainingPolicy__requiredPackages,
			XaiConfigTables.Properties._TrainingPolicy__scalerClassPath,
			XaiConfigTables.Properties._TrainingPolicy__useStratification
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AIModel__AIModel.initProperties(_AIModel);
			Fragments._Configuration__Configuration.initProperties(_Configuration);
			Fragments._DatasetType__DatasetType.initProperties(_DatasetType);
			Fragments._DebugTechnique__DebugTechnique.initProperties(_DebugTechnique);
			Fragments._DetailsLevel__DetailsLevel.initProperties(_DetailsLevel);
			Fragments._ExpertiseLevel__ExpertiseLevel.initProperties(_ExpertiseLevel);
			Fragments._ExplanationMethod__ExplanationMethod.initProperties(_ExplanationMethod);
			Fragments._OutputFormat__OutputFormat.initProperties(_OutputFormat);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Purpose__Purpose.initProperties(_Purpose);
			Fragments._TrainingPolicy__TrainingPolicy.initProperties(_TrainingPolicy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of XaiConfigTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new XaiConfigTables();
	}

	private XaiConfigTables() {
		super(XaiConfigPackage.eNS_URI);
	}
}
