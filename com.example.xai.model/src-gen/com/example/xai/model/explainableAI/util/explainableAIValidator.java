/**
 */
package com.example.xai.model.explainableAI.util;

import com.example.xai.model.explainableAI.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.xai.model.explainableAI.explainableAIPackage
 * @generated
 */
public class explainableAIValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final explainableAIValidator INSTANCE = new explainableAIValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.example.xai.model.explainableAI";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Expertise' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__NON_BLANK_EXPERTISE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Purpose If Specified' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__NON_BLANK_PURPOSE_IF_SPECIFIED = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Formats' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__NON_BLANK_FORMATS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Formats Case Insensitive' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__UNIQUE_FORMATS_CASE_INSENSITIVE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Details If Specified' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__NON_BLANK_DETAILS_IF_SPECIFIED = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Path' of 'Dataset'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATASET__NON_BLANK_PATH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Target If Specified' of 'Dataset'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATASET__NON_BLANK_TARGET_IF_SPECIFIED = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Blank Format' of 'Dataset'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATASET__NON_BLANK_FORMAT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public explainableAIValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return explainableAIPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case explainableAIPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case explainableAIPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case explainableAIPackage.DATASET:
			return validateDataset((Dataset) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_NonBlankDetailsIfSpecified(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_NonBlankExpertise(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_NonBlankPurposeIfSpecified(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_NonBlankFormats(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_UniqueFormatsCaseInsensitive(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonBlankDetailsIfSpecified constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_NonBlankDetailsIfSpecified(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.NonBlankDetailsIfSpecified(diagnostics, context);
	}

	/**
	 * Validates the NonBlankExpertise constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_NonBlankExpertise(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.NonBlankExpertise(diagnostics, context);
	}

	/**
	 * Validates the NonBlankPurposeIfSpecified constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_NonBlankPurposeIfSpecified(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.NonBlankPurposeIfSpecified(diagnostics, context);
	}

	/**
	 * Validates the NonBlankFormats constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_NonBlankFormats(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.NonBlankFormats(diagnostics, context);
	}

	/**
	 * Validates the UniqueFormatsCaseInsensitive constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_UniqueFormatsCaseInsensitive(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.UniqueFormatsCaseInsensitive(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset(Dataset dataset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataset, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataset_NonBlankFormat(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataset_NonBlankPath(dataset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataset_NonBlankTargetIfSpecified(dataset, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonBlankFormat constraint of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset_NonBlankFormat(Dataset dataset, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataset.NonBlankFormat(diagnostics, context);
	}

	/**
	 * Validates the NonBlankPath constraint of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset_NonBlankPath(Dataset dataset, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataset.NonBlankPath(diagnostics, context);
	}

	/**
	 * Validates the NonBlankTargetIfSpecified constraint of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset_NonBlankTargetIfSpecified(Dataset dataset, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataset.NonBlankTargetIfSpecified(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //explainableAIValidator
