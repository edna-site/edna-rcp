/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataSubWedge.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataSubWedge extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _action.
     */
    private org.edna.mxv1.xsdata.XSDataString _action;

    /**
     * Field _experimentalCondition.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalCondition;

    /**
     * Field _imageList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataImage> _imageList;

    /**
     * Field _subWedgeNumber.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _subWedgeNumber;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataSubWedge() {
        super();
        this._imageList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataImage>();
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
     * Returns the value of field 'action'.
     * 
     * @return the value of field 'Action'.
     */
    public org.edna.mxv1.xsdata.XSDataString getAction(
    ) {
        return this._action;
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
     * Returns the value of field 'subWedgeNumber'.
     * 
     * @return the value of field 'SubWedgeNumber'.
     */
    public org.edna.mxv1.xsdata.XSDataInteger getSubWedgeNumber(
    ) {
        return this._subWedgeNumber;
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
     * Sets the value of field 'action'.
     * 
     * @param action the value of field 'action'.
     */
    public void setAction(
            final org.edna.mxv1.xsdata.XSDataString action) {
        this._action = action;
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
     * Sets the value of field 'subWedgeNumber'.
     * 
     * @param subWedgeNumber the value of field 'subWedgeNumber'.
     */
    public void setSubWedgeNumber(
            final org.edna.mxv1.xsdata.XSDataInteger subWedgeNumber) {
        this._subWedgeNumber = subWedgeNumber;
    }

    /**
     * Method unmarshalXSDataSubWedge.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataSubWedge
     */
    public static org.edna.mxv1.xsdata.XSDataSubWedge unmarshalXSDataSubWedge(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataSubWedge) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataSubWedge.class, reader);
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
