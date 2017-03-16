/**
 * CSSchedDeploy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Schedule deployment parameters.
 */
public class CSSchedDeploy  implements java.io.Serializable {
    /* Name of deployment to run. */
    private java.lang.String deploymentName;

    /* Deployment ID . */
    private java.lang.String deploymentID;

    /* Deployment instance value. It is appended to the
     *                         deployment name to form a unique name. */
    private java.lang.String deploymentInstance;

    /* Deployment description. */
    private java.lang.String description;

    /* Deployment start time. */
    private java.util.Calendar startTime;

    /* Deployment end time. */
    private java.util.Calendar endTime;

    /* Key-value pair substitutions for the deployment
     *                         configuration file. */
    private com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs;

    /* This specifies the deployment frequency.
     *                        1 -   Schedule deployment once. 
     *                        2 -   Schedule deployment SUB-HOURLY. 
     *                                 In this type, you should set the minuteInterval
     * field. 
     *                        3 -   Schedule deployment HOURLY. 
     *                                 In this type, you should set the hourInterval
     * field. 
     *                        4 -   Schedule deployment DAILY. 
     *                                 In this type, you should set the dayInterval
     * field. 
     *                        5 -   Schedule deployment WEEKLY. 
     *                                 In this type, you should set the weekInterval
     * as well as field dayOfWeek
     *                        6 -   Schedule deployment MONTHLY. 
     *                                 In this type, you should set the field
     * daysOfMonth */
    private int deploymentFrequency;

    /* Minute Interval. */
    private int minuteInterval;

    /* Hour Interval. */
    private int hourInterval;

    /* Day Interval. */
    private int dayInterval;

    /* Week Interval. */
    private int weekInterval;

    /* Day of the Week. It should be spelled out like Monday, TuesDay
     * etc.
     *                        This is a required field for scheduling WEEKLY
     * deployment. */
    private java.lang.String dayOfWeek;

    /* Days of Month for monthly deployment type. */
    private com.interwoven.opendeploy.web.service.CSDaysOfMonth[] daysOfMonth;

    public CSSchedDeploy() {
    }

    public CSSchedDeploy(
           java.lang.String deploymentName,
           java.lang.String deploymentID,
           java.lang.String deploymentInstance,
           java.lang.String description,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs,
           int deploymentFrequency,
           int minuteInterval,
           int hourInterval,
           int dayInterval,
           int weekInterval,
           java.lang.String dayOfWeek,
           com.interwoven.opendeploy.web.service.CSDaysOfMonth[] daysOfMonth) {
           this.deploymentName = deploymentName;
           this.deploymentID = deploymentID;
           this.deploymentInstance = deploymentInstance;
           this.description = description;
           this.startTime = startTime;
           this.endTime = endTime;
           this.keyValuePairs = keyValuePairs;
           this.deploymentFrequency = deploymentFrequency;
           this.minuteInterval = minuteInterval;
           this.hourInterval = hourInterval;
           this.dayInterval = dayInterval;
           this.weekInterval = weekInterval;
           this.dayOfWeek = dayOfWeek;
           this.daysOfMonth = daysOfMonth;
    }


    /**
     * Gets the deploymentName value for this CSSchedDeploy.
     * 
     * @return deploymentName   * Name of deployment to run.
     */
    public java.lang.String getDeploymentName() {
        return deploymentName;
    }


    /**
     * Sets the deploymentName value for this CSSchedDeploy.
     * 
     * @param deploymentName   * Name of deployment to run.
     */
    public void setDeploymentName(java.lang.String deploymentName) {
        this.deploymentName = deploymentName;
    }


    /**
     * Gets the deploymentID value for this CSSchedDeploy.
     * 
     * @return deploymentID   * Deployment ID .
     */
    public java.lang.String getDeploymentID() {
        return deploymentID;
    }


    /**
     * Sets the deploymentID value for this CSSchedDeploy.
     * 
     * @param deploymentID   * Deployment ID .
     */
    public void setDeploymentID(java.lang.String deploymentID) {
        this.deploymentID = deploymentID;
    }


    /**
     * Gets the deploymentInstance value for this CSSchedDeploy.
     * 
     * @return deploymentInstance   * Deployment instance value. It is appended to the
     *                         deployment name to form a unique name.
     */
    public java.lang.String getDeploymentInstance() {
        return deploymentInstance;
    }


