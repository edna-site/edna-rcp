/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataSystemInfo.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataSystemInfo extends org.edna.tomov1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _compiler.
     */
    private org.edna.tomov1.xsdata.XSDataString _compiler;

    /**
     * Field _hostIP.
     */
    private org.edna.tomov1.xsdata.XSDataString _hostIP;

    /**
     * Field _hostName.
     */
    private org.edna.tomov1.xsdata.XSDataString _hostName;

    /**
     * Field _operatingSystem.
     */
    private org.edna.tomov1.xsdata.XSDataString _operatingSystem;

    /**
     * Field _operatingSystemType.
     */
    private org.edna.tomov1.xsdata.XSDataString _operatingSystemType;

    /**
     * Field _userName.
     */
    private org.edna.tomov1.xsdata.XSDataString _userName;

    /**
     * Field _virtualMachine.
     */
    private org.edna.tomov1.xsdata.XSDataString _virtualMachine;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataSystemInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'compiler'.
     * 
     * @return the value of field 'Compiler'.
     */
    public org.edna.tomov1.xsdata.XSDataString getCompiler(
    ) {
        return this._compiler;
    }

    /**
     * Returns the value of field 'hostIP'.
     * 
     * @return the value of field 'HostIP'.
     */
    public org.edna.tomov1.xsdata.XSDataString getHostIP(
    ) {
        return this._hostIP;
    }

    /**
     * Returns the value of field 'hostName'.
     * 
     * @return the value of field 'HostName'.
     */
    public org.edna.tomov1.xsdata.XSDataString getHostName(
    ) {
        return this._hostName;
    }

    /**
     * Returns the value of field 'operatingSystem'.
     * 
     * @return the value of field 'OperatingSystem'.
     */
    public org.edna.tomov1.xsdata.XSDataString getOperatingSystem(
    ) {
        return this._operatingSystem;
    }

    /**
     * Returns the value of field 'operatingSystemType'.
     * 
     * @return the value of field 'OperatingSystemType'.
     */
    public org.edna.tomov1.xsdata.XSDataString getOperatingSystemType(
    ) {
        return this._operatingSystemType;
    }

    /**
     * Returns the value of field 'userName'.
     * 
     * @return the value of field 'UserName'.
     */
    public org.edna.tomov1.xsdata.XSDataString getUserName(
    ) {
        return this._userName;
    }

    /**
     * Returns the value of field 'virtualMachine'.
     * 
     * @return the value of field 'VirtualMachine'.
     */
    public org.edna.tomov1.xsdata.XSDataString getVirtualMachine(
    ) {
        return this._virtualMachine;
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
     * Sets the value of field 'compiler'.
     * 
     * @param compiler the value of field 'compiler'.
     */
    public void setCompiler(
            final org.edna.tomov1.xsdata.XSDataString compiler) {
        this._compiler = compiler;
    }

    /**
     * Sets the value of field 'hostIP'.
     * 
     * @param hostIP the value of field 'hostIP'.
     */
    public void setHostIP(
            final org.edna.tomov1.xsdata.XSDataString hostIP) {
        this._hostIP = hostIP;
    }

    /**
     * Sets the value of field 'hostName'.
     * 
     * @param hostName the value of field 'hostName'.
     */
    public void setHostName(
            final org.edna.tomov1.xsdata.XSDataString hostName) {
        this._hostName = hostName;
    }

    /**
     * Sets the value of field 'operatingSystem'.
     * 
     * @param operatingSystem the value of field 'operatingSystem'.
     */
    public void setOperatingSystem(
            final org.edna.tomov1.xsdata.XSDataString operatingSystem) {
        this._operatingSystem = operatingSystem;
    }

    /**
     * Sets the value of field 'operatingSystemType'.
     * 
     * @param operatingSystemType the value of field
     * 'operatingSystemType'.
     */
    public void setOperatingSystemType(
            final org.edna.tomov1.xsdata.XSDataString operatingSystemType) {
        this._operatingSystemType = operatingSystemType;
    }

    /**
     * Sets the value of field 'userName'.
     * 
     * @param userName the value of field 'userName'.
     */
    public void setUserName(
            final org.edna.tomov1.xsdata.XSDataString userName) {
        this._userName = userName;
    }

    /**
     * Sets the value of field 'virtualMachine'.
     * 
     * @param virtualMachine the value of field 'virtualMachine'.
     */
    public void setVirtualMachine(
            final org.edna.tomov1.xsdata.XSDataString virtualMachine) {
        this._virtualMachine = virtualMachine;
    }

    /**
     * Method unmarshalXSDataSystemInfo.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataSystemInfo
     */
    public static org.edna.tomov1.xsdata.XSDataSystemInfo unmarshalXSDataSystemInfo(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataSystemInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataSystemInfo.class, reader);
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
