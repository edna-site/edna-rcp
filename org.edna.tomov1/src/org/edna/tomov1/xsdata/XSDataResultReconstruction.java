/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataResultReconstruction.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResultReconstruction extends org.edna.tomov1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numberOfSlices.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfSlices;

    /**
     * Field _sliceDirectory.
     */
    private org.edna.tomov1.xsdata.XSDataFile _sliceDirectory;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResultReconstruction() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'numberOfSlices'.
     * 
     * @return the value of field 'NumberOfSlices'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfSlices(
    ) {
        return this._numberOfSlices;
    }

    /**
     * Returns the value of field 'sliceDirectory'.
     * 
     * @return the value of field 'SliceDirectory'.
     */
    public org.edna.tomov1.xsdata.XSDataFile getSliceDirectory(
    ) {
        return this._sliceDirectory;
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
     * Sets the value of field 'numberOfSlices'.
     * 
     * @param numberOfSlices the value of field 'numberOfSlices'.
     */
    public void setNumberOfSlices(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfSlices) {
        this._numberOfSlices = numberOfSlices;
    }

    /**
     * Sets the value of field 'sliceDirectory'.
     * 
     * @param sliceDirectory the value of field 'sliceDirectory'.
     */
    public void setSliceDirectory(
            final org.edna.tomov1.xsdata.XSDataFile sliceDirectory) {
        this._sliceDirectory = sliceDirectory;
    }

    /**
     * Method unmarshalXSDataResultReconstruction.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataResultReconstruction
     */
    public static org.edna.tomov1.xsdata.XSDataResultReconstruction unmarshalXSDataResultReconstruction(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataResultReconstruction) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataResultReconstruction.class, reader);
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
