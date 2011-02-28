/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCollectionPlan.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCollectionPlan extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _collectionPlanNumber.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _collectionPlanNumber;

    /**
     * Field _collectionStrategy.
     */
    private org.edna.mxv1.xsdata.XSDataCollection _collectionStrategy;

    /**
     * Field _comment.
     */
    private org.edna.mxv1.xsdata.XSDataString _comment;

    /**
     * Field _statistics.
     */
    private org.edna.mxv1.xsdata.XSDataStatisticsStrategy _statistics;

    /**
     * Field _strategySummary.
     */
    private org.edna.mxv1.xsdata.XSDataStrategySummary _strategySummary;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCollectionPlan() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'collectionPlanNumber'.
     * 
     * @return the value of field 'CollectionPlanNumber'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getCollectionPlanNumber(
    ) {
        return this._collectionPlanNumber;
    }

    /**
     * Returns the value of field 'collectionStrategy'.
     * 
     * @return the value of field 'CollectionStrategy'.
     */
    public org.edna.mxv1.xsdata.XSDataCollection getCollectionStrategy(
    ) {
        return this._collectionStrategy;
    }

    /**
     * Returns the value of field 'comment'.
     * 
     * @return the value of field 'Comment'.
     */
    public org.edna.mxv1.xsdata.XSDataString getComment(
    ) {
        return this._comment;
    }

    /**
     * Returns the value of field 'statistics'.
     * 
     * @return the value of field 'Statistics'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsStrategy getStatistics(
    ) {
        return this._statistics;
    }

    /**
     * Returns the value of field 'strategySummary'.
     * 
     * @return the value of field 'StrategySummary'.
     */
    public org.edna.mxv1.xsdata.XSDataStrategySummary getStrategySummary(
    ) {
        return this._strategySummary;
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
     * Sets the value of field 'collectionPlanNumber'.
     * 
     * @param collectionPlanNumber the value of field
     * 'collectionPlanNumber'.
     */
    public void setCollectionPlanNumber(
            final org.edna.mxv1.xsdata.XSDataInteger collectionPlanNumber) {
        this._collectionPlanNumber = collectionPlanNumber;
    }

    /**
     * Sets the value of field 'collectionStrategy'.
     * 
     * @param collectionStrategy the value of field
     * 'collectionStrategy'.
     */
    public void setCollectionStrategy(
            final org.edna.mxv1.xsdata.XSDataCollection collectionStrategy) {
        this._collectionStrategy = collectionStrategy;
    }

    /**
     * Sets the value of field 'comment'.
     * 
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final org.edna.mxv1.xsdata.XSDataString comment) {
        this._comment = comment;
    }

    /**
     * Sets the value of field 'statistics'.
     * 
     * @param statistics the value of field 'statistics'.
     */
    public void setStatistics(
            final org.edna.mxv1.xsdata.XSDataStatisticsStrategy statistics) {
        this._statistics = statistics;
    }

    /**
     * Sets the value of field 'strategySummary'.
     * 
     * @param strategySummary the value of field 'strategySummary'.
     */
    public void setStrategySummary(
            final org.edna.mxv1.xsdata.XSDataStrategySummary strategySummary) {
        this._strategySummary = strategySummary;
    }

    /**
     * Method unmarshalXSDataCollectionPlan.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataCollectionPlan
     */
    public static org.edna.mxv1.xsdata.XSDataCollectionPlan unmarshalXSDataCollectionPlan(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCollectionPlan) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCollectionPlan.class, reader);
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
