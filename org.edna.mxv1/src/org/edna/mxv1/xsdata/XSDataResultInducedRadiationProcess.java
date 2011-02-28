/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataResultInducedRadiationProcess.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResultInducedRadiationProcess extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bFactor.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _bFactor;

    /**
     * Field _crystal.
     */
    private org.edna.mxv1.xsdata.XSDataCrystal _crystal;

    /**
     * Field _scale.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _scale;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResultInducedRadiationProcess() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'bFactor'.
     * 
     * @return the value of field 'BFactor'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getBFactor(
    ) {
        return this._bFactor;
    }

    /**
     * Returns the value of field 'crystal'.
     * 
     * @return the value of field 'Crystal'.
     */
    public org.edna.mxv1.xsdata.XSDataCrystal getCrystal(
    ) {
        return this._crystal;
    }

    /**
     * Returns the value of field 'scale'.
     * 
     * @return the value of field 'Scale'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getScale(
    ) {
        return this._scale;
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
     * Sets the value of field 'bFactor'.
     * 
     * @param bFactor the value of field 'bFactor'.
     */
    public void setBFactor(
            final org.edna.mxv1.xsdata.XSDataDouble bFactor) {
        this._bFactor = bFactor;
    }

    /**
     * Sets the value of field 'crystal'.
     * 
     * @param crystal the value of field 'crystal'.
     */
    public void setCrystal(
            final org.edna.mxv1.xsdata.XSDataCrystal crystal) {
        this._crystal = crystal;
    }

    /**
     * Sets the value of field 'scale'.
     * 
     * @param scale the value of field 'scale'.
     */
    public void setScale(
            final org.edna.mxv1.xsdata.XSDataDouble scale) {
        this._scale = scale;
    }

    /**
     * Method unmarshalXSDataResultInducedRadiationProcess.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataResultInducedRadiationProcess
     */
    public static org.edna.mxv1.xsdata.XSDataResultInducedRadiationProcess unmarshalXSDataResultInducedRadiationProcess(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataResultInducedRadiationProcess) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataResultInducedRadiationProcess.class, reader);
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
