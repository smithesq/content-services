/**
 * CSCancelDeploymentParm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Cancel deployment parameters.
 */
public class CSCancelDeploymentParm  implements java.io.Serializable {
    /* Name of deployment to cancel. */
    private java.lang.String deploymentName;

    public CSCancelDeploymentParm() {
    }

    public CSCancelDeploymentParm(
           java.lang.String deploymentName) {
           this.deploymentName = deploymentName;
    }


    /**
     * Gets the deploymentName value for this CSCancelDeploymentParm.
     * 
     * @return deploymentName   * Name of deployment to cancel.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSCancelDeploymentParm.
     * 
     * @param deploymentName   * Name of deployment to cancel.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCancelDeploymentParm)) return false;
        CSCancelDeploymentParm other = (CSCancelDeploymentParm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deploymentName==null && other.getDeploymentName()==null) || 
             (this.deploymentName!=null &&
              this.deploymentName.equals(other.getDeploymentName())));
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
        if (getDeploymentName() != null) {
            _hashCode += getDeploymentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSCancelDeploymentParm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSCancelDeploymentParm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentName"));
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
