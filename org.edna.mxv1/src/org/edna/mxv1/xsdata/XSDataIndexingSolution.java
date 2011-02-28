/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIndexingSolution.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIndexingSolution extends org.edna.mxv1.xsdata.XSData 
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
     * Field _number.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _number;

    /**
     * Field _penalty.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _penalty;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIndexingSolution() {
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
     * Returns the value of field 'number'.
     * 
     * @return the value of field 'Number'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getNumber(
    ) {
        return this._number;
    }

    /**
     * Returns the value of field 'penalty'.
     * 
     * @return the value of field 'Penalty'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getPenalty(
    ) {
        return this._penalty;
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
     * Sets the value of field 'number'.
     * 
     * @param number the value of field 'number'.
     */
    public void setNumber(
            final org.edna.mxv1.xsdata.XSDataInteger number) {
        this._number = number;
    }

    /**
     * Sets the value of field 'penalty'.
     * 
     * @param penalty the value of field 'penalty'.
     */
    public void setPenalty(
            final org.edna.mxv1.xsdata.XSDataFloat penalty) {
        this._penalty = penalty;
    }

    /**
     * Method unmarshalXSDataIndexingSolution.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIndexingSolution
     */
    public static org.edna.mxv1.xsdata.XSDataIndexingSolution unmarshalXSDataIndexingSolution(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIndexingSolution) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIndexingSolution.class, reader);
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
