/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsIndexing.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsIndexing extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _beamPositionShiftX.
     */
    private org.edna.mxv1.xsdata.XSDataLength _beamPositionShiftX;

    /**
     * Field _beamPositionShiftY.
     */
    private org.edna.mxv1.xsdata.XSDataLength _beamPositionShiftY;

    /**
     * Field _spotDeviationAngular.
     */
    private org.edna.mxv1.xsdata.XSDataAngle _spotDeviationAngular;

    /**
     * Field _spotDeviationPositional.
     */
    private org.edna.mxv1.xsdata.XSDataLength _spotDeviationPositional;

    /**
     * Field _spotsTotal.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _spotsTotal;

    /**
     * Field _spotsUsed.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _spotsUsed;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsIndexing() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'beamPositionShiftX'.
     * 
     * @return the value of field 'BeamPositionShiftX'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getBeamPositionShiftX(
    ) {
        return this._beamPositionShiftX;
    }

    /**
     * Returns the value of field 'beamPositionShiftY'.
     * 
     * @return the value of field 'BeamPositionShiftY'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getBeamPositionShiftY(
    ) {
        return this._beamPositionShiftY;
    }

    /**
     * Returns the value of field 'spotDeviationAngular'.
     * 
     * @return the value of field 'SpotDeviationAngular'.
     */
    public org.edna.mxv1.xsdata.XSDataAngle getSpotDeviationAngular(
    ) {
        return this._spotDeviationAngular;
    }

    /**
     * Returns the value of field 'spotDeviationPositional'.
     * 
     * @return the value of field 'SpotDeviationPositional'.
     */
    public org.edna.mxv1.xsdata.XSDataLength getSpotDeviationPositional(
    ) {
        return this._spotDeviationPositional;
    }

    /**
     * Returns the value of field 'spotsTotal'.
     * 
     * @return the value of field 'SpotsTotal'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getSpotsTotal(
    ) {
        return this._spotsTotal;
    }

    /**
     * Returns the value of field 'spotsUsed'.
     * 
     * @return the value of field 'SpotsUsed'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getSpotsUsed(
    ) {
        return this._spotsUsed;
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
     * Sets the value of field 'beamPositionShiftX'.
     * 
     * @param beamPositionShiftX the value of field
     * 'beamPositionShiftX'.
     */
    public void setBeamPositionShiftX(
            final org.edna.mxv1.xsdata.XSDataLength beamPositionShiftX) {
        this._beamPositionShiftX = beamPositionShiftX;
    }

    /**
     * Sets the value of field 'beamPositionShiftY'.
     * 
     * @param beamPositionShiftY the value of field
     * 'beamPositionShiftY'.
     */
    public void setBeamPositionShiftY(
            final org.edna.mxv1.xsdata.XSDataLength beamPositionShiftY) {
        this._beamPositionShiftY = beamPositionShiftY;
    }

    /**
     * Sets the value of field 'spotDeviationAngular'.
     * 
     * @param spotDeviationAngular the value of field
     * 'spotDeviationAngular'.
     */
    public void setSpotDeviationAngular(
            final org.edna.mxv1.xsdata.XSDataAngle spotDeviationAngular) {
        this._spotDeviationAngular = spotDeviationAngular;
    }

    /**
     * Sets the value of field 'spotDeviationPositional'.
     * 
     * @param spotDeviationPositional the value of field
     * 'spotDeviationPositional'.
     */
    public void setSpotDeviationPositional(
            final org.edna.mxv1.xsdata.XSDataLength spotDeviationPositional) {
        this._spotDeviationPositional = spotDeviationPositional;
    }

    /**
     * Sets the value of field 'spotsTotal'.
     * 
     * @param spotsTotal the value of field 'spotsTotal'.
     */
    public void setSpotsTotal(
            final org.edna.mxv1.xsdata.XSDataInteger spotsTotal) {
        this._spotsTotal = spotsTotal;
    }

    /**
     * Sets the value of field 'spotsUsed'.
     * 
     * @param spotsUsed the value of field 'spotsUsed'.
     */
    public void setSpotsUsed(
            final org.edna.mxv1.xsdata.XSDataInteger spotsUsed) {
        this._spotsUsed = spotsUsed;
    }

    /**
     * Method unmarshalXSDataStatisticsIndexing.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsIndexing
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsIndexing unmarshalXSDataStatisticsIndexing(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsIndexing) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsIndexing.class, reader);
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
