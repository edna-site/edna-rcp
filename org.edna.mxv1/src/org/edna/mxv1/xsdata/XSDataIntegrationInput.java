/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIntegrationInput.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIntegrationInput extends org.edna.mxv1.xsdata.XSDataGeneratePredictionInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _crystalRefined.
     */
    private org.edna.mxv1.xsdata.XSDataCrystal _crystalRefined;

    /**
     * Field _experimentalConditionRefined.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalConditionRefined;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIntegrationInput() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'crystalRefined'.
     * 
     * @return the value of field 'CrystalRefined'.
     */
    public org.edna.mxv1.xsdata.XSDataCrystal getCrystalRefined(
    ) {
        return this._crystalRefined;
    }

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
     * Sets the value of field 'crystalRefined'.
     * 
     * @param crystalRefined the value of field 'crystalRefined'.
     */
    public void setCrystalRefined(
            final org.edna.mxv1.xsdata.XSDataCrystal crystalRefined) {
        this._crystalRefined = crystalRefined;
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
     * Method unmarshalXSDataIntegrationInput.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIntegrationInput
     */
    public static org.edna.mxv1.xsdata.XSDataIntegrationInput unmarshalXSDataIntegrationInput(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIntegrationInput) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIntegrationInput.class, reader);
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
