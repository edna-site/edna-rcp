/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataLigand.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataLigand extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _heavyAtoms.
     */
    private org.edna.mxv1.xsdata.XSDataAtomicComposition _heavyAtoms;

    /**
     * should be the number of chemically identical ligands in the
     * structure
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOfCopies;

    /**
     * Should be the total of the number of atoms of C, O, N
     * H is negligible
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOfLightAtoms;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataLigand() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'heavyAtoms'.
     * 
     * @return the value of field 'HeavyAtoms'.
     */
    public org.edna.mxv1.xsdata.XSDataAtomicComposition getHeavyAtoms(
    ) {
        return this._heavyAtoms;
    }

    /**
     * Returns the value of field 'numberOfCopies'. The field
     * 'numberOfCopies' has the following description: should be
     * the number of chemically identical ligands in the structure
     * 
     * @return the value of field 'NumberOfCopies'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOfCopies(
    ) {
        return this._numberOfCopies;
    }

    /**
     * Returns the value of field 'numberOfLightAtoms'. The field
     * 'numberOfLightAtoms' has the following description: Should
     * be the total of the number of atoms of C, O, N
     * H is negligible
     * 
     * @return the value of field 'NumberOfLightAtoms'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOfLightAtoms(
    ) {
        return this._numberOfLightAtoms;
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
     * Sets the value of field 'heavyAtoms'.
     * 
     * @param heavyAtoms the value of field 'heavyAtoms'.
     */
    public void setHeavyAtoms(
            final org.edna.mxv1.xsdata.XSDataAtomicComposition heavyAtoms) {
        this._heavyAtoms = heavyAtoms;
    }

    /**
     * Sets the value of field 'numberOfCopies'. The field
     * 'numberOfCopies' has the following description: should be
     * the number of chemically identical ligands in the structure
     * 
     * @param numberOfCopies the value of field 'numberOfCopies'.
     */
    public void setNumberOfCopies(
            final org.edna.mxv1.xsdata.XSDataFloat numberOfCopies) {
        this._numberOfCopies = numberOfCopies;
    }

    /**
     * Sets the value of field 'numberOfLightAtoms'. The field
     * 'numberOfLightAtoms' has the following description: Should
     * be the total of the number of atoms of C, O, N
     * H is negligible
     * 
     * @param numberOfLightAtoms the value of field
     * 'numberOfLightAtoms'.
     */
    public void setNumberOfLightAtoms(
            final org.edna.mxv1.xsdata.XSDataFloat numberOfLightAtoms) {
        this._numberOfLightAtoms = numberOfLightAtoms;
    }

    /**
     * Method unmarshalXSDataLigand.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataLigand
     */
    public static org.edna.mxv1.xsdata.XSDataLigand unmarshalXSDataLigand(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataLigand) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataLigand.class, reader);
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
