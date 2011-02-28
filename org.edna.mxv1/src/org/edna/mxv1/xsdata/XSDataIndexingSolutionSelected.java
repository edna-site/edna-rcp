/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIndexingSolutionSelected.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIndexingSolutionSelected extends org.edna.mxv1.xsdata.XSDataIndexingSolution 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _experimentalConditionRefined.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalConditionRefined;

    /**
     * Field _mosaicityEstimation.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _mosaicityEstimation;

    /**
     * Field _orientation.
     */
    private org.edna.mxv1.xsdata.XSDataOrientation _orientation;

    /**
     * Field _statistics.
     */
    private org.edna.mxv1.xsdata.XSDataStatisticsIndexing _statistics;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIndexingSolutionSelected() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'experimentalConditionRefined'.
     * 
     * @return the value of field 'ExperimentalConditionRefined'.
     */
    public org.edna.mxv1.xsdata.XSDataExperimentalCondition getExperimentalConditionRefined(
    ) {
        return this._experimentalConditionRefined;
    }

    /**
     * Returns the value of field 'mosaicityEstimation'.
     * 
     * @return the value of field 'MosaicityEstimation'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getMosaicityEstimation(
    ) {
        return this._mosaicityEstimation;
    }

    /**
     * Returns the value of field 'orientation'.
     * 
     * @return the value of field 'Orientation'.
     */
    public org.edna.mxv1.xsdata.XSDataOrientation getOrientation(
    ) {
        return this._orientation;
    }

    /**
     * Returns the value of field 'statistics'.
     * 
     * @return the value of field 'Statistics'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIndexing getStatistics(
    ) {
        return this._statistics;
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
     * Sets the value of field 'experimentalConditionRefined'.
     * 
     * @param experimentalConditionRefined the value of field
     * 'experimentalConditionRefined'.
     */
    public void setExperimentalConditionRefined(
            final org.edna.mxv1.xsdata.XSDataExperimentalCondition experimentalConditionRefined) {
        this._experimentalConditionRefined = experimentalConditionRefined;
    }

    /**
     * Sets the value of field 'mosaicityEstimation'.
     * 
     * @param mosaicityEstimation the value of field
     * 'mosaicityEstimation'.
     */
    public void setMosaicityEstimation(
            final org.edna.mxv1.xsdata.XSDataFloat mosaicityEstimation) {
        this._mosaicityEstimation = mosaicityEstimation;
    }

    /**
     * Sets the value of field 'orientation'.
     * 
     * @param orientation the value of field 'orientation'.
     */
    public void setOrientation(
            final org.edna.mxv1.xsdata.XSDataOrientation orientation) {
        this._orientation = orientation;
    }

    /**
     * Sets the value of field 'statistics'.
     * 
     * @param statistics the value of field 'statistics'.
     */
    public void setStatistics(
            final org.edna.mxv1.xsdata.XSDataStatisticsIndexing statistics) {
        this._statistics = statistics;
    }

    /**
     * Method unmarshalXSDataIndexingSolutionSelected.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected
     */
    public static org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected unmarshalXSDataIndexingSolutionSelected(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected.class, reader);
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
