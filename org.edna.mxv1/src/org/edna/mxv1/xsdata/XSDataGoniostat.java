/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataGoniostat.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataGoniostat extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOscillationSpeed.
     */
    private org.edna.mxv1.xsdata.XSDataAngularSpeed _maxOscillationSpeed;

    /**
     * Field _minOscillationWidth.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _minOscillationWidth;

    /**
     * Field _oscillationWidth.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _oscillationWidth;

    /**
     * Field _rotationAxis.
     */
    private org.edna.mxv1.xsdata.XSDataString _rotationAxis;

    /**
     * Field _rotationAxisEnd.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _rotationAxisEnd;

    /**
     * Field _rotationAxisStart.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _rotationAxisStart;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataGoniostat() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'maxOscillationSpeed'.
     * 
     * @return the value of field 'MaxOscillationSpeed'.
     */
    public org.edna.mxv1.xsdata.XSDataAngularSpeed getMaxOscillationSpeed(
    ) {
        return this._maxOscillationSpeed;
    }

    /**
     * Returns the value of field 'minOscillationWidth'.
     * 
     * @return the value of field 'MinOscillationWidth'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getMinOscillationWidth(
    ) {
        return this._minOscillationWidth;
    }

    /**
     * Returns the value of field 'oscillationWidth'.
     * 
     * @return the value of field 'OscillationWidth'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getOscillationWidth(
    ) {
        return this._oscillationWidth;
    }

    /**
     * Returns the value of field 'rotationAxis'.
     * 
     * @return the value of field 'RotationAxis'.
     */
    public org.edna.mxv1.xsdata.XSDataString getRotationAxis(
    ) {
        return this._rotationAxis;
    }

    /**
     * Returns the value of field 'rotationAxisEnd'.
     * 
     * @return the value of field 'RotationAxisEnd'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getRotationAxisEnd(
    ) {
        return this._rotationAxisEnd;
    }

    /**
     * Returns the value of field 'rotationAxisStart'.
     * 
     * @return the value of field 'RotationAxisStart'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getRotationAxisStart(
    ) {
        return this._rotationAxisStart;
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
     * Sets the value of field 'maxOscillationSpeed'.
     * 
     * @param maxOscillationSpeed the value of field
     * 'maxOscillationSpeed'.
     */
    public void setMaxOscillationSpeed(
            final org.edna.mxv1.xsdata.XSDataAngularSpeed maxOscillationSpeed) {
        this._maxOscillationSpeed = maxOscillationSpeed;
    }

    /**
     * Sets the value of field 'minOscillationWidth'.
     * 
     * @param minOscillationWidth the value of field
     * 'minOscillationWidth'.
     */
    public void setMinOscillationWidth(
            final org.edna.mxv1.xsdata.XSDataAngle minOscillationWidth) {
        this._minOscillationWidth = minOscillationWidth;
    }

    /**
     * Sets the value of field 'oscillationWidth'.
     * 
     * @param oscillationWidth the value of field 'oscillationWidth'
     */
    public void setOscillationWidth(
            final org.edna.mxv1.xsdata.XSDataAngle oscillationWidth) {
        this._oscillationWidth = oscillationWidth;
    }

    /**
     * Sets the value of field 'rotationAxis'.
     * 
     * @param rotationAxis the value of field 'rotationAxis'.
     */
    public void setRotationAxis(
            final org.edna.mxv1.xsdata.XSDataString rotationAxis) {
        this._rotationAxis = rotationAxis;
    }

    /**
     * Sets the value of field 'rotationAxisEnd'.
     * 
     * @param rotationAxisEnd the value of field 'rotationAxisEnd'.
     */
    public void setRotationAxisEnd(
            final org.edna.mxv1.xsdata.XSDataAngle rotationAxisEnd) {
        this._rotationAxisEnd = rotationAxisEnd;
    }

    /**
     * Sets the value of field 'rotationAxisStart'.
     * 
     * @param rotationAxisStart the value of field
     * 'rotationAxisStart'.
     */
    public void setRotationAxisStart(
            final org.edna.mxv1.xsdata.XSDataAngle rotationAxisStart) {
        this._rotationAxisStart = rotationAxisStart;
    }

    /**
     * Method unmarshalXSDataGoniostat.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataGoniostat
     */
    public static org.edna.mxv1.xsdata.XSDataGoniostat unmarshalXSDataGoniostat(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataGoniostat) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataGoniostat.class, reader);
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
