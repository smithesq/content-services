/**
 * CSGetMultipleDeploymentsParm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Indicate the deployments to get by setting
 *                 these parameters.
 */
public class CSGetMultipleDeploymentsParm  implements java.io.Serializable {
    /* Set to true to get sending deployments which are
     *                         still running (not completed). */
    private boolean sendRunning;

    /* Set to true to get sending deployments which are
     *                         completed. */
    private boolean sendCompleted;

    /* Set to true to get sending deployments which are
     *                         scheduled and have not yet started.
     *                         Also need to set sendingScheduledDays parameter. */
    private boolean sendScheduled;

    /* When sendScheduled parameter is set to true,
     *                         this is the number of days for getting 
     *                         sending scheduled deployments.
     *                         Negative values will be treated as zero.
     *                         Only the next occurence of each scheduled
     * deployment
     *                         within the days specified will be return. */
    private int sendScheduledDays;

    /* Set to true to get receiving deployments which are
     *                         still running (not completed). */
    private boolean receiveRunning;

    /* Set to true to get receiving deployments which are
     *                         completed. */
    private boolean receiveCompleted;

    public CSGetMultipleDeploymentsParm() {
    }

    public CSGetMultipleDeploymentsParm(
           boolean sendRunning,
           boolean sendCompleted,
           boolean sendScheduled,
           int sendScheduledDays,
           boolean receiveRunning,
           boolean receiveCompleted) {
           this.sendRunning = sendRunning;
           this.sendCompleted = sendCompleted;
           this.sendScheduled = sendScheduled;
           this.sendScheduledDays = sendScheduledDays;
           this.receiveRunning = receiveRunning;
           this.receiveCompleted = receiveCompleted;
    }


    /**
     * Gets the sendRunning value for this CSGetMultipleDeploymentsParm.
     * 
     * @return sendRunning   * Set to true to get sending deployments which are
     *                         still running (not completed).
     */
    public boolean isSendRunning() {
        return sendRunning;
    }


    /**
     * Sets the sendRunning value for this CSGetMultipleDeploymentsParm.
     * 
     * @param sendRunning   * Set to true to get sending deployments which are
     *                         still running (not completed).
     */
    public void setSendRunning(boolean sendRunning) {
        this.sendRunning = sendRunning;
    }


    /**
     * Gets the sendCompleted value for this CSGetMultipleDeploymentsParm.
     * 
     * @return sendCompleted   * Set to true to get sending deployments which are
     *                         completed.
     */
    public boolean isSendCompleted() {
        return sendCompleted;
    }


    /**
     * Sets the sendCompleted value for this CSGetMultipleDeploymentsParm.
     * 
     * @param sendCompleted   * Set to true to get sending deployments which are
     *                         completed.
     */
    public void setSendCompleted(boolean sendCompleted) {
        this.sendCompleted = sendCompleted;
    }


    /**
     * Gets the sendScheduled value for this CSGetMultipleDeploymentsParm.
     * 
     * @return sendScheduled   * Set to true to get sending deployments which are
     *                         scheduled and have not yet started.
     *                         Also need to set sendingScheduledDays parameter.
     */
    public boolean isSendScheduled() {
        return sendScheduled;
    }


    /**
     * Sets the sendScheduled value for this CSGetMultipleDeploymentsParm.
     * 
     * @param sendScheduled   * Set to true to get sending deployments which are
     *                         scheduled and have not yet started.
     *                         Also need to set sendingScheduledDays parameter.
     */
    public void setSendScheduled(boolean sendScheduled) {
        this.sendScheduled = sendScheduled;
    }


    /**
     * Gets the sendScheduledDays value for this CSGetMultipleDeploymentsParm.
     * 
     * @return sendScheduledDays   * When sendScheduled parameter is set to true,
     *                         this is the number of days for getting 
     *                         sending scheduled deployments.
     *                         Negative values will be treated as zero.
     *                         Only the next occurence of each scheduled
     * deployment
     *                         within the days specified will be return.
     */
    public int getSendScheduledDays() {
        return sendScheduledDays;
    }


    /**
     * Sets the sendScheduledDays value for this CSGetMultipleDeploymentsParm.
     * 
     * @param sendScheduledDays   * When sendScheduled parameter is set to true,
     *                         this is the number of days for getting 
     *                         sending scheduled deployments.
     *                         Negative values will be treated as zero.
     *                         Only the next occurence of each scheduled
     * deployment
     *                         within the days specified will be return.
     */
    public void setSendScheduledDays(int sendScheduledDays) {
        this.sendScheduledDays = sendScheduledDays;
    }


    /**
     * Gets the receiveRunning value for this CSGetMultipleDeploymentsParm.
     * 
     * @return receiveRunning   * Set to true to get receiving deployments which are
     *                         still running (not completed).
     */
    public boolean isReceiveRunning() {
        return receiveRunning;
    }


    /**
     * Sets the receiveRunning value for this CSGetMultipleDeploymentsParm.
     * 
     * @param receiveRunning   * Set to true to get receiving deployments which are
     *                         still running (not completed).
     */
    public void setReceiveRunning(boolean receiveRunning) {
        this.receiveRunning = receiveRunning;
    }


    /**
     * Gets the receiveCompleted value for this CSGetMultipleDeploymentsParm.
     * 
     * @return receiveCompleted   * Set to true to get receiving deployments which are
     *                         completed.
     */
    public boolean isReceiveCompleted() {
        return receiveCompleted;
    }


    /**
     * Sets the receiveCompleted value for this CSGetMultipleDeploymentsParm.
     * 
     * @param receiveCompleted   * Set to true to get receiving deployments which are
     *                         completed.
     */
    public void setReceiveCompleted(boolean receiveCompleted) {
        this.receiveCompleted = receiveCompleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSGetMultipleDeploymentsParm)) return false;
        CSGetMultipleDeploymentsParm other = (CSGetMultipleDeploymentsParm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sendRunning == other.isSendRunning() &&
            this.sendCompleted == other.isSendCompleted() &&
            this.sendScheduled == other.isSendScheduled() &&
            this.sendScheduledDays == other.getSendScheduledDays() &&
            this.receiveRunning == other.isReceiveRunning() &&
            this.receiveCompleted == other.isReceiveCompleted();
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
        _hashCode += (isSendRunning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendCompleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendScheduled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSendScheduledDays();
        _hashCode += (isReceiveRunning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceiveCompleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSGetMultipleDeploymentsParm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetMultipleDeploymentsParm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRunning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendRunning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendScheduledDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendScheduledDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveRunning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiveRunning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiveCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
