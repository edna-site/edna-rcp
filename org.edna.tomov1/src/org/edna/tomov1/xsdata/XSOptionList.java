/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSOptionList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSOptionList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _XSOptionItemList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSOptionItem> _XSOptionItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSOptionList() {
        super();
        this._XSOptionItemList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSOptionItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vXSOptionItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSOptionItem(
            final org.edna.tomov1.xsdata.XSOptionItem vXSOptionItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSOptionItemList.add(vXSOptionItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vXSOptionItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSOptionItem(
            final int index,
            final org.edna.tomov1.xsdata.XSOptionItem vXSOptionItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSOptionItemList.add(index, vXSOptionItem);
    }

    /**
     * Method enumerateXSOptionItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSOptionItem> enumerateXSOptionItem(
    ) {
        return java.util.Collections.enumeration(this._XSOptionItemList);
    }

    /**
     * Method getXSOptionItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.tomov1.xsdata.XSOptionItem
     * at the given index
     */
    public org.edna.tomov1.xsdata.XSOptionItem getXSOptionItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSOptionItemList.size()) {
            throw new IndexOutOfBoundsException("getXSOptionItem: Index value '" + index + "' not in range [0.." + (this._XSOptionItemList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSOptionItem) _XSOptionItemList.get(index);
    }

    /**
     * Method getXSOptionItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSOptionItem[] getXSOptionItem(
    ) {
        org.edna.tomov1.xsdata.XSOptionItem[] array = new org.edna.tomov1.xsdata.XSOptionItem[0];
        return (org.edna.tomov1.xsdata.XSOptionItem[]) this._XSOptionItemList.toArray(array);
    }

    /**
     * Method getXSOptionItemCount.
     * 
     * @return the size of this collection
     */
    public int getXSOptionItemCount(
    ) {
        return this._XSOptionItemList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateXSOptionItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSOptionItem> iterateXSOptionItem(
    ) {
        return this._XSOptionItemList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllXSOptionItem(
    ) {
        this._XSOptionItemList.clear();
    }

    /**
     * Method removeXSOptionItem.
     * 
     * @param vXSOptionItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeXSOptionItem(
            final org.edna.tomov1.xsdata.XSOptionItem vXSOptionItem) {
        boolean removed = _XSOptionItemList.remove(vXSOptionItem);
        return removed;
    }

    /**
     * Method removeXSOptionItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSOptionItem removeXSOptionItemAt(
            final int index) {
        java.lang.Object obj = this._XSOptionItemList.remove(index);
        return (org.edna.tomov1.xsdata.XSOptionItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vXSOptionItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setXSOptionItem(
            final int index,
            final org.edna.tomov1.xsdata.XSOptionItem vXSOptionItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSOptionItemList.size()) {
            throw new IndexOutOfBoundsException("setXSOptionItem: Index value '" + index + "' not in range [0.." + (this._XSOptionItemList.size() - 1) + "]");
        }

        this._XSOptionItemList.set(index, vXSOptionItem);
    }

    /**
     * 
     * 
     * @param vXSOptionItemArray
     */
    public void setXSOptionItem(
            final org.edna.tomov1.xsdata.XSOptionItem[] vXSOptionItemArray) {
        //-- copy array
        _XSOptionItemList.clear();

        for (int i = 0; i < vXSOptionItemArray.length; i++) {
                this._XSOptionItemList.add(vXSOptionItemArray[i]);
        }
    }

    /**
     * Method unmarshalXSOptionList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.tomov1.xsdata.XSOptionList
     */
    public static org.edna.tomov1.xsdata.XSOptionList unmarshalXSOptionList(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSOptionList) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSOptionList.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
