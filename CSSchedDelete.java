/**
 * CSSchedDelete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Delete Deployment schedules parameters.
 */
public class CSSchedDelete  implements java.io.Serializable {
    /* Specify the desired schedDeleteType .
     *                        1 -   Delete Schedules with the specified deploymentName.
     * 
     *                        2 -   Delete Schedules based on wildcard name. */
    private int schedDeleteType;

    /* Name of deployment to delete. This is required for schedDeleteType
     * 1. */
    private java.lang.String deploymentName;

    /* Deployment Job ID . This is required for schedDeleteType 1. */
    private java.lang.String jobID;

    /* Deployment wildcard Name. This is required for schedDeleteType
     * 2. */
    private java.lang.String deploymentNamePattern;

    public CSSchedDelete() {
    }

    public CSSchedDelete(
           int schedDeleteType,
           java.lang.String deploymentName,
           java.lang.String jobID,
           java.lang.String deploymentNamePattern) {
           this.schedDeleteType = schedDeleteType;
           this.deploymentName = deploymentName;
           this.jobID = jobID;
           this.deploymentNamePattern = deploymentNamePattern;
    }


    /**
     * Gets the schedDeleteType value for this CSSchedDelete.
     * 
     * @return schedDeleteType   * Specify the desired schedDeleteType .
     *                        1 -   Delete Schedules with the specified deploymentName.
     * 
     *                        2 -   Delete Schedules based on wildcard name.
     */
    public int getSchedDeleteType() {
        return schedDeleteType;
    }


    /**
     * Sets the schedDeleteType value for this CSSchedDelete.
     * 
     * @param schedDeleteType   * Specify the desired schedDeleteType .
     *                        1 -   Delete Schedules with the specified deploymentName.
     * 
     *                        2 -   Delete Schedules based on wildcard name.
     */
    public void setSchedDeleteType(int schedDeleteType) {
        this.schedDeleteType = schedDeleteType;
    }


    /**
     * Gets the deploymentName value for this CSSchedDelete.
     * 
     * @return deploymentName   * Name of deployment to delete. This is required for schedDeleteType
     * 1.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSSchedDelete.
     * 
     * @param deploymentName   * Name of deployment to delete. This is required for schedDeleteType
     * 1.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }


    /**
     * Gets the jobID value for this CSSchedDelete.
     * 
     * @return jobID   * Deployment Job ID . This is required for schedDeleteType 1.
     */
    public java.lang.String getJobID() {
        return jobID;
    }


    /**
     * Sets the jobID value for this CSSchedDelete.
     * 
     * @param jobID   * Deployment Job ID . This is required for schedDeleteType 1.
     */
    public void setJobID(java.lang.String jobID) {
        this.jobID = jobID;
    }


    /**
     * Gets the deploymentNamePattern value for this CSSchedDelete.
     * 
     * @return deploymentNamePattern   * Deployment wildcard Name. This is required for schedDeleteType
     * 2.
     */
    public java.lang.String getDeploymentNamePattern() {
        return deploymentNamePattern;
    }


    /**
     * Sets the deploymentNamePattern value for this CSSchedDelete.
     * 
     * @param deploymentNamePattern   * Deployment wildcard Name. This is required for schedDeleteType
     * 2.
     */
    public void setDeploymentNamePattern(java.lang.String deploymentNamePattern) {
        this.deploymentNamePattern = deploymentNamePattern;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSchedDelete)) return false;
        CSSchedDelete other = (CSSchedDelete) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.schedDeleteType == other.getSchedDeleteType() &&
            ((this.deploymentName==null && other.getDeploymentName()==null) || 
             (this.deploymentName!=null &&
              this.deploymentName.equals(other.getDeploymentName()))) &&
            ((this.jobID==null && other.getJobID()==null) || 
             (this.jobID!=null &&
              this.jobID.equals(other.getJobID()))) &&
            ((this.deploymentNamePattern==null && other.getDeploymentNamePattern()==null) || 
             (this.deploymentNamePattern!=null &&
              this.deploymentNamePattern.equals(other.getDeploymentNamePattern())));
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
        _hashCode += getSchedDeleteType();
        if (getDeploymentName() != null) {
            _hashCode += getDeploymentName().hashCode();
        }
        if (getJobID() != null) {
            _hashCode += getJobID().hashCode();
        }
        if (getDeploymentNamePattern() != null) {
            _hashCode += getDeploymentNamePattern().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSchedDelete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDelete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedDeleteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedDeleteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentNamePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentNamePattern"));
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
