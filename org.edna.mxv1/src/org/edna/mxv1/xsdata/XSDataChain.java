/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataChain.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataChain extends org.edna.mxv1.xsdata.XSData 
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
     * number of identical chain within the structure
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOfCopies;

    /**
     * should be the number of amino-acid, ribonuclotides or
     * desoxyribonucleotides depending on the type
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOfMonomers;

    /**
     * should be either: 'protein', 'dna'or 'rna'
     */
    private org.edna.mxv1.xsdata.XSDataString _type;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataChain() {
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
     * 'numberOfCopies' has the following description: number of
     * identical chain within the structure
     * 
     * @return the value of field 'NumberOfCopies'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOfCopies(
    ) {
        return this._numberOfCopies;
    }

    /**
     * Returns the value of field 'numberOfMonomers'. The field
     * 'numberOfMonomers' has the following description: should be
     * the number of amino-acid, ribonuclotides or
     * desoxyribonucleotides depending on the type
     * 
     * @return the value of field 'NumberOfMonomers'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOfMonomers(
    ) {
        return this._numberOfMonomers;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: should be either: 'protein', 'dna'or
     * 'rna'
     * 
     * @return the value of field 'Type'.
     */
    public org.edna.mxv1.xsdata.XSDataString getType(
    ) {
        return this._type;
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
     * 'numberOfCopies' has the following description: number of
     * identical chain within the structure
     * 
     * @param numberOfCopies the value of field 'numberOfCopies'.
     */
    public void setNumberOfCopies(
            final org.edna.mxv1.xsdata.XSDataFloat numberOfCopies) {
        this._numberOfCopies = numberOfCopies;
    }

    /**
     * Sets the value of field 'numberOfMonomers'. The field
     * 'numberOfMonomers' has the following description: should be
     * the number of amino-acid, ribonuclotides or
     * desoxyribonucleotides depending on the type
     * 
     * @param numberOfMonomers the value of field 'numberOfMonomers'
     */
    public void setNumberOfMonomers(
            final org.edna.mxv1.xsdata.XSDataFloat numberOfMonomers) {
        this._numberOfMonomers = numberOfMonomers;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: should be either: 'protein', 'dna'or
     * 'rna'
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final org.edna.mxv1.xsdata.XSDataString type) {
        this._type = type;
    }

    /**
     * Method unmarshalXSDataChain.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataChain
     */
    public static org.edna.mxv1.xsdata.XSDataChain unmarshalXSDataChain(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataChain) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataChain.class, reader);
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
