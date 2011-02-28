/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataStatus.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatus extends org.edna.tomov1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _executionInfo.
     */
    private org.edna.tomov1.xsdata.XSDataExecutionInfo _executionInfo;

    /**
     * Field _executiveSummary.
     */
    private org.edna.tomov1.xsdata.XSDataString _executiveSummary;

    /**
     * Field _isSuccess.
     */
    private org.edna.tomov1.xsdata.XSDataBoolean _isSuccess;

    /**
     * Field _messageList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSDataMessage> _messageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatus() {
        super();
        this._messageList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSDataMessage>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMessage(
            final org.edna.tomov1.xsdata.XSDataMessage vMessage)
    throws java.lang.IndexOutOfBoundsException {
        this._messageList.add(vMessage);
    }

    /**
     * 
     * 
     * @param index
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMessage(
            final int index,
            final org.edna.tomov1.xsdata.XSDataMessage vMessage)
    throws java.lang.IndexOutOfBoundsException {
        this._messageList.add(index, vMessage);
    }

    /**
     * Method enumerateMessage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSDataMessage> enumerateMessage(
    ) {
        return java.util.Collections.enumeration(this._messageList);
    }

    /**
     * Returns the value of field 'executionInfo'.
     * 
     * @return the value of field 'ExecutionInfo'.
     */
    public org.edna.tomov1.xsdata.XSDataExecutionInfo getExecutionInfo(
    ) {
        return this._executionInfo;
    }

    /**
     * Returns the value of field 'executiveSummary'.
     * 
     * @return the value of field 'ExecutiveSummary'.
     */
    public org.edna.tomov1.xsdata.XSDataString getExecutiveSummary(
    ) {
        return this._executiveSummary;
    }

    /**
     * Returns the value of field 'isSuccess'.
     * 
     * @return the value of field 'IsSuccess'.
     */
    public org.edna.tomov1.xsdata.XSDataBoolean getIsSuccess(
    ) {
        return this._isSuccess;
    }

    /**
     * Method getMessage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.tomov1.xsdata.XSDataMessage at the given index
     */
    public org.edna.tomov1.xsdata.XSDataMessage getMessage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._messageList.size()) {
            throw new IndexOutOfBoundsException("getMessage: Index value '" + index + "' not in range [0.." + (this._messageList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSDataMessage) _messageList.get(index);
    }

    /**
     * Method getMessage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSDataMessage[] getMessage(
    ) {
        org.edna.tomov1.xsdata.XSDataMessage[] array = new org.edna.tomov1.xsdata.XSDataMessage[0];
        return (org.edna.tomov1.xsdata.XSDataMessage[]) this._messageList.toArray(array);
    }

    /**
     * Method getMessageCount.
     * 
     * @return the size of this collection
     */
    public int getMessageCount(
    ) {
        return this._messageList.size();
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
     * Method iterateMessage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSDataMessage> iterateMessage(
    ) {
        return this._messageList.iterator();
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
     */
    public void removeAllMessage(
    ) {
        this._messageList.clear();
    }

    /**
     * Method removeMessage.
     * 
     * @param vMessage
     * @return true if the object was removed from the collection.
     */
    public boolean removeMessage(
            final org.edna.tomov1.xsdata.XSDataMessage vMessage) {
        boolean removed = _messageList.remove(vMessage);
        return removed;
    }

    /**
     * Method removeMessageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSDataMessage removeMessageAt(
            final int index) {
        java.lang.Object obj = this._messageList.remove(index);
        return (org.edna.tomov1.xsdata.XSDataMessage) obj;
    }

    /**
     * Sets the value of field 'executionInfo'.
     * 
     * @param executionInfo the value of field 'executionInfo'.
     */
    public void setExecutionInfo(
            final org.edna.tomov1.xsdata.XSDataExecutionInfo executionInfo) {
        this._executionInfo = executionInfo;
    }

    /**
     * Sets the value of field 'executiveSummary'.
     * 
     * @param executiveSummary the value of field 'executiveSummary'
     */
    public void setExecutiveSummary(
            final org.edna.tomov1.xsdata.XSDataString executiveSummary) {
        this._executiveSummary = executiveSummary;
    }

    /**
     * Sets the value of field 'isSuccess'.
     * 
     * @param isSuccess the value of field 'isSuccess'.
     */
    public void setIsSuccess(
            final org.edna.tomov1.xsdata.XSDataBoolean isSuccess) {
        this._isSuccess = isSuccess;
    }

    /**
     * 
     * 
     * @param index
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMessage(
            final int index,
            final org.edna.tomov1.xsdata.XSDataMessage vMessage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._messageList.size()) {
            throw new IndexOutOfBoundsException("setMessage: Index value '" + index + "' not in range [0.." + (this._messageList.size() - 1) + "]");
        }

        this._messageList.set(index, vMessage);
    }

    /**
     * 
     * 
     * @param vMessageArray
     */
    public void setMessage(
            final org.edna.tomov1.xsdata.XSDataMessage[] vMessageArray) {
        //-- copy array
        _messageList.clear();

        for (int i = 0; i < vMessageArray.length; i++) {
                this._messageList.add(vMessageArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataStatus.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.tomov1.xsdata.XSDataStatus
     */
    public static org.edna.tomov1.xsdata.XSDataStatus unmarshalXSDataStatus(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataStatus) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataStatus.class, reader);
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
