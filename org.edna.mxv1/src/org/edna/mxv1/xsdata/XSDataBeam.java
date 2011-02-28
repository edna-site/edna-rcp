/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataBeam.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataBeam extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _exposureTime.
     */
    private org.edna.mxv1.xsdata.XSDataTime _exposureTime;

    /**
     * Field _flux.
     */
    private org.edna.mxv1.xsdata.XSDataFlux _flux;

    /**
     * Field _minExposureTimePerImage.
     */
    private org.edna.mxv1.xsdata.XSDataTime _minExposureTimePerImage;

    /**
     * Field _size.
     */
    private org.edna.mxv1.xsdata.XSDataSize _size;

    /**
     * Field _transmission.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _transmission;

    /**
     * Field _wavelength.
     */
    private org.edna.mxv1.xsdata.XSDataWavelength _wavelength;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataBeam() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'exposureTime'.
     * 
     * @return the value of field 'ExposureTime'.
     */
    public org.edna.mxv1.xsdata.XSDataTime getExposureTime(
    ) {
        return this._exposureTime;
    }

    /**
     * Returns the value of field 'flux'.
     * 
     * @return the value of field 'Flux'.
     */
    public org.edna.mxv1.xsdata.XSDataFlux getFlux(
    ) {
        return this._flux;
    }

    /**
     * Returns the value of field 'minExposureTimePerImage'.
     * 
     * @return the value of field 'MinExposureTimePerImage'.
     */
    public org.edna.mxv1.xsdata.XSDataTime getMinExposureTimePerImage(
    ) {
        return this._minExposureTimePerImage;
    }

    /**
     * Returns the value of field 'size'.
     * 
     * @return the value of field 'Size'.
     */
    public org.edna.mxv1.xsdata.XSDataSize getSize(
    ) {
        return this._size;
    }

    /**
     * Returns the value of field 'transmission'.
     * 
     * @return the value of field 'Transmission'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getTransmission(
    ) {
        return this._transmission;
    }

    /**
     * Returns the value of field 'wavelength'.
     * 
     * @return the value of field 'Wavelength'.
     */
    public org.edna.mxv1.xsdata.XSDataWavelength getWavelength(
    ) {
        return this._wavelength;
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
     * Sets the value of field 'exposureTime'.
     * 
     * @param exposureTime the value of field 'exposureTime'.
     */
    public void setExposureTime(
            final org.edna.mxv1.xsdata.XSDataTime exposureTime) {
        this._exposureTime = exposureTime;
    }

    /**
     * Sets the value of field 'flux'.
     * 
     * @param flux the value of field 'flux'.
     */
    public void setFlux(
            final org.edna.mxv1.xsdata.XSDataFlux flux) {
        this._flux = flux;
    }

    /**
     * Sets the value of field 'minExposureTimePerImage'.
     * 
     * @param minExposureTimePerImage the value of field
     * 'minExposureTimePerImage'.
     */
    public void setMinExposureTimePerImage(
            final org.edna.mxv1.xsdata.XSDataTime minExposureTimePerImage) {
        this._minExposureTimePerImage = minExposureTimePerImage;
    }

    /**
     * Sets the value of field 'size'.
     * 
     * @param size the value of field 'size'.
     */
    public void setSize(
            final org.edna.mxv1.xsdata.XSDataSize size) {
        this._size = size;
    }

    /**
     * Sets the value of field 'transmission'.
     * 
     * @param transmission the value of field 'transmission'.
     */
    public void setTransmission(
            final org.edna.mxv1.xsdata.XSDataDouble transmission) {
        this._transmission = transmission;
    }

    /**
     * Sets the value of field 'wavelength'.
     * 
     * @param wavelength the value of field 'wavelength'.
     */
    public void setWavelength(
            final org.edna.mxv1.xsdata.XSDataWavelength wavelength) {
        this._wavelength = wavelength;
    }

    /**
     * Method unmarshalXSDataBeam.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataBeam
     */
    public static org.edna.mxv1.xsdata.XSDataBeam unmarshalXSDataBeam(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataBeam) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataBeam.class, reader);
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
