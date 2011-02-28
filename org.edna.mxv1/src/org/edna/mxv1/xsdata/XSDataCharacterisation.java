/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCharacterisation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCharacterisation extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataCollection.
     */
    private org.edna.mxv1.xsdata.XSDataCollection _dataCollection;

    /**
     * Field _indexingResult.
     */
    private org.edna.mxv1.xsdata.XSDataIndexingResult _indexingResult;

    /**
     * Field _integrationResult.
     */
    private org.edna.mxv1.xsdata.XSDataIntegrationResult _integrationResult;

    /**
     * Field _strategyResult.
     */
    private org.edna.mxv1.xsdata.XSDataStrategyResult _strategyResult;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCharacterisation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataCollection'.
     * 
     * @return the value of field 'DataCollection'.
     */
    public org.edna.mxv1.xsdata.XSDataCollection getDataCollection(
    ) {
        return this._dataCollection;
    }

    /**
     * Returns the value of field 'indexingResult'.
     * 
     * @return the value of field 'IndexingResult'.
     */
    public org.edna.mxv1.xsdata.XSDataIndexingResult getIndexingResult(
    ) {
        return this._indexingResult;
    }

    /**
     * Returns the value of field 'integrationResult'.
     * 
     * @return the value of field 'IntegrationResult'.
     */
    public org.edna.mxv1.xsdata.XSDataIntegrationResult getIntegrationResult(
    ) {
        return this._integrationResult;
    }

    /**
     * Returns the value of field 'strategyResult'.
     * 
     * @return the value of field 'StrategyResult'.
     */
    public org.edna.mxv1.xsdata.XSDataStrategyResult getStrategyResult(
    ) {
        return this._strategyResult;
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
     * Sets the value of field 'dataCollection'.
     * 
     * @param dataCollection the value of field 'dataCollection'.
     */
    public void setDataCollection(
            final org.edna.mxv1.xsdata.XSDataCollection dataCollection) {
        this._dataCollection = dataCollection;
    }

    /**
     * Sets the value of field 'indexingResult'.
     * 
     * @param indexingResult the value of field 'indexingResult'.
     */
    public void setIndexingResult(
            final org.edna.mxv1.xsdata.XSDataIndexingResult indexingResult) {
        this._indexingResult = indexingResult;
    }

    /**
     * Sets the value of field 'integrationResult'.
     * 
     * @param integrationResult the value of field
     * 'integrationResult'.
     */
    public void setIntegrationResult(
            final org.edna.mxv1.xsdata.XSDataIntegrationResult integrationResult) {
        this._integrationResult = integrationResult;
    }

    /**
     * Sets the value of field 'strategyResult'.
     * 
     * @param strategyResult the value of field 'strategyResult'.
     */
    public void setStrategyResult(
            final org.edna.mxv1.xsdata.XSDataStrategyResult strategyResult) {
        this._strategyResult = strategyResult;
    }

    /**
     * Method unmarshalXSDataCharacterisation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataCharacterisation
     */
    public static org.edna.mxv1.xsdata.XSDataCharacterisation unmarshalXSDataCharacterisation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCharacterisation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCharacterisation.class, reader);
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
