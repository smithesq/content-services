/**
 * CSDeployment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Basic information for a deployment.
 */
public class CSDeployment  implements java.io.Serializable {
    /* Name of deployment. If a deployment
     *                         instance value was specified, this will be
     * 
     *                         the original deployemnt name appended with
     * the deployment instance value. */
    private java.lang.String deploymentName;

    /* Deployment job ID. */
    private java.lang.String deploymentID;

    /* Deployment UUID. This is unique
     *                         for each deployment.
     *                         This is blank if the deployment is
     *                         a scheduled deployment that have not
     *                         yet started. */
    private java.lang.String deploymentUUID;

    /* Deployment route ID. This is unique
     *                         for each routed deployment. 
     *                         This is blank if deployment is not 
     *                         part of a routed deployment. */
    private java.lang.String deploymentRouteID;

    /* This indicates if the deployment is a
     *                         sending or receiving deployment.
     *                         Possible values: SENDING, RECEIVING */
    private java.lang.String deploymentDirection;

    /* This indicates if the deployment is a
     *                         scheduled deployment waiting to be run,
     *                         an actively running deployment or a completed
     * deployment.
     *                         Possible values: SCHEDULED, RUNNING, COMPLETED */
    private java.lang.String deploymentState;

    public CSDeployment() {
    }

    public CSDeployment(
           java.lang.String deploymentName,
           java.lang.String deploymentID,
           java.lang.String deploymentUUID,
           java.lang.String deploymentRouteID,
           java.lang.String deploymentDirection,
           java.lang.String deploymentState) {
           this.deploymentName = deploymentName;
           this.deploymentID = deploymentID;
           this.deploymentUUID = deploymentUUID;
           this.deploymentRouteID = deploymentRouteID;
           this.deploymentDirection = deploymentDirection;
           this.deploymentState = deploymentState;
    }


    /**
     * Gets the deploymentName value for this CSDeployment.
     * 
     * @return deploymentName   * Name of deployment. If a deployment
     *                         instance value was specified, this will be
     * 
     *                         the original deployemnt name appended with
     * the deployment instance value.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSDeployment.
     * 
     * @param deploymentName   * Name of deployment. If a deployment
     *                         instance value was specified, this will be
     * 
     *                         the original deployemnt name appended with
     * the deployment instance value.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }


    /**
     * Gets the deploymentID value for this CSDeployment.
     * 
     * @return deploymentID   * Deployment job ID.
     */
    public java.lang.String getDeploymentID() {
        return deploymentID;
    }


    /**
     * Sets the deploymentID value for this CSDeployment.
     * 
     * @param deploymentID   * Deployment job ID.
     */
    public void setDeploymentID(java.lang.String deploymentID) {
        this.deploymentID = deploymentID;
    }


    /**
     * Gets the deploymentUUID value for this CSDeployment.
     * 
     * @return deploymentUUID   * Deployment UUID. This is unique
     *                         for each deployment.
     *                         This is blank if the deployment is
     *                         a scheduled deployment that have not
     *                         yet started.
     */
    public java.lang.String getDeploymentUUID() {
        return deploymentUUID;
    }


    /**
     * Sets the deploymentUUID value for this CSDeployment.
     * 
     * @param deploymentUUID   * Deployment UUID. This is unique
     *                         for each deployment.
     *                         This is blank if the deployment is
     *                         a scheduled deployment that have not
     *                         yet started.
     */
    public void setDeploymentUUID(java.lang.String deploymentUUID) {
        this.deploymentUUID = deploymentUUID;
    }


    /**
     * Gets the deploymentRouteID value for this CSDeployment.
     * 
     * @return deploymentRouteID   * Deployment route ID. This is unique
     *                         for each routed deployment. 
     *                         This is blank if deployment is not 
     *                         part of a routed deployment.
     */
    public java.lang.String getDeploymentRouteID() {
        return deploymentRouteID;
    }


    /**
     * Sets the deploymentRouteID value for this CSDeployment.
     * 
     * @param deploymentRouteID   * Deployment route ID. This is unique
     *                         for each routed deployment. 
     *                         This is blank if deployment is not 
     *                         part of a routed deployment.
     */
    public void setDeploymentRouteID(java.lang.String deploymentRouteID) {
        this.deploymentRouteID = deploymentRouteID;
    }


    /**
     * Gets the deploymentDirection value for this CSDeployment.
     * 
     * @return deploymentDirection   * This indicates if the deployment is a
     *                         sending or receiving deployment.
     *                         Possible values: SENDING, RECEIVING
     */
    public java.lang.String getDeploymentDirection() {
        return deploymentDirection;
    }


    /**
     * Sets the deploymentDirection value for this CSDeployment.
     * 
     * @param deploymentDirection   * This indicates if the deployment is a
     *                         sending or receiving deployment.
     *                         Possible values: SENDING, RECEIVING
     */
    public void setDeploymentDirection(java.lang.String deploymentDirection) {
        this.deploymentDirection = deploymentDirection;
    }


    /**
     * Gets the deploymentState value for this CSDeployment.
     * 
     * @return deploymentState   * This indicates if the deployment is a
     *                         scheduled deployment waiting to be run,
     *                         an actively running deployment or a completed
     * deployment.
     *                         Possible values: SCHEDULED, RUNNING, COMPLETED
     */
    public java.lang.String getDeploymentState() {
        return deploymentState;
    }


    /**
     * Sets the deploymentState value for this CSDeployment.
     * 
     * @param deploymentState   * This indicates if the deployment is a
     *                         scheduled deployment waiting to be run,
     *                         an actively running deployment or a completed
     * deployment.
     *                         Possible values: SCHEDULED, RUNNING, COMPLETED
     */
    public void setDeploymentState(java.lang.String deploymentState) {
        this.deploymentState = deploymentState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSDeployment)) return false;
        CSDeployment other = (CSDeployment) obj;
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
              this.deploymentName.equals(other.getDeploymentName()))) &&
            ((this.deploymentID==null && other.getDeploymentID()==null) || 
             (this.deploymentID!=null &&
              this.deploymentID.equals(other.getDeploymentID()))) &&
            ((this.deploymentUUID==null && other.getDeploymentUUID()==null) || 
             (this.deploymentUUID!=null &&
              this.deploymentUUID.equals(other.getDeploymentUUID()))) &&
            ((this.deploymentRouteID==null && other.getDeploymentRouteID()==null) || 
             (this.deploymentRouteID!=null &&
              this.deploymentRouteID.equals(other.getDeploymentRouteID()))) &&
            ((this.deploymentDirection==null && other.getDeploymentDirection()==null) || 
             (this.deploymentDirection!=null &&
              this.deploymentDirection.equals(other.getDeploymentDirection()))) &&
            ((this.deploymentState==null && other.getDeploymentState()==null) || 
             (this.deploymentState!=null &&
              this.deploymentState.equals(other.getDeploymentState())));
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
        if (getDeploymentID() != null) {
            _hashCode += getDeploymentID().hashCode();
        }
        if (getDeploymentUUID() != null) {
            _hashCode += getDeploymentUUID().hashCode();
        }
        if (getDeploymentRouteID() != null) {
            _hashCode += getDeploymentRouteID().hashCode();
        }
        if (getDeploymentDirection() != null) {
            _hashCode += getDeploymentDirection().hashCode();
        }
        if (getDeploymentState() != null) {
            _hashCode += getDeploymentState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSDeployment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeployment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentRouteID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentRouteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentState"));
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
