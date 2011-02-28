/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCell.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCell extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _angle_alpha.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _angle_alpha;

    /**
     * Field _angle_beta.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _angle_beta;

    /**
     * Field _angle_gamma.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _angle_gamma;

    /**
     * Field _length_a.
     */
    private org.edna.mxv1.xsdata.XSDataLength _length_a;

    /**
     * Field _length_b.
     */
    private org.edna.mxv1.xsdata.XSDataLength _length_b;

    /**
     * Field _length_c.
     */
    private org.edna.mxv1.xsdata.XSDataLength _length_c;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCell() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'angle_alpha'.
     * 
     * @return the value of field 'Angle_alpha'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getAngle_alpha(
    ) {
        return this._angle_alpha;
    }

    /**
     * Returns the value of field 'angle_beta'.
     * 
     * @return the value of field 'Angle_beta'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getAngle_beta(
    ) {
        return this._angle_beta;
    }

    /**
     * Returns the value of field 'angle_gamma'.
     * 
     * @return the value of field 'Angle_gamma'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getAngle_gamma(
    ) {
        return this._angle_gamma;
    }

    /**
     * Returns the value of field 'length_a'.
     * 
     * @return the value of field 'Length_a'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getLength_a(
    ) {
        return this._length_a;
    }

    /**
     * Returns the value of field 'length_b'.
     * 
     * @return the value of field 'Length_b'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getLength_b(
    ) {
        return this._length_b;
    }

    /**
     * Returns the value of field 'length_c'.
     * 
     * @return the value of field 'Length_c'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getLength_c(
    ) {
        return this._length_c;
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
     * Sets the value of field 'angle_alpha'.
     * 
     * @param angle_alpha the value of field 'angle_alpha'.
     */
    public void setAngle_alpha(
            final org.edna.mxv1.xsdata.XSDataAngle angle_alpha) {
        this._angle_alpha = angle_alpha;
    }

    /**
     * Sets the value of field 'angle_beta'.
     * 
     * @param angle_beta the value of field 'angle_beta'.
     */
    public void setAngle_beta(
            final org.edna.mxv1.xsdata.XSDataAngle angle_beta) {
        this._angle_beta = angle_beta;
    }

    /**
     * Sets the value of field 'angle_gamma'.
     * 
     * @param angle_gamma the value of field 'angle_gamma'.
     */
    public void setAngle_gamma(
            final org.edna.mxv1.xsdata.XSDataAngle angle_gamma) {
        this._angle_gamma = angle_gamma;
    }

    /**
     * Sets the value of field 'length_a'.
     * 
     * @param length_a the value of field 'length_a'.
     */
    public void setLength_a(
            final org.edna.mxv1.xsdata.XSDataLength length_a) {
        this._length_a = length_a;
    }

    /**
     * Sets the value of field 'length_b'.
     * 
     * @param length_b the value of field 'length_b'.
     */
    public void setLength_b(
            final org.edna.mxv1.xsdata.XSDataLength length_b) {
        this._length_b = length_b;
    }

    /**
     * Sets the value of field 'length_c'.
     * 
     * @param length_c the value of field 'length_c'.
     */
    public void setLength_c(
            final org.edna.mxv1.xsdata.XSDataLength length_c) {
        this._length_c = length_c;
    }

    /**
     * Method unmarshalXSDataCell.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataCell
     */
    public static org.edna.mxv1.xsdata.XSDataCell unmarshalXSDataCell(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCell) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCell.class, reader);
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
