/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSParamList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSParamList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _XSParamItemList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSParamItem> _XSParamItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSParamList() {
        super();
        this._XSParamItemList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSParamItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vXSParamItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSParamItem(
            final org.edna.mxv1.xsdata.XSParamItem vXSParamItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSParamItemList.add(vXSParamItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vXSParamItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSParamItem(
            final int index,
            final org.edna.mxv1.xsdata.XSParamItem vXSParamItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSParamItemList.add(index, vXSParamItem);
    }

    /**
     * Method enumerateXSParamItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSParamItem> enumerateXSParamItem(
    ) {
        return java.util.Collections.enumeration(this._XSParamItemList);
    }

    /**
     * Method getXSParamItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSParamItem at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSParamItem getXSParamItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSParamItemList.size()) {
            throw new IndexOutOfBoundsException("getXSParamItem: Index value '" + index + "' not in range [0.." + (this._XSParamItemList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSParamItem) _XSParamItemList.get(index);
    }

    /**
     * Method getXSParamItem.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSParamItem[] getXSParamItem(
    ) {
        org.edna.mxv1.xsdata.XSParamItem[] array = new org.edna.mxv1.xsdata.XSParamItem[0];
        return (org.edna.mxv1.xsdata.XSParamItem[]) this._XSParamItemList.toArray(array);
    }

    /**
     * Method getXSParamItemCount.
     * 
     * @return the size of this collection
     */
    public int getXSParamItemCount(
    ) {
        return this._XSParamItemList.size();
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
     * Method iterateXSParamItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSParamItem> iterateXSParamItem(
    ) {
        return this._XSParamItemList.iterator();
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
    public void removeAllXSParamItem(
    ) {
        this._XSParamItemList.clear();
    }

    /**
     * Method removeXSParamItem.
     * 
     * @param vXSParamItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeXSParamItem(
            final org.edna.mxv1.xsdata.XSParamItem vXSParamItem) {
        boolean removed = _XSParamItemList.remove(vXSParamItem);
        return removed;
    }

    /**
     * Method removeXSParamItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSParamItem removeXSParamItemAt(
            final int index) {
        java.lang.Object obj = this._XSParamItemList.remove(index);
        return (org.edna.mxv1.xsdata.XSParamItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vXSParamItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setXSParamItem(
            final int index,
            final org.edna.mxv1.xsdata.XSParamItem vXSParamItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSParamItemList.size()) {
            throw new IndexOutOfBoundsException("setXSParamItem: Index value '" + index + "' not in range [0.." + (this._XSParamItemList.size() - 1) + "]");
        }

        this._XSParamItemList.set(index, vXSParamItem);
    }

    /**
     * 
     * 
     * @param vXSParamItemArray
     */
    public void setXSParamItem(
            final org.edna.mxv1.xsdata.XSParamItem[] vXSParamItemArray) {
        //-- copy array
        _XSParamItemList.clear();

        for (int i = 0; i < vXSParamItemArray.length; i++) {
                this._XSParamItemList.add(vXSParamItemArray[i]);
        }
    }

    /**
     * Method unmarshalXSParamList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSParamList
     */
    public static org.edna.mxv1.xsdata.XSParamList unmarshalXSParamList(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSParamList) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSParamList.class, reader);
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
