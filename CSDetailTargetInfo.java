/**
 * CSDetailTargetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Detail target information.
 */
public class CSDetailTargetInfo  implements java.io.Serializable {
    private java.lang.String targetName;

    private java.lang.String targetIPAddr;

    private java.lang.String targetNextDeploymentName;

    /* Elasped time (milleseconds) this target 
     *                         of the deployment has been running. */
    private long targetElapsedTime;

    /* Average data rate (KB/second) for this
     *                         target of the deployment. */
    private java.lang.String targetAvgDataRate;

    private com.interwoven.opendeploy.web.service.CSTargetProgressPhase[] targetProgressPhases;

    public CSDetailTargetInfo() {
    }

    public CSDetailTargetInfo(
           java.lang.String targetName,
           java.lang.String targetIPAddr,
           java.lang.String targetNextDeploymentName,
           long targetElapsedTime,
           java.lang.String targetAvgDataRate,
           com.interwoven.opendeploy.web.service.CSTargetProgressPhase[] targetProgressPhases) {
           this.targetName = targetName;
           this.targetIPAddr = targetIPAddr;
           this.targetNextDeploymentName = targetNextDeploymentName;
           this.targetElapsedTime = targetElapsedTime;
           this.targetAvgDataRate = targetAvgDataRate;
           this.targetProgressPhases = targetProgressPhases;
    }


    /**
     * Gets the targetName value for this CSDetailTargetInfo.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this CSDetailTargetInfo.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetIPAddr value for this CSDetailTargetInfo.
     * 
     * @return targetIPAddr
     */
    public java.lang.String getTargetIPAddr() {
        return targetIPAddr;
    }


    /**
     * Sets the targetIPAddr value for this CSDetailTargetInfo.
     * 
     * @param targetIPAddr
     */
    public void setTargetIPAddr(java.lang.String targetIPAddr) {
        this.targetIPAddr = targetIPAddr;
    }


    /**
     * Gets the targetNextDeploymentName value for this CSDetailTargetInfo.
     * 
     * @return targetNextDeploymentName
     */
    public java.lang.String getTargetNextDeploymentName() {
        return targetNextDeploymentName;
    }


    /**
     * Sets the targetNextDeploymentName value for this CSDetailTargetInfo.
     * 
     * @param targetNextDeploymentName
     */
    public void setTargetNextDeploymentName(java.lang.String targetNextDeploymentName) {
        this.targetNextDeploymentName = targetNextDeploymentName;
    }


    /**
     * Gets the targetElapsedTime value for this CSDetailTargetInfo.
     * 
     * @return targetElapsedTime   * Elasped time (milleseconds) this target 
     *                         of the deployment has been running.
     */
    public long getTargetElapsedTime() {
        return targetElapsedTime;
    }


    /**
     * Sets the targetElapsedTime value for this CSDetailTargetInfo.
     * 
     * @param targetElapsedTime   * Elasped time (milleseconds) this target 
     *                         of the deployment has been running.
     */
    public void setTargetElapsedTime(long targetElapsedTime) {
        this.targetElapsedTime = targetElapsedTime;
    }


    /**
     * Gets the targetAvgDataRate value for this CSDetailTargetInfo.
     * 
     * @return targetAvgDataRate   * Average data rate (KB/second) for this
     *                         target of the deployment.
     */
    public java.lang.String getTargetAvgDataRate() {
        return targetAvgDataRate;
    }


    /**
     * Sets the targetAvgDataRate value for this CSDetailTargetInfo.
     * 
     * @param targetAvgDataRate   * Average data rate (KB/second) for this
     *                         target of the deployment.
     */
    public void setTargetAvgDataRate(java.lang.String targetAvgDataRate) {
        this.targetAvgDataRate = targetAvgDataRate;
    }


    /**
     * Gets the targetProgressPhases value for this CSDetailTargetInfo.
     * 
     * @return targetProgressPhases
     */
    public com.interwoven.opendeploy.web.service.CSTargetProgressPhase[] getTargetProgressPhases() {
        return targetProgressPhases;
    }


    /**
     * Sets the targetProgressPhases value for this CSDetailTargetInfo.
     * 
     * @param targetProgressPhases
     */
    public void setTargetProgressPhases(com.interwoven.opendeploy.web.service.CSTargetProgressPhase[] targetProgressPhases) {
        this.targetProgressPhases = targetProgressPhases;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSDetailTargetInfo)) return false;
        CSDetailTargetInfo other = (CSDetailTargetInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetName==null && other.getTargetName()==null) || 
             (this.targetName!=null &&
              this.targetName.equals(other.getTargetName()))) &&
            ((this.targetIPAddr==null && other.getTargetIPAddr()==null) || 
             (this.targetIPAddr!=null &&
              this.targetIPAddr.equals(other.getTargetIPAddr()))) &&
            ((this.targetNextDeploymentName==null && other.getTargetNextDeploymentName()==null) || 
             (this.targetNextDeploymentName!=null &&
              this.targetNextDeploymentName.equals(other.getTargetNextDeploymentName()))) &&
            this.targetElapsedTime == other.getTargetElapsedTime() &&
            ((this.targetAvgDataRate==null && other.getTargetAvgDataRate()==null) || 
             (this.targetAvgDataRate!=null &&
              this.targetAvgDataRate.equals(other.getTargetAvgDataRate()))) &&
            ((this.targetProgressPhases==null && other.getTargetProgressPhases()==null) || 
             (this.targetProgressPhases!=null &&
              java.util.Arrays.equals(this.targetProgressPhases, other.getTargetProgressPhases())));
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
        if (getTargetName() != null) {
            _hashCode += getTargetName().hashCode();
        }
        if (getTargetIPAddr() != null) {
            _hashCode += getTargetIPAddr().hashCode();
        }
        if (getTargetNextDeploymentName() != null) {
            _hashCode += getTargetNextDeploymentName().hashCode();
        }
        _hashCode += new Long(getTargetElapsedTime()).hashCode();
        if (getTargetAvgDataRate() != null) {
            _hashCode += getTargetAvgDataRate().hashCode();
        }
        if (getTargetProgressPhases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetProgressPhases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetProgressPhases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSDetailTargetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailTargetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetIPAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetIPAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNextDeploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetNextDeploymentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetElapsedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetElapsedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAvgDataRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAvgDataRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProgressPhases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetProgressPhases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSTargetProgressPhase"));
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
