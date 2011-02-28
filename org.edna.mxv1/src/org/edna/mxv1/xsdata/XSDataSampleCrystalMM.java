/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataSampleCrystalMM.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataSampleCrystalMM extends org.edna.mxv1.xsdata.XSDataSampleCrystal 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _chemicalComposition.
     */
    private org.edna.mxv1.xsdata.XSDataChemicalCompositionMM _chemicalComposition;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataSampleCrystalMM() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'chemicalComposition'.
     * 
     * @return the value of field 'ChemicalComposition'.
     */
    public org.edna.mxv1.xsdata.XSDataChemicalCompositionMM getChemicalComposition(
    ) {
        return this._chemicalComposition;
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
     * Sets the value of field 'chemicalComposition'.
     * 
     * @param chemicalComposition the value of field
     * 'chemicalComposition'.
     */
    public void setChemicalComposition(
            final org.edna.mxv1.xsdata.XSDataChemicalCompositionMM chemicalComposition) {
        this._chemicalComposition = chemicalComposition;
    }

    /**
     * Method unmarshalXSDataSampleCrystalMM.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataSampleCrystalMM
     */
    public static org.edna.mxv1.xsdata.XSDataSampleCrystalMM unmarshalXSDataSampleCrystalMM(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataSampleCrystalMM) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataSampleCrystalMM.class, reader);
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
