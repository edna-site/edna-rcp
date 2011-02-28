/**
 * <copyright>
 * </copyright>
 *
 */
package org.edna.datamodel.datamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.DatamodelPackage;
import org.edna.datamodel.datamodel.ElementDeclaration;
import org.edna.datamodel.datamodel.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDeclarationImpl extends MinimalEObjectImpl.Container implements ElementDeclaration
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
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ComplexType ref;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final PrimitiveType TYPE_EDEFAULT = PrimitiveType.UNDEFINED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PrimitiveType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDeclarationImpl()
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
    return DatamodelPackage.Literals.ELEMENT_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ComplexType)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.ELEMENT_DECLARATION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ComplexType newRef)
  {
    ComplexType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(PrimitiveType newType)
  {
    PrimitiveType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__OPTIONAL, oldOptional, optional));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ELEMENT_DECLARATION__DOC, oldDoc, doc));
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
      case DatamodelPackage.ELEMENT_DECLARATION__NAME:
        return getName();
      case DatamodelPackage.ELEMENT_DECLARATION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case DatamodelPackage.ELEMENT_DECLARATION__TYPE:
        return getType();
      case DatamodelPackage.ELEMENT_DECLARATION__MULTIPLE:
        return isMultiple();
      case DatamodelPackage.ELEMENT_DECLARATION__OPTIONAL:
        return isOptional();
      case DatamodelPackage.ELEMENT_DECLARATION__DOC:
        return getDoc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DatamodelPackage.ELEMENT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__REF:
        setRef((ComplexType)newValue);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__TYPE:
        setType((PrimitiveType)newValue);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__MULTIPLE:
        setMultiple((Boolean)newValue);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__DOC:
        setDoc((String)newValue);
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
      case DatamodelPackage.ELEMENT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__REF:
        setRef((ComplexType)null);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case DatamodelPackage.ELEMENT_DECLARATION__DOC:
        setDoc(DOC_EDEFAULT);
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
      case DatamodelPackage.ELEMENT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DatamodelPackage.ELEMENT_DECLARATION__REF:
        return ref != null;
      case DatamodelPackage.ELEMENT_DECLARATION__TYPE:
        return type != TYPE_EDEFAULT;
      case DatamodelPackage.ELEMENT_DECLARATION__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case DatamodelPackage.ELEMENT_DECLARATION__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case DatamodelPackage.ELEMENT_DECLARATION__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
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
    result.append(", type: ");
    result.append(type);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(", optional: ");
    result.append(optional);
    result.append(", doc: ");
    result.append(doc);
    result.append(')');
    return result.toString();
  }

} //ElementDeclarationImpl
