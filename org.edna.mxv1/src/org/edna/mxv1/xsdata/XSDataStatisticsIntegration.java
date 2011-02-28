/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsIntegration.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsIntegration extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _iOverSigmaAtHighestResolution.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _iOverSigmaAtHighestResolution;

    /**
     * Field _iOverSigmaOverall.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _iOverSigmaOverall;

    /**
     * Field _numberOfBadReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfBadReflections;

    /**
     * Field _numberOfFullyRecordedReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfFullyRecordedReflections;

    /**
     * Field _numberOfNegativeReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfNegativeReflections;

    /**
     * Field _numberOfOverlappedReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfOverlappedReflections;

    /**
     * Field _numberOfPartialReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfPartialReflections;

    /**
     * Field _numberOfReflectionsGenerated.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfReflectionsGenerated;

    /**
     * Field _RMSSpotDeviation.
     */
    private org.edna.mxv1.xsdata.XSDataLength _RMSSpotDeviation;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsIntegration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'iOverSigmaAtHighestResolution'.
     * 
     * @return the value of field 'IOverSigmaAtHighestResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getIOverSigmaAtHighestResolution(
    ) {
        return this._iOverSigmaAtHighestResolution;
    }

    /**
     * Returns the value of field 'iOverSigmaOverall'.
     * 
     * @return the value of field 'IOverSigmaOverall'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getIOverSigmaOverall(
    ) {
        return this._iOverSigmaOverall;
    }

    /**
     * Returns the value of field 'numberOfBadReflections'.
     * 
     * @return the value of field 'NumberOfBadReflections'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfBadReflections(
    ) {
        return this._numberOfBadReflections;
    }

    /**
     * Returns the value of field
     * 'numberOfFullyRecordedReflections'.
     * 
     * @return the value of field 'NumberOfFullyRecordedReflections'
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfFullyRecordedReflections(
    ) {
        return this._numberOfFullyRecordedReflections;
    }

    /**
     * Returns the value of field 'numberOfNegativeReflections'.
     * 
     * @return the value of field 'NumberOfNegativeReflections'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfNegativeReflections(
    ) {
        return this._numberOfNegativeReflections;
    }

    /**
     * Returns the value of field 'numberOfOverlappedReflections'.
     * 
     * @return the value of field 'NumberOfOverlappedReflections'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfOverlappedReflections(
    ) {
        return this._numberOfOverlappedReflections;
    }

    /**
     * Returns the value of field 'numberOfPartialReflections'.
     * 
     * @return the value of field 'NumberOfPartialReflections'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfPartialReflections(
    ) {
        return this._numberOfPartialReflections;
    }

    /**
     * Returns the value of field 'numberOfReflectionsGenerated'.
     * 
     * @return the value of field 'NumberOfReflectionsGenerated'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfReflectionsGenerated(
    ) {
        return this._numberOfReflectionsGenerated;
    }

    /**
     * Returns the value of field 'RMSSpotDeviation'.
     * 
     * @return the value of field 'RMSSpotDeviation'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getRMSSpotDeviation(
    ) {
        return this._RMSSpotDeviation;
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
     * Sets the value of field 'iOverSigmaAtHighestResolution'.
     * 
     * @param iOverSigmaAtHighestResolution the value of field
     * 'iOverSigmaAtHighestResolution'.
     */
    public void setIOverSigmaAtHighestResolution(
            final org.edna.mxv1.xsdata.XSDataDouble iOverSigmaAtHighestResolution) {
        this._iOverSigmaAtHighestResolution = iOverSigmaAtHighestResolution;
    }

    /**
     * Sets the value of field 'iOverSigmaOverall'.
     * 
     * @param iOverSigmaOverall the value of field
     * 'iOverSigmaOverall'.
     */
    public void setIOverSigmaOverall(
            final org.edna.mxv1.xsdata.XSDataDouble iOverSigmaOverall) {
        this._iOverSigmaOverall = iOverSigmaOverall;
    }

    /**
     * Sets the value of field 'numberOfBadReflections'.
     * 
     * @param numberOfBadReflections the value of field
     * 'numberOfBadReflections'.
     */
    public void setNumberOfBadReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfBadReflections) {
        this._numberOfBadReflections = numberOfBadReflections;
    }

    /**
     * Sets the value of field 'numberOfFullyRecordedReflections'.
     * 
     * @param numberOfFullyRecordedReflections the value of field
     * 'numberOfFullyRecordedReflections'.
     */
    public void setNumberOfFullyRecordedReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfFullyRecordedReflections) {
        this._numberOfFullyRecordedReflections = numberOfFullyRecordedReflections;
    }

    /**
     * Sets the value of field 'numberOfNegativeReflections'.
     * 
     * @param numberOfNegativeReflections the value of field
     * 'numberOfNegativeReflections'.
     */
    public void setNumberOfNegativeReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfNegativeReflections) {
        this._numberOfNegativeReflections = numberOfNegativeReflections;
    }

    /**
     * Sets the value of field 'numberOfOverlappedReflections'.
     * 
     * @param numberOfOverlappedReflections the value of field
     * 'numberOfOverlappedReflections'.
     */
    public void setNumberOfOverlappedReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfOverlappedReflections) {
        this._numberOfOverlappedReflections = numberOfOverlappedReflections;
    }

    /**
     * Sets the value of field 'numberOfPartialReflections'.
     * 
     * @param numberOfPartialReflections the value of field
     * 'numberOfPartialReflections'.
     */
    public void setNumberOfPartialReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfPartialReflections) {
        this._numberOfPartialReflections = numberOfPartialReflections;
    }

    /**
     * Sets the value of field 'numberOfReflectionsGenerated'.
     * 
     * @param numberOfReflectionsGenerated the value of field
     * 'numberOfReflectionsGenerated'.
     */
    public void setNumberOfReflectionsGenerated(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfReflectionsGenerated) {
        this._numberOfReflectionsGenerated = numberOfReflectionsGenerated;
    }

    /**
     * Sets the value of field 'RMSSpotDeviation'.
     * 
     * @param RMSSpotDeviation the value of field 'RMSSpotDeviation'
     */
    public void setRMSSpotDeviation(
            final org.edna.mxv1.xsdata.XSDataLength RMSSpotDeviation) {
        this._RMSSpotDeviation = RMSSpotDeviation;
    }

    /**
     * Method unmarshalXSDataStatisticsIntegration.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsIntegration
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsIntegration unmarshalXSDataStatisticsIntegration(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegration) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsIntegration.class, reader);
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
