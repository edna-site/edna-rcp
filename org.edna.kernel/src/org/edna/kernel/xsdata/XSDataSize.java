/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataSize.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataSize extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _x.
     */
    private org.edna.kernel.xsdata.XSDataLength _x;

    /**
     * Field _y.
     */
    private org.edna.kernel.xsdata.XSDataLength _y;

    /**
     * Field _z.
     */
    private org.edna.kernel.xsdata.XSDataLength _z;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataSize() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'x'.
     * 
     * @return the value of field 'X'.
     */
    public org.edna.kernel.xsdata.XSDataLength getX(
    ) {
        return this._x;
    }

    /**
     * Returns the value of field 'y'.
     * 
     * @return the value of field 'Y'.
     */
    public org.edna.kernel.xsdata.XSDataLength getY(
    ) {
        return this._y;
    }

    /**
     * Returns the value of field 'z'.
     * 
     * @return the value of field 'Z'.
     */
    public org.edna.kernel.xsdata.XSDataLength getZ(
    ) {
        return this._z;
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
     * Sets the value of field 'x'.
     * 
     * @param x the value of field 'x'.
     */
    public void setX(
            final org.edna.kernel.xsdata.XSDataLength x) {
        this._x = x;
    }

    /**
     * Sets the value of field 'y'.
     * 
     * @param y the value of field 'y'.
     */
    public void setY(
            final org.edna.kernel.xsdata.XSDataLength y) {
        this._y = y;
    }

    /**
     * Sets the value of field 'z'.
     * 
     * @param z the value of field 'z'.
     */
    public void setZ(
            final org.edna.kernel.xsdata.XSDataLength z) {
        this._z = z;
    }

    /**
     * Method unmarshalXSDataSize.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.kernel.xsdata.XSDataSize
     */
    public static org.edna.kernel.xsdata.XSDataSize unmarshalXSDataSize(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataSize) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataSize.class, reader);
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
