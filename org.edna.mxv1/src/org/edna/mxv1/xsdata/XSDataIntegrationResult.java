/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIntegrationResult.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIntegrationResult extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _integrationSubWedgeResultList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult> _integrationSubWedgeResultList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIntegrationResult() {
        super();
        this._integrationSubWedgeResultList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIntegrationSubWedgeResult
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIntegrationSubWedgeResult(
            final org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult vIntegrationSubWedgeResult)
    throws java.lang.IndexOutOfBoundsException {
        this._integrationSubWedgeResultList.add(vIntegrationSubWedgeResult);
    }

    /**
     * 
     * 
     * @param index
     * @param vIntegrationSubWedgeResult
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIntegrationSubWedgeResult(
            final int index,
            final org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult vIntegrationSubWedgeResult)
    throws java.lang.IndexOutOfBoundsException {
        this._integrationSubWedgeResultList.add(index, vIntegrationSubWedgeResult);
    }

    /**
     * Method enumerateIntegrationSubWedgeResult.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult> enumerateIntegrationSubWedgeResult(
    ) {
        return java.util.Collections.enumeration(this._integrationSubWedgeResultList);
    }

    /**
     * Method getIntegrationSubWedgeResult.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult at the
     * given index
     */
    public org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult getIntegrationSubWedgeResult(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._integrationSubWedgeResultList.size()) {
            throw new IndexOutOfBoundsException("getIntegrationSubWedgeResult: Index value '" + index + "' not in range [0.." + (this._integrationSubWedgeResultList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult) _integrationSubWedgeResultList.get(index);
    }

    /**
     * Method getIntegrationSubWedgeResult.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult[] getIntegrationSubWedgeResult(
    ) {
        org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult[] array = new org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult[0];
        return (org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult[]) this._integrationSubWedgeResultList.toArray(array);
    }

    /**
     * Method getIntegrationSubWedgeResultCount.
     * 
     * @return the size of this collection
     */
    public int getIntegrationSubWedgeResultCount(
    ) {
        return this._integrationSubWedgeResultList.size();
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
     * Method iterateIntegrationSubWedgeResult.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult> iterateIntegrationSubWedgeResult(
    ) {
        return this._integrationSubWedgeResultList.iterator();
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
     */
    public void removeAllIntegrationSubWedgeResult(
    ) {
        this._integrationSubWedgeResultList.clear();
    }

    /**
     * Method removeIntegrationSubWedgeResult.
     * 
     * @param vIntegrationSubWedgeResult
     * @return true if the object was removed from the collection.
     */
    public boolean removeIntegrationSubWedgeResult(
            final org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult vIntegrationSubWedgeResult) {
        boolean removed = _integrationSubWedgeResultList.remove(vIntegrationSubWedgeResult);
        return removed;
    }

    /**
     * Method removeIntegrationSubWedgeResultAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult removeIntegrationSubWedgeResultAt(
            final int index) {
        java.lang.Object obj = this._integrationSubWedgeResultList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vIntegrationSubWedgeResult
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIntegrationSubWedgeResult(
            final int index,
            final org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult vIntegrationSubWedgeResult)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._integrationSubWedgeResultList.size()) {
            throw new IndexOutOfBoundsException("setIntegrationSubWedgeResult: Index value '" + index + "' not in range [0.." + (this._integrationSubWedgeResultList.size() - 1) + "]");
        }

        this._integrationSubWedgeResultList.set(index, vIntegrationSubWedgeResult);
    }

    /**
     * 
     * 
     * @param vIntegrationSubWedgeResultArray
     */
    public void setIntegrationSubWedgeResult(
            final org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult[] vIntegrationSubWedgeResultArray) {
        //-- copy array
        _integrationSubWedgeResultList.clear();

        for (int i = 0; i < vIntegrationSubWedgeResultArray.length; i++) {
                this._integrationSubWedgeResultList.add(vIntegrationSubWedgeResultArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataIntegrationResult.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIntegrationResult
     */
    public static org.edna.mxv1.xsdata.XSDataIntegrationResult unmarshalXSDataIntegrationResult(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIntegrationResult) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIntegrationResult.class, reader);
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
