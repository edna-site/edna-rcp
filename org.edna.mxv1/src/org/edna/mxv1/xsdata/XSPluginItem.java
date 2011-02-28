/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSPluginItem.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSPluginItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _XSOptionList.
     */
    private org.edna.mxv1.xsdata.XSOptionList _XSOptionList;

    /**
     * Field _XSParamList.
     */
    private org.edna.mxv1.xsdata.XSParamList _XSParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSPluginItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'XSOptionList'.
     * 
     * @return the value of field 'XSOptionList'.
     */
    public org.edna.mxv1.xsdata.XSOptionList getXSOptionList(
    ) {
        return this._XSOptionList;
    }

    /**
     * Returns the value of field 'XSParamList'.
     * 
     * @return the value of field 'XSParamList'.
     */
    public org.edna.mxv1.xsdata.XSParamList getXSParamList(
    ) {
        return this._XSParamList;
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'XSOptionList'.
     * 
     * @param XSOptionList the value of field 'XSOptionList'.
     */
    public void setXSOptionList(
            final org.edna.mxv1.xsdata.XSOptionList XSOptionList) {
        this._XSOptionList = XSOptionList;
    }

    /**
     * Sets the value of field 'XSParamList'.
     * 
     * @param XSParamList the value of field 'XSParamList'.
     */
    public void setXSParamList(
            final org.edna.mxv1.xsdata.XSParamList XSParamList) {
        this._XSParamList = XSParamList;
    }

    /**
     * Method unmarshalXSPluginItem.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSPluginItem
     */
    public static org.edna.mxv1.xsdata.XSPluginItem unmarshalXSPluginItem(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSPluginItem) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSPluginItem.class, reader);
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
