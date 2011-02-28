/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataOrientation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataOrientation extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _matrixA.
     */
    private org.edna.mxv1.xsdata.XSDataMatrix _matrixA;

    /**
     * Field _matrixU.
     */
    private org.edna.mxv1.xsdata.XSDataMatrix _matrixU;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataOrientation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'matrixA'.
     * 
     * @return the value of field 'MatrixA'.
     */
    public org.edna.mxv1.xsdata.XSDataMatrix getMatrixA(
    ) {
        return this._matrixA;
    }

    /**
     * Returns the value of field 'matrixU'.
     * 
     * @return the value of field 'MatrixU'.
     */
    public org.edna.mxv1.xsdata.XSDataMatrix getMatrixU(
    ) {
        return this._matrixU;
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
     * Sets the value of field 'matrixA'.
     * 
     * @param matrixA the value of field 'matrixA'.
     */
    public void setMatrixA(
            final org.edna.mxv1.xsdata.XSDataMatrix matrixA) {
        this._matrixA = matrixA;
    }

    /**
     * Sets the value of field 'matrixU'.
     * 
     * @param matrixU the value of field 'matrixU'.
     */
    public void setMatrixU(
            final org.edna.mxv1.xsdata.XSDataMatrix matrixU) {
        this._matrixU = matrixU;
    }

    /**
     * Method unmarshalXSDataOrientation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataOrientatio
     */
    public static org.edna.mxv1.xsdata.XSDataOrientation unmarshalXSDataOrientation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataOrientation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataOrientation.class, reader);
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
