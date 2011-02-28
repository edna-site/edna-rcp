/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataCCP4iDataSet.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataCCP4iDataSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _imageFileList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataFile> _imageFileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataCCP4iDataSet() {
        super();
        this._imageFileList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataFile>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImageFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImageFile(
            final org.edna.mxv1.xsdata.XSDataFile vImageFile)
    throws java.lang.IndexOutOfBoundsException {
        this._imageFileList.add(vImageFile);
    }

    /**
     * 
     * 
     * @param index
     * @param vImageFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImageFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vImageFile)
    throws java.lang.IndexOutOfBoundsException {
        this._imageFileList.add(index, vImageFile);
    }

    /**
     * Method enumerateImageFile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataFile> enumerateImageFile(
    ) {
        return java.util.Collections.enumeration(this._imageFileList);
    }

    /**
     * Method getImageFile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataFile at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataFile getImageFile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageFileList.size()) {
            throw new IndexOutOfBoundsException("getImageFile: Index value '" + index + "' not in range [0.." + (this._imageFileList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataFile) _imageFileList.get(index);
    }

    /**
     * Method getImageFile.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataFile[] getImageFile(
    ) {
        org.edna.mxv1.xsdata.XSDataFile[] array = new org.edna.mxv1.xsdata.XSDataFile[0];
        return (org.edna.mxv1.xsdata.XSDataFile[]) this._imageFileList.toArray(array);
    }

    /**
     * Method getImageFileCount.
     * 
     * @return the size of this collection
     */
    public int getImageFileCount(
    ) {
        return this._imageFileList.size();
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
     * Method iterateImageFile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataFile> iterateImageFile(
    ) {
        return this._imageFileList.iterator();
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
    public void removeAllImageFile(
    ) {
        this._imageFileList.clear();
    }

    /**
     * Method removeImageFile.
     * 
     * @param vImageFile
     * @return true if the object was removed from the collection.
     */
    public boolean removeImageFile(
            final org.edna.mxv1.xsdata.XSDataFile vImageFile) {
        boolean removed = _imageFileList.remove(vImageFile);
        return removed;
    }

    /**
     * Method removeImageFileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataFile removeImageFileAt(
            final int index) {
        java.lang.Object obj = this._imageFileList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataFile) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vImageFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImageFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vImageFile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._imageFileList.size()) {
            throw new IndexOutOfBoundsException("setImageFile: Index value '" + index + "' not in range [0.." + (this._imageFileList.size() - 1) + "]");
        }

        this._imageFileList.set(index, vImageFile);
    }

    /**
     * 
     * 
     * @param vImageFileArray
     */
    public void setImageFile(
            final org.edna.mxv1.xsdata.XSDataFile[] vImageFileArray) {
        //-- copy array
        _imageFileList.clear();

        for (int i = 0; i < vImageFileArray.length; i++) {
                this._imageFileList.add(vImageFileArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataCCP4iDataSet.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataCCP4iDataSet
     */
    public static org.edna.mxv1.xsdata.XSDataCCP4iDataSet unmarshalXSDataCCP4iDataSet(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataCCP4iDataSet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataCCP4iDataSet.class, reader);
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
