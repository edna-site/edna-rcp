/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataMessage.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataMessage extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _debugInfo.
     */
    private org.edna.mxv1.xsdata.XSDataString _debugInfo;

    /**
     * Field _level.
     */
    private org.edna.mxv1.xsdata.XSDataString _level;

    /**
     * Field _text.
     */
    private org.edna.mxv1.xsdata.XSDataString _text;

    /**
     * Field _type.
     */
    private org.edna.mxv1.xsdata.XSDataString _type;


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
     * Returns the value of field 'debugInfo'.
     * 
     * @return the value of field 'DebugInfo'.
     */
    public org.edna.mxv1.xsdata.XSDataString getDebugInfo(
    ) {
        return this._debugInfo;
    }

    /**
     * Returns the value of field 'level'.
     * 
     * @return the value of field 'Level'.
     */
    public org.edna.mxv1.xsdata.XSDataString getLevel(
    ) {
        return this._level;
    }

    /**
     * Returns the value of field 'text'.
     * 
     * @return the value of field 'Text'.
     */
    public org.edna.mxv1.xsdata.XSDataString getText(
    ) {
        return this._text;
    }

    /**
     * Returns the value of field 'type'.
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
     * Sets the value of field 'debugInfo'.
     * 
     * @param debugInfo the value of field 'debugInfo'.
     */
    public void setDebugInfo(
            final org.edna.mxv1.xsdata.XSDataString debugInfo) {
        this._debugInfo = debugInfo;
    }

    /**
     * Sets the value of field 'level'.
     * 
     * @param level the value of field 'level'.
     */
    public void setLevel(
            final org.edna.mxv1.xsdata.XSDataString level) {
        this._level = level;
    }

    /**
     * Sets the value of field 'text'.
     * 
     * @param text the value of field 'text'.
     */
    public void setText(
            final org.edna.mxv1.xsdata.XSDataString text) {
        this._text = text;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final org.edna.mxv1.xsdata.XSDataString type) {
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
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataMessage
     */
    public static org.edna.mxv1.xsdata.XSDataMessage unmarshalXSDataMessage(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataMessage) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataMessage.class, reader);
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
