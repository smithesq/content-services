/**
 * CSSubscriptionSchedUpdateParm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public class CSSubscriptionSchedUpdateParm  implements java.io.Serializable {
    private java.lang.String subscriptionName;

    private java.lang.String schedSpec;

    public CSSubscriptionSchedUpdateParm() {
    }

    public CSSubscriptionSchedUpdateParm(
           java.lang.String subscriptionName,
           java.lang.String schedSpec) {
           this.subscriptionName = subscriptionName;
           this.schedSpec = schedSpec;
    }


    /**
     * Gets the subscriptionName value for this CSSubscriptionSchedUpdateParm.
     * 
     * @return subscriptionName
     */
    public java.lang.String getSubscriptionName() {
        return subscriptionName;
    }


    /**
     * Sets the subscriptionName value for this CSSubscriptionSchedUpdateParm.
     * 
     * @param subscriptionName
     */
    public void setSubscriptionName(java.lang.String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }


    /**
     * Gets the schedSpec value for this CSSubscriptionSchedUpdateParm.
     * 
     * @return schedSpec
     */
    public java.lang.String getSchedSpec() {
        return schedSpec;
    }


    /**
     * Sets the schedSpec value for this CSSubscriptionSchedUpdateParm.
     * 
     * @param schedSpec
     */
    public void setSchedSpec(java.lang.String schedSpec) {
        this.schedSpec = schedSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSubscriptionSchedUpdateParm)) return false;
        CSSubscriptionSchedUpdateParm other = (CSSubscriptionSchedUpdateParm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptionName==null && other.getSubscriptionName()==null) || 
             (this.subscriptionName!=null &&
              this.subscriptionName.equals(other.getSubscriptionName()))) &&
            ((this.schedSpec==null && other.getSchedSpec()==null) || 
             (this.schedSpec!=null &&
              this.schedSpec.equals(other.getSchedSpec())));
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
        if (getSubscriptionName() != null) {
            _hashCode += getSubscriptionName().hashCode();
        }
        if (getSchedSpec() != null) {
            _hashCode += getSchedSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSubscriptionSchedUpdateParm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionSchedUpdateParm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedSpec"));
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
