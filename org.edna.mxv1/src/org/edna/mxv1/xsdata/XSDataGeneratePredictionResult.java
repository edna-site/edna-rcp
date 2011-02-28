/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataGeneratePredictionResult.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataGeneratePredictionResult extends org.edna.mxv1.xsdata.XSDataResult 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _predictionImageList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataImage> _predictionImageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataGeneratePredictionResult() {
        super();
        this._predictionImageList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataImage>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPredictionImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPredictionImage(
            final org.edna.mxv1.xsdata.XSDataImage vPredictionImage)
    throws java.lang.IndexOutOfBoundsException {
        this._predictionImageList.add(vPredictionImage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPredictionImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPredictionImage(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImage vPredictionImage)
    throws java.lang.IndexOutOfBoundsException {
        this._predictionImageList.add(index, vPredictionImage);
    }

    /**
     * Method enumeratePredictionImage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataImage> enumeratePredictionImage(
    ) {
        return java.util.Collections.enumeration(this._predictionImageList);
    }

    /**
     * Method getPredictionImage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataImage at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataImage getPredictionImage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._predictionImageList.size()) {
            throw new IndexOutOfBoundsException("getPredictionImage: Index value '" + index + "' not in range [0.." + (this._predictionImageList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataImage) _predictionImageList.get(index);
    }

    /**
     * Method getPredictionImage.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataImage[] getPredictionImage(
    ) {
        org.edna.mxv1.xsdata.XSDataImage[] array = new org.edna.mxv1.xsdata.XSDataImage[0];
        return (org.edna.mxv1.xsdata.XSDataImage[]) this._predictionImageList.toArray(array);
    }

    /**
     * Method getPredictionImageCount.
     * 
     * @return the size of this collection
     */
    public int getPredictionImageCount(
    ) {
        return this._predictionImageList.size();
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
     * Method iteratePredictionImage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataImage> iteratePredictionImage(
    ) {
        return this._predictionImageList.iterator();
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
    public void removeAllPredictionImage(
    ) {
        this._predictionImageList.clear();
    }

    /**
     * Method removePredictionImage.
     * 
     * @param vPredictionImage
     * @return true if the object was removed from the collection.
     */
    public boolean removePredictionImage(
            final org.edna.mxv1.xsdata.XSDataImage vPredictionImage) {
        boolean removed = _predictionImageList.remove(vPredictionImage);
        return removed;
    }

    /**
     * Method removePredictionImageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataImage removePredictionImageAt(
            final int index) {
        java.lang.Object obj = this._predictionImageList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataImage) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vPredictionImage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPredictionImage(
            final int index,
            final org.edna.mxv1.xsdata.XSDataImage vPredictionImage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._predictionImageList.size()) {
            throw new IndexOutOfBoundsException("setPredictionImage: Index value '" + index + "' not in range [0.." + (this._predictionImageList.size() - 1) + "]");
        }

        this._predictionImageList.set(index, vPredictionImage);
    }

    /**
     * 
     * 
     * @param vPredictionImageArray
     */
    public void setPredictionImage(
            final org.edna.mxv1.xsdata.XSDataImage[] vPredictionImageArray) {
        //-- copy array
        _predictionImageList.clear();

        for (int i = 0; i < vPredictionImageArray.length; i++) {
                this._predictionImageList.add(vPredictionImageArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataGeneratePredictionResult.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataGeneratePredictionResult
     */
    public static org.edna.mxv1.xsdata.XSDataGeneratePredictionResult unmarshalXSDataGeneratePredictionResult(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataGeneratePredictionResult) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataGeneratePredictionResult.class, reader);
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
