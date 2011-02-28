/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataResultCCP4i.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResultCCP4i implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listOfOutputFiles.
     */
    private org.edna.mxv1.xsdata.XSDataString _listOfOutputFiles;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResultCCP4i() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listOfOutputFiles'.
     * 
     * @return the value of field 'ListOfOutputFiles'.
     */
    public org.edna.mxv1.xsdata.XSDataString getListOfOutputFiles(
    ) {
        return this._listOfOutputFiles;
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
     * Sets the value of field 'listOfOutputFiles'.
     * 
     * @param listOfOutputFiles the value of field
     * 'listOfOutputFiles'.
     */
    public void setListOfOutputFiles(
            final org.edna.mxv1.xsdata.XSDataString listOfOutputFiles) {
        this._listOfOutputFiles = listOfOutputFiles;
    }

    /**
     * Method unmarshalXSDataResultCCP4i.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataResultCCP4
     */
    public static org.edna.mxv1.xsdata.XSDataResultCCP4i unmarshalXSDataResultCCP4i(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataResultCCP4i) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataResultCCP4i.class, reader);
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
