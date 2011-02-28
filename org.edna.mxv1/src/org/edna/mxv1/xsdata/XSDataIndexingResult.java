/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIndexingResult.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIndexingResult extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _imageList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataImage> _imageList;

    /**
     * Field _indexingLogFile.
     */
    private org.edna.mxv1.xsdata.XSDataFile _indexingLogFile;

    /**
     * Field _predictionResult.
     */
    private org.edna.mxv1.xsdata.XSDataGeneratePredictionResult _predictionResult;

    /**
     * Field _selectedSolution.
     */
    private org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected _selectedSolution;

    /**
     * Field _solutionList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataIndexingSolution> _solutionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIndexingResult() {
        super();
        this._imageList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataImage>();
        this._solutionList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataIndexingSolution>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImage(
            final org.edna.mxv1.xsdata.XSDataImage vImage)
    throws java.lang.IndexOutOfBoundsException {
        this._imageList.add(vImage);
    }

    /**
     * 
     * 
     * @param index
     * @param vImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImage(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImage vImage)
    throws java.lang.IndexOutOfBoundsException {
        this._imageList.add(index, vImage);
    }

    /**
     * 
     * 
     * @param vSolution
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSolution(
            final org.edna.mxv1.xsdata.XSDataIndexingSolution vSolution)
    throws java.lang.IndexOutOfBoundsException {
        this._solutionList.add(vSolution);
    }

    /**
     * 
     * 
     * @param index
     * @param vSolution
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSolution(
            final int index,
            final org.edna.mxv1.xsdata.XSDataIndexingSolution vSolution)
    throws java.lang.IndexOutOfBoundsException {
        this._solutionList.add(index, vSolution);
    }

    /**
     * Method enumerateImage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataImage> enumerateImage(
    ) {
        return java.util.Collections.enumeration(this._imageList);
    }

    /**
     * Method enumerateSolution.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataIndexingSolution> enumerateSolution(
    ) {
        return java.util.Collections.enumeration(this._solutionList);
    }

    /**
     * Method getImage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataImage at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataImage getImage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageList.size()) {
            throw new IndexOutOfBoundsException("getImage: Index value '" + index + "' not in range [0.." + (this._imageList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataImage) _imageList.get(index);
    }

    /**
     * Method getImage.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataImage[] getImage(
    ) {
        org.edna.mxv1.xsdata.XSDataImage[] array = new org.edna.mxv1.xsdata.XSDataImage[0];
        return (org.edna.mxv1.xsdata.XSDataImage[]) this._imageList.toArray(array);
    }

    /**
     * Method getImageCount.
     * 
     * @return the size of this collection
     */
    public int getImageCount(
    ) {
        return this._imageList.size();
    }

    /**
     * Returns the value of field 'indexingLogFile'.
     * 
     * @return the value of field 'IndexingLogFile'.
     */
    public org.edna.mxv1.xsdata.XSDataFile getIndexingLogFile(
    ) {
        return this._indexingLogFile;
    }

    /**
     * Returns the value of field 'predictionResult'.
     * 
     * @return the value of field 'PredictionResult'.
     */
    public org.edna.mxv1.xsdata.XSDataGeneratePredictionResult getPredictionResult(
    ) {
        return this._predictionResult;
    }

    /**
     * Returns the value of field 'selectedSolution'.
     * 
     * @return the value of field 'SelectedSolution'.
     */
    public org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected getSelectedSolution(
    ) {
        return this._selectedSolution;
    }

    /**
     * Method getSolution.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataIndexingSolution at the given inde
     */
    public org.edna.mxv1.xsdata.XSDataIndexingSolution getSolution(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._solutionList.size()) {
            throw new IndexOutOfBoundsException("getSolution: Index value '" + index + "' not in range [0.." + (this._solutionList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataIndexingSolution) _solutionList.get(index);
    }

    /**
     * Method getSolution.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataIndexingSolution[] getSolution(
    ) {
        org.edna.mxv1.xsdata.XSDataIndexingSolution[] array = new org.edna.mxv1.xsdata.XSDataIndexingSolution[0];
        return (org.edna.mxv1.xsdata.XSDataIndexingSolution[]) this._solutionList.toArray(array);
    }

    /**
     * Method getSolutionCount.
     * 
     * @return the size of this collection
     */
    public int getSolutionCount(
    ) {
        return this._solutionList.size();
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
     * Method iterateImage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataImage> iterateImage(
    ) {
        return this._imageList.iterator();
    }

    /**
     * Method iterateSolution.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataIndexingSolution> iterateSolution(
    ) {
        return this._solutionList.iterator();
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
    public void removeAllImage(
    ) {
        this._imageList.clear();
    }

    /**
     */
    public void removeAllSolution(
    ) {
        this._solutionList.clear();
    }

    /**
     * Method removeImage.
     * 
     * @param vImage
     * @return true if the object was removed from the collection.
     */
    public boolean removeImage(
            final org.edna.mxv1.xsdata.XSDataImage vImage) {
        boolean removed = _imageList.remove(vImage);
        return removed;
    }

    /**
     * Method removeImageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataImage removeImageAt(
            final int index) {
        java.lang.Object obj = this._imageList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataImage) obj;
    }

    /**
     * Method removeSolution.
     * 
     * @param vSolution
     * @return true if the object was removed from the collection.
     */
    public boolean removeSolution(
            final org.edna.mxv1.xsdata.XSDataIndexingSolution vSolution) {
        boolean removed = _solutionList.remove(vSolution);
        return removed;
    }

    /**
     * Method removeSolutionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataIndexingSolution removeSolutionAt(
            final int index) {
        java.lang.Object obj = this._solutionList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataIndexingSolution) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImage(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImage vImage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageList.size()) {
            throw new IndexOutOfBoundsException("setImage: Index value '" + index + "' not in range [0.." + (this._imageList.size() - 1) + "]");
        }

        this._imageList.set(index, vImage);
    }

    /**
     * 
     * 
     * @param vImageArray
     */
    public void setImage(
            final org.edna.mxv1.xsdata.XSDataImage[] vImageArray) {
        //-- copy array
        _imageList.clear();

        for (int i = 0; i < vImageArray.length; i++) {
                this._imageList.add(vImageArray[i]);
        }
    }

    /**
     * Sets the value of field 'indexingLogFile'.
     * 
     * @param indexingLogFile the value of field 'indexingLogFile'.
     */
    public void setIndexingLogFile(
            final org.edna.mxv1.xsdata.XSDataFile indexingLogFile) {
        this._indexingLogFile = indexingLogFile;
    }

    /**
     * Sets the value of field 'predictionResult'.
     * 
     * @param predictionResult the value of field 'predictionResult'
     */
    public void setPredictionResult(
            final org.edna.mxv1.xsdata.XSDataGeneratePredictionResult predictionResult) {
        this._predictionResult = predictionResult;
    }

    /**
     * Sets the value of field 'selectedSolution'.
     * 
     * @param selectedSolution the value of field 'selectedSolution'
     */
    public void setSelectedSolution(
            final org.edna.mxv1.xsdata.XSDataIndexingSolutionSelected selectedSolution) {
        this._selectedSolution = selectedSolution;
    }

    /**
     * 
     * 
     * @param index
     * @param vSolution
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSolution(
            final int index,
            final org.edna.mxv1.xsdata.XSDataIndexingSolution vSolution)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._solutionList.size()) {
            throw new IndexOutOfBoundsException("setSolution: Index value '" + index + "' not in range [0.." + (this._solutionList.size() - 1) + "]");
        }

        this._solutionList.set(index, vSolution);
    }

    /**
     * 
     * 
     * @param vSolutionArray
     */
    public void setSolution(
            final org.edna.mxv1.xsdata.XSDataIndexingSolution[] vSolutionArray) {
        //-- copy array
        _solutionList.clear();

        for (int i = 0; i < vSolutionArray.length; i++) {
                this._solutionList.add(vSolutionArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataIndexingResult.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIndexingResult
     */
    public static org.edna.mxv1.xsdata.XSDataIndexingResult unmarshalXSDataIndexingResult(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIndexingResult) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIndexingResult.class, reader);
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
