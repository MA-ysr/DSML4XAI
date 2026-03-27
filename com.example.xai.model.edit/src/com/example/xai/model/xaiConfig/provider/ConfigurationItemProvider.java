/**
 */
package com.example.xai.model.xaiConfig.provider;


import com.example.xai.model.xaiConfig.Configuration;
import com.example.xai.model.xaiConfig.XaiConfigFactory;
import com.example.xai.model.xaiConfig.XaiConfigPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.example.xai.model.xaiConfig.Configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationItemProvider 
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
	public ConfigurationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__EXPERTISE_LEVELS);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__DETAILS_LEVELS);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__OUTPUT_FORMATS);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__PURPOSES);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__DEBUG_TECHNIQUES);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__DATASET_TYPES);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__TRAINING_POLICIES);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__MODELS);
			childrenFeatures.add(XaiConfigPackage.Literals.CONFIGURATION__METHODS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Configuration_type");
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

		switch (notification.getFeatureID(Configuration.class)) {
			case XaiConfigPackage.CONFIGURATION__EXPERTISE_LEVELS:
			case XaiConfigPackage.CONFIGURATION__DETAILS_LEVELS:
			case XaiConfigPackage.CONFIGURATION__OUTPUT_FORMATS:
			case XaiConfigPackage.CONFIGURATION__PURPOSES:
			case XaiConfigPackage.CONFIGURATION__DEBUG_TECHNIQUES:
			case XaiConfigPackage.CONFIGURATION__DATASET_TYPES:
			case XaiConfigPackage.CONFIGURATION__TRAINING_POLICIES:
			case XaiConfigPackage.CONFIGURATION__MODELS:
			case XaiConfigPackage.CONFIGURATION__METHODS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__EXPERTISE_LEVELS,
				 XaiConfigFactory.eINSTANCE.createExpertiseLevel()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__DETAILS_LEVELS,
				 XaiConfigFactory.eINSTANCE.createDetailsLevel()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__OUTPUT_FORMATS,
				 XaiConfigFactory.eINSTANCE.createOutputFormat()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__PURPOSES,
				 XaiConfigFactory.eINSTANCE.createPurpose()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__DEBUG_TECHNIQUES,
				 XaiConfigFactory.eINSTANCE.createDebugTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__DATASET_TYPES,
				 XaiConfigFactory.eINSTANCE.createDatasetType()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__TRAINING_POLICIES,
				 XaiConfigFactory.eINSTANCE.createTrainingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__MODELS,
				 XaiConfigFactory.eINSTANCE.createAIModel()));

		newChildDescriptors.add
			(createChildParameter
				(XaiConfigPackage.Literals.CONFIGURATION__METHODS,
				 XaiConfigFactory.eINSTANCE.createExplanationMethod()));
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
