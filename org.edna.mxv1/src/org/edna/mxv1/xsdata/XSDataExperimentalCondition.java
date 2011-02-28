/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataExperimentalCondition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataExperimentalCondition extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _beam.
     */
    private org.edna.mxv1.xsdata.XSDataBeam _beam;

    /**
     * Field _detector.
     */
    private org.edna.mxv1.xsdata.XSDataDetector _detector;

    /**
     * Field _goniostat.
     */
    private org.edna.mxv1.xsdata.XSDataGoniostat _goniostat;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataExperimentalCondition() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'beam'.
     * 
     * @return the value of field 'Beam'.
     */
    public org.edna.mxv1.xsdata.XSDataBeam getBeam(
    ) {
        return this._beam;
    }

    /**
     * Returns the value of field 'detector'.
     * 
     * @return the value of field 'Detector'.
     */
    public org.edna.mxv1.xsdata.XSDataDetector getDetector(
    ) {
        return this._detector;
    }

    /**
     * Returns the value of field 'goniostat'.
     * 
     * @return the value of field 'Goniostat'.
     */
    public org.edna.mxv1.xsdata.XSDataGoniostat getGoniostat(
    ) {
        return this._goniostat;
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
     * Sets the value of field 'beam'.
     * 
     * @param beam the value of field 'beam'.
     */
    public void setBeam(
            final org.edna.mxv1.xsdata.XSDataBeam beam) {
        this._beam = beam;
    }

    /**
     * Sets the value of field 'detector'.
     * 
     * @param detector the value of field 'detector'.
     */
    public void setDetector(
            final org.edna.mxv1.xsdata.XSDataDetector detector) {
        this._detector = detector;
    }

    /**
     * Sets the value of field 'goniostat'.
     * 
     * @param goniostat the value of field 'goniostat'.
     */
    public void setGoniostat(
            final org.edna.mxv1.xsdata.XSDataGoniostat goniostat) {
        this._goniostat = goniostat;
    }

    /**
     * Method unmarshalXSDataExperimentalCondition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataExperimentalCondition
     */
    public static org.edna.mxv1.xsdata.XSDataExperimentalCondition unmarshalXSDataExperimentalCondition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataExperimentalCondition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataExperimentalCondition.class, reader);
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
