/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataImageExt.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataImageExt extends org.edna.kernel.xsdata.XSDataImage 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _array.
     */
    private org.edna.kernel.xsdata.XSDataArray _array;

    /**
     * Field _shared.
     */
    private org.edna.kernel.xsdata.XSDataString _shared;

    /**
     * Field _exposureTime.
     */
    private org.edna.kernel.xsdata.XSDataTime _exposureTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataImageExt() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'array'.
     * 
     * @return the value of field 'Array'.
     */
    public org.edna.kernel.xsdata.XSDataArray getArray(
    ) {
        return this._array;
    }

    /**
     * Returns the value of field 'exposureTime'.
     * 
     * @return the value of field 'ExposureTime'.
     */
    public org.edna.kernel.xsdata.XSDataTime getExposureTime(
    ) {
        return this._exposureTime;
    }

    /**
     * Returns the value of field 'shared'.
     * 
     * @return the value of field 'Shared'.
     */
    public org.edna.kernel.xsdata.XSDataString getShared(
    ) {
        return this._shared;
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
     * Sets the value of field 'array'.
     * 
     * @param array the value of field 'array'.
     */
    public void setArray(
            final org.edna.kernel.xsdata.XSDataArray array) {
        this._array = array;
    }

    /**
     * Sets the value of field 'exposureTime'.
     * 
     * @param exposureTime the value of field 'exposureTime'.
     */
    public void setExposureTime(
            final org.edna.kernel.xsdata.XSDataTime exposureTime) {
        this._exposureTime = exposureTime;
    }

    /**
     * Sets the value of field 'shared'.
     * 
     * @param shared the value of field 'shared'.
     */
    public void setShared(
            final org.edna.kernel.xsdata.XSDataString shared) {
        this._shared = shared;
    }

    /**
     * Method unmarshalXSDataImageExt.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.kernel.xsdata.XSDataImageExt
     */
    public static org.edna.kernel.xsdata.XSDataImageExt unmarshalXSDataImageExt(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataImageExt) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataImageExt.class, reader);
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
