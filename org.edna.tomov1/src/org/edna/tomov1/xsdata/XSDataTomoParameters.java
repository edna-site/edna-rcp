/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataTomoParameters.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataTomoParameters extends org.edna.tomov1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private org.edna.tomov1.xsdata.XSDataString _name;

    /**
     * Field _valuesList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSDataString> _valuesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataTomoParameters() {
        super();
        this._valuesList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSDataString>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vValues
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValues(
            final org.edna.tomov1.xsdata.XSDataString vValues)
    throws java.lang.IndexOutOfBoundsException {
        this._valuesList.add(vValues);
    }

    /**
     * 
     * 
     * @param index
     * @param vValues
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValues(
            final int index,
            final org.edna.tomov1.xsdata.XSDataString vValues)
    throws java.lang.IndexOutOfBoundsException {
        this._valuesList.add(index, vValues);
    }

    /**
     * Method enumerateValues.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSDataString> enumerateValues(
    ) {
        return java.util.Collections.enumeration(this._valuesList);
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public org.edna.tomov1.xsdata.XSDataString getName(
    ) {
        return this._name;
    }

    /**
     * Method getValues.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.tomov1.xsdata.XSDataString
     * at the given index
     */
    public org.edna.tomov1.xsdata.XSDataString getValues(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valuesList.size()) {
            throw new IndexOutOfBoundsException("getValues: Index value '" + index + "' not in range [0.." + (this._valuesList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSDataString) _valuesList.get(index);
    }

    /**
     * Method getValues.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSDataString[] getValues(
    ) {
        org.edna.tomov1.xsdata.XSDataString[] array = new org.edna.tomov1.xsdata.XSDataString[0];
        return (org.edna.tomov1.xsdata.XSDataString[]) this._valuesList.toArray(array);
    }

    /**
     * Method getValuesCount.
     * 
     * @return the size of this collection
     */
    public int getValuesCount(
    ) {
        return this._valuesList.size();
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
     * Method iterateValues.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSDataString> iterateValues(
    ) {
        return this._valuesList.iterator();
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
    public void removeAllValues(
    ) {
        this._valuesList.clear();
    }

    /**
     * Method removeValues.
     * 
     * @param vValues
     * @return true if the object was removed from the collection.
     */
    public boolean removeValues(
            final org.edna.tomov1.xsdata.XSDataString vValues) {
        boolean removed = _valuesList.remove(vValues);
        return removed;
    }

    /**
     * Method removeValuesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSDataString removeValuesAt(
            final int index) {
        java.lang.Object obj = this._valuesList.remove(index);
        return (org.edna.tomov1.xsdata.XSDataString) obj;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final org.edna.tomov1.xsdata.XSDataString name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vValues
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValues(
            final int index,
            final org.edna.tomov1.xsdata.XSDataString vValues)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valuesList.size()) {
            throw new IndexOutOfBoundsException("setValues: Index value '" + index + "' not in range [0.." + (this._valuesList.size() - 1) + "]");
        }

        this._valuesList.set(index, vValues);
    }

    /**
     * 
     * 
     * @param vValuesArray
     */
    public void setValues(
            final org.edna.tomov1.xsdata.XSDataString[] vValuesArray) {
        //-- copy array
        _valuesList.clear();

        for (int i = 0; i < vValuesArray.length; i++) {
                this._valuesList.add(vValuesArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataTomoParameters.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataTomoParameters
     */
    public static org.edna.tomov1.xsdata.XSDataTomoParameters unmarshalXSDataTomoParameters(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataTomoParameters) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataTomoParameters.class, reader);
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
