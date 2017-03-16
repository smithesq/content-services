/**
 * CSGeneralTargetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Target information.
 */
public class CSGeneralTargetInfo  implements java.io.Serializable {
    private java.lang.String targetName;

    private java.lang.String targetIPAddr;

    private java.lang.String targetNextDeploymentName;

    public CSGeneralTargetInfo() {
    }

    public CSGeneralTargetInfo(
           java.lang.String targetName,
           java.lang.String targetIPAddr,
           java.lang.String targetNextDeploymentName) {
           this.targetName = targetName;
           this.targetIPAddr = targetIPAddr;
           this.targetNextDeploymentName = targetNextDeploymentName;
    }


    /**
     * Gets the targetName value for this CSGeneralTargetInfo.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this CSGeneralTargetInfo.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetIPAddr value for this CSGeneralTargetInfo.
     * 
     * @return targetIPAddr
     */
    public java.lang.String getTargetIPAddr() {
        return targetIPAddr;
    }


    /**
     * Sets the targetIPAddr value for this CSGeneralTargetInfo.
     * 
     * @param targetIPAddr
     */
    public void setTargetIPAddr(java.lang.String targetIPAddr) {
        this.targetIPAddr = targetIPAddr;
    }


    /**
     * Gets the targetNextDeploymentName value for this CSGeneralTargetInfo.
     * 
     * @return targetNextDeploymentName
     */
    public java.lang.String getTargetNextDeploymentName() {
        return targetNextDeploymentName;
    }


    /**
     * Sets the targetNextDeploymentName value for this CSGeneralTargetInfo.
     * 
     * @param targetNextDeploymentName
     */
    public void setTargetNextDeploymentName(java.lang.String targetNextDeploymentName) {
        this.targetNextDeploymentName = targetNextDeploymentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSGeneralTargetInfo)) return false;
        CSGeneralTargetInfo other = (CSGeneralTargetInfo) obj;
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
              this.targetNextDeploymentName.equals(other.getTargetNextDeploymentName())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSGeneralTargetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralTargetInfo"));
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
