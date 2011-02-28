/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCollection.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCollection extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _diffractionPlan.
     */
    private org.edna.mxv1.xsdata.XSDataDiffractionPlan _diffractionPlan;

    /**
     * Field _sample.
     */
    private org.edna.mxv1.xsdata.XSDataSampleCrystalMM _sample;

    /**
     * Field _subWedgeList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataSubWedge> _subWedgeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCollection() {
        super();
        this._subWedgeList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataSubWedge>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSubWedge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubWedge(
            final org.edna.mxv1.xsdata.XSDataSubWedge vSubWedge)
    throws java.lang.IndexOutOfBoundsException {
        this._subWedgeList.add(vSubWedge);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubWedge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubWedge(
            final int index,
            final org.edna.mxv1.xsdata.XSDataSubWedge vSubWedge)
    throws java.lang.IndexOutOfBoundsException {
        this._subWedgeList.add(index, vSubWedge);
    }

    /**
     * Method enumerateSubWedge.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataSubWedge> enumerateSubWedge(
    ) {
        return java.util.Collections.enumeration(this._subWedgeList);
    }

    /**
     * Returns the value of field 'diffractionPlan'.
     * 
     * @return the value of field 'DiffractionPlan'.
     */
    public org.edna.mxv1.xsdata.XSDataDiffractionPlan getDiffractionPlan(
    ) {
        return this._diffractionPlan;
    }

    /**
     * Returns the value of field 'sample'.
     * 
     * @return the value of field 'Sample'.
     */
    public org.edna.mxv1.xsdata.XSDataSampleCrystalMM getSample(
    ) {
        return this._sample;
    }

    /**
     * Method getSubWedge.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataSubWedge
     * at the given index
     */
    public org.edna.mxv1.xsdata.XSDataSubWedge getSubWedge(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subWedgeList.size()) {
            throw new IndexOutOfBoundsException("getSubWedge: Index value '" + index + "' not in range [0.." + (this._subWedgeList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataSubWedge) _subWedgeList.get(index);
    }

    /**
     * Method getSubWedge.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataSubWedge[] getSubWedge(
    ) {
        org.edna.mxv1.xsdata.XSDataSubWedge[] array = new org.edna.mxv1.xsdata.XSDataSubWedge[0];
        return (org.edna.mxv1.xsdata.XSDataSubWedge[]) this._subWedgeList.toArray(array);
    }

    /**
     * Method getSubWedgeCount.
     * 
     * @return the size of this collection
     */
    public int getSubWedgeCount(
    ) {
        return this._subWedgeList.size();
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
     * Method iterateSubWedge.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataSubWedge> iterateSubWedge(
    ) {
        return this._subWedgeList.iterator();
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
    public void removeAllSubWedge(
    ) {
        this._subWedgeList.clear();
    }

    /**
     * Method removeSubWedge.
     * 
     * @param vSubWedge
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubWedge(
            final org.edna.mxv1.xsdata.XSDataSubWedge vSubWedge) {
        boolean removed = _subWedgeList.remove(vSubWedge);
        return removed;
    }

    /**
     * Method removeSubWedgeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataSubWedge removeSubWedgeAt(
            final int index) {
        java.lang.Object obj = this._subWedgeList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataSubWedge) obj;
    }

    /**
     * Sets the value of field 'diffractionPlan'.
     * 
     * @param diffractionPlan the value of field 'diffractionPlan'.
     */
    public void setDiffractionPlan(
            final org.edna.mxv1.xsdata.XSDataDiffractionPlan diffractionPlan) {
        this._diffractionPlan = diffractionPlan;
    }

    /**
     * Sets the value of field 'sample'.
     * 
     * @param sample the value of field 'sample'.
     */
    public void setSample(
            final org.edna.mxv1.xsdata.XSDataSampleCrystalMM sample) {
        this._sample = sample;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubWedge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubWedge(
            final int index,
            final org.edna.mxv1.xsdata.XSDataSubWedge vSubWedge)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subWedgeList.size()) {
            throw new IndexOutOfBoundsException("setSubWedge: Index value '" + index + "' not in range [0.." + (this._subWedgeList.size() - 1) + "]");
        }

        this._subWedgeList.set(index, vSubWedge);
    }

    /**
     * 
     * 
     * @param vSubWedgeArray
     */
    public void setSubWedge(
            final org.edna.mxv1.xsdata.XSDataSubWedge[] vSubWedgeArray) {
        //-- copy array
        _subWedgeList.clear();

        for (int i = 0; i < vSubWedgeArray.length; i++) {
                this._subWedgeList.add(vSubWedgeArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataCollection.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataCollection
     */
    public static org.edna.mxv1.xsdata.XSDataCollection unmarshalXSDataCollection(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCollection) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCollection.class, reader);
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
