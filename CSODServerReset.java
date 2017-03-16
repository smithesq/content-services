/**
 * CSODServerReset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * OD Server Reset .
 */
public class CSODServerReset  implements java.io.Serializable {
    /* OD Server version */
    private int resetStatus;

    /* OD Server version */
    private java.lang.String resetMsg;

    public CSODServerReset() {
    }

    public CSODServerReset(
           int resetStatus,
           java.lang.String resetMsg) {
           this.resetStatus = resetStatus;
           this.resetMsg = resetMsg;
    }


    /**
     * Gets the resetStatus value for this CSODServerReset.
     * 
     * @return resetStatus   * OD Server version
     */
    public int getResetStatus() {
        return resetStatus;
    }


    /**
     * Sets the resetStatus value for this CSODServerReset.
     * 
     * @param resetStatus   * OD Server version
     */
    public void setResetStatus(int resetStatus) {
        this.resetStatus = resetStatus;
    }


    /**
     * Gets the resetMsg value for this CSODServerReset.
     * 
     * @return resetMsg   * OD Server version
     */
    public java.lang.String getResetMsg() {
        return resetMsg;
    }


    /**
     * Sets the resetMsg value for this CSODServerReset.
     * 
     * @param resetMsg   * OD Server version
     */
    public void setResetMsg(java.lang.String resetMsg) {
        this.resetMsg = resetMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSODServerReset)) return false;
        CSODServerReset other = (CSODServerReset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resetStatus == other.getResetStatus() &&
            ((this.resetMsg==null && other.getResetMsg()==null) || 
             (this.resetMsg!=null &&
              this.resetMsg.equals(other.getResetMsg())));
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
        _hashCode += getResetStatus();
        if (getResetMsg() != null) {
            _hashCode += getResetMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSODServerReset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerReset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resetStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resetMsg"));
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
