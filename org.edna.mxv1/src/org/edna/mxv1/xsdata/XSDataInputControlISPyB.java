/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataInputControlISPyB.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataInputControlISPyB extends org.edna.mxv1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _characterisationResult.
     */
    private org.edna.mxv1.xsdata.XSDataResultCharacterisation _characterisationResult;

    /**
     * Field _dataCollectionId.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _dataCollectionId;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataInputControlISPyB() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'characterisationResult'.
     * 
     * @return the value of field 'CharacterisationResult'.
     */
    public org.edna.mxv1.xsdata.XSDataResultCharacterisation getCharacterisationResult(
    ) {
        return this._characterisationResult;
    }

    /**
     * Returns the value of field 'dataCollectionId'.
     * 
     * @return the value of field 'DataCollectionId'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getDataCollectionId(
    ) {
        return this._dataCollectionId;
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
     * Sets the value of field 'characterisationResult'.
     * 
     * @param characterisationResult the value of field
     * 'characterisationResult'.
     */
    public void setCharacterisationResult(
            final org.edna.mxv1.xsdata.XSDataResultCharacterisation characterisationResult) {
        this._characterisationResult = characterisationResult;
    }

    /**
     * Sets the value of field 'dataCollectionId'.
     * 
     * @param dataCollectionId the value of field 'dataCollectionId'
     */
    public void setDataCollectionId(
            final org.edna.mxv1.xsdata.XSDataInteger dataCollectionId) {
        this._dataCollectionId = dataCollectionId;
    }

    /**
     * Method unmarshalXSDataInputControlISPyB.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataInputControlISPyB
     */
    public static org.edna.mxv1.xsdata.XSDataInputControlISPyB unmarshalXSDataInputControlISPyB(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataInputControlISPyB) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataInputControlISPyB.class, reader);
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
