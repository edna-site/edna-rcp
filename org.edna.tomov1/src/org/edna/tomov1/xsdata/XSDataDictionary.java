/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataDictionary.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataDictionary extends org.edna.tomov1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _keyValuePairList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSDataKeyValuePair> _keyValuePairList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataDictionary() {
        super();
        this._keyValuePairList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSDataKeyValuePair>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKeyValuePair
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyValuePair(
            final org.edna.tomov1.xsdata.XSDataKeyValuePair vKeyValuePair)
    throws java.lang.IndexOutOfBoundsException {
        this._keyValuePairList.add(vKeyValuePair);
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyValuePair
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyValuePair(
            final int index,
            final org.edna.tomov1.xsdata.XSDataKeyValuePair vKeyValuePair)
    throws java.lang.IndexOutOfBoundsException {
        this._keyValuePairList.add(index, vKeyValuePair);
    }

    /**
     * Method enumerateKeyValuePair.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSDataKeyValuePair> enumerateKeyValuePair(
    ) {
        return java.util.Collections.enumeration(this._keyValuePairList);
    }

    /**
     * Method getKeyValuePair.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.tomov1.xsdata.XSDataKeyValuePair at the given index
     */
    public org.edna.tomov1.xsdata.XSDataKeyValuePair getKeyValuePair(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keyValuePairList.size()) {
            throw new IndexOutOfBoundsException("getKeyValuePair: Index value '" + index + "' not in range [0.." + (this._keyValuePairList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSDataKeyValuePair) _keyValuePairList.get(index);
    }

    /**
     * Method getKeyValuePair.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSDataKeyValuePair[] getKeyValuePair(
    ) {
        org.edna.tomov1.xsdata.XSDataKeyValuePair[] array = new org.edna.tomov1.xsdata.XSDataKeyValuePair[0];
        return (org.edna.tomov1.xsdata.XSDataKeyValuePair[]) this._keyValuePairList.toArray(array);
    }

    /**
     * Method getKeyValuePairCount.
     * 
     * @return the size of this collection
     */
    public int getKeyValuePairCount(
    ) {
        return this._keyValuePairList.size();
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
     * Method iterateKeyValuePair.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSDataKeyValuePair> iterateKeyValuePair(
    ) {
        return this._keyValuePairList.iterator();
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
    public void removeAllKeyValuePair(
    ) {
        this._keyValuePairList.clear();
    }

    /**
     * Method removeKeyValuePair.
     * 
     * @param vKeyValuePair
     * @return true if the object was removed from the collection.
     */
    public boolean removeKeyValuePair(
            final org.edna.tomov1.xsdata.XSDataKeyValuePair vKeyValuePair) {
        boolean removed = _keyValuePairList.remove(vKeyValuePair);
        return removed;
    }

    /**
     * Method removeKeyValuePairAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSDataKeyValuePair removeKeyValuePairAt(
            final int index) {
        java.lang.Object obj = this._keyValuePairList.remove(index);
        return (org.edna.tomov1.xsdata.XSDataKeyValuePair) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyValuePair
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKeyValuePair(
            final int index,
            final org.edna.tomov1.xsdata.XSDataKeyValuePair vKeyValuePair)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keyValuePairList.size()) {
            throw new IndexOutOfBoundsException("setKeyValuePair: Index value '" + index + "' not in range [0.." + (this._keyValuePairList.size() - 1) + "]");
        }

        this._keyValuePairList.set(index, vKeyValuePair);
    }

    /**
     * 
     * 
     * @param vKeyValuePairArray
     */
    public void setKeyValuePair(
            final org.edna.tomov1.xsdata.XSDataKeyValuePair[] vKeyValuePairArray) {
        //-- copy array
        _keyValuePairList.clear();

        for (int i = 0; i < vKeyValuePairArray.length; i++) {
                this._keyValuePairList.add(vKeyValuePairArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataDictionary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataDictionary
     */
    public static org.edna.tomov1.xsdata.XSDataDictionary unmarshalXSDataDictionary(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataDictionary) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataDictionary.class, reader);
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
