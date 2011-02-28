/**
 * <copyright>
 * </copyright>
 *
 */
package org.edna.datamodel.datamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.DatamodelPackage;
import org.edna.datamodel.datamodel.Import;
import org.edna.datamodel.datamodel.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ModelImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNamespace()
   * @generated
   * @ordered
   */
  protected static final String TARGET_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNamespace()
   * @generated
   * @ordered
   */
  protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<ComplexType> types;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<org.edna.datamodel.datamodel.Package> packages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DatamodelPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetNamespace()
  {
    return targetNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetNamespace(String newTargetNamespace)
  {
    String oldTargetNamespace = targetNamespace;
    targetNamespace = newTargetNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.MODEL__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, DatamodelPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, DatamodelPackage.MODEL__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.edna.datamodel.datamodel.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<org.edna.datamodel.datamodel.Package>(org.edna.datamodel.datamodel.Package.class, this, DatamodelPackage.MODEL__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DatamodelPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DatamodelPackage.MODEL__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case DatamodelPackage.MODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DatamodelPackage.MODEL__TARGET_NAMESPACE:
        return getTargetNamespace();
      case DatamodelPackage.MODEL__IMPORTS:
        return getImports();
      case DatamodelPackage.MODEL__TYPES:
        return getTypes();
      case DatamodelPackage.MODEL__PACKAGES:
        return getPackages();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DatamodelPackage.MODEL__TARGET_NAMESPACE:
        setTargetNamespace((String)newValue);
        return;
      case DatamodelPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case DatamodelPackage.MODEL__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends ComplexType>)newValue);
        return;
      case DatamodelPackage.MODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends org.edna.datamodel.datamodel.Package>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DatamodelPackage.MODEL__TARGET_NAMESPACE:
        setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
        return;
      case DatamodelPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case DatamodelPackage.MODEL__TYPES:
        getTypes().clear();
        return;
      case DatamodelPackage.MODEL__PACKAGES:
        getPackages().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DatamodelPackage.MODEL__TARGET_NAMESPACE:
        return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
      case DatamodelPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DatamodelPackage.MODEL__TYPES:
        return types != null && !types.isEmpty();
      case DatamodelPackage.MODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (targetNamespace: ");
    result.append(targetNamespace);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
