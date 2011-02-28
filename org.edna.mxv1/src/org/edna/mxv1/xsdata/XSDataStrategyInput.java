/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStrategyInput.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStrategyInput extends org.edna.mxv1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bestFileContentDat.
     */
    private org.edna.mxv1.xsdata.XSDataString _bestFileContentDat;

    /**
     * Field _bestFileContentHKLList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataString> _bestFileContentHKLList;

    /**
     * Field _bestFileContentPar.
     */
    private org.edna.mxv1.xsdata.XSDataString _bestFileContentPar;

    /**
     * Field _crystalRefined.
     */
    private org.edna.mxv1.xsdata.XSDataCrystal _crystalRefined;

    /**
     * Field _diffractionPlan.
     */
    private org.edna.mxv1.xsdata.XSDataDiffractionPlan _diffractionPlan;

    /**
     * Field _experimentalCondition.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalCondition;

    /**
     * Field _sample.
     */
    private org.edna.mxv1.xsdata.XSDataSampleCrystalMM _sample;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStrategyInput() {
        super();
        this._bestFileContentHKLList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataString>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBestFileContentHKL
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBestFileContentHKL(
            final org.edna.mxv1.xsdata.XSDataString vBestFileContentHKL)
    throws java.lang.IndexOutOfBoundsException {
        this._bestFileContentHKLList.add(vBestFileContentHKL);
    }

    /**
     * 
     * 
     * @param index
     * @param vBestFileContentHKL
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBestFileContentHKL(
            final int index,
            final org.edna.mxv1.xsdata.XSDataString vBestFileContentHKL)
    throws java.lang.IndexOutOfBoundsException {
        this._bestFileContentHKLList.add(index, vBestFileContentHKL);
    }

    /**
     * Method enumerateBestFileContentHKL.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataString> enumerateBestFileContentHKL(
    ) {
        return java.util.Collections.enumeration(this._bestFileContentHKLList);
    }

    /**
     * Returns the value of field 'bestFileContentDat'.
     * 
     * @return the value of field 'BestFileContentDat'.
     */
    public org.edna.mxv1.xsdata.XSDataString getBestFileContentDat(
    ) {
        return this._bestFileContentDat;
    }

    /**
     * Method getBestFileContentHKL.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataString
     * at the given index
     */
    public org.edna.mxv1.xsdata.XSDataString getBestFileContentHKL(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bestFileContentHKLList.size()) {
            throw new IndexOutOfBoundsException("getBestFileContentHKL: Index value '" + index + "' not in range [0.." + (this._bestFileContentHKLList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataString) _bestFileContentHKLList.get(index);
    }

    /**
     * Method getBestFileContentHKL.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataString[] getBestFileContentHKL(
    ) {
        org.edna.mxv1.xsdata.XSDataString[] array = new org.edna.mxv1.xsdata.XSDataString[0];
        return (org.edna.mxv1.xsdata.XSDataString[]) this._bestFileContentHKLList.toArray(array);
    }

    /**
     * Method getBestFileContentHKLCount.
     * 
     * @return the size of this collection
     */
    public int getBestFileContentHKLCount(
    ) {
        return this._bestFileContentHKLList.size();
    }

    /**
     * Returns the value of field 'bestFileContentPar'.
     * 
     * @return the value of field 'BestFileContentPar'.
     */
    public org.edna.mxv1.xsdata.XSDataString getBestFileContentPar(
    ) {
        return this._bestFileContentPar;
    }

    /**
     * Returns the value of field 'crystalRefined'.
     * 
     * @return the value of field 'CrystalRefined'.
     */
    public org.edna.mxv1.xsdata.XSDataCrystal getCrystalRefined(
    ) {
        return this._crystalRefined;
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
     * Returns the value of field 'experimentalCondition'.
     * 
     * @return the value of field 'ExperimentalCondition'.
     */
    public org.edna.mxv1.xsdata.XSDataExperimentalCondition getExperimentalCondition(
    ) {
        return this._experimentalCondition;
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
     * Method iterateBestFileContentHKL.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataString> iterateBestFileContentHKL(
    ) {
        return this._bestFileContentHKLList.iterator();
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
    public void removeAllBestFileContentHKL(
    ) {
        this._bestFileContentHKLList.clear();
    }

    /**
     * Method removeBestFileContentHKL.
     * 
     * @param vBestFileContentHKL
     * @return true if the object was removed from the collection.
     */
    public boolean removeBestFileContentHKL(
            final org.edna.mxv1.xsdata.XSDataString vBestFileContentHKL) {
        boolean removed = _bestFileContentHKLList.remove(vBestFileContentHKL);
        return removed;
    }

    /**
     * Method removeBestFileContentHKLAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataString removeBestFileContentHKLAt(
            final int index) {
        java.lang.Object obj = this._bestFileContentHKLList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataString) obj;
    }

    /**
     * Sets the value of field 'bestFileContentDat'.
     * 
     * @param bestFileContentDat the value of field
     * 'bestFileContentDat'.
     */
    public void setBestFileContentDat(
            final org.edna.mxv1.xsdata.XSDataString bestFileContentDat) {
        this._bestFileContentDat = bestFileContentDat;
    }

    /**
     * 
     * 
     * @param index
     * @param vBestFileContentHKL
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBestFileContentHKL(
            final int index,
            final org.edna.mxv1.xsdata.XSDataString vBestFileContentHKL)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bestFileContentHKLList.size()) {
            throw new IndexOutOfBoundsException("setBestFileContentHKL: Index value '" + index + "' not in range [0.." + (this._bestFileContentHKLList.size() - 1) + "]");
        }

        this._bestFileContentHKLList.set(index, vBestFileContentHKL);
    }

    /**
     * 
     * 
     * @param vBestFileContentHKLArray
     */
    public void setBestFileContentHKL(
            final org.edna.mxv1.xsdata.XSDataString[] vBestFileContentHKLArray) {
        //-- copy array
        _bestFileContentHKLList.clear();

        for (int i = 0; i < vBestFileContentHKLArray.length; i++) {
                this._bestFileContentHKLList.add(vBestFileContentHKLArray[i]);
        }
    }

    /**
     * Sets the value of field 'bestFileContentPar'.
     * 
     * @param bestFileContentPar the value of field
     * 'bestFileContentPar'.
     */
    public void setBestFileContentPar(
            final org.edna.mxv1.xsdata.XSDataString bestFileContentPar) {
        this._bestFileContentPar = bestFileContentPar;
    }

    /**
     * Sets the value of field 'crystalRefined'.
     * 
     * @param crystalRefined the value of field 'crystalRefined'.
     */
    public void setCrystalRefined(
            final org.edna.mxv1.xsdata.XSDataCrystal crystalRefined) {
        this._crystalRefined = crystalRefined;
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
     * Sets the value of field 'experimentalCondition'.
     * 
     * @param experimentalCondition the value of field
     * 'experimentalCondition'.
     */
    public void setExperimentalCondition(
            final org.edna.mxv1.xsdata.XSDataExperimentalCondition experimentalCondition) {
        this._experimentalCondition = experimentalCondition;
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
     * Method unmarshalXSDataStrategyInput.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStrategyInput
     */
    public static org.edna.mxv1.xsdata.XSDataStrategyInput unmarshalXSDataStrategyInput(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStrategyInput) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStrategyInput.class, reader);
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
