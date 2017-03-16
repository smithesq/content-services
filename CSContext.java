/**
 * CSContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Represents the user's context that is passed between the CSSDK
 *             client and server.
 */
public class CSContext  implements java.io.Serializable {
    private java.lang.String locale;

    /* An application specific context, usually a string unique to
     * the application. */
    private java.lang.String appContext;

    /* A session string representing the user's context. This string
     * can be used in the beginSessionUsingSessionString method. */
    private java.lang.String sessionString;

    private java.lang.String serverName;

    /* The domain that the cookie set by a web appliation is
     * 			recommended to be associated with */
    private java.lang.String cookieDomain;

    /* A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 			a fully qualified domain name of the host that the CSF server is
     * running
     * 			on is recommeded to be used. This id should be unique among all
     * the CSF
     * 			server installed within the organization. */
    private java.lang.String cookieName;

    public CSContext() {
    }

    public CSContext(
           java.lang.String locale,
           java.lang.String appContext,
           java.lang.String sessionString,
           java.lang.String serverName,
           java.lang.String cookieDomain,
           java.lang.String cookieName) {
           this.locale = locale;
           this.appContext = appContext;
           this.sessionString = sessionString;
           this.serverName = serverName;
           this.cookieDomain = cookieDomain;
           this.cookieName = cookieName;
    }


    /**
     * Gets the locale value for this CSContext.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this CSContext.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the appContext value for this CSContext.
     * 
     * @return appContext   * An application specific context, usually a string unique to
     * the application.
     */
    public java.lang.String getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this CSContext.
     * 
     * @param appContext   * An application specific context, usually a string unique to
     * the application.
     */
    public void setAppContext(java.lang.String appContext) {
        this.appContext = appContext;
    }


    /**
     * Gets the sessionString value for this CSContext.
     * 
     * @return sessionString   * A session string representing the user's context. This string
     * can be used in the beginSessionUsingSessionString method.
     */
    public java.lang.String getSessionString() {
        return sessionString;
    }


    /**
     * Sets the sessionString value for this CSContext.
     * 
     * @param sessionString   * A session string representing the user's context. This string
     * can be used in the beginSessionUsingSessionString method.
     */
    public void setSessionString(java.lang.String sessionString) {
        this.sessionString = sessionString;
    }


    /**
     * Gets the serverName value for this CSContext.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this CSContext.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the cookieDomain value for this CSContext.
     * 
     * @return cookieDomain   * The domain that the cookie set by a web appliation is
     * 			recommended to be associated with
     */
    public java.lang.String getCookieDomain() {
        return cookieDomain;
    }


    /**
     * Sets the cookieDomain value for this CSContext.
     * 
     * @param cookieDomain   * The domain that the cookie set by a web appliation is
     * 			recommended to be associated with
     */
    public void setCookieDomain(java.lang.String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }


    /**
     * Gets the cookieName value for this CSContext.
     * 
     * @return cookieName   * A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 			a fully qualified domain name of the host that the CSF server is
     * running
     * 			on is recommeded to be used. This id should be unique among all
     * the CSF
     * 			server installed within the organization.
     */
    public java.lang.String getCookieName() {
        return cookieName;
    }


    /**
     * Sets the cookieName value for this CSContext.
     * 
     * @param cookieName   * A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 			a fully qualified domain name of the host that the CSF server is
     * running
     * 			on is recommeded to be used. This id should be unique among all
     * the CSF
     * 			server installed within the organization.
     */
    public void setCookieName(java.lang.String cookieName) {
        this.cookieName = cookieName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSContext)) return false;
        CSContext other = (CSContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.appContext==null && other.getAppContext()==null) || 
             (this.appContext!=null &&
              this.appContext.equals(other.getAppContext()))) &&
            ((this.sessionString==null && other.getSessionString()==null) || 
             (this.sessionString!=null &&
              this.sessionString.equals(other.getSessionString()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.cookieDomain==null && other.getCookieDomain()==null) || 
             (this.cookieDomain!=null &&
              this.cookieDomain.equals(other.getCookieDomain()))) &&
            ((this.cookieName==null && other.getCookieName()==null) || 
             (this.cookieName!=null &&
              this.cookieName.equals(other.getCookieName())));
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getAppContext() != null) {
            _hashCode += getAppContext().hashCode();
        }
        if (getSessionString() != null) {
            _hashCode += getSessionString().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getCookieDomain() != null) {
            _hashCode += getCookieDomain().hashCode();
        }
        if (getCookieName() != null) {
            _hashCode += getCookieName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieName"));
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
