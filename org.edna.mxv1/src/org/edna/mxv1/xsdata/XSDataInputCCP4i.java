/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataInputCCP4i.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataInputCCP4i implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataFileList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataFile> _dataFileList;

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

    /**
     * Field _dataSetList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataCCP4iDataSet> _dataSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataInputCCP4i() {
        super();
        this._dataFileList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataFile>();
        this._dataSetList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataCCP4iDataSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDataFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataFile(
            final org.edna.mxv1.xsdata.XSDataFile vDataFile)
    throws java.lang.IndexOutOfBoundsException {
        this._dataFileList.add(vDataFile);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vDataFile)
    throws java.lang.IndexOutOfBoundsException {
        this._dataFileList.add(index, vDataFile);
    }

    /**
     * 
     * 
     * @param vDataSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataSet(
            final org.edna.mxv1.xsdata.XSDataCCP4iDataSet vDataSet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataSetList.add(vDataSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataSet(
            final int index,
            final org.edna.mxv1.xsdata.XSDataCCP4iDataSet vDataSet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataSetList.add(index, vDataSet);
    }

    /**
     * Method enumerateDataFile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataFile> enumerateDataFile(
    ) {
        return java.util.Collections.enumeration(this._dataFileList);
    }

    /**
     * Method enumerateDataSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataCCP4iDataSet> enumerateDataSet(
    ) {
        return java.util.Collections.enumeration(this._dataSetList);
    }

    /**
     * Method getDataFile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataFile at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataFile getDataFile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataFileList.size()) {
            throw new IndexOutOfBoundsException("getDataFile: Index value '" + index + "' not in range [0.." + (this._dataFileList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataFile) _dataFileList.get(index);
    }

    /**
     * Method getDataFile.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataFile[] getDataFile(
    ) {
        org.edna.mxv1.xsdata.XSDataFile[] array = new org.edna.mxv1.xsdata.XSDataFile[0];
        return (org.edna.mxv1.xsdata.XSDataFile[]) this._dataFileList.toArray(array);
    }

    /**
     * Method getDataFileCount.
     * 
     * @return the size of this collection
     */
    public int getDataFileCount(
    ) {
        return this._dataFileList.size();
    }

    /**
     * Method getDataSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataCCP4iDataSet at the given index
     */
    public org.edna.mxv1.xsdata.XSDataCCP4iDataSet getDataSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataSetList.size()) {
            throw new IndexOutOfBoundsException("getDataSet: Index value '" + index + "' not in range [0.." + (this._dataSetList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataCCP4iDataSet) _dataSetList.get(index);
    }

    /**
     * Method getDataSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataCCP4iDataSet[] getDataSet(
    ) {
        org.edna.mxv1.xsdata.XSDataCCP4iDataSet[] array = new org.edna.mxv1.xsdata.XSDataCCP4iDataSet[0];
        return (org.edna.mxv1.xsdata.XSDataCCP4iDataSet[]) this._dataSetList.toArray(array);
    }

    /**
     * Method getDataSetCount.
     * 
     * @return the size of this collection
     */
    public int getDataSetCount(
    ) {
        return this._dataSetList.size();
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
     * Method iterateDataFile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataFile> iterateDataFile(
    ) {
        return this._dataFileList.iterator();
    }

    /**
     * Method iterateDataSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataCCP4iDataSet> iterateDataSet(
    ) {
        return this._dataSetList.iterator();
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
    public void removeAllDataFile(
    ) {
        this._dataFileList.clear();
    }

    /**
     */
    public void removeAllDataSet(
    ) {
        this._dataSetList.clear();
    }

    /**
     * Method removeDataFile.
     * 
     * @param vDataFile
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataFile(
            final org.edna.mxv1.xsdata.XSDataFile vDataFile) {
        boolean removed = _dataFileList.remove(vDataFile);
        return removed;
    }

    /**
     * Method removeDataFileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataFile removeDataFileAt(
            final int index) {
        java.lang.Object obj = this._dataFileList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataFile) obj;
    }

    /**
     * Method removeDataSet.
     * 
     * @param vDataSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataSet(
            final org.edna.mxv1.xsdata.XSDataCCP4iDataSet vDataSet) {
        boolean removed = _dataSetList.remove(vDataSet);
        return removed;
    }

    /**
     * Method removeDataSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataCCP4iDataSet removeDataSetAt(
            final int index) {
        java.lang.Object obj = this._dataSetList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataCCP4iDataSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDataFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vDataFile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataFileList.size()) {
            throw new IndexOutOfBoundsException("setDataFile: Index value '" + index + "' not in range [0.." + (this._dataFileList.size() - 1) + "]");
        }

        this._dataFileList.set(index, vDataFile);
    }

    /**
     * 
     * 
     * @param vDataFileArray
     */
    public void setDataFile(
            final org.edna.mxv1.xsdata.XSDataFile[] vDataFileArray) {
        //-- copy array
        _dataFileList.clear();

        for (int i = 0; i < vDataFileArray.length; i++) {
                this._dataFileList.add(vDataFileArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vDataSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataSet(
            final int index,
            final org.edna.mxv1.xsdata.XSDataCCP4iDataSet vDataSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataSetList.size()) {
            throw new IndexOutOfBoundsException("setDataSet: Index value '" + index + "' not in range [0.." + (this._dataSetList.size() - 1) + "]");
        }

        this._dataSetList.set(index, vDataSet);
    }

    /**
     * 
     * 
     * @param vDataSetArray
     */
    public void setDataSet(
            final org.edna.mxv1.xsdata.XSDataCCP4iDataSet[] vDataSetArray) {
        //-- copy array
        _dataSetList.clear();

        for (int i = 0; i < vDataSetArray.length; i++) {
                this._dataSetList.add(vDataSetArray[i]);
        }
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
     * Method unmarshalXSDataInputCCP4i.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataInputCCP4i
     */
    public static org.edna.mxv1.xsdata.XSDataInputCCP4i unmarshalXSDataInputCCP4i(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataInputCCP4i) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataInputCCP4i.class, reader);
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
