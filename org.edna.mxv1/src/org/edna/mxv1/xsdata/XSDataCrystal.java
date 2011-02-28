/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCrystal.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCrystal extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cell.
     */
    private org.edna.mxv1.xsdata.XSDataCell _cell;

    /**
     * Field _mosaicity.
     */
    private org.edna.mxv1.xsdata.XSDataFloat _mosaicity;

    /**
     * Field _spaceGroup.
     */
    private org.edna.mxv1.xsdata.XSDataSpaceGroup _spaceGroup;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCrystal() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'cell'.
     * 
     * @return the value of field 'Cell'.
     */
    public org.edna.mxv1.xsdata.XSDataCell getCell(
    ) {
        return this._cell;
    }

    /**
     * Returns the value of field 'mosaicity'.
     * 
     * @return the value of field 'Mosaicity'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getMosaicity(
    ) {
        return this._mosaicity;
    }

    /**
     * Returns the value of field 'spaceGroup'.
     * 
     * @return the value of field 'SpaceGroup'.
     */
    public org.edna.mxv1.xsdata.XSDataSpaceGroup getSpaceGroup(
    ) {
        return this._spaceGroup;
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
     * Sets the value of field 'cell'.
     * 
     * @param cell the value of field 'cell'.
     */
    public void setCell(
            final org.edna.mxv1.xsdata.XSDataCell cell) {
        this._cell = cell;
    }

    /**
     * Sets the value of field 'mosaicity'.
     * 
     * @param mosaicity the value of field 'mosaicity'.
     */
    public void setMosaicity(
            final org.edna.mxv1.xsdata.XSDataFloat mosaicity) {
        this._mosaicity = mosaicity;
    }

    /**
     * Sets the value of field 'spaceGroup'.
     * 
     * @param spaceGroup the value of field 'spaceGroup'.
     */
    public void setSpaceGroup(
            final org.edna.mxv1.xsdata.XSDataSpaceGroup spaceGroup) {
        this._spaceGroup = spaceGroup;
    }

    /**
     * Method unmarshalXSDataCrystal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataCrystal
     */
    public static org.edna.mxv1.xsdata.XSDataCrystal unmarshalXSDataCrystal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCrystal) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCrystal.class, reader);
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
