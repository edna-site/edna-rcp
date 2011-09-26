/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataMessage.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataMessage extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _debuginfo.
     */
    private org.edna.kernel.xsdata.XSDataString _debuginfo;

    /**
     * Field _level.
     */
    private org.edna.kernel.xsdata.XSDataString _level;

    /**
     * Field _text.
     */
    private org.edna.kernel.xsdata.XSDataString _text;

    /**
     * Field _type.
     */
    private org.edna.kernel.xsdata.XSDataString _type;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataMessage() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'debuginfo'.
     * 
     * @return the value of field 'Debuginfo'.
     */
    public org.edna.kernel.xsdata.XSDataString getDebuginfo(
    ) {
        return this._debuginfo;
    }

    /**
     * Returns the value of field 'level'.
     * 
     * @return the value of field 'Level'.
     */
    public org.edna.kernel.xsdata.XSDataString getLevel(
    ) {
        return this._level;
    }

    /**
     * Returns the value of field 'text'.
     * 
     * @return the value of field 'Text'.
     */
    public org.edna.kernel.xsdata.XSDataString getText(
    ) {
        return this._text;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public org.edna.kernel.xsdata.XSDataString getType(
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
     * Sets the value of field 'debuginfo'.
     * 
     * @param debuginfo the value of field 'debuginfo'.
     */
    public void setDebuginfo(
            final org.edna.kernel.xsdata.XSDataString debuginfo) {
        this._debuginfo = debuginfo;
    }

    /**
     * Sets the value of field 'level'.
     * 
     * @param level the value of field 'level'.
     */
    public void setLevel(
            final org.edna.kernel.xsdata.XSDataString level) {
        this._level = level;
    }

    /**
     * Sets the value of field 'text'.
     * 
     * @param text the value of field 'text'.
     */
    public void setText(
            final org.edna.kernel.xsdata.XSDataString text) {
        this._text = text;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final org.edna.kernel.xsdata.XSDataString type) {
        this._type = type;
    }

    /**
     * Method unmarshalXSDataMessage.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.kernel.xsdata.XSDataMessage
     */
    public static org.edna.kernel.xsdata.XSDataMessage unmarshalXSDataMessage(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataMessage) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataMessage.class, reader);
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
