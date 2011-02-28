/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStrategySummary.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStrategySummary extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _attenuation.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _attenuation;

    /**
     * Field _completeness.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _completeness;

    /**
     * Field _iSigma.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _iSigma;

    /**
     * Field _rankingResolution.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _rankingResolution;

    /**
     * Field _redundancy.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _redundancy;

    /**
     * Field _resolution.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _resolution;

    /**
     * Field _resolutionReasoning.
     */
    private org.edna.mxv1.xsdata.XSDataString _resolutionReasoning;

    /**
     * Field _totalDataCollectionTime.
     */
    private org.edna.mxv1.xsdata.XSDataTime _totalDataCollectionTime;

    /**
     * Field _totalExposureTime.
     */
    private org.edna.mxv1.xsdata.XSDataTime _totalExposureTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStrategySummary() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'attenuation'.
     * 
     * @return the value of field 'Attenuation'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getAttenuation(
    ) {
        return this._attenuation;
    }

    /**
     * Returns the value of field 'completeness'.
     * 
     * @return the value of field 'Completeness'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getCompleteness(
    ) {
        return this._completeness;
    }

    /**
     * Returns the value of field 'iSigma'.
     * 
     * @return the value of field 'ISigma'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getISigma(
    ) {
        return this._iSigma;
    }

    /**
     * Returns the value of field 'rankingResolution'.
     * 
     * @return the value of field 'RankingResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getRankingResolution(
    ) {
        return this._rankingResolution;
    }

    /**
     * Returns the value of field 'redundancy'.
     * 
     * @return the value of field 'Redundancy'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getRedundancy(
    ) {
        return this._redundancy;
    }

    /**
     * Returns the value of field 'resolution'.
     * 
     * @return the value of field 'Resolution'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getResolution(
    ) {
        return this._resolution;
    }

    /**
     * Returns the value of field 'resolutionReasoning'.
     * 
     * @return the value of field 'ResolutionReasoning'.
     */
    public org.edna.mxv1.xsdata.XSDataString getResolutionReasoning(
    ) {
        return this._resolutionReasoning;
    }

    /**
     * Returns the value of field 'totalDataCollectionTime'.
     * 
     * @return the value of field 'TotalDataCollectionTime'.
     */
    public org.edna.mxv1.xsdata.XSDataTime getTotalDataCollectionTime(
    ) {
        return this._totalDataCollectionTime;
    }

    /**
     * Returns the value of field 'totalExposureTime'.
     * 
     * @return the value of field 'TotalExposureTime'.
     */
    public org.edna.mxv1.xsdata.XSDataTime getTotalExposureTime(
    ) {
        return this._totalExposureTime;
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
     * Sets the value of field 'attenuation'.
     * 
     * @param attenuation the value of field 'attenuation'.
     */
    public void setAttenuation(
            final org.edna.mxv1.xsdata.XSDataFloat attenuation) {
        this._attenuation = attenuation;
    }

    /**
     * Sets the value of field 'completeness'.
     * 
     * @param completeness the value of field 'completeness'.
     */
    public void setCompleteness(
            final org.edna.mxv1.xsdata.XSDataFloat completeness) {
        this._completeness = completeness;
    }

    /**
     * Sets the value of field 'iSigma'.
     * 
     * @param iSigma the value of field 'iSigma'.
     */
    public void setISigma(
            final org.edna.mxv1.xsdata.XSDataFloat iSigma) {
        this._iSigma = iSigma;
    }

    /**
     * Sets the value of field 'rankingResolution'.
     * 
     * @param rankingResolution the value of field
     * 'rankingResolution'.
     */
    public void setRankingResolution(
            final org.edna.mxv1.xsdata.XSDataFloat rankingResolution) {
        this._rankingResolution = rankingResolution;
    }

    /**
     * Sets the value of field 'redundancy'.
     * 
     * @param redundancy the value of field 'redundancy'.
     */
    public void setRedundancy(
            final org.edna.mxv1.xsdata.XSDataFloat redundancy) {
        this._redundancy = redundancy;
    }

    /**
     * Sets the value of field 'resolution'.
     * 
     * @param resolution the value of field 'resolution'.
     */
    public void setResolution(
            final org.edna.mxv1.xsdata.XSDataFloat resolution) {
        this._resolution = resolution;
    }

    /**
     * Sets the value of field 'resolutionReasoning'.
     * 
     * @param resolutionReasoning the value of field
     * 'resolutionReasoning'.
     */
    public void setResolutionReasoning(
            final org.edna.mxv1.xsdata.XSDataString resolutionReasoning) {
        this._resolutionReasoning = resolutionReasoning;
    }

    /**
     * Sets the value of field 'totalDataCollectionTime'.
     * 
     * @param totalDataCollectionTime the value of field
     * 'totalDataCollectionTime'.
     */
    public void setTotalDataCollectionTime(
            final org.edna.mxv1.xsdata.XSDataTime totalDataCollectionTime) {
        this._totalDataCollectionTime = totalDataCollectionTime;
    }

    /**
     * Sets the value of field 'totalExposureTime'.
     * 
     * @param totalExposureTime the value of field
     * 'totalExposureTime'.
     */
    public void setTotalExposureTime(
            final org.edna.mxv1.xsdata.XSDataTime totalExposureTime) {
        this._totalExposureTime = totalExposureTime;
    }

    /**
     * Method unmarshalXSDataStrategySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStrategySummary
     */
    public static org.edna.mxv1.xsdata.XSDataStrategySummary unmarshalXSDataStrategySummary(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStrategySummary) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStrategySummary.class, reader);
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
