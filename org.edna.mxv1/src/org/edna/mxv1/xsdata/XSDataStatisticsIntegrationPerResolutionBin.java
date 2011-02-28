/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsIntegrationPerResolutionBin.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsIntegrationPerResolutionBin extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxResolution.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _maxResolution;

    /**
     * Field _minResolution.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _minResolution;

    /**
     * Field _profileFitted.
     */
    private XSDataStatisticsIntegrationPerResolutionBin _profileFitted;

    /**
     * Field _summation.
     */
    private XSDataStatisticsIntegrationPerResolutionBin _summation;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsIntegrationPerResolutionBin() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'maxResolution'.
     * 
     * @return the value of field 'MaxResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getMaxResolution(
    ) {
        return this._maxResolution;
    }

    /**
     * Returns the value of field 'minResolution'.
     * 
     * @return the value of field 'MinResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getMinResolution(
    ) {
        return this._minResolution;
    }

    /**
     * Returns the value of field 'profileFitted'.
     * 
     * @return the value of field 'ProfileFitted'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin getProfileFitted(
    ) {
        return this._profileFitted;
    }

    /**
     * Returns the value of field 'summation'.
     * 
     * @return the value of field 'Summation'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin getSummation(
    ) {
        return this._summation;
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
     * Sets the value of field 'maxResolution'.
     * 
     * @param maxResolution the value of field 'maxResolution'.
     */
    public void setMaxResolution(
            final org.edna.mxv1.xsdata.XSDataDouble maxResolution) {
        this._maxResolution = maxResolution;
    }

    /**
     * Sets the value of field 'minResolution'.
     * 
     * @param minResolution the value of field 'minResolution'.
     */
    public void setMinResolution(
            final org.edna.mxv1.xsdata.XSDataDouble minResolution) {
        this._minResolution = minResolution;
    }

    /**
     * Sets the value of field 'profileFitted'.
     * 
     * @param profileFitted the value of field 'profileFitted'.
     */
    public void setProfileFitted(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin profileFitted) {
        this._profileFitted = profileFitted;
    }

    /**
     * Sets the value of field 'summation'.
     * 
     * @param summation the value of field 'summation'.
     */
    public void setSummation(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin summation) {
        this._summation = summation;
    }

    /**
     * Method unmarshalXSDataStatisticsIntegrationPerResolutionBin.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin unmarshalXSDataStatisticsIntegrationPerResolutionBin(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin.class, reader);
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
