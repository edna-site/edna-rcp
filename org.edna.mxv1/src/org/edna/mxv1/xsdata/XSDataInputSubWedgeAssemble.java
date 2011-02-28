/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataInputSubWedgeAssemble.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataInputSubWedgeAssemble extends org.edna.mxv1.xsdata.XSDataInput 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fileList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataFile> _fileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataInputSubWedgeAssemble() {
        super();
        this._fileList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataFile>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFile(
            final org.edna.mxv1.xsdata.XSDataFile vFile)
    throws java.lang.IndexOutOfBoundsException {
        this._fileList.add(vFile);
    }

    /**
     * 
     * 
     * @param index
     * @param vFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vFile)
    throws java.lang.IndexOutOfBoundsException {
        this._fileList.add(index, vFile);
    }

    /**
     * Method enumerateFile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataFile> enumerateFile(
    ) {
        return java.util.Collections.enumeration(this._fileList);
    }

    /**
     * Method getFile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataFile at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataFile getFile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fileList.size()) {
            throw new IndexOutOfBoundsException("getFile: Index value '" + index + "' not in range [0.." + (this._fileList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataFile) _fileList.get(index);
    }

    /**
     * Method getFile.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataFile[] getFile(
    ) {
        org.edna.mxv1.xsdata.XSDataFile[] array = new org.edna.mxv1.xsdata.XSDataFile[0];
        return (org.edna.mxv1.xsdata.XSDataFile[]) this._fileList.toArray(array);
    }

    /**
     * Method getFileCount.
     * 
     * @return the size of this collection
     */
    public int getFileCount(
    ) {
        return this._fileList.size();
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
     * Method iterateFile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataFile> iterateFile(
    ) {
        return this._fileList.iterator();
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
    public void removeAllFile(
    ) {
        this._fileList.clear();
    }

    /**
     * Method removeFile.
     * 
     * @param vFile
     * @return true if the object was removed from the collection.
     */
    public boolean removeFile(
            final org.edna.mxv1.xsdata.XSDataFile vFile) {
        boolean removed = _fileList.remove(vFile);
        return removed;
    }

    /**
     * Method removeFileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataFile removeFileAt(
            final int index) {
        java.lang.Object obj = this._fileList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataFile) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFile(
            final int index,
            final org.edna.mxv1.xsdata.XSDataFile vFile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fileList.size()) {
            throw new IndexOutOfBoundsException("setFile: Index value '" + index + "' not in range [0.." + (this._fileList.size() - 1) + "]");
        }

        this._fileList.set(index, vFile);
    }

    /**
     * 
     * 
     * @param vFileArray
     */
    public void setFile(
            final org.edna.mxv1.xsdata.XSDataFile[] vFileArray) {
        //-- copy array
        _fileList.clear();

        for (int i = 0; i < vFileArray.length; i++) {
                this._fileList.add(vFileArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataInputSubWedgeAssemble.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataInputSubWedgeAssemble
     */
    public static org.edna.mxv1.xsdata.XSDataInputSubWedgeAssemble unmarshalXSDataInputSubWedgeAssemble(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataInputSubWedgeAssemble) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataInputSubWedgeAssemble.class, reader);
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
