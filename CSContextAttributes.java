/**
 * CSContextAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Returned as the result of a call to getCSContextAttributes
 */
public class CSContextAttributes  implements java.io.Serializable {
    /* User name. Domain qualified in case Access Service is on Windows
     * platform. */
    private java.lang.String userName;

    /* Application data.
     *                 This is a string in the format of key=value pairs
     *                 separated by semicolon. For example:
     *                    key1=value1;key2=value2;key3=value3
     *                 Key names started with "iw" (case insensitive) are
     * reserved for use by Interwoven products.
     *                 Known reserved key names:
     *                   iwodrole - OpenDeploy role name
     *                              (examples: iwodrole=od-admin, iwodrole=od-user)
     * iwtsrole - TeamSite role name
     *                              (examples: iwtsrole=master) */
    private java.lang.String applicationData;

    /* User password. */
    private java.lang.String password;

    /* Life time of the CSContext in milliseconds, set at the time
     * it
     *                was created. */
    private long lifeTime;

    /* Time in milliseconds until the CSContext expires. */
    private long timeLeft;

    /* Type of authentication cookie. */
    private java.lang.String cookieType;

    /* The domain that the cookie set by a web appliation is
     * 				recommended to be associated with */
    private java.lang.String cookieDomain;

    /* A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 	   		    a fully qualified domain name of the host that the CSF server
     * is running
     * 	   		    on is recommeded to be used. This id should be unique among
     * all the CSF
     * 	   		    server installed within the organization. */
    private java.lang.String cookieName;

    /* A string unique to the application requesting authentication.
     * Use to identify the application. */
    private java.lang.String appContext;

    /* Hostname of the server requesting the CSContext. */
    private java.lang.String serverName;

    /* Application locale. */
    private java.lang.String locale;

    public CSContextAttributes() {
    }

    public CSContextAttributes(
           java.lang.String userName,
           java.lang.String applicationData,
           java.lang.String password,
           long lifeTime,
           long timeLeft,
           java.lang.String cookieType,
           java.lang.String cookieDomain,
           java.lang.String cookieName,
           java.lang.String appContext,
           java.lang.String serverName,
           java.lang.String locale) {
           this.userName = userName;
           this.applicationData = applicationData;
           this.password = password;
           this.lifeTime = lifeTime;
           this.timeLeft = timeLeft;
           this.cookieType = cookieType;
           this.cookieDomain = cookieDomain;
           this.cookieName = cookieName;
           this.appContext = appContext;
           this.serverName = serverName;
           this.locale = locale;
    }


    /**
     * Gets the userName value for this CSContextAttributes.
     * 
     * @return userName   * User name. Domain qualified in case Access Service is on Windows
     * platform.
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CSContextAttributes.
     * 
     * @param userName   * User name. Domain qualified in case Access Service is on Windows
     * platform.
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the applicationData value for this CSContextAttributes.
     * 
     * @return applicationData   * Application data.
     *                 This is a string in the format of key=value pairs
     *                 separated by semicolon. For example:
     *                    key1=value1;key2=value2;key3=value3
     *                 Key names started with "iw" (case insensitive) are
     * reserved for use by Interwoven products.
     *                 Known reserved key names:
     *                   iwodrole - OpenDeploy role name
     *                              (examples: iwodrole=od-admin, iwodrole=od-user)
     * iwtsrole - TeamSite role name
     *                              (examples: iwtsrole=master)
     */
    public java.lang.String getApplicationData() {
        return applicationData;
    }


    /**
     * Sets the applicationData value for this CSContextAttributes.
     * 
     * @param applicationData   * Application data.
     *                 This is a string in the format of key=value pairs
     *                 separated by semicolon. For example:
     *                    key1=value1;key2=value2;key3=value3
     *                 Key names started with "iw" (case insensitive) are
     * reserved for use by Interwoven products.
     *                 Known reserved key names:
     *                   iwodrole - OpenDeploy role name
     *                              (examples: iwodrole=od-admin, iwodrole=od-user)
     * iwtsrole - TeamSite role name
     *                              (examples: iwtsrole=master)
     */
    public void setApplicationData(java.lang.String applicationData) {
        this.applicationData = applicationData;
    }


    /**
     * Gets the password value for this CSContextAttributes.
     * 
     * @return password   * User password.
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CSContextAttributes.
     * 
     * @param password   * User password.
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the lifeTime value for this CSContextAttributes.
     * 
     * @return lifeTime   * Life time of the CSContext in milliseconds, set at the time
     * it
     *                was created.
     */
    public long getLifeTime() {
        return lifeTime;
    }


    /**
     * Sets the lifeTime value for this CSContextAttributes.
     * 
     * @param lifeTime   * Life time of the CSContext in milliseconds, set at the time
     * it
     *                was created.
     */
    public void setLifeTime(long lifeTime) {
        this.lifeTime = lifeTime;
    }


