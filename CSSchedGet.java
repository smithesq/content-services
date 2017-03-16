/**
 * CSSchedGet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Get Deployment schedules parameters.
 */
public class CSSchedGet  implements java.io.Serializable {
    /* Specify the desired schedGetType .
     *                        1 -   Get all Schedules. 
     *                        2 -   Get all Schedules for the specified deploymentName.
     * 
     *                        3 -   Get all Schedules for the specified deploymentName
     * and jobID. */
    private int schedGetType;

    /* Name of deployment to get the status. This is required for
     * schedGetType 2 and 3. */
    private java.lang.String deploymentName;

    /* Deployment Job ID . This is required for schedGetType 3. */
    private java.lang.String jobID;

    public CSSchedGet() {
    }

    public CSSchedGet(
           int schedGetType,
           java.lang.String deploymentName,
           java.lang.String jobID) {
           this.schedGetType = schedGetType;
           this.deploymentName = deploymentName;
           this.jobID = jobID;
    }


    /**
     * Gets the schedGetType value for this CSSchedGet.
     * 
     * @return schedGetType   * Specify the desired schedGetType .
     *                        1 -   Get all Schedules. 
     *                        2 -   Get all Schedules for the specified deploymentName.
     * 
     *                        3 -   Get all Schedules for the specified deploymentName
     * and jobID.
     */
    public int getSchedGetType() {
        return schedGetType;
    }


    /**
     * Sets the schedGetType value for this CSSchedGet.
     * 
     * @param schedGetType   * Specify the desired schedGetType .
     *                        1 -   Get all Schedules. 
     *                        2 -   Get all Schedules for the specified deploymentName.
     * 
     *                        3 -   Get all Schedules for the specified deploymentName
     * and jobID.
     */
    public void setSchedGetType(int schedGetType) {
        this.schedGetType = schedGetType;
    }


    /**
     * Gets the deploymentName value for this CSSchedGet.
     * 
     * @return deploymentName   * Name of deployment to get the status. This is required for
     * schedGetType 2 and 3.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSSchedGet.
     * 
     * @param deploymentName   * Name of deployment to get the status. This is required for
     * schedGetType 2 and 3.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }


    /**
     * Gets the jobID value for this CSSchedGet.
     * 
     * @return jobID   * Deployment Job ID . This is required for schedGetType 3.
     */
    public java.lang.String getJobID() {
        return jobID;
    }


    /**
     * Sets the jobID value for this CSSchedGet.
     * 
     * @param jobID   * Deployment Job ID . This is required for schedGetType 3.
     */
    public void setJobID(java.lang.String jobID) {
        this.jobID = jobID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSchedGet)) return false;
        CSSchedGet other = (CSSchedGet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.schedGetType == other.getSchedGetType() &&
            ((this.deploymentName==null && other.getDeploymentName()==null) || 
             (this.deploymentName!=null &&
              this.deploymentName.equals(other.getDeploymentName()))) &&
            ((this.jobID==null && other.getJobID()==null) || 
             (this.jobID!=null &&
              this.jobID.equals(other.getJobID())));
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
        _hashCode += getSchedGetType();
        if (getDeploymentName() != null) {
            _hashCode += getDeploymentName().hashCode();
        }
        if (getJobID() != null) {
            _hashCode += getJobID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSchedGet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedGetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedGetType"));
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
