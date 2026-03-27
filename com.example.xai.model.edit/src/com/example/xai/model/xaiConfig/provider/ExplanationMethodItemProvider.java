/**
 */
package com.example.xai.model.xaiConfig.provider;


import com.example.xai.model.xaiConfig.ExplanationMethod;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.example.xai.model.xaiConfig.ExplanationMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExplanationMethodItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationMethodItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addImplementationClassPathPropertyDescriptor(object);
			addRequiredPackagesPropertyDescriptor(object);
			addMinExpertisePropertyDescriptor(object);
			addSupportedFormatsPropertyDescriptor(object);
			addDefaultFormatPropertyDescriptor(object);
			addRecommendedPurposesPropertyDescriptor(object);
			addDebugTechniquesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_name_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Expertise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExpertisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_minExpertise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_minExpertise_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__MIN_EXPERTISE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Formats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedFormatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_supportedFormats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_supportedFormats_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__SUPPORTED_FORMATS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_defaultFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_defaultFormat_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__DEFAULT_FORMAT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recommended Purposes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecommendedPurposesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_recommendedPurposes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_recommendedPurposes_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__RECOMMENDED_PURPOSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Debug Techniques feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDebugTechniquesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_debugTechniques_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_debugTechniques_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__DEBUG_TECHNIQUES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_scope_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__SCOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Class Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationClassPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_implementationClassPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_implementationClassPath_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExplanationMethod_requiredPackages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExplanationMethod_requiredPackages_feature", "_UI_ExplanationMethod_type"),
				 XaiConfigPackage.Literals.EXPLANATION_METHOD__REQUIRED_PACKAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ExplanationMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExplanationMethod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExplanationMethod)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExplanationMethod_type") :
			getString("_UI_ExplanationMethod_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExplanationMethod.class)) {
			case XaiConfigPackage.EXPLANATION_METHOD__NAME:
			case XaiConfigPackage.EXPLANATION_METHOD__SCOPE:
			case XaiConfigPackage.EXPLANATION_METHOD__IMPLEMENTATION_CLASS_PATH:
			case XaiConfigPackage.EXPLANATION_METHOD__REQUIRED_PACKAGES:
			case XaiConfigPackage.EXPLANATION_METHOD__MIN_EXPERTISE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConfigEditPlugin.INSTANCE;
	}

}
