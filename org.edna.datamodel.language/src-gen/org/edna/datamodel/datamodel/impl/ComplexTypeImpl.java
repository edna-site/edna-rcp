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
import org.edna.datamodel.datamodel.ElementDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexTypeImpl extends MinimalEObjectImpl.Container implements ComplexType
{
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
   * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseType()
   * @generated
   * @ordered
   */
  protected ComplexType baseType;

  /**
   * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected static final String DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected String doc = DOC_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ElementDeclaration> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexTypeImpl()
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
    return DatamodelPackage.Literals.COMPLEX_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.COMPLEX_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType getBaseType()
  {
    if (baseType != null && baseType.eIsProxy())
    {
      InternalEObject oldBaseType = (InternalEObject)baseType;
      baseType = (ComplexType)eResolveProxy(oldBaseType);
      if (baseType != oldBaseType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.COMPLEX_TYPE__BASE_TYPE, oldBaseType, baseType));
      }
    }
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType basicGetBaseType()
  {
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseType(ComplexType newBaseType)
  {
    ComplexType oldBaseType = baseType;
    baseType = newBaseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.COMPLEX_TYPE__BASE_TYPE, oldBaseType, baseType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(String newDoc)
  {
    String oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.COMPLEX_TYPE__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementDeclaration> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ElementDeclaration>(ElementDeclaration.class, this, DatamodelPackage.COMPLEX_TYPE__ELEMENTS);
    }
    return elements;
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
      case DatamodelPackage.COMPLEX_TYPE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case DatamodelPackage.COMPLEX_TYPE__NAME:
        return getName();
      case DatamodelPackage.COMPLEX_TYPE__BASE_TYPE:
        if (resolve) return getBaseType();
        return basicGetBaseType();
      case DatamodelPackage.COMPLEX_TYPE__DOC:
        return getDoc();
      case DatamodelPackage.COMPLEX_TYPE__ELEMENTS:
        return getElements();
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
      case DatamodelPackage.COMPLEX_TYPE__NAME:
        setName((String)newValue);
        return;
      case DatamodelPackage.COMPLEX_TYPE__BASE_TYPE:
        setBaseType((ComplexType)newValue);
        return;
      case DatamodelPackage.COMPLEX_TYPE__DOC:
        setDoc((String)newValue);
        return;
      case DatamodelPackage.COMPLEX_TYPE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ElementDeclaration>)newValue);
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
      case DatamodelPackage.COMPLEX_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DatamodelPackage.COMPLEX_TYPE__BASE_TYPE:
        setBaseType((ComplexType)null);
        return;
      case DatamodelPackage.COMPLEX_TYPE__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case DatamodelPackage.COMPLEX_TYPE__ELEMENTS:
        getElements().clear();
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
      case DatamodelPackage.COMPLEX_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DatamodelPackage.COMPLEX_TYPE__BASE_TYPE:
        return baseType != null;
      case DatamodelPackage.COMPLEX_TYPE__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case DatamodelPackage.COMPLEX_TYPE__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", doc: ");
    result.append(doc);
    result.append(')');
    return result.toString();
  }

} //ComplexTypeImpl
