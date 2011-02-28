/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataRotation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataRotation extends org.edna.tomov1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _q0.
     */
    private double _q0;

    /**
     * keeps track of state for field: _q0
     */
    private boolean _has_q0;

    /**
     * Field _q1.
     */
    private double _q1;

    /**
     * keeps track of state for field: _q1
     */
    private boolean _has_q1;

    /**
     * Field _q2.
     */
    private double _q2;

    /**
     * keeps track of state for field: _q2
     */
    private boolean _has_q2;

    /**
     * Field _q3.
     */
    private double _q3;

    /**
     * keeps track of state for field: _q3
     */
    private boolean _has_q3;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataRotation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteQ0(
    ) {
        this._has_q0= false;
    }

    /**
     */
    public void deleteQ1(
    ) {
        this._has_q1= false;
    }

    /**
     */
    public void deleteQ2(
    ) {
        this._has_q2= false;
    }

    /**
     */
    public void deleteQ3(
    ) {
        this._has_q3= false;
    }

    /**
     * Returns the value of field 'q0'.
     * 
     * @return the value of field 'Q0'.
     */
    public double getQ0(
    ) {
        return this._q0;
    }

    /**
     * Returns the value of field 'q1'.
     * 
     * @return the value of field 'Q1'.
     */
    public double getQ1(
    ) {
        return this._q1;
    }

    /**
     * Returns the value of field 'q2'.
     * 
     * @return the value of field 'Q2'.
     */
    public double getQ2(
    ) {
        return this._q2;
    }

    /**
     * Returns the value of field 'q3'.
     * 
     * @return the value of field 'Q3'.
     */
    public double getQ3(
    ) {
        return this._q3;
    }

    /**
     * Method hasQ0.
     * 
     * @return true if at least one Q0 has been added
     */
    public boolean hasQ0(
    ) {
        return this._has_q0;
    }

    /**
     * Method hasQ1.
     * 
     * @return true if at least one Q1 has been added
     */
    public boolean hasQ1(
    ) {
        return this._has_q1;
    }

    /**
     * Method hasQ2.
     * 
     * @return true if at least one Q2 has been added
     */
    public boolean hasQ2(
    ) {
        return this._has_q2;
    }

    /**
     * Method hasQ3.
     * 
     * @return true if at least one Q3 has been added
     */
    public boolean hasQ3(
    ) {
        return this._has_q3;
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
     * Sets the value of field 'q0'.
     * 
     * @param q0 the value of field 'q0'.
     */
    public void setQ0(
            final double q0) {
        this._q0 = q0;
        this._has_q0 = true;
    }

    /**
     * Sets the value of field 'q1'.
     * 
     * @param q1 the value of field 'q1'.
     */
    public void setQ1(
            final double q1) {
        this._q1 = q1;
        this._has_q1 = true;
    }

    /**
     * Sets the value of field 'q2'.
     * 
     * @param q2 the value of field 'q2'.
     */
    public void setQ2(
            final double q2) {
        this._q2 = q2;
        this._has_q2 = true;
    }

    /**
     * Sets the value of field 'q3'.
     * 
     * @param q3 the value of field 'q3'.
     */
    public void setQ3(
            final double q3) {
        this._q3 = q3;
        this._has_q3 = true;
    }

    /**
     * Method unmarshalXSDataRotation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.tomov1.xsdata.XSDataRotation
     */
    public static org.edna.tomov1.xsdata.XSDataRotation unmarshalXSDataRotation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataRotation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataRotation.class, reader);
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
