/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSPluginList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSPluginList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _XSPluginItemList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSPluginItem> _XSPluginItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSPluginList() {
        super();
        this._XSPluginItemList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSPluginItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vXSPluginItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSPluginItem(
            final org.edna.mxv1.xsdata.XSPluginItem vXSPluginItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSPluginItemList.add(vXSPluginItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vXSPluginItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXSPluginItem(
            final int index,
            final org.edna.mxv1.xsdata.XSPluginItem vXSPluginItem)
    throws java.lang.IndexOutOfBoundsException {
        this._XSPluginItemList.add(index, vXSPluginItem);
    }

    /**
     * Method enumerateXSPluginItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSPluginItem> enumerateXSPluginItem(
    ) {
        return java.util.Collections.enumeration(this._XSPluginItemList);
    }

    /**
     * Method getXSPluginItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSPluginItem
     * at the given index
     */
    public org.edna.mxv1.xsdata.XSPluginItem getXSPluginItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSPluginItemList.size()) {
            throw new IndexOutOfBoundsException("getXSPluginItem: Index value '" + index + "' not in range [0.." + (this._XSPluginItemList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSPluginItem) _XSPluginItemList.get(index);
    }

    /**
     * Method getXSPluginItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSPluginItem[] getXSPluginItem(
    ) {
        org.edna.mxv1.xsdata.XSPluginItem[] array = new org.edna.mxv1.xsdata.XSPluginItem[0];
        return (org.edna.mxv1.xsdata.XSPluginItem[]) this._XSPluginItemList.toArray(array);
    }

    /**
     * Method getXSPluginItemCount.
     * 
     * @return the size of this collection
     */
    public int getXSPluginItemCount(
    ) {
        return this._XSPluginItemList.size();
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
     * Method iterateXSPluginItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSPluginItem> iterateXSPluginItem(
    ) {
        return this._XSPluginItemList.iterator();
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
    public void removeAllXSPluginItem(
    ) {
        this._XSPluginItemList.clear();
    }

    /**
     * Method removeXSPluginItem.
     * 
     * @param vXSPluginItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeXSPluginItem(
            final org.edna.mxv1.xsdata.XSPluginItem vXSPluginItem) {
        boolean removed = _XSPluginItemList.remove(vXSPluginItem);
        return removed;
    }

    /**
     * Method removeXSPluginItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSPluginItem removeXSPluginItemAt(
            final int index) {
        java.lang.Object obj = this._XSPluginItemList.remove(index);
        return (org.edna.mxv1.xsdata.XSPluginItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vXSPluginItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setXSPluginItem(
            final int index,
            final org.edna.mxv1.xsdata.XSPluginItem vXSPluginItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._XSPluginItemList.size()) {
            throw new IndexOutOfBoundsException("setXSPluginItem: Index value '" + index + "' not in range [0.." + (this._XSPluginItemList.size() - 1) + "]");
        }

        this._XSPluginItemList.set(index, vXSPluginItem);
    }

    /**
     * 
     * 
     * @param vXSPluginItemArray
     */
    public void setXSPluginItem(
            final org.edna.mxv1.xsdata.XSPluginItem[] vXSPluginItemArray) {
        //-- copy array
        _XSPluginItemList.clear();

        for (int i = 0; i < vXSPluginItemArray.length; i++) {
                this._XSPluginItemList.add(vXSPluginItemArray[i]);
        }
    }

    /**
     * Method unmarshalXSPluginList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSPluginList
     */
    public static org.edna.mxv1.xsdata.XSPluginList unmarshalXSPluginList(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSPluginList) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSPluginList.class, reader);
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
