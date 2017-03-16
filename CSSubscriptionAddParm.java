/**
 * CSSubscriptionAddParm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public class CSSubscriptionAddParm  implements java.io.Serializable {
    private java.lang.String offerName;

    private java.lang.String subscriptionName;

    private java.lang.String subscriptionSpec;

    public CSSubscriptionAddParm() {
    }

    public CSSubscriptionAddParm(
           java.lang.String offerName,
           java.lang.String subscriptionName,
           java.lang.String subscriptionSpec) {
           this.offerName = offerName;
           this.subscriptionName = subscriptionName;
           this.subscriptionSpec = subscriptionSpec;
    }


    /**
     * Gets the offerName value for this CSSubscriptionAddParm.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this CSSubscriptionAddParm.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }


    /**
     * Gets the subscriptionName value for this CSSubscriptionAddParm.
     * 
     * @return subscriptionName
     */
    public java.lang.String getSubscriptionName() {
        return subscriptionName;
    }


    /**
     * Sets the subscriptionName value for this CSSubscriptionAddParm.
     * 
     * @param subscriptionName
     */
    public void setSubscriptionName(java.lang.String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }


    /**
     * Gets the subscriptionSpec value for this CSSubscriptionAddParm.
     * 
     * @return subscriptionSpec
     */
    public java.lang.String getSubscriptionSpec() {
        return subscriptionSpec;
    }


    /**
     * Sets the subscriptionSpec value for this CSSubscriptionAddParm.
     * 
     * @param subscriptionSpec
     */
    public void setSubscriptionSpec(java.lang.String subscriptionSpec) {
        this.subscriptionSpec = subscriptionSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSubscriptionAddParm)) return false;
        CSSubscriptionAddParm other = (CSSubscriptionAddParm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName()))) &&
            ((this.subscriptionName==null && other.getSubscriptionName()==null) || 
             (this.subscriptionName!=null &&
              this.subscriptionName.equals(other.getSubscriptionName()))) &&
            ((this.subscriptionSpec==null && other.getSubscriptionSpec()==null) || 
             (this.subscriptionSpec!=null &&
              this.subscriptionSpec.equals(other.getSubscriptionSpec())));
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
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        if (getSubscriptionName() != null) {
            _hashCode += getSubscriptionName().hashCode();
        }
        if (getSubscriptionSpec() != null) {
            _hashCode += getSubscriptionSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSubscriptionAddParm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionAddParm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionSpec"));
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
