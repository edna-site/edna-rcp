/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsIntegrationPerReflectionType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsIntegrationPerReflectionType extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fullyRecorded.
     */
    private org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections _fullyRecorded;

    /**
     * Field _partials.
     */
    private org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections _partials;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsIntegrationPerReflectionType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fullyRecorded'.
     * 
     * @return the value of field 'FullyRecorded'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections getFullyRecorded(
    ) {
        return this._fullyRecorded;
    }

    /**
     * Returns the value of field 'partials'.
     * 
     * @return the value of field 'Partials'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections getPartials(
    ) {
        return this._partials;
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
     * Sets the value of field 'fullyRecorded'.
     * 
     * @param fullyRecorded the value of field 'fullyRecorded'.
     */
    public void setFullyRecorded(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections fullyRecorded) {
        this._fullyRecorded = fullyRecorded;
    }

    /**
     * Sets the value of field 'partials'.
     * 
     * @param partials the value of field 'partials'.
     */
    public void setPartials(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationAverageAndNumberOfReflections partials) {
        this._partials = partials;
    }

    /**
     * Method
     * unmarshalXSDataStatisticsIntegrationPerReflectionType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerReflectionType
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerReflectionType unmarshalXSDataStatisticsIntegrationPerReflectionType(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerReflectionType) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerReflectionType.class, reader);
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