    /**
     * Gets the timeLeft value for this CSContextAttributes.
     * 
     * @return timeLeft   * Time in milliseconds until the CSContext expires.
     */
    public long getTimeLeft() {
        return timeLeft;
    }


    /**
     * Sets the timeLeft value for this CSContextAttributes.
     * 
     * @param timeLeft   * Time in milliseconds until the CSContext expires.
     */
    public void setTimeLeft(long timeLeft) {
        this.timeLeft = timeLeft;
    }


    /**
     * Gets the cookieType value for this CSContextAttributes.
     * 
     * @return cookieType   * Type of authentication cookie.
     */
    public java.lang.String getCookieType() {
        return cookieType;
    }


    /**
     * Sets the cookieType value for this CSContextAttributes.
     * 
     * @param cookieType   * Type of authentication cookie.
     */
    public void setCookieType(java.lang.String cookieType) {
        this.cookieType = cookieType;
    }


    /**
     * Gets the cookieDomain value for this CSContextAttributes.
     * 
     * @return cookieDomain   * The domain that the cookie set by a web appliation is
     * 				recommended to be associated with
     */
    public java.lang.String getCookieDomain() {
        return cookieDomain;
    }


    /**
     * Sets the cookieDomain value for this CSContextAttributes.
     * 
     * @param cookieDomain   * The domain that the cookie set by a web appliation is
     * 				recommended to be associated with
     */
    public void setCookieDomain(java.lang.String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }


    /**
     * Gets the cookieName value for this CSContextAttributes.
     * 
     * @return cookieName   * A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 	   		    a fully qualified domain name of the host that the CSF server
     * is running
     * 	   		    on is recommeded to be used. This id should be unique among
     * all the CSF
     * 	   		    server installed within the organization.
     */
    public java.lang.String getCookieName() {
        return cookieName;
    }


    /**
     * Sets the cookieName value for this CSContextAttributes.
     * 
     * @param cookieName   * A uniqe id that idenitifies the CSF server instance. An IP
     * address or
     * 	   		    a fully qualified domain name of the host that the CSF server
     * is running
     * 	   		    on is recommeded to be used. This id should be unique among
     * all the CSF
     * 	   		    server installed within the organization.
     */
    public void setCookieName(java.lang.String cookieName) {
        this.cookieName = cookieName;
    }


    /**
     * Gets the appContext value for this CSContextAttributes.
     * 
     * @return appContext   * A string unique to the application requesting authentication.
     * Use to identify the application.
     */
    public java.lang.String getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this CSContextAttributes.
     * 
     * @param appContext   * A string unique to the application requesting authentication.
     * Use to identify the application.
     */
    public void setAppContext(java.lang.String appContext) {
        this.appContext = appContext;
    }


    /**
     * Gets the serverName value for this CSContextAttributes.
     * 
     * @return serverName   * Hostname of the server requesting the CSContext.
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this CSContextAttributes.
     * 
     * @param serverName   * Hostname of the server requesting the CSContext.
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the locale value for this CSContextAttributes.
     * 
     * @return locale   * Application locale.
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this CSContextAttributes.
     * 
     * @param locale   * Application locale.
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSContextAttributes)) return false;
        CSContextAttributes other = (CSContextAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.applicationData==null && other.getApplicationData()==null) || 
             (this.applicationData!=null &&
              this.applicationData.equals(other.getApplicationData()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.lifeTime == other.getLifeTime() &&
            this.timeLeft == other.getTimeLeft() &&
            ((this.cookieType==null && other.getCookieType()==null) || 
             (this.cookieType!=null &&
              this.cookieType.equals(other.getCookieType()))) &&
            ((this.cookieDomain==null && other.getCookieDomain()==null) || 
             (this.cookieDomain!=null &&
              this.cookieDomain.equals(other.getCookieDomain()))) &&
            ((this.cookieName==null && other.getCookieName()==null) || 
             (this.cookieName!=null &&
              this.cookieName.equals(other.getCookieName()))) &&
            ((this.appContext==null && other.getAppContext()==null) || 
             (this.appContext!=null &&
              this.appContext.equals(other.getAppContext()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getApplicationData() != null) {
            _hashCode += getApplicationData().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += new Long(getLifeTime()).hashCode();
        _hashCode += new Long(getTimeLeft()).hashCode();
        if (getCookieType() != null) {
            _hashCode += getCookieType().hashCode();
        }
        if (getCookieDomain() != null) {
            _hashCode += getCookieDomain().hashCode();
        }
        if (getCookieName() != null) {
            _hashCode += getCookieName().hashCode();
        }
        if (getAppContext() != null) {
            _hashCode += getAppContext().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSContextAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContextAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appContext"));
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
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
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
