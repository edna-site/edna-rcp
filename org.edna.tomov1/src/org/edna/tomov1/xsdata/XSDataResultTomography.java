/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.tomov1.xsdata;

/**
 * Class XSDataResultTomography.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResultTomography extends org.edna.tomov1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numberOfSlices.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _numberOfSlices;

    /**
     * Field _overallTimeForReconstruction.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _overallTimeForReconstruction;

    /**
     * Field _reconstructionImageHeight.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _reconstructionImageHeight;

    /**
     * Field _reconstructionImageWidth.
     */
    private org.edna.tomov1.xsdata.XSDataInteger _reconstructionImageWidth;

    /**
     * Field _reconstructionTimePerChunkList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSDataFloat> _reconstructionTimePerChunkList;

    /**
     * Field _sinogramCreationTimePerChunkList.
     */
    private java.util.List<org.edna.tomov1.xsdata.XSDataFloat> _sinogramCreationTimePerChunkList;

    /**
     * Field _sliceDirectory.
     */
    private org.edna.tomov1.xsdata.XSDataFile _sliceDirectory;

    /**
     * Field _voxelDepthScale.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _voxelDepthScale;

    /**
     * Field _voxelHeightScale.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _voxelHeightScale;

    /**
     * Field _voxelWidthScale.
     */
    private org.edna.tomov1.xsdata.XSDataFloat _voxelWidthScale;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResultTomography() {
        super();
        this._reconstructionTimePerChunkList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSDataFloat>();
        this._sinogramCreationTimePerChunkList = new java.util.ArrayList<org.edna.tomov1.xsdata.XSDataFloat>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vReconstructionTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReconstructionTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat vReconstructionTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        this._reconstructionTimePerChunkList.add(vReconstructionTimePerChunk);
    }

    /**
     * 
     * 
     * @param index
     * @param vReconstructionTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReconstructionTimePerChunk(
            final int index,
            final org.edna.tomov1.xsdata.XSDataFloat vReconstructionTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        this._reconstructionTimePerChunkList.add(index, vReconstructionTimePerChunk);
    }

    /**
     * 
     * 
     * @param vSinogramCreationTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSinogramCreationTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat vSinogramCreationTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        this._sinogramCreationTimePerChunkList.add(vSinogramCreationTimePerChunk);
    }

    /**
     * 
     * 
     * @param index
     * @param vSinogramCreationTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSinogramCreationTimePerChunk(
            final int index,
            final org.edna.tomov1.xsdata.XSDataFloat vSinogramCreationTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        this._sinogramCreationTimePerChunkList.add(index, vSinogramCreationTimePerChunk);
    }

    /**
     * Method enumerateReconstructionTimePerChunk.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSDataFloat> enumerateReconstructionTimePerChunk(
    ) {
        return java.util.Collections.enumeration(this._reconstructionTimePerChunkList);
    }

    /**
     * Method enumerateSinogramCreationTimePerChunk.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.tomov1.xsdata.XSDataFloat> enumerateSinogramCreationTimePerChunk(
    ) {
        return java.util.Collections.enumeration(this._sinogramCreationTimePerChunkList);
    }

    /**
     * Returns the value of field 'numberOfSlices'.
     * 
     * @return the value of field 'NumberOfSlices'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getNumberOfSlices(
    ) {
        return this._numberOfSlices;
    }

    /**
     * Returns the value of field 'overallTimeForReconstruction'.
     * 
     * @return the value of field 'OverallTimeForReconstruction'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getOverallTimeForReconstruction(
    ) {
        return this._overallTimeForReconstruction;
    }

    /**
     * Returns the value of field 'reconstructionImageHeight'.
     * 
     * @return the value of field 'ReconstructionImageHeight'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getReconstructionImageHeight(
    ) {
        return this._reconstructionImageHeight;
    }

    /**
     * Returns the value of field 'reconstructionImageWidth'.
     * 
     * @return the value of field 'ReconstructionImageWidth'.
     */
    public org.edna.tomov1.xsdata.XSDataInteger getReconstructionImageWidth(
    ) {
        return this._reconstructionImageWidth;
    }

    /**
     * Method getReconstructionTimePerChunk.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.tomov1.xsdata.XSDataFloat
     * at the given index
     */
    public org.edna.tomov1.xsdata.XSDataFloat getReconstructionTimePerChunk(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reconstructionTimePerChunkList.size()) {
            throw new IndexOutOfBoundsException("getReconstructionTimePerChunk: Index value '" + index + "' not in range [0.." + (this._reconstructionTimePerChunkList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSDataFloat) _reconstructionTimePerChunkList.get(index);
    }

    /**
     * Method getReconstructionTimePerChunk.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSDataFloat[] getReconstructionTimePerChunk(
    ) {
        org.edna.tomov1.xsdata.XSDataFloat[] array = new org.edna.tomov1.xsdata.XSDataFloat[0];
        return (org.edna.tomov1.xsdata.XSDataFloat[]) this._reconstructionTimePerChunkList.toArray(array);
    }

    /**
     * Method getReconstructionTimePerChunkCount.
     * 
     * @return the size of this collection
     */
    public int getReconstructionTimePerChunkCount(
    ) {
        return this._reconstructionTimePerChunkList.size();
    }

    /**
     * Method getSinogramCreationTimePerChunk.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.tomov1.xsdata.XSDataFloat
     * at the given index
     */
    public org.edna.tomov1.xsdata.XSDataFloat getSinogramCreationTimePerChunk(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sinogramCreationTimePerChunkList.size()) {
            throw new IndexOutOfBoundsException("getSinogramCreationTimePerChunk: Index value '" + index + "' not in range [0.." + (this._sinogramCreationTimePerChunkList.size() - 1) + "]");
        }

        return (org.edna.tomov1.xsdata.XSDataFloat) _sinogramCreationTimePerChunkList.get(index);
    }

    /**
     * Method getSinogramCreationTimePerChunk.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.tomov1.xsdata.XSDataFloat[] getSinogramCreationTimePerChunk(
    ) {
        org.edna.tomov1.xsdata.XSDataFloat[] array = new org.edna.tomov1.xsdata.XSDataFloat[0];
        return (org.edna.tomov1.xsdata.XSDataFloat[]) this._sinogramCreationTimePerChunkList.toArray(array);
    }

    /**
     * Method getSinogramCreationTimePerChunkCount.
     * 
     * @return the size of this collection
     */
    public int getSinogramCreationTimePerChunkCount(
    ) {
        return this._sinogramCreationTimePerChunkList.size();
    }

    /**
     * Returns the value of field 'sliceDirectory'.
     * 
     * @return the value of field 'SliceDirectory'.
     */
    public org.edna.tomov1.xsdata.XSDataFile getSliceDirectory(
    ) {
        return this._sliceDirectory;
    }

    /**
     * Returns the value of field 'voxelDepthScale'.
     * 
     * @return the value of field 'VoxelDepthScale'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getVoxelDepthScale(
    ) {
        return this._voxelDepthScale;
    }

    /**
     * Returns the value of field 'voxelHeightScale'.
     * 
     * @return the value of field 'VoxelHeightScale'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getVoxelHeightScale(
    ) {
        return this._voxelHeightScale;
    }

    /**
     * Returns the value of field 'voxelWidthScale'.
     * 
     * @return the value of field 'VoxelWidthScale'.
     */
    public org.edna.tomov1.xsdata.XSDataFloat getVoxelWidthScale(
    ) {
        return this._voxelWidthScale;
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
     * Method iterateReconstructionTimePerChunk.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSDataFloat> iterateReconstructionTimePerChunk(
    ) {
        return this._reconstructionTimePerChunkList.iterator();
    }

    /**
     * Method iterateSinogramCreationTimePerChunk.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.tomov1.xsdata.XSDataFloat> iterateSinogramCreationTimePerChunk(
    ) {
        return this._sinogramCreationTimePerChunkList.iterator();
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
    public void removeAllReconstructionTimePerChunk(
    ) {
        this._reconstructionTimePerChunkList.clear();
    }

    /**
     */
    public void removeAllSinogramCreationTimePerChunk(
    ) {
        this._sinogramCreationTimePerChunkList.clear();
    }

    /**
     * Method removeReconstructionTimePerChunk.
     * 
     * @param vReconstructionTimePerChunk
     * @return true if the object was removed from the collection.
     */
    public boolean removeReconstructionTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat vReconstructionTimePerChunk) {
        boolean removed = _reconstructionTimePerChunkList.remove(vReconstructionTimePerChunk);
        return removed;
    }

    /**
     * Method removeReconstructionTimePerChunkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSDataFloat removeReconstructionTimePerChunkAt(
            final int index) {
        java.lang.Object obj = this._reconstructionTimePerChunkList.remove(index);
        return (org.edna.tomov1.xsdata.XSDataFloat) obj;
    }

    /**
     * Method removeSinogramCreationTimePerChunk.
     * 
     * @param vSinogramCreationTimePerChunk
     * @return true if the object was removed from the collection.
     */
    public boolean removeSinogramCreationTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat vSinogramCreationTimePerChunk) {
        boolean removed = _sinogramCreationTimePerChunkList.remove(vSinogramCreationTimePerChunk);
        return removed;
    }

    /**
     * Method removeSinogramCreationTimePerChunkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.tomov1.xsdata.XSDataFloat removeSinogramCreationTimePerChunkAt(
            final int index) {
        java.lang.Object obj = this._sinogramCreationTimePerChunkList.remove(index);
        return (org.edna.tomov1.xsdata.XSDataFloat) obj;
    }

    /**
     * Sets the value of field 'numberOfSlices'.
     * 
     * @param numberOfSlices the value of field 'numberOfSlices'.
     */
    public void setNumberOfSlices(
            final org.edna.tomov1.xsdata.XSDataInteger numberOfSlices) {
        this._numberOfSlices = numberOfSlices;
    }

    /**
     * Sets the value of field 'overallTimeForReconstruction'.
     * 
     * @param overallTimeForReconstruction the value of field
     * 'overallTimeForReconstruction'.
     */
    public void setOverallTimeForReconstruction(
            final org.edna.tomov1.xsdata.XSDataFloat overallTimeForReconstruction) {
        this._overallTimeForReconstruction = overallTimeForReconstruction;
    }

    /**
     * Sets the value of field 'reconstructionImageHeight'.
     * 
     * @param reconstructionImageHeight the value of field
     * 'reconstructionImageHeight'.
     */
    public void setReconstructionImageHeight(
            final org.edna.tomov1.xsdata.XSDataInteger reconstructionImageHeight) {
        this._reconstructionImageHeight = reconstructionImageHeight;
    }

    /**
     * Sets the value of field 'reconstructionImageWidth'.
     * 
     * @param reconstructionImageWidth the value of field
     * 'reconstructionImageWidth'.
     */
    public void setReconstructionImageWidth(
            final org.edna.tomov1.xsdata.XSDataInteger reconstructionImageWidth) {
        this._reconstructionImageWidth = reconstructionImageWidth;
    }

    /**
     * 
     * 
     * @param index
     * @param vReconstructionTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReconstructionTimePerChunk(
            final int index,
            final org.edna.tomov1.xsdata.XSDataFloat vReconstructionTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reconstructionTimePerChunkList.size()) {
            throw new IndexOutOfBoundsException("setReconstructionTimePerChunk: Index value '" + index + "' not in range [0.." + (this._reconstructionTimePerChunkList.size() - 1) + "]");
        }

        this._reconstructionTimePerChunkList.set(index, vReconstructionTimePerChunk);
    }

    /**
     * 
     * 
     * @param vReconstructionTimePerChunkArray
     */
    public void setReconstructionTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat[] vReconstructionTimePerChunkArray) {
        //-- copy array
        _reconstructionTimePerChunkList.clear();

        for (int i = 0; i < vReconstructionTimePerChunkArray.length; i++) {
                this._reconstructionTimePerChunkList.add(vReconstructionTimePerChunkArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSinogramCreationTimePerChunk
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSinogramCreationTimePerChunk(
            final int index,
            final org.edna.tomov1.xsdata.XSDataFloat vSinogramCreationTimePerChunk)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sinogramCreationTimePerChunkList.size()) {
            throw new IndexOutOfBoundsException("setSinogramCreationTimePerChunk: Index value '" + index + "' not in range [0.." + (this._sinogramCreationTimePerChunkList.size() - 1) + "]");
        }

        this._sinogramCreationTimePerChunkList.set(index, vSinogramCreationTimePerChunk);
    }

    /**
     * 
     * 
     * @param vSinogramCreationTimePerChunkArray
     */
    public void setSinogramCreationTimePerChunk(
            final org.edna.tomov1.xsdata.XSDataFloat[] vSinogramCreationTimePerChunkArray) {
        //-- copy array
        _sinogramCreationTimePerChunkList.clear();

        for (int i = 0; i < vSinogramCreationTimePerChunkArray.length; i++) {
                this._sinogramCreationTimePerChunkList.add(vSinogramCreationTimePerChunkArray[i]);
        }
    }

    /**
     * Sets the value of field 'sliceDirectory'.
     * 
     * @param sliceDirectory the value of field 'sliceDirectory'.
     */
    public void setSliceDirectory(
            final org.edna.tomov1.xsdata.XSDataFile sliceDirectory) {
        this._sliceDirectory = sliceDirectory;
    }

    /**
     * Sets the value of field 'voxelDepthScale'.
     * 
     * @param voxelDepthScale the value of field 'voxelDepthScale'.
     */
    public void setVoxelDepthScale(
            final org.edna.tomov1.xsdata.XSDataFloat voxelDepthScale) {
        this._voxelDepthScale = voxelDepthScale;
    }

    /**
     * Sets the value of field 'voxelHeightScale'.
     * 
     * @param voxelHeightScale the value of field 'voxelHeightScale'
     */
    public void setVoxelHeightScale(
            final org.edna.tomov1.xsdata.XSDataFloat voxelHeightScale) {
        this._voxelHeightScale = voxelHeightScale;
    }

    /**
     * Sets the value of field 'voxelWidthScale'.
     * 
     * @param voxelWidthScale the value of field 'voxelWidthScale'.
     */
    public void setVoxelWidthScale(
            final org.edna.tomov1.xsdata.XSDataFloat voxelWidthScale) {
        this._voxelWidthScale = voxelWidthScale;
    }

    /**
     * Method unmarshalXSDataResultTomography.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.tomov1.xsdata.XSDataResultTomography
     */
    public static org.edna.tomov1.xsdata.XSDataResultTomography unmarshalXSDataResultTomography(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.tomov1.xsdata.XSDataResultTomography) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.tomov1.xsdata.XSDataResultTomography.class, reader);
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
