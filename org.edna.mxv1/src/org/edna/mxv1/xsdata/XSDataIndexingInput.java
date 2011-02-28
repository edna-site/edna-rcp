/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIndexingInput.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIndexingInput extends org.edna.mxv1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _crystal.
     */
    private org.edna.mxv1.xsdata.XSDataCrystal _crystal;

    /**
     * Field _dataCollection.
     */
    private org.edna.mxv1.xsdata.XSDataCollection _dataCollection;

    /**
     * Field _experimentalCondition.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalCondition;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIndexingInput() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'dataCollection'.
     * 
     * @return the value of field 'DataCollection'.
     */
    public org.edna.mxv1.xsdata.XSDataCollection getDataCollection(
    ) {
        return this._dataCollection;
    }

    /**
     * Returns the value of field 'experimentalCondition'.
     * 
     * @return the value of field 'ExperimentalCondition'.
     */
    public org.edna.mxv1.xsdata.XSDataExperimentalCondition getExperimentalCondition(
    ) {
        return this._experimentalCondition;
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
     * Sets the value of field 'crystal'.
     * 
     * @param crystal the value of field 'crystal'.
     */
    public void setCrystal(
            final org.edna.mxv1.xsdata.XSDataCrystal crystal) {
        this._crystal = crystal;
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
     * Sets the value of field 'experimentalCondition'.
     * 
     * @param experimentalCondition the value of field
     * 'experimentalCondition'.
     */
    public void setExperimentalCondition(
            final org.edna.mxv1.xsdata.XSDataExperimentalCondition experimentalCondition) {
        this._experimentalCondition = experimentalCondition;
    }

    /**
     * Method unmarshalXSDataIndexingInput.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIndexingInput
     */
    public static org.edna.mxv1.xsdata.XSDataIndexingInput unmarshalXSDataIndexingInput(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIndexingInput) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIndexingInput.class, reader);
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
