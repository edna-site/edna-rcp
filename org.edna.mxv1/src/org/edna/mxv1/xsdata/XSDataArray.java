/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataArray.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataArray extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _shapeList.
     */
    private java.util.List<java.lang.Integer> _shapeList;

    /**
     * Field _size.
     */
    private int _size;

    /**
     * keeps track of state for field: _size
     */
    private boolean _has_size;

    /**
     * Field _dtype.
     */
    private java.lang.String _dtype;

    /**
     * Field _data.
     */
    private java.lang.String _data;

    /**
     * Field _coding.
     */
    private org.edna.mxv1.xsdata.XSDataString _coding;

    /**
     * Field _md5sum.
     */
    private org.edna.mxv1.xsdata.XSDataString _md5sum;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataArray() {
        super();
        this._shapeList = new java.util.ArrayList<java.lang.Integer>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vShape
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShape(
            final int vShape)
    throws java.lang.IndexOutOfBoundsException {
        this._shapeList.add(new java.lang.Integer(vShape));
    }

    /**
     * 
     * 
     * @param index
     * @param vShape
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShape(
            final int index,
            final int vShape)
    throws java.lang.IndexOutOfBoundsException {
        this._shapeList.add(index, new java.lang.Integer(vShape));
    }

    /**
     */
    public void deleteSize(
    ) {
        this._has_size= false;
    }

    /**
     * Method enumerateShape.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.Integer> enumerateShape(
    ) {
        return java.util.Collections.enumeration(this._shapeList);
    }

    /**
     * Returns the value of field 'coding'.
     * 
     * @return the value of field 'Coding'.
     */
    public org.edna.mxv1.xsdata.XSDataString getCoding(
    ) {
        return this._coding;
    }

    /**
     * Returns the value of field 'data'.
     * 
     * @return the value of field 'Data'.
     */
    public java.lang.String getData(
    ) {
        return this._data;
    }

    /**
     * Returns the value of field 'dtype'.
     * 
     * @return the value of field 'Dtype'.
     */
    public java.lang.String getDtype(
    ) {
        return this._dtype;
    }

    /**
     * Returns the value of field 'md5sum'.
     * 
     * @return the value of field 'Md5sum'.
     */
    public org.edna.mxv1.xsdata.XSDataString getMd5sum(
    ) {
        return this._md5sum;
    }

    /**
     * Method getShape.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the int at the given index
     */
    public int getShape(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shapeList.size()) {
            throw new IndexOutOfBoundsException("getShape: Index value '" + index + "' not in range [0.." + (this._shapeList.size() - 1) + "]");
        }

        return ((java.lang.Integer) _shapeList.get(index)).intValue();
    }

    /**
     * Method getShape.Returns the contents of the collection in an
     * Array.  
     * 
     * @return this collection as an Array
     */
    public int[] getShape(
    ) {
        int size = this._shapeList.size();
        int[] array = new int[size];
        java.util.Iterator iter = _shapeList.iterator();
        for (int index = 0; index < size; index++) {
            array[index] = ((java.lang.Integer) iter.next()).intValue();
        }
        return array;
    }

    /**
     * Method getShapeCount.
     * 
     * @return the size of this collection
     */
    public int getShapeCount(
    ) {
        return this._shapeList.size();
    }

    /**
     * Returns the value of field 'size'.
     * 
     * @return the value of field 'Size'.
     */
    public int getSize(
    ) {
        return this._size;
    }

    /**
     * Method hasSize.
     * 
     * @return true if at least one Size has been added
     */
    public boolean hasSize(
    ) {
        return this._has_size;
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
     * Method iterateShape.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.Integer> iterateShape(
    ) {
        return this._shapeList.iterator();
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
    public void removeAllShape(
    ) {
        this._shapeList.clear();
    }

    /**
     * Method removeShape.
     * 
     * @param vShape
     * @return true if the object was removed from the collection.
     */
    public boolean removeShape(
            final int vShape) {
        boolean removed = _shapeList.remove(new java.lang.Integer(vShape));
        return removed;
    }

    /**
     * Method removeShapeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public int removeShapeAt(
            final int index) {
        java.lang.Object obj = this._shapeList.remove(index);
        return ((java.lang.Integer) obj).intValue();
    }

    /**
     * Sets the value of field 'coding'.
     * 
     * @param coding the value of field 'coding'.
     */
    public void setCoding(
            final org.edna.mxv1.xsdata.XSDataString coding) {
        this._coding = coding;
    }

    /**
     * Sets the value of field 'data'.
     * 
     * @param data the value of field 'data'.
     */
    public void setData(
            final java.lang.String data) {
        this._data = data;
    }

    /**
     * Sets the value of field 'dtype'.
     * 
     * @param dtype the value of field 'dtype'.
     */
    public void setDtype(
            final java.lang.String dtype) {
        this._dtype = dtype;
    }

    /**
     * Sets the value of field 'md5sum'.
     * 
     * @param md5sum the value of field 'md5sum'.
     */
    public void setMd5sum(
            final org.edna.mxv1.xsdata.XSDataString md5sum) {
        this._md5sum = md5sum;
    }

    /**
     * 
     * 
     * @param index
     * @param vShape
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setShape(
            final int index,
            final int vShape)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shapeList.size()) {
            throw new IndexOutOfBoundsException("setShape: Index value '" + index + "' not in range [0.." + (this._shapeList.size() - 1) + "]");
        }

        this._shapeList.set(index, new java.lang.Integer(vShape));
    }

    /**
     * 
     * 
     * @param vShapeArray
     */
    public void setShape(
            final int[] vShapeArray) {
        //-- copy array
        _shapeList.clear();

        for (int i = 0; i < vShapeArray.length; i++) {
                this._shapeList.add(new java.lang.Integer(vShapeArray[i]));
        }
    }

    /**
     * Sets the value of field 'size'.
     * 
     * @param size the value of field 'size'.
     */
    public void setSize(
            final int size) {
        this._size = size;
        this._has_size = true;
    }

    /**
     * Method unmarshalXSDataArray.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataArray
     */
    public static org.edna.mxv1.xsdata.XSDataArray unmarshalXSDataArray(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataArray) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataArray.class, reader);
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
