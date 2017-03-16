/**
 * CSDeploymentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Current status of the deployment.
 *                 Possible values are:
 *                   Code  Status  
 *                   ----  ------
 *                    1    Running
 *                    2    Rolling back
 *                    3    Completed
 *                    4    Completed with errors
 *                    5    Failed
 *                    6    Cancel Pending
 *                    7    Cancelling
 *                    8    Cancelled
 *                    9    Waiting for next tier deployment
 *                    10   Scheduled active
 *                    11   Scheduled inactive
 *                    99   Undefined
 */
public class CSDeploymentStatus  implements java.io.Serializable {
    private java.lang.String deploymentStatus;

    private int deploymentStatusCode;

    /* Extra information related to the deployment status.
     *                         Most status do not have extra information. */
    private java.lang.String deploymentStatusMsg;

    public CSDeploymentStatus() {
    }

    public CSDeploymentStatus(
           java.lang.String deploymentStatus,
           int deploymentStatusCode,
           java.lang.String deploymentStatusMsg) {
           this.deploymentStatus = deploymentStatus;
           this.deploymentStatusCode = deploymentStatusCode;
           this.deploymentStatusMsg = deploymentStatusMsg;
    }


    /**
     * Gets the deploymentStatus value for this CSDeploymentStatus.
     * 
     * @return deploymentStatus
     */
    public java.lang.String getDeploymentStatus() {
        return deploymentStatus;
    }


    /**
     * Sets the deploymentStatus value for this CSDeploymentStatus.
     * 
     * @param deploymentStatus
     */
    public void setDeploymentStatus(java.lang.String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }


    /**
     * Gets the deploymentStatusCode value for this CSDeploymentStatus.
     * 
     * @return deploymentStatusCode
     */
    public int getDeploymentStatusCode() {
        return deploymentStatusCode;
    }


    /**
     * Sets the deploymentStatusCode value for this CSDeploymentStatus.
     * 
     * @param deploymentStatusCode
     */
    public void setDeploymentStatusCode(int deploymentStatusCode) {
        this.deploymentStatusCode = deploymentStatusCode;
    }


    /**
     * Gets the deploymentStatusMsg value for this CSDeploymentStatus.
     * 
     * @return deploymentStatusMsg   * Extra information related to the deployment status.
     *                         Most status do not have extra information.
     */
    public java.lang.String getDeploymentStatusMsg() {
        return deploymentStatusMsg;
    }


    /**
     * Sets the deploymentStatusMsg value for this CSDeploymentStatus.
     * 
     * @param deploymentStatusMsg   * Extra information related to the deployment status.
     *                         Most status do not have extra information.
     */
    public void setDeploymentStatusMsg(java.lang.String deploymentStatusMsg) {
        this.deploymentStatusMsg = deploymentStatusMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSDeploymentStatus)) return false;
        CSDeploymentStatus other = (CSDeploymentStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deploymentStatus==null && other.getDeploymentStatus()==null) || 
             (this.deploymentStatus!=null &&
              this.deploymentStatus.equals(other.getDeploymentStatus()))) &&
            this.deploymentStatusCode == other.getDeploymentStatusCode() &&
            ((this.deploymentStatusMsg==null && other.getDeploymentStatusMsg()==null) || 
             (this.deploymentStatusMsg!=null &&
              this.deploymentStatusMsg.equals(other.getDeploymentStatusMsg())));
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
        if (getDeploymentStatus() != null) {
            _hashCode += getDeploymentStatus().hashCode();
        }
        _hashCode += getDeploymentStatusCode();
        if (getDeploymentStatusMsg() != null) {
            _hashCode += getDeploymentStatusMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSDeploymentStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeploymentStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentStatusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
