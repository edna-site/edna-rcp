/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStrategyResult.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStrategyResult extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _collectionPlanList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataCollectionPlan> _collectionPlanList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStrategyResult() {
        super();
        this._collectionPlanList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataCollectionPlan>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCollectionPlan
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCollectionPlan(
            final org.edna.mxv1.xsdata.XSDataCollectionPlan vCollectionPlan)
    throws java.lang.IndexOutOfBoundsException {
        this._collectionPlanList.add(vCollectionPlan);
    }

    /**
     * 
     * 
     * @param index
     * @param vCollectionPlan
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCollectionPlan(
            final int index,
            final org.edna.mxv1.xsdata.XSDataCollectionPlan vCollectionPlan)
    throws java.lang.IndexOutOfBoundsException {
        this._collectionPlanList.add(index, vCollectionPlan);
    }

    /**
     * Method enumerateCollectionPlan.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataCollectionPlan> enumerateCollectionPlan(
    ) {
        return java.util.Collections.enumeration(this._collectionPlanList);
    }

    /**
     * Method getCollectionPlan.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataCollectionPlan at the given index
     */
    public org.edna.mxv1.xsdata.XSDataCollectionPlan getCollectionPlan(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._collectionPlanList.size()) {
            throw new IndexOutOfBoundsException("getCollectionPlan: Index value '" + index + "' not in range [0.." + (this._collectionPlanList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataCollectionPlan) _collectionPlanList.get(index);
    }

    /**
     * Method getCollectionPlan.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataCollectionPlan[] getCollectionPlan(
    ) {
        org.edna.mxv1.xsdata.XSDataCollectionPlan[] array = new org.edna.mxv1.xsdata.XSDataCollectionPlan[0];
        return (org.edna.mxv1.xsdata.XSDataCollectionPlan[]) this._collectionPlanList.toArray(array);
    }

    /**
     * Method getCollectionPlanCount.
     * 
     * @return the size of this collection
     */
    public int getCollectionPlanCount(
    ) {
        return this._collectionPlanList.size();
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
     * Method iterateCollectionPlan.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataCollectionPlan> iterateCollectionPlan(
    ) {
        return this._collectionPlanList.iterator();
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
    public void removeAllCollectionPlan(
    ) {
        this._collectionPlanList.clear();
    }

    /**
     * Method removeCollectionPlan.
     * 
     * @param vCollectionPlan
     * @return true if the object was removed from the collection.
     */
    public boolean removeCollectionPlan(
            final org.edna.mxv1.xsdata.XSDataCollectionPlan vCollectionPlan) {
        boolean removed = _collectionPlanList.remove(vCollectionPlan);
        return removed;
    }

    /**
     * Method removeCollectionPlanAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataCollectionPlan removeCollectionPlanAt(
            final int index) {
        java.lang.Object obj = this._collectionPlanList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataCollectionPlan) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCollectionPlan
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCollectionPlan(
            final int index,
            final org.edna.mxv1.xsdata.XSDataCollectionPlan vCollectionPlan)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._collectionPlanList.size()) {
            throw new IndexOutOfBoundsException("setCollectionPlan: Index value '" + index + "' not in range [0.." + (this._collectionPlanList.size() - 1) + "]");
        }

        this._collectionPlanList.set(index, vCollectionPlan);
    }

    /**
     * 
     * 
     * @param vCollectionPlanArray
     */
    public void setCollectionPlan(
            final org.edna.mxv1.xsdata.XSDataCollectionPlan[] vCollectionPlanArray) {
        //-- copy array
        _collectionPlanList.clear();

        for (int i = 0; i < vCollectionPlanArray.length; i++) {
                this._collectionPlanList.add(vCollectionPlanArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataStrategyResult.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStrategyResult
     */
    public static org.edna.mxv1.xsdata.XSDataStrategyResult unmarshalXSDataStrategyResult(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStrategyResult) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStrategyResult.class, reader);
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
