/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataMessageError.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataMessageError extends org.edna.kernel.xsdata.XSDataMessage 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _debugMessage.
     */
    private org.edna.kernel.xsdata.XSDataString _debugMessage;

    /**
     * Field _errorType.
     */
    private org.edna.kernel.xsdata.XSDataString _errorType;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataMessageError() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'debugMessage'.
     * 
     * @return the value of field 'DebugMessage'.
     */
    public org.edna.kernel.xsdata.XSDataString getDebugMessage(
    ) {
        return this._debugMessage;
    }

    /**
     * Returns the value of field 'errorType'.
     * 
     * @return the value of field 'ErrorType'.
     */
    public org.edna.kernel.xsdata.XSDataString getErrorType(
    ) {
        return this._errorType;
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
     * Sets the value of field 'debugMessage'.
     * 
     * @param debugMessage the value of field 'debugMessage'.
     */
    public void setDebugMessage(
            final org.edna.kernel.xsdata.XSDataString debugMessage) {
        this._debugMessage = debugMessage;
    }

    /**
     * Sets the value of field 'errorType'.
     * 
     * @param errorType the value of field 'errorType'.
     */
    public void setErrorType(
            final org.edna.kernel.xsdata.XSDataString errorType) {
        this._errorType = errorType;
    }

    /**
     * Method unmarshalXSDataMessageError.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.kernel.xsdata.XSDataMessageError
     */
    public static org.edna.kernel.xsdata.XSDataMessageError unmarshalXSDataMessageError(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataMessageError) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataMessageError.class, reader);
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
