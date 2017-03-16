/**
 * CSODServerVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * OD Server version .
 */
public class CSODServerVersion  implements java.io.Serializable {
    /* OD Server version */
    private java.lang.String odVersion;

    public CSODServerVersion() {
    }

    public CSODServerVersion(
           java.lang.String odVersion) {
           this.odVersion = odVersion;
    }


    /**
     * Gets the odVersion value for this CSODServerVersion.
     * 
     * @return odVersion   * OD Server version
     */
    public java.lang.String getOdVersion() {
        return odVersion;
    }


    /**
     * Sets the odVersion value for this CSODServerVersion.
     * 
     * @param odVersion   * OD Server version
     */
    public void setOdVersion(java.lang.String odVersion) {
        this.odVersion = odVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSODServerVersion)) return false;
        CSODServerVersion other = (CSODServerVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.odVersion==null && other.getOdVersion()==null) || 
             (this.odVersion!=null &&
              this.odVersion.equals(other.getOdVersion())));
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
        if (getOdVersion() != null) {
            _hashCode += getOdVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSODServerVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odVersion"));
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
