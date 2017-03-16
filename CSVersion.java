/**
 * CSVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Used to return version information.
 */
public class CSVersion  implements java.io.Serializable {
    private int majorNumber;

    private int minorNumber;

    private int patchNumber;

    private java.lang.String auxInfo;

    public CSVersion() {
    }

    public CSVersion(
           int majorNumber,
           int minorNumber,
           int patchNumber,
           java.lang.String auxInfo) {
           this.majorNumber = majorNumber;
           this.minorNumber = minorNumber;
           this.patchNumber = patchNumber;
           this.auxInfo = auxInfo;
    }


    /**
     * Gets the majorNumber value for this CSVersion.
     * 
     * @return majorNumber
     */
    public int getMajorNumber() {
        return majorNumber;
    }


    /**
     * Sets the majorNumber value for this CSVersion.
     * 
     * @param majorNumber
     */
    public void setMajorNumber(int majorNumber) {
        this.majorNumber = majorNumber;
    }


    /**
     * Gets the minorNumber value for this CSVersion.
     * 
     * @return minorNumber
     */
    public int getMinorNumber() {
        return minorNumber;
    }


    /**
     * Sets the minorNumber value for this CSVersion.
     * 
     * @param minorNumber
     */
    public void setMinorNumber(int minorNumber) {
        this.minorNumber = minorNumber;
    }


    /**
     * Gets the patchNumber value for this CSVersion.
     * 
     * @return patchNumber
     */
    public int getPatchNumber() {
        return patchNumber;
    }


    /**
     * Sets the patchNumber value for this CSVersion.
     * 
     * @param patchNumber
     */
    public void setPatchNumber(int patchNumber) {
        this.patchNumber = patchNumber;
    }


    /**
     * Gets the auxInfo value for this CSVersion.
     * 
     * @return auxInfo
     */
    public java.lang.String getAuxInfo() {
        return auxInfo;
    }


    /**
     * Sets the auxInfo value for this CSVersion.
     * 
     * @param auxInfo
     */
    public void setAuxInfo(java.lang.String auxInfo) {
        this.auxInfo = auxInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSVersion)) return false;
        CSVersion other = (CSVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.majorNumber == other.getMajorNumber() &&
            this.minorNumber == other.getMinorNumber() &&
            this.patchNumber == other.getPatchNumber() &&
            ((this.auxInfo==null && other.getAuxInfo()==null) || 
             (this.auxInfo!=null &&
              this.auxInfo.equals(other.getAuxInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getMajorNumber();
        _hashCode += getMinorNumber();
        _hashCode += getPatchNumber();
        if (getAuxInfo() != null) {
            _hashCode += getAuxInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
