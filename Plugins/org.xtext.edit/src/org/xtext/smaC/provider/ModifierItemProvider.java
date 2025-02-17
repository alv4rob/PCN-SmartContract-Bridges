/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.xtext.smaC.Modifier;
import org.xtext.smaC.SmaCFactory;
import org.xtext.smaC.SmaCPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.smaC.Modifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifierItemProvider 
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
	public ModifierItemProvider(AdapterFactory adapterFactory) {
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
			addExpressionsAssignValueBeforeMarkPropertyDescriptor(object);
			addExpressionsAssignValueAfterMarkPropertyDescriptor(object);
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
				 getString("_UI_Modifier_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modifier_name_feature", "_UI_Modifier_type"),
				 SmaCPackage.Literals.MODIFIER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expressions Assign Value Before Mark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionsAssignValueBeforeMarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Modifier_expressionsAssignValueBeforeMark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modifier_expressionsAssignValueBeforeMark_feature", "_UI_Modifier_type"),
				 SmaCPackage.Literals.MODIFIER__EXPRESSIONS_ASSIGN_VALUE_BEFORE_MARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expressions Assign Value After Mark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionsAssignValueAfterMarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Modifier_expressionsAssignValueAfterMark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modifier_expressionsAssignValueAfterMark_feature", "_UI_Modifier_type"),
				 SmaCPackage.Literals.MODIFIER__EXPRESSIONS_ASSIGN_VALUE_AFTER_MARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SmaCPackage.Literals.MODIFIER__INPUT_PARAMS);
			childrenFeatures.add(SmaCPackage.Literals.MODIFIER__CONDITION_RESTRICION);
			childrenFeatures.add(SmaCPackage.Literals.MODIFIER__CONDITIONS_BEFORE_MARK);
			childrenFeatures.add(SmaCPackage.Literals.MODIFIER__CONDITIONS_AFTER_MARK);
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
	 * This returns Modifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Modifier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Modifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Modifier_type") :
			getString("_UI_Modifier_type") + " " + label;
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

		switch (notification.getFeatureID(Modifier.class)) {
			case SmaCPackage.MODIFIER__NAME:
			case SmaCPackage.MODIFIER__EXPRESSIONS_ASSIGN_VALUE_BEFORE_MARK:
			case SmaCPackage.MODIFIER__EXPRESSIONS_ASSIGN_VALUE_AFTER_MARK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmaCPackage.MODIFIER__INPUT_PARAMS:
			case SmaCPackage.MODIFIER__CONDITION_RESTRICION:
			case SmaCPackage.MODIFIER__CONDITIONS_BEFORE_MARK:
			case SmaCPackage.MODIFIER__CONDITIONS_AFTER_MARK:
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
				(SmaCPackage.Literals.MODIFIER__INPUT_PARAMS,
				 SmaCFactory.eINSTANCE.createInputParam()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__INPUT_PARAMS,
				 SmaCFactory.eINSTANCE.createMappingDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITION_RESTRICION,
				 SmaCFactory.eINSTANCE.createRestrictionClause()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITION_RESTRICION,
				 SmaCFactory.eINSTANCE.createRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITION_RESTRICION,
				 SmaCFactory.eINSTANCE.createRestrictionGas()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITION_RESTRICION,
				 SmaCFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITIONS_BEFORE_MARK,
				 SmaCFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.MODIFIER__CONDITIONS_AFTER_MARK,
				 SmaCFactory.eINSTANCE.createCondition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SmaCPackage.Literals.MODIFIER__CONDITIONS_BEFORE_MARK ||
			childFeature == SmaCPackage.Literals.MODIFIER__CONDITIONS_AFTER_MARK;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SmaCEditPlugin.INSTANCE;
	}

}
