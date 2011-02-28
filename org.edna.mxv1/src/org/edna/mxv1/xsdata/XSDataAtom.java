/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataAtom.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataAtom extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _concentration.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _concentration;

    /**
     * Field _numberOf.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOf;

    /**
     * Field _symbol.
     */
    private org.edna.mxv1.xsdata.XSDataString _symbol;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataAtom() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'concentration'.
     * 
     * @return the value of field 'Concentration'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getConcentration(
    ) {
        return this._concentration;
    }

    /**
     * Returns the value of field 'numberOf'.
     * 
     * @return the value of field 'NumberOf'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOf(
    ) {
        return this._numberOf;
    }

    /**
     * Returns the value of field 'symbol'.
     * 
     * @return the value of field 'Symbol'.
     */
    public org.edna.mxv1.xsdata.XSDataString getSymbol(
    ) {
        return this._symbol;
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
     * Sets the value of field 'concentration'.
     * 
     * @param concentration the value of field 'concentration'.
     */
    public void setConcentration(
            final org.edna.mxv1.xsdata.XSDataFloat concentration) {
        this._concentration = concentration;
    }

    /**
     * Sets the value of field 'numberOf'.
     * 
     * @param numberOf the value of field 'numberOf'.
     */
    public void setNumberOf(
            final org.edna.mxv1.xsdata.XSDataFloat numberOf) {
        this._numberOf = numberOf;
    }

    /**
     * Sets the value of field 'symbol'.
     * 
     * @param symbol the value of field 'symbol'.
     */
    public void setSymbol(
            final org.edna.mxv1.xsdata.XSDataString symbol) {
        this._symbol = symbol;
    }

    /**
     * Method unmarshalXSDataAtom.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataAtom
     */
    public static org.edna.mxv1.xsdata.XSDataAtom unmarshalXSDataAtom(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataAtom) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataAtom.class, reader);
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
