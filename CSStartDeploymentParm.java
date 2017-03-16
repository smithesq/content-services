/**
 * CSStartDeploymentParm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Start deployment parameters.
 */
public class CSStartDeploymentParm  implements java.io.Serializable {
    /* Name of deployment to run. */
    private java.lang.String deploymentName;

    /* Deployment instance value. It is appended to the 
     *                         deployment name to form a unique name. */
    private java.lang.String deploymentInstance;

    /* Deployment logging level. Default is verbose. */
    private com.interwoven.opendeploy.web.service.CSDeployLogLevels logLevel;

    /* Set to true if want to do a simulated deployment.
     *                         Default is false. */
    private boolean simulate;

    /* Set to true run start deployment operation asynchronously.
     *                         Start deployment operation will return before
     * the deployment completes. Default is false. */
    private boolean asynchronous;

    /* Key-value pair substitutions for the deployment
     *                         configuration file. */
    private com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs;

    /* External (workflow) task ID. */
    private java.lang.String externalTaskID;

    public CSStartDeploymentParm() {
    }

    public CSStartDeploymentParm(
           java.lang.String deploymentName,
           java.lang.String deploymentInstance,
           com.interwoven.opendeploy.web.service.CSDeployLogLevels logLevel,
           boolean simulate,
           boolean asynchronous,
           com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs,
           java.lang.String externalTaskID) {
           this.deploymentName = deploymentName;
           this.deploymentInstance = deploymentInstance;
           this.logLevel = logLevel;
           this.simulate = simulate;
           this.asynchronous = asynchronous;
           this.keyValuePairs = keyValuePairs;
           this.externalTaskID = externalTaskID;
    }


    /**
     * Gets the deploymentName value for this CSStartDeploymentParm.
     * 
     * @return deploymentName   * Name of deployment to run.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSStartDeploymentParm.
     * 
     * @param deploymentName   * Name of deployment to run.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }


    /**
     * Gets the deploymentInstance value for this CSStartDeploymentParm.
     * 
     * @return deploymentInstance   * Deployment instance value. It is appended to the 
     *                         deployment name to form a unique name.
     */
    public java.lang.String getDeploymentInstance() {
        return deploymentInstance;
    }


    /**
     * Sets the deploymentInstance value for this CSStartDeploymentParm.
     * 
     * @param deploymentInstance   * Deployment instance value. It is appended to the 
     *                         deployment name to form a unique name.
     */
    public void setDeploymentInstance(java.lang.String deploymentInstance) {
        this.deploymentInstance = deploymentInstance;
    }


    /**
     * Gets the logLevel value for this CSStartDeploymentParm.
     * 
     * @return logLevel   * Deployment logging level. Default is verbose.
     */
    public com.interwoven.opendeploy.web.service.CSDeployLogLevels getLogLevel() {
        return logLevel;
    }


    /**
     * Sets the logLevel value for this CSStartDeploymentParm.
     * 
     * @param logLevel   * Deployment logging level. Default is verbose.
     */
    public void setLogLevel(com.interwoven.opendeploy.web.service.CSDeployLogLevels logLevel) {
        this.logLevel = logLevel;
    }


    /**
     * Gets the simulate value for this CSStartDeploymentParm.
     * 
     * @return simulate   * Set to true if want to do a simulated deployment.
     *                         Default is false.
     */
    public boolean isSimulate() {
        return simulate;
    }


    /**
     * Sets the simulate value for this CSStartDeploymentParm.
     * 
     * @param simulate   * Set to true if want to do a simulated deployment.
     *                         Default is false.
     */
    public void setSimulate(boolean simulate) {
        this.simulate = simulate;
    }


    /**
     * Gets the asynchronous value for this CSStartDeploymentParm.
     * 
     * @return asynchronous   * Set to true run start deployment operation asynchronously.
     *                         Start deployment operation will return before
     * the deployment completes. Default is false.
     */
    public boolean isAsynchronous() {
        return asynchronous;
    }


    /**
     * Sets the asynchronous value for this CSStartDeploymentParm.
     * 
     * @param asynchronous   * Set to true run start deployment operation asynchronously.
     *                         Start deployment operation will return before
     * the deployment completes. Default is false.
     */
    public void setAsynchronous(boolean asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     * Gets the keyValuePairs value for this CSStartDeploymentParm.
     * 
     * @return keyValuePairs   * Key-value pair substitutions for the deployment
     *                         configuration file.
     */
    public com.interwoven.opendeploy.web.service.CSKeyValuePair[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this CSStartDeploymentParm.
     * 
     * @param keyValuePairs   * Key-value pair substitutions for the deployment
     *                         configuration file.
     */
    public void setKeyValuePairs(com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the externalTaskID value for this CSStartDeploymentParm.
     * 
     * @return externalTaskID   * External (workflow) task ID.
     */
    public java.lang.String getExternalTaskID() {
        return externalTaskID;
    }


    /**
     * Sets the externalTaskID value for this CSStartDeploymentParm.
     * 
     * @param externalTaskID   * External (workflow) task ID.
     */
    public void setExternalTaskID(java.lang.String externalTaskID) {
        this.externalTaskID = externalTaskID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSStartDeploymentParm)) return false;
        CSStartDeploymentParm other = (CSStartDeploymentParm) obj;
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
            ((this.deploymentInstance==null && other.getDeploymentInstance()==null) || 
             (this.deploymentInstance!=null &&
              this.deploymentInstance.equals(other.getDeploymentInstance()))) &&
            ((this.logLevel==null && other.getLogLevel()==null) || 
             (this.logLevel!=null &&
              this.logLevel.equals(other.getLogLevel()))) &&
            this.simulate == other.isSimulate() &&
            this.asynchronous == other.isAsynchronous() &&
            ((this.keyValuePairs==null && other.getKeyValuePairs()==null) || 
             (this.keyValuePairs!=null &&
              java.util.Arrays.equals(this.keyValuePairs, other.getKeyValuePairs()))) &&
            ((this.externalTaskID==null && other.getExternalTaskID()==null) || 
             (this.externalTaskID!=null &&
              this.externalTaskID.equals(other.getExternalTaskID())));
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
        if (getDeploymentInstance() != null) {
            _hashCode += getDeploymentInstance().hashCode();
        }
        if (getLogLevel() != null) {
            _hashCode += getLogLevel().hashCode();
        }
        _hashCode += (isSimulate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAsynchronous() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKeyValuePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValuePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValuePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalTaskID() != null) {
            _hashCode += getExternalTaskID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSStartDeploymentParm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSStartDeploymentParm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSDeployLogLevels"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simulate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "simulate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asynchronous");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asynchronous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSKeyValuePair"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalTaskID"));
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
