/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataStatus.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatus extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _executionInfo.
     */
    private org.edna.kernel.xsdata.XSDataExecutionInfo _executionInfo;

    /**
     * Field _executiveSummary.
     */
    private org.edna.kernel.xsdata.XSDataString _executiveSummary;

    /**
     * Field _isSuccess.
     */
    private org.edna.kernel.xsdata.XSDataBoolean _isSuccess;

    /**
     * Field _message.
     */
    private org.edna.kernel.xsdata.XSDataMessage _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatus() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'executionInfo'.
     * 
     * @return the value of field 'ExecutionInfo'.
     */
    public org.edna.kernel.xsdata.XSDataExecutionInfo getExecutionInfo(
    ) {
        return this._executionInfo;
    }

    /**
     * Returns the value of field 'executiveSummary'.
     * 
     * @return the value of field 'ExecutiveSummary'.
     */
    public org.edna.kernel.xsdata.XSDataString getExecutiveSummary(
    ) {
        return this._executiveSummary;
    }

    /**
     * Returns the value of field 'isSuccess'.
     * 
     * @return the value of field 'IsSuccess'.
     */
    public org.edna.kernel.xsdata.XSDataBoolean getIsSuccess(
    ) {
        return this._isSuccess;
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public org.edna.kernel.xsdata.XSDataMessage getMessage(
    ) {
        return this._message;
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
     * Sets the value of field 'executionInfo'.
     * 
     * @param executionInfo the value of field 'executionInfo'.
     */
    public void setExecutionInfo(
            final org.edna.kernel.xsdata.XSDataExecutionInfo executionInfo) {
        this._executionInfo = executionInfo;
    }

    /**
     * Sets the value of field 'executiveSummary'.
     * 
     * @param executiveSummary the value of field 'executiveSummary'
     */
    public void setExecutiveSummary(
            final org.edna.kernel.xsdata.XSDataString executiveSummary) {
        this._executiveSummary = executiveSummary;
    }

    /**
     * Sets the value of field 'isSuccess'.
     * 
     * @param isSuccess the value of field 'isSuccess'.
     */
    public void setIsSuccess(
            final org.edna.kernel.xsdata.XSDataBoolean isSuccess) {
        this._isSuccess = isSuccess;
    }

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final org.edna.kernel.xsdata.XSDataMessage message) {
        this._message = message;
    }

    /**
     * Method unmarshalXSDataStatus.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.kernel.xsdata.XSDataStatus
     */
    public static org.edna.kernel.xsdata.XSDataStatus unmarshalXSDataStatus(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataStatus) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataStatus.class, reader);
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
