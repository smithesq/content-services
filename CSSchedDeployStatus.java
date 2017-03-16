/**
 * CSSchedDeployStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Schedule deployment status.
 */
public class CSSchedDeployStatus  implements java.io.Serializable {
    /* Schedule Deployment status. */
    private com.interwoven.opendeploy.web.service.CSSchedDeploy scheduleInfo;

    public CSSchedDeployStatus() {
    }

    public CSSchedDeployStatus(
           com.interwoven.opendeploy.web.service.CSSchedDeploy scheduleInfo) {
           this.scheduleInfo = scheduleInfo;
    }


    /**
     * Gets the scheduleInfo value for this CSSchedDeployStatus.
     * 
     * @return scheduleInfo   * Schedule Deployment status.
     */
    public com.interwoven.opendeploy.web.service.CSSchedDeploy getScheduleInfo() {
        return scheduleInfo;
    }


    /**
     * Sets the scheduleInfo value for this CSSchedDeployStatus.
     * 
     * @param scheduleInfo   * Schedule Deployment status.
     */
    public void setScheduleInfo(com.interwoven.opendeploy.web.service.CSSchedDeploy scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSchedDeployStatus)) return false;
        CSSchedDeployStatus other = (CSSchedDeployStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleInfo==null && other.getScheduleInfo()==null) || 
             (this.scheduleInfo!=null &&
              this.scheduleInfo.equals(other.getScheduleInfo())));
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
        if (getScheduleInfo() != null) {
            _hashCode += getScheduleInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSchedDeployStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeployStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy"));
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
