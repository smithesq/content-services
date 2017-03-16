/**
 * CSSchedGetStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Get Schedule deployment status.
 */
public class CSSchedGetStatus  implements java.io.Serializable {
    /* Get Schedule status . */
    private com.interwoven.opendeploy.web.service.CSSchedDeploy[] schedGetStatus;

    public CSSchedGetStatus() {
    }

    public CSSchedGetStatus(
           com.interwoven.opendeploy.web.service.CSSchedDeploy[] schedGetStatus) {
           this.schedGetStatus = schedGetStatus;
    }


    /**
     * Gets the schedGetStatus value for this CSSchedGetStatus.
     * 
     * @return schedGetStatus   * Get Schedule status .
     */
    public com.interwoven.opendeploy.web.service.CSSchedDeploy[] getSchedGetStatus() {
        return schedGetStatus;
    }


    /**
     * Sets the schedGetStatus value for this CSSchedGetStatus.
     * 
     * @param schedGetStatus   * Get Schedule status .
     */
    public void setSchedGetStatus(com.interwoven.opendeploy.web.service.CSSchedDeploy[] schedGetStatus) {
        this.schedGetStatus = schedGetStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSchedGetStatus)) return false;
        CSSchedGetStatus other = (CSSchedGetStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schedGetStatus==null && other.getSchedGetStatus()==null) || 
             (this.schedGetStatus!=null &&
              java.util.Arrays.equals(this.schedGetStatus, other.getSchedGetStatus())));
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
        if (getSchedGetStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedGetStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedGetStatus(), i);
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
        new org.apache.axis.description.TypeDesc(CSSchedGetStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGetStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedGetStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedGetStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy"));
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
