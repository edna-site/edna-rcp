/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataResolutionBin.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResolutionBin extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _averageIntensity.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _averageIntensity;

    /**
     * Field _averageIntensityOverAverageSigma.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _averageIntensityOverAverageSigma;

    /**
     * Field _averageSigma.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _averageSigma;

    /**
     * Field _chi2.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _chi2;

    /**
     * Field _completeness.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _completeness;

    /**
     * Field _IOverSigma.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _IOverSigma;

    /**
     * Field _IOverSigmaChi.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _IOverSigmaChi;

    /**
     * Field _maxResolution.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _maxResolution;

    /**
     * Field _minResolution.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _minResolution;

    /**
     * Field _percentageOverload.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _percentageOverload;

    /**
     * Field _redundancy.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _redundancy;

    /**
     * Field _rFactor.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _rFactor;

    /**
     * Field _rFriedel.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _rFriedel;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResolutionBin() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'averageIntensity'.
     * 
     * @return the value of field 'AverageIntensity'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getAverageIntensity(
    ) {
        return this._averageIntensity;
    }

    /**
     * Returns the value of field
     * 'averageIntensityOverAverageSigma'.
     * 
     * @return the value of field 'AverageIntensityOverAverageSigma'
     */
    public org.edna.mxv1.xsdata.XSDataFloat getAverageIntensityOverAverageSigma(
    ) {
        return this._averageIntensityOverAverageSigma;
    }

    /**
     * Returns the value of field 'averageSigma'.
     * 
     * @return the value of field 'AverageSigma'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getAverageSigma(
    ) {
        return this._averageSigma;
    }

    /**
     * Returns the value of field 'chi2'.
     * 
     * @return the value of field 'Chi2'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getChi2(
    ) {
        return this._chi2;
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
     * Returns the value of field 'IOverSigma'.
     * 
     * @return the value of field 'IOverSigma'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getIOverSigma(
    ) {
        return this._IOverSigma;
    }

    /**
     * Returns the value of field 'IOverSigmaChi'.
     * 
     * @return the value of field 'IOverSigmaChi'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getIOverSigmaChi(
    ) {
        return this._IOverSigmaChi;
    }

    /**
     * Returns the value of field 'maxResolution'.
     * 
     * @return the value of field 'MaxResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getMaxResolution(
    ) {
        return this._maxResolution;
    }

    /**
     * Returns the value of field 'minResolution'.
     * 
     * @return the value of field 'MinResolution'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getMinResolution(
    ) {
        return this._minResolution;
    }

    /**
     * Returns the value of field 'percentageOverload'.
     * 
     * @return the value of field 'PercentageOverload'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getPercentageOverload(
    ) {
        return this._percentageOverload;
    }

    /**
     * Returns the value of field 'rFactor'.
     * 
     * @return the value of field 'RFactor'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getRFactor(
    ) {
        return this._rFactor;
    }

    /**
     * Returns the value of field 'rFriedel'.
     * 
     * @return the value of field 'RFriedel'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getRFriedel(
    ) {
        return this._rFriedel;
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
     * Sets the value of field 'averageIntensity'.
     * 
     * @param averageIntensity the value of field 'averageIntensity'
     */
    public void setAverageIntensity(
            final org.edna.mxv1.xsdata.XSDataFloat averageIntensity) {
        this._averageIntensity = averageIntensity;
    }

    /**
     * Sets the value of field 'averageIntensityOverAverageSigma'.
     * 
     * @param averageIntensityOverAverageSigma the value of field
     * 'averageIntensityOverAverageSigma'.
     */
    public void setAverageIntensityOverAverageSigma(
            final org.edna.mxv1.xsdata.XSDataFloat averageIntensityOverAverageSigma) {
        this._averageIntensityOverAverageSigma = averageIntensityOverAverageSigma;
    }

    /**
     * Sets the value of field 'averageSigma'.
     * 
     * @param averageSigma the value of field 'averageSigma'.
     */
    public void setAverageSigma(
            final org.edna.mxv1.xsdata.XSDataFloat averageSigma) {
        this._averageSigma = averageSigma;
    }

    /**
     * Sets the value of field 'chi2'.
     * 
     * @param chi2 the value of field 'chi2'.
     */
    public void setChi2(
            final org.edna.mxv1.xsdata.XSDataFloat chi2) {
        this._chi2 = chi2;
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
     * Sets the value of field 'IOverSigma'.
     * 
     * @param IOverSigma the value of field 'IOverSigma'.
     */
    public void setIOverSigma(
            final org.edna.mxv1.xsdata.XSDataFloat IOverSigma) {
        this._IOverSigma = IOverSigma;
    }

    /**
     * Sets the value of field 'IOverSigmaChi'.
     * 
     * @param IOverSigmaChi the value of field 'IOverSigmaChi'.
     */
    public void setIOverSigmaChi(
            final org.edna.mxv1.xsdata.XSDataFloat IOverSigmaChi) {
        this._IOverSigmaChi = IOverSigmaChi;
    }

    /**
     * Sets the value of field 'maxResolution'.
     * 
     * @param maxResolution the value of field 'maxResolution'.
     */
    public void setMaxResolution(
            final org.edna.mxv1.xsdata.XSDataFloat maxResolution) {
        this._maxResolution = maxResolution;
    }

    /**
     * Sets the value of field 'minResolution'.
     * 
     * @param minResolution the value of field 'minResolution'.
     */
    public void setMinResolution(
            final org.edna.mxv1.xsdata.XSDataFloat minResolution) {
        this._minResolution = minResolution;
    }

    /**
     * Sets the value of field 'percentageOverload'.
     * 
     * @param percentageOverload the value of field
     * 'percentageOverload'.
     */
    public void setPercentageOverload(
            final org.edna.mxv1.xsdata.XSDataFloat percentageOverload) {
        this._percentageOverload = percentageOverload;
    }

    /**
     * Sets the value of field 'rFactor'.
     * 
     * @param rFactor the value of field 'rFactor'.
     */
    public void setRFactor(
            final org.edna.mxv1.xsdata.XSDataFloat rFactor) {
        this._rFactor = rFactor;
    }

    /**
     * Sets the value of field 'rFriedel'.
     * 
     * @param rFriedel the value of field 'rFriedel'.
     */
    public void setRFriedel(
            final org.edna.mxv1.xsdata.XSDataFloat rFriedel) {
        this._rFriedel = rFriedel;
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
     * Method unmarshalXSDataResolutionBin.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataResolutionBin
     */
    public static org.edna.mxv1.xsdata.XSDataResolutionBin unmarshalXSDataResolutionBin(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataResolutionBin) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataResolutionBin.class, reader);
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
