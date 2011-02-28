/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataInputTomography.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataInputTomography extends org.edna.tomov1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _byteDepthOfImage.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _byteDepthOfImage;

    /**
     * Field _chunkHeight.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _chunkHeight;

    /**
     * Field _imageDirectory.
     */
    private org.edna.tomov1.xsdata.XSDataFile _imageDirectory;

    /**
     * Field _imageWidth.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _imageWidth;

    /**
     * Field _jobName.
     */
    private org.edna.tomov1.xsdata.XSDataString _jobName;

    /**
     * Field _numberOfChunks.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfChunks;

    /**
     * Field _numberOfProjectionsPerSegment.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfProjectionsPerSegment;

    /**
     * Field _numberOfSegments.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfSegments;

    /**
     * Field _settingsFileName.
     */
    private org.edna.tomov1.xsdata.XSDataFile _settingsFileName;

    /**
     * Field _timeoutLength.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _timeoutLength;

    /**
     * Field _timeoutPollingInterval.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _timeoutPollingInterval;

    /**
     * Field _uniqueName.
     */
    private org.edna.tomov1.xsdata.XSDataString _uniqueName;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataInputTomography() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'byteDepthOfImage'.
     * 
     * @return the value of field 'ByteDepthOfImage'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getByteDepthOfImage(
    ) {
        return this._byteDepthOfImage;
    }

    /**
     * Returns the value of field 'chunkHeight'.
     * 
     * @return the value of field 'ChunkHeight'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getChunkHeight(
    ) {
        return this._chunkHeight;
    }

    /**
     * Returns the value of field 'imageDirectory'.
     * 
     * @return the value of field 'ImageDirectory'.
     */
    public org.edna.tomov1.xsdata.XSDataFile getImageDirectory(
    ) {
        return this._imageDirectory;
    }

    /**
     * Returns the value of field 'imageWidth'.
     * 
     * @return the value of field 'ImageWidth'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getImageWidth(
    ) {
        return this._imageWidth;
    }

    /**
     * Returns the value of field 'jobName'.
     * 
     * @return the value of field 'JobName'.
     */
    public org.edna.tomov1.xsdata.XSDataString getJobName(
    ) {
        return this._jobName;
    }

    /**
     * Returns the value of field 'numberOfChunks'.
     * 
     * @return the value of field 'NumberOfChunks'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfChunks(
    ) {
        return this._numberOfChunks;
    }

    /**
     * Returns the value of field 'numberOfProjectionsPerSegment'.
     * 
     * @return the value of field 'NumberOfProjectionsPerSegment'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfProjectionsPerSegment(
    ) {
        return this._numberOfProjectionsPerSegment;
    }

    /**
     * Returns the value of field 'numberOfSegments'.
     * 
     * @return the value of field 'NumberOfSegments'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfSegments(
    ) {
        return this._numberOfSegments;
    }

    /**
     * Returns the value of field 'settingsFileName'.
     * 
     * @return the value of field 'SettingsFileName'.
     */
    public org.edna.tomov1.xsdata.XSDataFile getSettingsFileName(
    ) {
        return this._settingsFileName;
    }

    /**
     * Returns the value of field 'timeoutLength'.
     * 
     * @return the value of field 'TimeoutLength'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getTimeoutLength(
    ) {
        return this._timeoutLength;
    }

    /**
     * Returns the value of field 'timeoutPollingInterval'.
     * 
     * @return the value of field 'TimeoutPollingInterval'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getTimeoutPollingInterval(
    ) {
        return this._timeoutPollingInterval;
    }

    /**
     * Returns the value of field 'uniqueName'.
     * 
     * @return the value of field 'UniqueName'.
     */
    public org.edna.tomov1.xsdata.XSDataString getUniqueName(
    ) {
        return this._uniqueName;
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
     * Sets the value of field 'byteDepthOfImage'.
     * 
     * @param byteDepthOfImage the value of field 'byteDepthOfImage'
     */
    public void setByteDepthOfImage(
            final org.edna.tomov1.xsdata.XSDataInteger byteDepthOfImage) {
        this._byteDepthOfImage = byteDepthOfImage;
    }

    /**
     * Sets the value of field 'chunkHeight'.
     * 
     * @param chunkHeight the value of field 'chunkHeight'.
     */
    public void setChunkHeight(
            final org.edna.tomov1.xsdata.XSDataInteger chunkHeight) {
        this._chunkHeight = chunkHeight;
    }

    /**
     * Sets the value of field 'imageDirectory'.
     * 
     * @param imageDirectory the value of field 'imageDirectory'.
     */
    public void setImageDirectory(
            final org.edna.tomov1.xsdata.XSDataFile imageDirectory) {
        this._imageDirectory = imageDirectory;
    }

    /**
     * Sets the value of field 'imageWidth'.
     * 
     * @param imageWidth the value of field 'imageWidth'.
     */
    public void setImageWidth(
            final org.edna.tomov1.xsdata.XSDataInteger imageWidth) {
        this._imageWidth = imageWidth;
    }

    /**
     * Sets the value of field 'jobName'.
     * 
     * @param jobName the value of field 'jobName'.
     */
    public void setJobName(
            final org.edna.tomov1.xsdata.XSDataString jobName) {
        this._jobName = jobName;
    }

    /**
     * Sets the value of field 'numberOfChunks'.
     * 
     * @param numberOfChunks the value of field 'numberOfChunks'.
     */
    public void setNumberOfChunks(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfChunks) {
        this._numberOfChunks = numberOfChunks;
    }

    /**
     * Sets the value of field 'numberOfProjectionsPerSegment'.
     * 
     * @param numberOfProjectionsPerSegment the value of field
     * 'numberOfProjectionsPerSegment'.
     */
    public void setNumberOfProjectionsPerSegment(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfProjectionsPerSegment) {
        this._numberOfProjectionsPerSegment = numberOfProjectionsPerSegment;
    }

    /**
     * Sets the value of field 'numberOfSegments'.
     * 
     * @param numberOfSegments the value of field 'numberOfSegments'
     */
    public void setNumberOfSegments(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfSegments) {
        this._numberOfSegments = numberOfSegments;
    }

    /**
     * Sets the value of field 'settingsFileName'.
     * 
     * @param settingsFileName the value of field 'settingsFileName'
     */
    public void setSettingsFileName(
            final org.edna.tomov1.xsdata.XSDataFile settingsFileName) {
        this._settingsFileName = settingsFileName;
    }

    /**
     * Sets the value of field 'timeoutLength'.
     * 
     * @param timeoutLength the value of field 'timeoutLength'.
     */
    public void setTimeoutLength(
            final org.edna.tomov1.xsdata.XSDataFloat timeoutLength) {
        this._timeoutLength = timeoutLength;
    }

    /**
     * Sets the value of field 'timeoutPollingInterval'.
     * 
     * @param timeoutPollingInterval the value of field
     * 'timeoutPollingInterval'.
     */
    public void setTimeoutPollingInterval(
            final org.edna.tomov1.xsdata.XSDataFloat timeoutPollingInterval) {
        this._timeoutPollingInterval = timeoutPollingInterval;
    }

    /**
     * Sets the value of field 'uniqueName'.
     * 
     * @param uniqueName the value of field 'uniqueName'.
     */
    public void setUniqueName(
            final org.edna.tomov1.xsdata.XSDataString uniqueName) {
        this._uniqueName = uniqueName;
    }

    /**
     * Method unmarshalXSDataInputTomography.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataInputTomography
     */
    public static org.edna.tomov1.xsdata.XSDataInputTomography unmarshalXSDataInputTomography(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataInputTomography) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataInputTomography.class, reader);
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
