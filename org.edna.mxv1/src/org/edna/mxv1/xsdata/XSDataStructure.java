/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStructure.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStructure extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _chainList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataChain> _chainList;

    /**
     * Field _ligandList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataLigand> _ligandList;

    /**
     * number of copies of the structure in the asymmetric unit
     */
    private org.edna.mxv1.xsdata.XSDataFloat _numberOfCopiesInAsymmetricUnit;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStructure() {
        super();
        this._chainList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataChain>();
        this._ligandList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataLigand>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vChain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addChain(
            final org.edna.mxv1.xsdata.XSDataChain vChain)
    throws java.lang.IndexOutOfBoundsException {
        this._chainList.add(vChain);
    }

    /**
     * 
     * 
     * @param index
     * @param vChain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addChain(
            final int index,
            final org.edna.mxv1.xsdata.XSDataChain vChain)
    throws java.lang.IndexOutOfBoundsException {
        this._chainList.add(index, vChain);
    }

    /**
     * 
     * 
     * @param vLigand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLigand(
            final org.edna.mxv1.xsdata.XSDataLigand vLigand)
    throws java.lang.IndexOutOfBoundsException {
        this._ligandList.add(vLigand);
    }

    /**
     * 
     * 
     * @param index
     * @param vLigand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLigand(
            final int index,
            final org.edna.mxv1.xsdata.XSDataLigand vLigand)
    throws java.lang.IndexOutOfBoundsException {
        this._ligandList.add(index, vLigand);
    }

    /**
     * Method enumerateChain.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataChain> enumerateChain(
    ) {
        return java.util.Collections.enumeration(this._chainList);
    }

    /**
     * Method enumerateLigand.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataLigand> enumerateLigand(
    ) {
        return java.util.Collections.enumeration(this._ligandList);
    }

    /**
     * Method getChain.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataChain at
     * the given index
     */
    public org.edna.mxv1.xsdata.XSDataChain getChain(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._chainList.size()) {
            throw new IndexOutOfBoundsException("getChain: Index value '" + index + "' not in range [0.." + (this._chainList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataChain) _chainList.get(index);
    }

    /**
     * Method getChain.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataChain[] getChain(
    ) {
        org.edna.mxv1.xsdata.XSDataChain[] array = new org.edna.mxv1.xsdata.XSDataChain[0];
        return (org.edna.mxv1.xsdata.XSDataChain[]) this._chainList.toArray(array);
    }

    /**
     * Method getChainCount.
     * 
     * @return the size of this collection
     */
    public int getChainCount(
    ) {
        return this._chainList.size();
    }

    /**
     * Method getLigand.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.edna.mxv1.xsdata.XSDataLigand
     * at the given index
     */
    public org.edna.mxv1.xsdata.XSDataLigand getLigand(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ligandList.size()) {
            throw new IndexOutOfBoundsException("getLigand: Index value '" + index + "' not in range [0.." + (this._ligandList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataLigand) _ligandList.get(index);
    }

    /**
     * Method getLigand.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataLigand[] getLigand(
    ) {
        org.edna.mxv1.xsdata.XSDataLigand[] array = new org.edna.mxv1.xsdata.XSDataLigand[0];
        return (org.edna.mxv1.xsdata.XSDataLigand[]) this._ligandList.toArray(array);
    }

    /**
     * Method getLigandCount.
     * 
     * @return the size of this collection
     */
    public int getLigandCount(
    ) {
        return this._ligandList.size();
    }

    /**
     * Returns the value of field 'numberOfCopiesInAsymmetricUnit'.
     * The field 'numberOfCopiesInAsymmetricUnit' has the following
     * description: number of copies of the structure in the
     * asymmetric unit
     * 
     * @return the value of field 'NumberOfCopiesInAsymmetricUnit'.
     */
    public org.edna.mxv1.xsdata.XSDataFloat getNumberOfCopiesInAsymmetricUnit(
    ) {
        return this._numberOfCopiesInAsymmetricUnit;
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
     * Method iterateChain.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataChain> iterateChain(
    ) {
        return this._chainList.iterator();
    }

    /**
     * Method iterateLigand.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataLigand> iterateLigand(
    ) {
        return this._ligandList.iterator();
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
    public void removeAllChain(
    ) {
        this._chainList.clear();
    }

    /**
     */
    public void removeAllLigand(
    ) {
        this._ligandList.clear();
    }

    /**
     * Method removeChain.
     * 
     * @param vChain
     * @return true if the object was removed from the collection.
     */
    public boolean removeChain(
            final org.edna.mxv1.xsdata.XSDataChain vChain) {
        boolean removed = _chainList.remove(vChain);
        return removed;
    }

    /**
     * Method removeChainAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataChain removeChainAt(
            final int index) {
        java.lang.Object obj = this._chainList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataChain) obj;
    }

    /**
     * Method removeLigand.
     * 
     * @param vLigand
     * @return true if the object was removed from the collection.
     */
    public boolean removeLigand(
            final org.edna.mxv1.xsdata.XSDataLigand vLigand) {
        boolean removed = _ligandList.remove(vLigand);
        return removed;
    }

    /**
     * Method removeLigandAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataLigand removeLigandAt(
            final int index) {
        java.lang.Object obj = this._ligandList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataLigand) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vChain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setChain(
            final int index,
            final org.edna.mxv1.xsdata.XSDataChain vChain)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._chainList.size()) {
            throw new IndexOutOfBoundsException("setChain: Index value '" + index + "' not in range [0.." + (this._chainList.size() - 1) + "]");
        }

        this._chainList.set(index, vChain);
    }

    /**
     * 
     * 
     * @param vChainArray
     */
    public void setChain(
            final org.edna.mxv1.xsdata.XSDataChain[] vChainArray) {
        //-- copy array
        _chainList.clear();

        for (int i = 0; i < vChainArray.length; i++) {
                this._chainList.add(vChainArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vLigand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLigand(
            final int index,
            final org.edna.mxv1.xsdata.XSDataLigand vLigand)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ligandList.size()) {
            throw new IndexOutOfBoundsException("setLigand: Index value '" + index + "' not in range [0.." + (this._ligandList.size() - 1) + "]");
        }

        this._ligandList.set(index, vLigand);
    }

    /**
     * 
     * 
     * @param vLigandArray
     */
    public void setLigand(
            final org.edna.mxv1.xsdata.XSDataLigand[] vLigandArray) {
        //-- copy array
        _ligandList.clear();

        for (int i = 0; i < vLigandArray.length; i++) {
                this._ligandList.add(vLigandArray[i]);
        }
    }

    /**
     * Sets the value of field 'numberOfCopiesInAsymmetricUnit'.
     * The field 'numberOfCopiesInAsymmetricUnit' has the following
     * description: number of copies of the structure in the
     * asymmetric unit
     * 
     * @param numberOfCopiesInAsymmetricUnit the value of field
     * 'numberOfCopiesInAsymmetricUnit'.
     */
    public void setNumberOfCopiesInAsymmetricUnit(
            final org.edna.mxv1.xsdata.XSDataFloat numberOfCopiesInAsymmetricUnit) {
        this._numberOfCopiesInAsymmetricUnit = numberOfCopiesInAsymmetricUnit;
    }

    /**
     * Method unmarshalXSDataStructure.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.edna.mxv1.xsdata.XSDataStructure
     */
    public static org.edna.mxv1.xsdata.XSDataStructure unmarshalXSDataStructure(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStructure) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStructure.class, reader);
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
