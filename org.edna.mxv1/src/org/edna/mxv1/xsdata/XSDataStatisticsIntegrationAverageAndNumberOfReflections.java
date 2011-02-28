/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsIntegrationAverageAndNumberOfReflections.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsIntegrationAverageAndNumberOfReflections implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _averageIntensity.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _averageIntensity;

    /**
     * Field _averageIOverSigma.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _averageIOverSigma;

    /**
     * Field _averageSigma.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _averageSigma;

    /**
     * Field _numberOfReflections.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _numberOfReflections;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsIntegrationAverageAndNumberOfReflections() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'averageIOverSigma'.
     * 
     * @return the value of field 'AverageIOverSigma'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getAverageIOverSigma(
    ) {
        return this._averageIOverSigma;
    }

    /**
     * Returns the value of field 'averageIntensity'.
     * 
     * @return the value of field 'AverageIntensity'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getAverageIntensity(
    ) {
        return this._averageIntensity;
    }

    /**
     * Returns the value of field 'averageSigma'.
     * 
     * @return the value of field 'AverageSigma'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getAverageSigma(
    ) {
        return this._averageSigma;
    }

    /**
     * Returns the value of field 'numberOfReflections'.
     * 
     * @return the value of field 'NumberOfReflections'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumberOfReflections(
    ) {
        return this._numberOfReflections;
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
     * Sets the value of field 'averageIOverSigma'.
     * 
     * @param averageIOverSigma the value of field
     * 'averageIOverSigma'.
     */
    public void setAverageIOverSigma(
            final org.edna.mxv1.xsdata.XSDataDouble averageIOverSigma) {
        this._averageIOverSigma = averageIOverSigma;
    }

    /**
     * Sets the value of field 'averageIntensity'.
     * 
     * @param averageIntensity the value of field 'averageIntensity'
     */
    public void setAverageIntensity(
            final org.edna.mxv1.xsdata.XSDataDouble averageIntensity) {
        this._averageIntensity = averageIntensity;
    }

    /**
     * Sets the value of field 'averageSigma'.
     * 
     * @param averageSigma the value of field 'averageSigma'.
     */
    public void setAverageSigma(
            final org.edna.mxv1.xsdata.XSDataDouble averageSigma) {
        this._averageSigma = averageSigma;
    }

    /**
     * Sets the value of field 'numberOfReflections'.
     * 
     * @param numberOfReflections the value of field
     * 'numberOfReflections'.
     */
    public void setNumberOfReflections(
            final org.edna.mxv1.xsdata.XSDataInteger numberOfReflections) {
        this._numberOfReflections = numberOfReflections;
    }

    /**
     * Method
     * unmarshalXSDataStatisticsIntegrationAverageAndNumberOfReflections.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections unmarshalXSDataStatisticsIntegrationAverageAndNumberOfReflections(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections.class, reader);
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
