/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataAtomicComposition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataAtomicComposition extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _atomList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataAtom> _atomList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataAtomicComposition() {
        super();
        this._atomList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataAtom>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAtom
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAtom(
            final org.edna.mxv1.xsdata.XSDataAtom vAtom)
    throws java.lang.IndexOutOfBoundsException {
        this._atomList.add(vAtom);
    }

    /**
     * 
     * 
     * @param index
     * @param vAtom
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAtom(
            final int index,
            final org.edna.mxv1.xsdata.XSDataAtom vAtom)
    throws java.lang.IndexOutOfBoundsException {
        this._atomList.add(index, vAtom);
    }

    /**
     * Method enumerateAtom.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataAtom> enumerateAtom(
    ) {
        return java.util.Collections.enumeration(this._atomList);
    }

    /**
     * Method getAtom.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataAtom at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataAtom getAtom(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._atomList.size()) {
            throw new IndexOutOfBoundsException("getAtom: Index value '" + index + "' not in range [0.." + (this._atomList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataAtom) _atomList.get(index);
    }

    /**
     * Method getAtom.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataAtom[] getAtom(
    ) {
        org.edna.mxv1.xsdata.XSDataAtom[] array = new org.edna.mxv1.xsdata.XSDataAtom[0];
        return (org.edna.mxv1.xsdata.XSDataAtom[]) this._atomList.toArray(array);
    }

    /**
     * Method getAtomCount.
     * 
     * @return the size of this collection
     */
    public int getAtomCount(
    ) {
        return this._atomList.size();
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
     * Method iterateAtom.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataAtom> iterateAtom(
    ) {
        return this._atomList.iterator();
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
    public void removeAllAtom(
    ) {
        this._atomList.clear();
    }

    /**
     * Method removeAtom.
     * 
     * @param vAtom
     * @return true if the object was removed from the collection.
     */
    public boolean removeAtom(
            final org.edna.mxv1.xsdata.XSDataAtom vAtom) {
        boolean removed = _atomList.remove(vAtom);
        return removed;
    }

    /**
     * Method removeAtomAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataAtom removeAtomAt(
            final int index) {
        java.lang.Object obj = this._atomList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataAtom) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAtom
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAtom(
            final int index,
            final org.edna.mxv1.xsdata.XSDataAtom vAtom)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._atomList.size()) {
            throw new IndexOutOfBoundsException("setAtom: Index value '" + index + "' not in range [0.." + (this._atomList.size() - 1) + "]");
        }

        this._atomList.set(index, vAtom);
    }

    /**
     * 
     * 
     * @param vAtomArray
     */
    public void setAtom(
            final org.edna.mxv1.xsdata.XSDataAtom[] vAtomArray) {
        //-- copy array
        _atomList.clear();

        for (int i = 0; i < vAtomArray.length; i++) {
                this._atomList.add(vAtomArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataAtomicComposition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataAtomicComposition
     */
    public static org.edna.mxv1.xsdata.XSDataAtomicComposition unmarshalXSDataAtomicComposition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataAtomicComposition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataAtomicComposition.class, reader);
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
