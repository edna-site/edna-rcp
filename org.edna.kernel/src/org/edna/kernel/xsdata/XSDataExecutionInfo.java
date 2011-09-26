/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.kernel.xsdata;

/**
 * Class XSDataExecutionInfo.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataExecutionInfo extends org.edna.kernel.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _baseDirectory.
     */
    private org.edna.kernel.xsdata.XSDataFile _baseDirectory;

    /**
     * Field _executionTime.
     */
    private org.edna.kernel.xsdata.XSDataTime _executionTime;

    /**
     * Field _pluginName.
     */
    private org.edna.kernel.xsdata.XSDataString _pluginName;

    /**
     * Field _startOfExecution.
     */
    private org.edna.kernel.xsdata.XSDataDate _startOfExecution;

    /**
     * Field _systemInfo.
     */
    private org.edna.kernel.xsdata.XSDataSystemInfo _systemInfo;

    /**
     * Field _workingDirectory.
     */
    private org.edna.kernel.xsdata.XSDataFile _workingDirectory;

    /**
     * Field _configuration.
     */
    private org.edna.kernel.xsdata.XSConfiguration _configuration;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataExecutionInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'baseDirectory'.
     * 
     * @return the value of field 'BaseDirectory'.
     */
    public org.edna.kernel.xsdata.XSDataFile getBaseDirectory(
    ) {
        return this._baseDirectory;
    }

    /**
     * Returns the value of field 'configuration'.
     * 
     * @return the value of field 'Configuration'.
     */
    public org.edna.kernel.xsdata.XSConfiguration getConfiguration(
    ) {
        return this._configuration;
    }

    /**
     * Returns the value of field 'executionTime'.
     * 
     * @return the value of field 'ExecutionTime'.
     */
    public org.edna.kernel.xsdata.XSDataTime getExecutionTime(
    ) {
        return this._executionTime;
    }

    /**
     * Returns the value of field 'pluginName'.
     * 
     * @return the value of field 'PluginName'.
     */
    public org.edna.kernel.xsdata.XSDataString getPluginName(
    ) {
        return this._pluginName;
    }

    /**
     * Returns the value of field 'startOfExecution'.
     * 
     * @return the value of field 'StartOfExecution'.
     */
    public org.edna.kernel.xsdata.XSDataDate getStartOfExecution(
    ) {
        return this._startOfExecution;
    }

    /**
     * Returns the value of field 'systemInfo'.
     * 
     * @return the value of field 'SystemInfo'.
     */
    public org.edna.kernel.xsdata.XSDataSystemInfo getSystemInfo(
    ) {
        return this._systemInfo;
    }

    /**
     * Returns the value of field 'workingDirectory'.
     * 
     * @return the value of field 'WorkingDirectory'.
     */
    public org.edna.kernel.xsdata.XSDataFile getWorkingDirectory(
    ) {
        return this._workingDirectory;
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
     * Sets the value of field 'baseDirectory'.
     * 
     * @param baseDirectory the value of field 'baseDirectory'.
     */
    public void setBaseDirectory(
            final org.edna.kernel.xsdata.XSDataFile baseDirectory) {
        this._baseDirectory = baseDirectory;
    }

    /**
     * Sets the value of field 'configuration'.
     * 
     * @param configuration the value of field 'configuration'.
     */
    public void setConfiguration(
            final org.edna.kernel.xsdata.XSConfiguration configuration) {
        this._configuration = configuration;
    }

    /**
     * Sets the value of field 'executionTime'.
     * 
     * @param executionTime the value of field 'executionTime'.
     */
    public void setExecutionTime(
            final org.edna.kernel.xsdata.XSDataTime executionTime) {
        this._executionTime = executionTime;
    }

    /**
     * Sets the value of field 'pluginName'.
     * 
     * @param pluginName the value of field 'pluginName'.
     */
    public void setPluginName(
            final org.edna.kernel.xsdata.XSDataString pluginName) {
        this._pluginName = pluginName;
    }

    /**
     * Sets the value of field 'startOfExecution'.
     * 
     * @param startOfExecution the value of field 'startOfExecution'
     */
    public void setStartOfExecution(
            final org.edna.kernel.xsdata.XSDataDate startOfExecution) {
        this._startOfExecution = startOfExecution;
    }

    /**
     * Sets the value of field 'systemInfo'.
     * 
     * @param systemInfo the value of field 'systemInfo'.
     */
    public void setSystemInfo(
            final org.edna.kernel.xsdata.XSDataSystemInfo systemInfo) {
        this._systemInfo = systemInfo;
    }

    /**
     * Sets the value of field 'workingDirectory'.
     * 
     * @param workingDirectory the value of field 'workingDirectory'
     */
    public void setWorkingDirectory(
            final org.edna.kernel.xsdata.XSDataFile workingDirectory) {
        this._workingDirectory = workingDirectory;
    }

    /**
     * Method unmarshalXSDataExecutionInfo.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.kernel.xsdata.XSDataExecutionInfo
     */
    public static org.edna.kernel.xsdata.XSDataExecutionInfo unmarshalXSDataExecutionInfo(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.kernel.xsdata.XSDataExecutionInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.kernel.xsdata.XSDataExecutionInfo.class, reader);
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
