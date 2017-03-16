/**
 * CSKeyValuePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * A key=value string.
 */
public class CSKeyValuePair  implements java.io.Serializable {
    private java.lang.String keyValuePair;

    public CSKeyValuePair() {
    }

    public CSKeyValuePair(
           java.lang.String keyValuePair) {
           this.keyValuePair = keyValuePair;
    }


    /**
     * Gets the keyValuePair value for this CSKeyValuePair.
     * 
     * @return keyValuePair
     */
    public java.lang.String getKeyValuePair() {
        return keyValuePair;
    }


    /**
     * Sets the keyValuePair value for this CSKeyValuePair.
     * 
     * @param keyValuePair
     */
    public void setKeyValuePair(java.lang.String keyValuePair) {
        this.keyValuePair = keyValuePair;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSKeyValuePair)) return false;
        CSKeyValuePair other = (CSKeyValuePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyValuePair==null && other.getKeyValuePair()==null) || 
             (this.keyValuePair!=null &&
              this.keyValuePair.equals(other.getKeyValuePair())));
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
        if (getKeyValuePair() != null) {
            _hashCode += getKeyValuePair().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSKeyValuePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSKeyValuePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValuePair");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyValuePair"));
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
