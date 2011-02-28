/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataResultCharacterisation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataResultCharacterisation extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataCollection.
     */
    private org.edna.mxv1.xsdata.XSDataCollection _dataCollection;

    /**
     * Field _imageQualityIndicatorsList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataImageQualityIndicators> _imageQualityIndicatorsList;

    /**
     * Field _indexingResult.
     */
    private org.edna.mxv1.xsdata.XSDataIndexingResult _indexingResult;

    /**
     * Field _integrationResult.
     */
    private org.edna.mxv1.xsdata.XSDataIntegrationResult _integrationResult;

    /**
     * Field _strategyResult.
     */
    private org.edna.mxv1.xsdata.XSDataResultStrategy _strategyResult;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataResultCharacterisation() {
        super();
        this._imageQualityIndicatorsList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataImageQualityIndicators>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImageQualityIndicators
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImageQualityIndicators(
            final org.edna.mxv1.xsdata.XSDataImageQualityIndicators vImageQualityIndicators)
    throws java.lang.IndexOutOfBoundsException {
        this._imageQualityIndicatorsList.add(vImageQualityIndicators);
    }

    /**
     * 
     * 
     * @param index
     * @param vImageQualityIndicators
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImageQualityIndicators(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImageQualityIndicators vImageQualityIndicators)
    throws java.lang.IndexOutOfBoundsException {
        this._imageQualityIndicatorsList.add(index, vImageQualityIndicators);
    }

    /**
     * Method enumerateImageQualityIndicators.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataImageQualityIndicators> enumerateImageQualityIndicators(
    ) {
        return java.util.Collections.enumeration(this._imageQualityIndicatorsList);
    }

    /**
     * Returns the value of field 'dataCollection'.
     * 
     * @return the value of field 'DataCollection'.
     */
    public org.edna.mxv1.xsdata.XSDataCollection getDataCollection(
    ) {
        return this._dataCollection;
    }

    /**
     * Method getImageQualityIndicators.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataImageQualityIndicators at the
     * given index
     */
    public org.edna.mxv1.xsdata.XSDataImageQualityIndicators getImageQualityIndicators(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageQualityIndicatorsList.size()) {
            throw new IndexOutOfBoundsException("getImageQualityIndicators: Index value '" + index + "' not in range [0.." + (this._imageQualityIndicatorsList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataImageQualityIndicators) _imageQualityIndicatorsList.get(index);
    }

    /**
     * Method getImageQualityIndicators.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataImageQualityIndicators[] getImageQualityIndicators(
    ) {
        org.edna.mxv1.xsdata.XSDataImageQualityIndicators[] array = new org.edna.mxv1.xsdata.XSDataImageQualityIndicators[0];
        return (org.edna.mxv1.xsdata.XSDataImageQualityIndicators[]) this._imageQualityIndicatorsList.toArray(array);
    }

    /**
     * Method getImageQualityIndicatorsCount.
     * 
     * @return the size of this collection
     */
    public int getImageQualityIndicatorsCount(
    ) {
        return this._imageQualityIndicatorsList.size();
    }

    /**
     * Returns the value of field 'indexingResult'.
     * 
     * @return the value of field 'IndexingResult'.
     */
    public org.edna.mxv1.xsdata.XSDataIndexingResult getIndexingResult(
    ) {
        return this._indexingResult;
    }

    /**
     * Returns the value of field 'integrationResult'.
     * 
     * @return the value of field 'IntegrationResult'.
     */
    public org.edna.mxv1.xsdata.XSDataIntegrationResult getIntegrationResult(
    ) {
        return this._integrationResult;
    }

    /**
     * Returns the value of field 'strategyResult'.
     * 
     * @return the value of field 'StrategyResult'.
     */
    public org.edna.mxv1.xsdata.XSDataResultStrategy getStrategyResult(
    ) {
        return this._strategyResult;
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
     * Method iterateImageQualityIndicators.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataImageQualityIndicators> iterateImageQualityIndicators(
    ) {
        return this._imageQualityIndicatorsList.iterator();
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
    public void removeAllImageQualityIndicators(
    ) {
        this._imageQualityIndicatorsList.clear();
    }

    /**
     * Method removeImageQualityIndicators.
     * 
     * @param vImageQualityIndicators
     * @return true if the object was removed from the collection.
     */
    public boolean removeImageQualityIndicators(
            final org.edna.mxv1.xsdata.XSDataImageQualityIndicators vImageQualityIndicators) {
        boolean removed = _imageQualityIndicatorsList.remove(vImageQualityIndicators);
        return removed;
    }

    /**
     * Method removeImageQualityIndicatorsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataImageQualityIndicators removeImageQualityIndicatorsAt(
            final int index) {
        java.lang.Object obj = this._imageQualityIndicatorsList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataImageQualityIndicators) obj;
    }

    /**
     * Sets the value of field 'dataCollection'.
     * 
     * @param dataCollection the value of field 'dataCollection'.
     */
    public void setDataCollection(
            final org.edna.mxv1.xsdata.XSDataCollection dataCollection) {
        this._dataCollection = dataCollection;
    }

    /**
     * 
     * 
     * @param index
     * @param vImageQualityIndicators
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImageQualityIndicators(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImageQualityIndicators vImageQualityIndicators)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageQualityIndicatorsList.size()) {
            throw new IndexOutOfBoundsException("setImageQualityIndicators: Index value '" + index + "' not in range [0.." + (this._imageQualityIndicatorsList.size() - 1) + "]");
        }

        this._imageQualityIndicatorsList.set(index, vImageQualityIndicators);
    }

    /**
     * 
     * 
     * @param vImageQualityIndicatorsArray
     */
    public void setImageQualityIndicators(
            final org.edna.mxv1.xsdata.XSDataImageQualityIndicators[] vImageQualityIndicatorsArray) {
        //-- copy array
        _imageQualityIndicatorsList.clear();

        for (int i = 0; i < vImageQualityIndicatorsArray.length; i++) {
                this._imageQualityIndicatorsList.add(vImageQualityIndicatorsArray[i]);
        }
    }

    /**
     * Sets the value of field 'indexingResult'.
     * 
     * @param indexingResult the value of field 'indexingResult'.
     */
    public void setIndexingResult(
            final org.edna.mxv1.xsdata.XSDataIndexingResult indexingResult) {
        this._indexingResult = indexingResult;
    }

    /**
     * Sets the value of field 'integrationResult'.
     * 
     * @param integrationResult the value of field
     * 'integrationResult'.
     */
    public void setIntegrationResult(
            final org.edna.mxv1.xsdata.XSDataIntegrationResult integrationResult) {
        this._integrationResult = integrationResult;
    }

    /**
     * Sets the value of field 'strategyResult'.
     * 
     * @param strategyResult the value of field 'strategyResult'.
     */
    public void setStrategyResult(
            final org.edna.mxv1.xsdata.XSDataResultStrategy strategyResult) {
        this._strategyResult = strategyResult;
    }

    /**
     * Method unmarshalXSDataResultCharacterisation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataResultCharacterisation
     */
    public static org.edna.mxv1.xsdata.XSDataResultCharacterisation unmarshalXSDataResultCharacterisation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataResultCharacterisation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataResultCharacterisation.class, reader);
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
