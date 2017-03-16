/**
 * CSODServerStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Server status returned.
 */
public class CSODServerStatus  implements java.io.Serializable {
    /* Current status of the server. */
    private com.interwoven.opendeploy.web.service.CSODServerStatusDetails odServerStatusDetails;

    /* Number of active deployments. */
    private int activeDeployments;

    public CSODServerStatus() {
    }

    public CSODServerStatus(
           com.interwoven.opendeploy.web.service.CSODServerStatusDetails odServerStatusDetails,
           int activeDeployments) {
           this.odServerStatusDetails = odServerStatusDetails;
           this.activeDeployments = activeDeployments;
    }


    /**
     * Gets the odServerStatusDetails value for this CSODServerStatus.
     * 
     * @return odServerStatusDetails   * Current status of the server.
     */
    public com.interwoven.opendeploy.web.service.CSODServerStatusDetails getOdServerStatusDetails() {
        return odServerStatusDetails;
    }


    /**
     * Sets the odServerStatusDetails value for this CSODServerStatus.
     * 
     * @param odServerStatusDetails   * Current status of the server.
     */
    public void setOdServerStatusDetails(com.interwoven.opendeploy.web.service.CSODServerStatusDetails odServerStatusDetails) {
        this.odServerStatusDetails = odServerStatusDetails;
    }


    /**
     * Gets the activeDeployments value for this CSODServerStatus.
     * 
     * @return activeDeployments   * Number of active deployments.
     */
    public int getActiveDeployments() {
        return activeDeployments;
    }


    /**
     * Sets the activeDeployments value for this CSODServerStatus.
     * 
     * @param activeDeployments   * Number of active deployments.
     */
    public void setActiveDeployments(int activeDeployments) {
        this.activeDeployments = activeDeployments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSODServerStatus)) return false;
        CSODServerStatus other = (CSODServerStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.odServerStatusDetails==null && other.getOdServerStatusDetails()==null) || 
             (this.odServerStatusDetails!=null &&
              this.odServerStatusDetails.equals(other.getOdServerStatusDetails()))) &&
            this.activeDeployments == other.getActiveDeployments();
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
        if (getOdServerStatusDetails() != null) {
            _hashCode += getOdServerStatusDetails().hashCode();
        }
        _hashCode += getActiveDeployments();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSODServerStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odServerStatusDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odServerStatusDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatusDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDeployments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeDeployments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
