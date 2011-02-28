/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataImageQualityIndicators.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataImageQualityIndicators extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _binPopCutOffMethod2Res.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _binPopCutOffMethod2Res;

    /**
     * Field _goodBraggCandidates.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _goodBraggCandidates;

    /**
     * Field _iceRings.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _iceRings;

    /**
     * Field _image.
     */
    private org.edna.mxv1.xsdata.XSDataImage _image;

    /**
     * Field _inResolutionOvrlSpots.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _inResolutionOvrlSpots;

    /**
     * Field _inResTotal.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _inResTotal;

    /**
     * Field _maxUnitCell.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _maxUnitCell;

    /**
     * Field _method1Res.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _method1Res;

    /**
     * Field _method2Res.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _method2Res;

    /**
     * Field _pctSaturationTop50Peaks.
     */
    private org.edna.mxv1.xsdata.XSDataDouble _pctSaturationTop50Peaks;

    /**
     * Field _spotTotal.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _spotTotal;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataImageQualityIndicators() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'binPopCutOffMethod2Res'.
     * 
     * @return the value of field 'BinPopCutOffMethod2Res'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getBinPopCutOffMethod2Res(
    ) {
        return this._binPopCutOffMethod2Res;
    }

    /**
     * Returns the value of field 'goodBraggCandidates'.
     * 
     * @return the value of field 'GoodBraggCandidates'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getGoodBraggCandidates(
    ) {
        return this._goodBraggCandidates;
    }

    /**
     * Returns the value of field 'iceRings'.
     * 
     * @return the value of field 'IceRings'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getIceRings(
    ) {
        return this._iceRings;
    }

    /**
     * Returns the value of field 'image'.
     * 
     * @return the value of field 'Image'.
     */
    public org.edna.mxv1.xsdata.XSDataImage getImage(
    ) {
        return this._image;
    }

    /**
     * Returns the value of field 'inResTotal'.
     * 
     * @return the value of field 'InResTotal'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getInResTotal(
    ) {
        return this._inResTotal;
    }

    /**
     * Returns the value of field 'inResolutionOvrlSpots'.
     * 
     * @return the value of field 'InResolutionOvrlSpots'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getInResolutionOvrlSpots(
    ) {
        return this._inResolutionOvrlSpots;
    }

    /**
     * Returns the value of field 'maxUnitCell'.
     * 
     * @return the value of field 'MaxUnitCell'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getMaxUnitCell(
    ) {
        return this._maxUnitCell;
    }

    /**
     * Returns the value of field 'method1Res'.
     * 
     * @return the value of field 'Method1Res'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getMethod1Res(
    ) {
        return this._method1Res;
    }

    /**
     * Returns the value of field 'method2Res'.
     * 
     * @return the value of field 'Method2Res'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getMethod2Res(
    ) {
        return this._method2Res;
    }

    /**
     * Returns the value of field 'pctSaturationTop50Peaks'.
     * 
     * @return the value of field 'PctSaturationTop50Peaks'.
     */
    public org.edna.mxv1.xsdata.XSDataDouble getPctSaturationTop50Peaks(
    ) {
        return this._pctSaturationTop50Peaks;
    }

    /**
     * Returns the value of field 'spotTotal'.
     * 
     * @return the value of field 'SpotTotal'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getSpotTotal(
    ) {
        return this._spotTotal;
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
     * Sets the value of field 'binPopCutOffMethod2Res'.
     * 
     * @param binPopCutOffMethod2Res the value of field
     * 'binPopCutOffMethod2Res'.
     */
    public void setBinPopCutOffMethod2Res(
            final org.edna.mxv1.xsdata.XSDataDouble binPopCutOffMethod2Res) {
        this._binPopCutOffMethod2Res = binPopCutOffMethod2Res;
    }

    /**
     * Sets the value of field 'goodBraggCandidates'.
     * 
     * @param goodBraggCandidates the value of field
     * 'goodBraggCandidates'.
     */
    public void setGoodBraggCandidates(
            final org.edna.mxv1.xsdata.XSDataInteger goodBraggCandidates) {
        this._goodBraggCandidates = goodBraggCandidates;
    }

    /**
     * Sets the value of field 'iceRings'.
     * 
     * @param iceRings the value of field 'iceRings'.
     */
    public void setIceRings(
            final org.edna.mxv1.xsdata.XSDataInteger iceRings) {
        this._iceRings = iceRings;
    }

    /**
     * Sets the value of field 'image'.
     * 
     * @param image the value of field 'image'.
     */
    public void setImage(
            final org.edna.mxv1.xsdata.XSDataImage image) {
        this._image = image;
    }

    /**
     * Sets the value of field 'inResTotal'.
     * 
     * @param inResTotal the value of field 'inResTotal'.
     */
    public void setInResTotal(
            final org.edna.mxv1.xsdata.XSDataInteger inResTotal) {
        this._inResTotal = inResTotal;
    }

    /**
     * Sets the value of field 'inResolutionOvrlSpots'.
     * 
     * @param inResolutionOvrlSpots the value of field
     * 'inResolutionOvrlSpots'.
     */
    public void setInResolutionOvrlSpots(
            final org.edna.mxv1.xsdata.XSDataInteger inResolutionOvrlSpots) {
        this._inResolutionOvrlSpots = inResolutionOvrlSpots;
    }

    /**
     * Sets the value of field 'maxUnitCell'.
     * 
     * @param maxUnitCell the value of field 'maxUnitCell'.
     */
    public void setMaxUnitCell(
            final org.edna.mxv1.xsdata.XSDataDouble maxUnitCell) {
        this._maxUnitCell = maxUnitCell;
    }

    /**
     * Sets the value of field 'method1Res'.
     * 
     * @param method1Res the value of field 'method1Res'.
     */
    public void setMethod1Res(
            final org.edna.mxv1.xsdata.XSDataDouble method1Res) {
        this._method1Res = method1Res;
    }

    /**
     * Sets the value of field 'method2Res'.
     * 
     * @param method2Res the value of field 'method2Res'.
     */
    public void setMethod2Res(
            final org.edna.mxv1.xsdata.XSDataDouble method2Res) {
        this._method2Res = method2Res;
    }

    /**
     * Sets the value of field 'pctSaturationTop50Peaks'.
     * 
     * @param pctSaturationTop50Peaks the value of field
     * 'pctSaturationTop50Peaks'.
     */
    public void setPctSaturationTop50Peaks(
            final org.edna.mxv1.xsdata.XSDataDouble pctSaturationTop50Peaks) {
        this._pctSaturationTop50Peaks = pctSaturationTop50Peaks;
    }

    /**
     * Sets the value of field 'spotTotal'.
     * 
     * @param spotTotal the value of field 'spotTotal'.
     */
    public void setSpotTotal(
            final org.edna.mxv1.xsdata.XSDataInteger spotTotal) {
        this._spotTotal = spotTotal;
    }

    /**
     * Method unmarshalXSDataImageQualityIndicators.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataImageQualityIndicators
     */
    public static org.edna.mxv1.xsdata.XSDataImageQualityIndicators unmarshalXSDataImageQualityIndicators(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataImageQualityIndicators) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataImageQualityIndicators.class, reader);
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