    /**
     * Sets the deploymentInstance value for this CSSchedDeploy.
     * 
     * @param deploymentInstance   * Deployment instance value. It is appended to the
     *                         deployment name to form a unique name.
     */
    public void setDeploymentInstance(java.lang.String deploymentInstance) {
        this.deploymentInstance = deploymentInstance;
    }


    /**
     * Gets the description value for this CSSchedDeploy.
     * 
     * @return description   * Deployment description.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CSSchedDeploy.
     * 
     * @param description   * Deployment description.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the startTime value for this CSSchedDeploy.
     * 
     * @return startTime   * Deployment start time.
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CSSchedDeploy.
     * 
     * @param startTime   * Deployment start time.
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this CSSchedDeploy.
     * 
     * @return endTime   * Deployment end time.
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this CSSchedDeploy.
     * 
     * @param endTime   * Deployment end time.
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the keyValuePairs value for this CSSchedDeploy.
     * 
     * @return keyValuePairs   * Key-value pair substitutions for the deployment
     *                         configuration file.
     */
    public com.interwoven.opendeploy.web.service.CSKeyValuePair[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this CSSchedDeploy.
     * 
     * @param keyValuePairs   * Key-value pair substitutions for the deployment
     *                         configuration file.
     */
    public void setKeyValuePairs(com.interwoven.opendeploy.web.service.CSKeyValuePair[] keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the deploymentFrequency value for this CSSchedDeploy.
     * 
     * @return deploymentFrequency   * This specifies the deployment frequency.
     *                        1 -   Schedule deployment once. 
     *                        2 -   Schedule deployment SUB-HOURLY. 
     *                                 In this type, you should set the minuteInterval
     * field. 
     *                        3 -   Schedule deployment HOURLY. 
     *                                 In this type, you should set the hourInterval
     * field. 
     *                        4 -   Schedule deployment DAILY. 
     *                                 In this type, you should set the dayInterval
     * field. 
     *                        5 -   Schedule deployment WEEKLY. 
     *                                 In this type, you should set the weekInterval
     * as well as field dayOfWeek
     *                        6 -   Schedule deployment MONTHLY. 
     *                                 In this type, you should set the field
     * daysOfMonth
     */
    public int getDeploymentFrequency() {
        return deploymentFrequency;
    }


    /**
     * Sets the deploymentFrequency value for this CSSchedDeploy.
     * 
     * @param deploymentFrequency   * This specifies the deployment frequency.
     *                        1 -   Schedule deployment once. 
     *                        2 -   Schedule deployment SUB-HOURLY. 
     *                                 In this type, you should set the minuteInterval
     * field. 
     *                        3 -   Schedule deployment HOURLY. 
     *                                 In this type, you should set the hourInterval
     * field. 
     *                        4 -   Schedule deployment DAILY. 
     *                                 In this type, you should set the dayInterval
     * field. 
     *                        5 -   Schedule deployment WEEKLY. 
     *                                 In this type, you should set the weekInterval
     * as well as field dayOfWeek
     *                        6 -   Schedule deployment MONTHLY. 
     *                                 In this type, you should set the field
     * daysOfMonth
     */
    public void setDeploymentFrequency(int deploymentFrequency) {
        this.deploymentFrequency = deploymentFrequency;
    }


    /**
     * Gets the minuteInterval value for this CSSchedDeploy.
     * 
     * @return minuteInterval   * Minute Interval.
     */
    public int getMinuteInterval() {
        return minuteInterval;
    }


    /**
     * Sets the minuteInterval value for this CSSchedDeploy.
     * 
     * @param minuteInterval   * Minute Interval.
     */
    public void setMinuteInterval(int minuteInterval) {
        this.minuteInterval = minuteInterval;
    }


    /**
     * Gets the hourInterval value for this CSSchedDeploy.
     * 
     * @return hourInterval   * Hour Interval.
     */
    public int getHourInterval() {
        return hourInterval;
    }


    /**
     * Sets the hourInterval value for this CSSchedDeploy.
     * 
     * @param hourInterval   * Hour Interval.
     */
    public void setHourInterval(int hourInterval) {
        this.hourInterval = hourInterval;
    }


    /**
     * Gets the dayInterval value for this CSSchedDeploy.
     * 
     * @return dayInterval   * Day Interval.
     */
    public int getDayInterval() {
        return dayInterval;
    }


    /**
     * Sets the dayInterval value for this CSSchedDeploy.
     * 
     * @param dayInterval   * Day Interval.
     */
    public void setDayInterval(int dayInterval) {
        this.dayInterval = dayInterval;
    }


    /**
     * Gets the weekInterval value for this CSSchedDeploy.
     * 
     * @return weekInterval   * Week Interval.
     */
    public int getWeekInterval() {
        return weekInterval;
    }


    /**
     * Sets the weekInterval value for this CSSchedDeploy.
     * 
     * @param weekInterval   * Week Interval.
     */
    public void setWeekInterval(int weekInterval) {
        this.weekInterval = weekInterval;
    }


    /**
     * Gets the dayOfWeek value for this CSSchedDeploy.
     * 
     * @return dayOfWeek   * Day of the Week. It should be spelled out like Monday, TuesDay
     * etc.
     *                        This is a required field for scheduling WEEKLY
     * deployment.
     */
    public java.lang.String getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this CSSchedDeploy.
     * 
     * @param dayOfWeek   * Day of the Week. It should be spelled out like Monday, TuesDay
     * etc.
     *                        This is a required field for scheduling WEEKLY
     * deployment.
     */
    public void setDayOfWeek(java.lang.String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the daysOfMonth value for this CSSchedDeploy.
     * 
     * @return daysOfMonth   * Days of Month for monthly deployment type.
     */
    public com.interwoven.opendeploy.web.service.CSDaysOfMonth[] getDaysOfMonth() {
        return daysOfMonth;
    }


    /**
     * Sets the daysOfMonth value for this CSSchedDeploy.
     * 
     * @param daysOfMonth   * Days of Month for monthly deployment type.
     */
    public void setDaysOfMonth(com.interwoven.opendeploy.web.service.CSDaysOfMonth[] daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSchedDeploy)) return false;
        CSSchedDeploy other = (CSSchedDeploy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deploymentName==null && other.getDeploymentName()==null) || 
             (this.deploymentName!=null &&
              this.deploymentName.equals(other.getDeploymentName()))) &&
            ((this.deploymentID==null && other.getDeploymentID()==null) || 
             (this.deploymentID!=null &&
              this.deploymentID.equals(other.getDeploymentID()))) &&
            ((this.deploymentInstance==null && other.getDeploymentInstance()==null) || 
             (this.deploymentInstance!=null &&
              this.deploymentInstance.equals(other.getDeploymentInstance()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.keyValuePairs==null && other.getKeyValuePairs()==null) || 
             (this.keyValuePairs!=null &&
              java.util.Arrays.equals(this.keyValuePairs, other.getKeyValuePairs()))) &&
            this.deploymentFrequency == other.getDeploymentFrequency() &&
            this.minuteInterval == other.getMinuteInterval() &&
            this.hourInterval == other.getHourInterval() &&
            this.dayInterval == other.getDayInterval() &&
            this.weekInterval == other.getWeekInterval() &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.daysOfMonth==null && other.getDaysOfMonth()==null) || 
             (this.daysOfMonth!=null &&
              java.util.Arrays.equals(this.daysOfMonth, other.getDaysOfMonth())));
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
        if (getDeploymentName() != null) {
            _hashCode += getDeploymentName().hashCode();
        }
        if (getDeploymentID() != null) {
            _hashCode += getDeploymentID().hashCode();
        }
        if (getDeploymentInstance() != null) {
            _hashCode += getDeploymentInstance().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getKeyValuePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValuePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValuePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDeploymentFrequency();
        _hashCode += getMinuteInterval();
        _hashCode += getHourInterval();
        _hashCode += getDayInterval();
        _hashCode += getWeekInterval();
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getDaysOfMonth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOfMonth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOfMonth(), i);
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
        new org.apache.axis.description.TypeDesc(CSSchedDeploy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSKeyValuePair"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minuteInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minuteInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hourInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weekInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daysOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSDaysOfMonth"));
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
