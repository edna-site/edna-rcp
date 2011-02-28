/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataSample.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataSample extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _absorbedDoseRate.
     */
    private org.edna.mxv1.xsdata.XSDataAbsorbedDoseRate _absorbedDoseRate;

    /**
     * Field _shape.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _shape;

    /**
     * Field _size.
     */
    private org.edna.mxv1.xsdata.XSDataSize _size;

    /**
     * Field _susceptibility.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _susceptibility;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataSample() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'absorbedDoseRate'.
     * 
     * @return the value of field 'AbsorbedDoseRate'.
     */
    public org.edna.mxv1.xsdata.XSDataAbsorbedDoseRate getAbsorbedDoseRate(
    ) {
        return this._absorbedDoseRate;
    }

    /**
     * Returns the value of field 'shape'.
     * 
     * @return the value of field 'Shape'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getShape(
    ) {
        return this._shape;
    }

    /**
     * Returns the value of field 'size'.
     * 
     * @return the value of field 'Size'.
     */
    public org.edna.mxv1.xsdata.XSDataSize getSize(
    ) {
        return this._size;
    }

    /**
     * Returns the value of field 'susceptibility'.
     * 
     * @return the value of field 'Susceptibility'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getSusceptibility(
    ) {
        return this._susceptibility;
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
     * Sets the value of field 'absorbedDoseRate'.
     * 
     * @param absorbedDoseRate the value of field 'absorbedDoseRate'
     */
    public void setAbsorbedDoseRate(
            final org.edna.mxv1.xsdata.XSDataAbsorbedDoseRate absorbedDoseRate) {
        this._absorbedDoseRate = absorbedDoseRate;
    }

    /**
     * Sets the value of field 'shape'.
     * 
     * @param shape the value of field 'shape'.
     */
    public void setShape(
            final org.edna.mxv1.xsdata.XSDataFloat shape) {
        this._shape = shape;
    }

    /**
     * Sets the value of field 'size'.
     * 
     * @param size the value of field 'size'.
     */
    public void setSize(
            final org.edna.mxv1.xsdata.XSDataSize size) {
        this._size = size;
    }

    /**
     * Sets the value of field 'susceptibility'.
     * 
     * @param susceptibility the value of field 'susceptibility'.
     */
    public void setSusceptibility(
            final org.edna.mxv1.xsdata.XSDataFloat susceptibility) {
        this._susceptibility = susceptibility;
    }

    /**
     * Method unmarshalXSDataSample.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataSample
     */
    public static org.edna.mxv1.xsdata.XSDataSample unmarshalXSDataSample(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataSample) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataSample.class, reader);
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
