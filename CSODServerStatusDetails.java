/**
 * CSODServerStatusDetails.java
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
 *                    0    Running
 */
public class CSODServerStatusDetails  implements java.io.Serializable {
    private java.lang.String serverStatusInfo;

    private int serverStatusCode;

    /* Extra information related to the deployment status.
     *                         Most status do not have extra information. */
    private java.lang.String serverStatusMsg;

    public CSODServerStatusDetails() {
    }

    public CSODServerStatusDetails(
           java.lang.String serverStatusInfo,
           int serverStatusCode,
           java.lang.String serverStatusMsg) {
           this.serverStatusInfo = serverStatusInfo;
           this.serverStatusCode = serverStatusCode;
           this.serverStatusMsg = serverStatusMsg;
    }


    /**
     * Gets the serverStatusInfo value for this CSODServerStatusDetails.
     * 
     * @return serverStatusInfo
     */
    public java.lang.String getServerStatusInfo() {
        return serverStatusInfo;
    }


    /**
     * Sets the serverStatusInfo value for this CSODServerStatusDetails.
     * 
     * @param serverStatusInfo
     */
    public void setServerStatusInfo(java.lang.String serverStatusInfo) {
        this.serverStatusInfo = serverStatusInfo;
    }


    /**
     * Gets the serverStatusCode value for this CSODServerStatusDetails.
     * 
     * @return serverStatusCode
     */
    public int getServerStatusCode() {
        return serverStatusCode;
    }


    /**
     * Sets the serverStatusCode value for this CSODServerStatusDetails.
     * 
     * @param serverStatusCode
     */
    public void setServerStatusCode(int serverStatusCode) {
        this.serverStatusCode = serverStatusCode;
    }


    /**
     * Gets the serverStatusMsg value for this CSODServerStatusDetails.
     * 
     * @return serverStatusMsg   * Extra information related to the deployment status.
     *                         Most status do not have extra information.
     */
    public java.lang.String getServerStatusMsg() {
        return serverStatusMsg;
    }


    /**
     * Sets the serverStatusMsg value for this CSODServerStatusDetails.
     * 
     * @param serverStatusMsg   * Extra information related to the deployment status.
     *                         Most status do not have extra information.
     */
    public void setServerStatusMsg(java.lang.String serverStatusMsg) {
        this.serverStatusMsg = serverStatusMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSODServerStatusDetails)) return false;
        CSODServerStatusDetails other = (CSODServerStatusDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverStatusInfo==null && other.getServerStatusInfo()==null) || 
             (this.serverStatusInfo!=null &&
              this.serverStatusInfo.equals(other.getServerStatusInfo()))) &&
            this.serverStatusCode == other.getServerStatusCode() &&
            ((this.serverStatusMsg==null && other.getServerStatusMsg()==null) || 
             (this.serverStatusMsg!=null &&
              this.serverStatusMsg.equals(other.getServerStatusMsg())));
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
        if (getServerStatusInfo() != null) {
            _hashCode += getServerStatusInfo().hashCode();
        }
        _hashCode += getServerStatusCode();
        if (getServerStatusMsg() != null) {
            _hashCode += getServerStatusMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSODServerStatusDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatusDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatusMsg"));
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
