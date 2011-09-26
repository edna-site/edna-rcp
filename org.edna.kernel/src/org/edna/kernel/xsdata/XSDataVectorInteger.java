/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataVectorInteger.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataVectorInteger extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _v1.
     */
    private int _v1;

    /**
     * keeps track of state for field: _v1
     */
    private boolean _has_v1;

    /**
     * Field _v2.
     */
    private int _v2;

    /**
     * keeps track of state for field: _v2
     */
    private boolean _has_v2;

    /**
     * Field _v3.
     */
    private int _v3;

    /**
     * keeps track of state for field: _v3
     */
    private boolean _has_v3;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataVectorInteger() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteV1(
    ) {
        this._has_v1= false;
    }

    /**
     */
    public void deleteV2(
    ) {
        this._has_v2= false;
    }

    /**
     */
    public void deleteV3(
    ) {
        this._has_v3= false;
    }

    /**
     * Returns the value of field 'v1'.
     * 
     * @return the value of field 'V1'.
     */
    public int getV1(
    ) {
        return this._v1;
    }

    /**
     * Returns the value of field 'v2'.
     * 
     * @return the value of field 'V2'.
     */
    public int getV2(
    ) {
        return this._v2;
    }

    /**
     * Returns the value of field 'v3'.
     * 
     * @return the value of field 'V3'.
     */
    public int getV3(
    ) {
        return this._v3;
    }

    /**
     * Method hasV1.
     * 
     * @return true if at least one V1 has been added
     */
    public boolean hasV1(
    ) {
        return this._has_v1;
    }

    /**
     * Method hasV2.
     * 
     * @return true if at least one V2 has been added
     */
    public boolean hasV2(
    ) {
        return this._has_v2;
    }

    /**
     * Method hasV3.
     * 
     * @return true if at least one V3 has been added
     */
    public boolean hasV3(
    ) {
        return this._has_v3;
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
     * Sets the value of field 'v1'.
     * 
     * @param v1 the value of field 'v1'.
     */
    public void setV1(
            final int v1) {
        this._v1 = v1;
        this._has_v1 = true;
    }

    /**
     * Sets the value of field 'v2'.
     * 
     * @param v2 the value of field 'v2'.
     */
    public void setV2(
            final int v2) {
        this._v2 = v2;
        this._has_v2 = true;
    }

    /**
     * Sets the value of field 'v3'.
     * 
     * @param v3 the value of field 'v3'.
     */
    public void setV3(
            final int v3) {
        this._v3 = v3;
        this._has_v3 = true;
    }

    /**
     * Method unmarshalXSDataVectorInteger.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.kernel.xsdata.XSDataVectorInteger
     */
    public static org.edna.kernel.xsdata.XSDataVectorInteger unmarshalXSDataVectorInteger(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataVectorInteger) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataVectorInteger.class, reader);
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
