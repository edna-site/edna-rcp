/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.edna.mxv1.xsdata;

/**
 * Class XSDataIntegrationSubWedgeResult.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class XSDataIntegrationSubWedgeResult extends org.edna.mxv1.xsdata.XSData 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bestfileDat.
     */
    private org.edna.mxv1.xsdata.XSDataString _bestfileDat;

    /**
     * Field _bestfileHKL.
     */
    private org.edna.mxv1.xsdata.XSDataString _bestfileHKL;

    /**
     * Field _bestfilePar.
     */
    private org.edna.mxv1.xsdata.XSDataString _bestfilePar;

    /**
     * Field _experimentalConditionRefined.
     */
    private org.edna.mxv1.xsdata.XSDataExperimentalCondition _experimentalConditionRefined;

    /**
     * Field _generatedMTZFile.
     */
    private org.edna.mxv1.xsdata.XSDataFile _generatedMTZFile;

    /**
     * Field _integrationLogFile.
     */
    private org.edna.mxv1.xsdata.XSDataFile _integrationLogFile;

    /**
     * Field _statistics.
     */
    private org.edna.mxv1.xsdata.XSDataStatisticsIntegration _statistics;

    /**
     * Field _statisticsPerResolutionBinList.
     */
    private java.util.List<org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin> _statisticsPerResolutionBinList;

    /**
     * Field _subWedgeNumber.
     */
    private org.edna.mxv1.xsdata.XSDataInteger _subWedgeNumber;


      //----------------/
     //- Constructors -/
    //----------------/

    public XSDataIntegrationSubWedgeResult() {
        super();
        this._statisticsPerResolutionBinList = new java.util.ArrayList<org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStatisticsPerResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatisticsPerResolutionBin(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin vStatisticsPerResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        this._statisticsPerResolutionBinList.add(vStatisticsPerResolutionBin);
    }

    /**
     * 
     * 
     * @param index
     * @param vStatisticsPerResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatisticsPerResolutionBin(
            final int index,
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin vStatisticsPerResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        this._statisticsPerResolutionBinList.add(index, vStatisticsPerResolutionBin);
    }

    /**
     * Method enumerateStatisticsPerResolutionBin.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin> enumerateStatisticsPerResolutionBin(
    ) {
        return java.util.Collections.enumeration(this._statisticsPerResolutionBinList);
    }

    /**
     * Returns the value of field 'bestfileDat'.
     * 
     * @return the value of field 'BestfileDat'.
     */
    public org.edna.mxv1.xsdata.XSDataString getBestfileDat(
    ) {
        return this._bestfileDat;
    }

    /**
     * Returns the value of field 'bestfileHKL'.
     * 
     * @return the value of field 'BestfileHKL'.
     */
    public org.edna.mxv1.xsdata.XSDataString getBestfileHKL(
    ) {
        return this._bestfileHKL;
    }

    /**
     * Returns the value of field 'bestfilePar'.
     * 
     * @return the value of field 'BestfilePar'.
     */
    public org.edna.mxv1.xsdata.XSDataString getBestfilePar(
    ) {
        return this._bestfilePar;
    }

    /**
     * Returns the value of field 'experimentalConditionRefined'.
     * 
     * @return the value of field 'ExperimentalConditionRefined'.
     */
    public org.edna.mxv1.xsdata.XSDataExperimentalCondition getExperimentalConditionRefined(
    ) {
        return this._experimentalConditionRefined;
    }

    /**
     * Returns the value of field 'generatedMTZFile'.
     * 
     * @return the value of field 'GeneratedMTZFile'.
     */
    public org.edna.mxv1.xsdata.XSDataFile getGeneratedMTZFile(
    ) {
        return this._generatedMTZFile;
    }

    /**
     * Returns the value of field 'integrationLogFile'.
     * 
     * @return the value of field 'IntegrationLogFile'.
     */
    public org.edna.mxv1.xsdata.XSDataFile getIntegrationLogFile(
    ) {
        return this._integrationLogFile;
    }

    /**
     * Returns the value of field 'statistics'.
     * 
     * @return the value of field 'Statistics'.
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegration getStatistics(
    ) {
        return this._statistics;
    }

    /**
     * Method getStatisticsPerResolutionBin.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin
     * at the given index
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin getStatisticsPerResolutionBin(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statisticsPerResolutionBinList.size()) {
            throw new IndexOutOfBoundsException("getStatisticsPerResolutionBin: Index value '" + index + "' not in range [0.." + (this._statisticsPerResolutionBinList.size() - 1) + "]");
        }

        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin) _statisticsPerResolutionBinList.get(index);
    }

    /**
     * Method getStatisticsPerResolutionBin.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin[] getStatisticsPerResolutionBin(
    ) {
        org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin[] array = new org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin[0];
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin[]) this._statisticsPerResolutionBinList.toArray(array);
    }

    /**
     * Method getStatisticsPerResolutionBinCount.
     * 
     * @return the size of this collection
     */
    public int getStatisticsPerResolutionBinCount(
    ) {
        return this._statisticsPerResolutionBinList.size();
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
     * Method iterateStatisticsPerResolutionBin.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin> iterateStatisticsPerResolutionBin(
    ) {
        return this._statisticsPerResolutionBinList.iterator();
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
    public void removeAllStatisticsPerResolutionBin(
    ) {
        this._statisticsPerResolutionBinList.clear();
    }

    /**
     * Method removeStatisticsPerResolutionBin.
     * 
     * @param vStatisticsPerResolutionBin
     * @return true if the object was removed from the collection.
     */
    public boolean removeStatisticsPerResolutionBin(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin vStatisticsPerResolutionBin) {
        boolean removed = _statisticsPerResolutionBinList.remove(vStatisticsPerResolutionBin);
        return removed;
    }

    /**
     * Method removeStatisticsPerResolutionBinAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin removeStatisticsPerResolutionBinAt(
            final int index) {
        java.lang.Object obj = this._statisticsPerResolutionBinList.remove(index);
        return (org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin) obj;
    }

    /**
     * Sets the value of field 'bestfileDat'.
     * 
     * @param bestfileDat the value of field 'bestfileDat'.
     */
    public void setBestfileDat(
            final org.edna.mxv1.xsdata.XSDataString bestfileDat) {
        this._bestfileDat = bestfileDat;
    }

    /**
     * Sets the value of field 'bestfileHKL'.
     * 
     * @param bestfileHKL the value of field 'bestfileHKL'.
     */
    public void setBestfileHKL(
            final org.edna.mxv1.xsdata.XSDataString bestfileHKL) {
        this._bestfileHKL = bestfileHKL;
    }

    /**
     * Sets the value of field 'bestfilePar'.
     * 
     * @param bestfilePar the value of field 'bestfilePar'.
     */
    public void setBestfilePar(
            final org.edna.mxv1.xsdata.XSDataString bestfilePar) {
        this._bestfilePar = bestfilePar;
    }

    /**
     * Sets the value of field 'experimentalConditionRefined'.
     * 
     * @param experimentalConditionRefined the value of field
     * 'experimentalConditionRefined'.
     */
    public void setExperimentalConditionRefined(
            final org.edna.mxv1.xsdata.XSDataExperimentalCondition experimentalConditionRefined) {
        this._experimentalConditionRefined = experimentalConditionRefined;
    }

    /**
     * Sets the value of field 'generatedMTZFile'.
     * 
     * @param generatedMTZFile the value of field 'generatedMTZFile'
     */
    public void setGeneratedMTZFile(
            final org.edna.mxv1.xsdata.XSDataFile generatedMTZFile) {
        this._generatedMTZFile = generatedMTZFile;
    }

    /**
     * Sets the value of field 'integrationLogFile'.
     * 
     * @param integrationLogFile the value of field
     * 'integrationLogFile'.
     */
    public void setIntegrationLogFile(
            final org.edna.mxv1.xsdata.XSDataFile integrationLogFile) {
        this._integrationLogFile = integrationLogFile;
    }

    /**
     * Sets the value of field 'statistics'.
     * 
     * @param statistics the value of field 'statistics'.
     */
    public void setStatistics(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegration statistics) {
        this._statistics = statistics;
    }

    /**
     * 
     * 
     * @param index
     * @param vStatisticsPerResolutionBin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStatisticsPerResolutionBin(
            final int index,
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin vStatisticsPerResolutionBin)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statisticsPerResolutionBinList.size()) {
            throw new IndexOutOfBoundsException("setStatisticsPerResolutionBin: Index value '" + index + "' not in range [0.." + (this._statisticsPerResolutionBinList.size() - 1) + "]");
        }

        this._statisticsPerResolutionBinList.set(index, vStatisticsPerResolutionBin);
    }

    /**
     * 
     * 
     * @param vStatisticsPerResolutionBinArray
     */
    public void setStatisticsPerResolutionBin(
            final org.edna.mxv1.xsdata.XSDataStatisticsIntegrationPerResolutionBin[] vStatisticsPerResolutionBinArray) {
        //-- copy array
        _statisticsPerResolutionBinList.clear();

        for (int i = 0; i < vStatisticsPerResolutionBinArray.length; i++) {
                this._statisticsPerResolutionBinList.add(vStatisticsPerResolutionBinArray[i]);
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
     * Method unmarshalXSDataIntegrationSubWedgeResult.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult
     */
    public static org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult unmarshalXSDataIntegrationSubWedgeResult(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult) org.exolab.castor.xml.Unmarshaller.unmarshal(org.edna.mxv1.xsdata.XSDataIntegrationSubWedgeResult.class, reader);
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
