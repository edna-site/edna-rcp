/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataAngularSpeed.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataAngularSpeed extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value.
     */
    private double _value;

    /**
     * keeps track of state for field: _value
     */
    private boolean _has_value;

    /**
     * Field _unit.
     */
    private org.edna.kernel.xsdata.XSDataString _unit;

    /**
     * Field _error.
     */
    private org.edna.kernel.xsdata.XSDataDouble _error;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataAngularSpeed() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteValue(
    ) {
        this._has_value= false;
    }

    /**
     * Returns the value of field 'error'.
     * 
     * @return the value of field 'Error'.
     */
    public org.edna.kernel.xsdata.XSDataDouble getError(
    ) {
        return this._error;
    }

    /**
     * Returns the value of field 'unit'.
     * 
     * @return the value of field 'Unit'.
     */
    public org.edna.kernel.xsdata.XSDataString getUnit(
    ) {
        return this._unit;
    }

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'Value'.
     */
    public double getValue(
    ) {
        return this._value;
    }

    /**
     * Method hasValue.
     * 
     * @return true if at least one Value has been added
     */
    public boolean hasValue(
    ) {
        return this._has_value;
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
     * Sets the value of field 'error'.
     * 
     * @param error the value of field 'error'.
     */
    public void setError(
            final org.edna.kernel.xsdata.XSDataDouble error) {
        this._error = error;
    }

    /**
     * Sets the value of field 'unit'.
     * 
     * @param unit the value of field 'unit'.
     */
    public void setUnit(
            final org.edna.kernel.xsdata.XSDataString unit) {
        this._unit = unit;
    }

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final double value) {
        this._value = value;
        this._has_value = true;
    }

    /**
     * Method unmarshalXSDataAngularSpeed.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.kernel.xsdata.XSDataAngularSpeed
     */
    public static org.edna.kernel.xsdata.XSDataAngularSpeed unmarshalXSDataAngularSpeed(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataAngularSpeed) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataAngularSpeed.class, reader);
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
