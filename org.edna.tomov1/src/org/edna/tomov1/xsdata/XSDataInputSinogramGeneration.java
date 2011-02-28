/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataInputSinogramGeneration.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataInputSinogramGeneration extends org.edna.tomov1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _imageDirectory.
     */
    private org.edna.tomov1.xsdata.XSDataFile _imageDirectory;

    /**
     * Field _imageWidth.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _imageWidth;

    /**
     * Field _numberOfImages.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfImages;

    /**
     * Field _numberOfSegments.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfSegments;

    /**
     * Field _segmentHeight.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _segmentHeight;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataInputSinogramGeneration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'numberOfImages'.
     * 
     * @return the value of field 'NumberOfImages'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfImages(
    ) {
        return this._numberOfImages;
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
     * Returns the value of field 'segmentHeight'.
     * 
     * @return the value of field 'SegmentHeight'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getSegmentHeight(
    ) {
        return this._segmentHeight;
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
     * Sets the value of field 'numberOfImages'.
     * 
     * @param numberOfImages the value of field 'numberOfImages'.
     */
    public void setNumberOfImages(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfImages) {
        this._numberOfImages = numberOfImages;
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
     * Sets the value of field 'segmentHeight'.
     * 
     * @param segmentHeight the value of field 'segmentHeight'.
     */
    public void setSegmentHeight(
            final org.edna.tomov1.xsdata.XSDataInteger segmentHeight) {
        this._segmentHeight = segmentHeight;
    }

    /**
     * Method unmarshalXSDataInputSinogramGeneration.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataInputSinogramGeneration
     */
    public static org.edna.tomov1.xsdata.XSDataInputSinogramGeneration unmarshalXSDataInputSinogramGeneration(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataInputSinogramGeneration) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataInputSinogramGeneration.class, reader);
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
