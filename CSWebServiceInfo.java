/**
 * CSWebServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Used to return information on a Web Service.
 */
public class CSWebServiceInfo  implements java.io.Serializable {
    private java.lang.String CSWebServiceName;

    private com.interwoven.opendeploy.web.service.CSVersion CSWebServiceVersion;

    private java.lang.String operatingSystemName;

    private java.lang.String operatingSystemArchitecture;

    private java.lang.String operatingSystemVersion;

    private java.lang.String fileSeparator;

    public CSWebServiceInfo() {
    }

    public CSWebServiceInfo(
           java.lang.String CSWebServiceName,
           com.interwoven.opendeploy.web.service.CSVersion CSWebServiceVersion,
           java.lang.String operatingSystemName,
           java.lang.String operatingSystemArchitecture,
           java.lang.String operatingSystemVersion,
           java.lang.String fileSeparator) {
           this.CSWebServiceName = CSWebServiceName;
           this.CSWebServiceVersion = CSWebServiceVersion;
           this.operatingSystemName = operatingSystemName;
           this.operatingSystemArchitecture = operatingSystemArchitecture;
           this.operatingSystemVersion = operatingSystemVersion;
           this.fileSeparator = fileSeparator;
    }


    /**
     * Gets the CSWebServiceName value for this CSWebServiceInfo.
     * 
     * @return CSWebServiceName
     */
    public java.lang.String getCSWebServiceName() {
        return CSWebServiceName;
    }


    /**
     * Sets the CSWebServiceName value for this CSWebServiceInfo.
     * 
     * @param CSWebServiceName
     */
    public void setCSWebServiceName(java.lang.String CSWebServiceName) {
        this.CSWebServiceName = CSWebServiceName;
    }


    /**
     * Gets the CSWebServiceVersion value for this CSWebServiceInfo.
     * 
     * @return CSWebServiceVersion
     */
    public com.interwoven.opendeploy.web.service.CSVersion getCSWebServiceVersion() {
        return CSWebServiceVersion;
    }


    /**
     * Sets the CSWebServiceVersion value for this CSWebServiceInfo.
     * 
     * @param CSWebServiceVersion
     */
    public void setCSWebServiceVersion(com.interwoven.opendeploy.web.service.CSVersion CSWebServiceVersion) {
        this.CSWebServiceVersion = CSWebServiceVersion;
    }


    /**
     * Gets the operatingSystemName value for this CSWebServiceInfo.
     * 
     * @return operatingSystemName
     */
    public java.lang.String getOperatingSystemName() {
        return operatingSystemName;
    }


    /**
     * Sets the operatingSystemName value for this CSWebServiceInfo.
     * 
     * @param operatingSystemName
     */
    public void setOperatingSystemName(java.lang.String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }


    /**
     * Gets the operatingSystemArchitecture value for this CSWebServiceInfo.
     * 
     * @return operatingSystemArchitecture
     */
    public java.lang.String getOperatingSystemArchitecture() {
        return operatingSystemArchitecture;
    }


    /**
     * Sets the operatingSystemArchitecture value for this CSWebServiceInfo.
     * 
     * @param operatingSystemArchitecture
     */
    public void setOperatingSystemArchitecture(java.lang.String operatingSystemArchitecture) {
        this.operatingSystemArchitecture = operatingSystemArchitecture;
    }


    /**
     * Gets the operatingSystemVersion value for this CSWebServiceInfo.
     * 
     * @return operatingSystemVersion
     */
    public java.lang.String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }


    /**
     * Sets the operatingSystemVersion value for this CSWebServiceInfo.
     * 
     * @param operatingSystemVersion
     */
    public void setOperatingSystemVersion(java.lang.String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }


    /**
     * Gets the fileSeparator value for this CSWebServiceInfo.
     * 
     * @return fileSeparator
     */
    public java.lang.String getFileSeparator() {
        return fileSeparator;
    }


    /**
     * Sets the fileSeparator value for this CSWebServiceInfo.
     * 
     * @param fileSeparator
     */
    public void setFileSeparator(java.lang.String fileSeparator) {
        this.fileSeparator = fileSeparator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSWebServiceInfo)) return false;
        CSWebServiceInfo other = (CSWebServiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSWebServiceName==null && other.getCSWebServiceName()==null) || 
             (this.CSWebServiceName!=null &&
              this.CSWebServiceName.equals(other.getCSWebServiceName()))) &&
            ((this.CSWebServiceVersion==null && other.getCSWebServiceVersion()==null) || 
             (this.CSWebServiceVersion!=null &&
              this.CSWebServiceVersion.equals(other.getCSWebServiceVersion()))) &&
            ((this.operatingSystemName==null && other.getOperatingSystemName()==null) || 
             (this.operatingSystemName!=null &&
              this.operatingSystemName.equals(other.getOperatingSystemName()))) &&
            ((this.operatingSystemArchitecture==null && other.getOperatingSystemArchitecture()==null) || 
             (this.operatingSystemArchitecture!=null &&
              this.operatingSystemArchitecture.equals(other.getOperatingSystemArchitecture()))) &&
            ((this.operatingSystemVersion==null && other.getOperatingSystemVersion()==null) || 
             (this.operatingSystemVersion!=null &&
              this.operatingSystemVersion.equals(other.getOperatingSystemVersion()))) &&
            ((this.fileSeparator==null && other.getFileSeparator()==null) || 
             (this.fileSeparator!=null &&
              this.fileSeparator.equals(other.getFileSeparator())));
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
        if (getCSWebServiceName() != null) {
            _hashCode += getCSWebServiceName().hashCode();
        }
        if (getCSWebServiceVersion() != null) {
            _hashCode += getCSWebServiceVersion().hashCode();
        }
        if (getOperatingSystemName() != null) {
            _hashCode += getOperatingSystemName().hashCode();
        }
        if (getOperatingSystemArchitecture() != null) {
            _hashCode += getOperatingSystemArchitecture().hashCode();
        }
        if (getOperatingSystemVersion() != null) {
            _hashCode += getOperatingSystemVersion().hashCode();
        }
        if (getFileSeparator() != null) {
            _hashCode += getFileSeparator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSWebServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSWebServiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSWebServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSWebServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSWebServiceVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSWebServiceVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSVersion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatingSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemArchitecture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatingSystemArchitecture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatingSystemVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSeparator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSeparator"));
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
