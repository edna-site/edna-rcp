/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataStatisticsStrategy.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataStatisticsStrategy extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resolutionBinList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataResolutionBin> _resolutionBinList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataStatisticsStrategy() {
        super();
        this._resolutionBinList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataResolutionBin>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolutionBin(
            final org.edna.mxv1.xsdata.XSDataResolutionBin vResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        this._resolutionBinList.add(vResolutionBin);
    }

    /**
     * 
     * 
     * @param index
     * @param vResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolutionBin(
            final int index,
            final org.edna.mxv1.xsdata.XSDataResolutionBin vResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        this._resolutionBinList.add(index, vResolutionBin);
    }

    /**
     * Method enumerateResolutionBin.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataResolutionBin> enumerateResolutionBin(
    ) {
        return java.util.Collections.enumeration(this._resolutionBinList);
    }

    /**
     * Method getResolutionBin.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataResolutionBin at the given index
     */
    public org.edna.mxv1.xsdata.XSDataResolutionBin getResolutionBin(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolutionBinList.size()) {
            throw new IndexOutOfBoundsException("getResolutionBin: Index value '" + index + "' not in range [0.." + (this._resolutionBinList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataResolutionBin) _resolutionBinList.get(index);
    }

    /**
     * Method getResolutionBin.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataResolutionBin[] getResolutionBin(
    ) {
        org.edna.mxv1.xsdata.XSDataResolutionBin[] array = new org.edna.mxv1.xsdata.XSDataResolutionBin[0];
        return (org.edna.mxv1.xsdata.XSDataResolutionBin[]) this._resolutionBinList.toArray(array);
    }

    /**
     * Method getResolutionBinCount.
     * 
     * @return the size of this collection
     */
    public int getResolutionBinCount(
    ) {
        return this._resolutionBinList.size();
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
     * Method iterateResolutionBin.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataResolutionBin> iterateResolutionBin(
    ) {
        return this._resolutionBinList.iterator();
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
    public void removeAllResolutionBin(
    ) {
        this._resolutionBinList.clear();
    }

    /**
     * Method removeResolutionBin.
     * 
     * @param vResolutionBin
     * @return true if the object was removed from the collection.
     */
    public boolean removeResolutionBin(
            final org.edna.mxv1.xsdata.XSDataResolutionBin vResolutionBin) {
        boolean removed = _resolutionBinList.remove(vResolutionBin);
        return removed;
    }

    /**
     * Method removeResolutionBinAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataResolutionBin removeResolutionBinAt(
            final int index) {
        java.lang.Object obj = this._resolutionBinList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataResolutionBin) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResolutionBin(
            final int index,
            final org.edna.mxv1.xsdata.XSDataResolutionBin vResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolutionBinList.size()) {
            throw new IndexOutOfBoundsException("setResolutionBin: Index value '" + index + "' not in range [0.." + (this._resolutionBinList.size() - 1) + "]");
        }

        this._resolutionBinList.set(index, vResolutionBin);
    }

    /**
     * 
     * 
     * @param vResolutionBinArray
     */
    public void setResolutionBin(
            final org.edna.mxv1.xsdata.XSDataResolutionBin[] vResolutionBinArray) {
        //-- copy array
        _resolutionBinList.clear();

        for (int i = 0; i < vResolutionBinArray.length; i++) {
                this._resolutionBinList.add(vResolutionBinArray[i]);
        }
    }

    /**
     * Method unmarshalXSDataStatisticsStrategy.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataStatisticsStrategy
     */
    public static org.edna.mxv1.xsdata.XSDataStatisticsStrategy unmarshalXSDataStatisticsStrategy(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataStatisticsStrategy) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataStatisticsStrategy.class, reader);
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
