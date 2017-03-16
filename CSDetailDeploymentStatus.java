/**
 * CSDetailDeploymentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Detail status for a deployment.
 */
public class CSDetailDeploymentStatus  implements java.io.Serializable {
    /* Basic information for a deployment. */
    private com.interwoven.opendeploy.web.service.CSDeployment deploymentBasicInfo;

    /* Source host. */
    private java.lang.String sourceHost;

    /* Name of the user started or scheduled 
     *                         this deployment. */
    private java.lang.String ownerName;

    /* Deployment start date-time. */
    private java.util.Calendar startTime;

    /* Current status of the deployment. */
    private com.interwoven.opendeploy.web.service.CSDeploymentStatus deploymentStatus;

    /* Elasped time (milleseconds) this deployment 
     *                         has been running. */
    private long deploymentElapsedTime;

    /* Quorum value set for the deployment.
     * 		       -1 - this deployment didn't set a quorum value.
     * 		       -2 - information not available such as in a 
     *                             scheduled deployment which has not yet
     * started. */
    private int quorum;

    /* Comments. */
    private java.lang.String comment;

    /* Array of targets and their detail information. */
    private com.interwoven.opendeploy.web.service.CSDetailTargetInfo[] targets;

    public CSDetailDeploymentStatus() {
    }

    public CSDetailDeploymentStatus(
           com.interwoven.opendeploy.web.service.CSDeployment deploymentBasicInfo,
           java.lang.String sourceHost,
           java.lang.String ownerName,
           java.util.Calendar startTime,
           com.interwoven.opendeploy.web.service.CSDeploymentStatus deploymentStatus,
           long deploymentElapsedTime,
           int quorum,
           java.lang.String comment,
           com.interwoven.opendeploy.web.service.CSDetailTargetInfo[] targets) {
           this.deploymentBasicInfo = deploymentBasicInfo;
           this.sourceHost = sourceHost;
           this.ownerName = ownerName;
           this.startTime = startTime;
           this.deploymentStatus = deploymentStatus;
           this.deploymentElapsedTime = deploymentElapsedTime;
           this.quorum = quorum;
           this.comment = comment;
           this.targets = targets;
    }


    /**
     * Gets the deploymentBasicInfo value for this CSDetailDeploymentStatus.
     * 
     * @return deploymentBasicInfo   * Basic information for a deployment.
     */
    public com.interwoven.opendeploy.web.service.CSDeployment getDeploymentBasicInfo() {
        return deploymentBasicInfo;
    }


    /**
     * Sets the deploymentBasicInfo value for this CSDetailDeploymentStatus.
     * 
     * @param deploymentBasicInfo   * Basic information for a deployment.
     */
    public void setDeploymentBasicInfo(com.interwoven.opendeploy.web.service.CSDeployment deploymentBasicInfo) {
        this.deploymentBasicInfo = deploymentBasicInfo;
    }


    /**
     * Gets the sourceHost value for this CSDetailDeploymentStatus.
     * 
     * @return sourceHost   * Source host.
     */
    public java.lang.String getSourceHost() {
        return sourceHost;
    }


    /**
     * Sets the sourceHost value for this CSDetailDeploymentStatus.
     * 
     * @param sourceHost   * Source host.
     */
    public void setSourceHost(java.lang.String sourceHost) {
        this.sourceHost = sourceHost;
    }


    /**
     * Gets the ownerName value for this CSDetailDeploymentStatus.
     * 
     * @return ownerName   * Name of the user started or scheduled 
     *                         this deployment.
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this CSDetailDeploymentStatus.
     * 
     * @param ownerName   * Name of the user started or scheduled 
     *                         this deployment.
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the startTime value for this CSDetailDeploymentStatus.
     * 
     * @return startTime   * Deployment start date-time.
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CSDetailDeploymentStatus.
     * 
     * @param startTime   * Deployment start date-time.
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the deploymentStatus value for this CSDetailDeploymentStatus.
     * 
     * @return deploymentStatus   * Current status of the deployment.
     */
    public com.interwoven.opendeploy.web.service.CSDeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }


    /**
     * Sets the deploymentStatus value for this CSDetailDeploymentStatus.
     * 
     * @param deploymentStatus   * Current status of the deployment.
     */
    public void setDeploymentStatus(com.interwoven.opendeploy.web.service.CSDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }


    /**
     * Gets the deploymentElapsedTime value for this CSDetailDeploymentStatus.
     * 
     * @return deploymentElapsedTime   * Elasped time (milleseconds) this deployment 
     *                         has been running.
     */
    public long getDeploymentElapsedTime() {
        return deploymentElapsedTime;
    }


    /**
     * Sets the deploymentElapsedTime value for this CSDetailDeploymentStatus.
     * 
     * @param deploymentElapsedTime   * Elasped time (milleseconds) this deployment 
     *                         has been running.
     */
    public void setDeploymentElapsedTime(long deploymentElapsedTime) {
        this.deploymentElapsedTime = deploymentElapsedTime;
    }


    /**
     * Gets the quorum value for this CSDetailDeploymentStatus.
     * 
     * @return quorum   * Quorum value set for the deployment.
     * 		       -1 - this deployment didn't set a quorum value.
     * 		       -2 - information not available such as in a 
     *                             scheduled deployment which has not yet
     * started.
     */
    public int getQuorum() {
        return quorum;
    }


    /**
     * Sets the quorum value for this CSDetailDeploymentStatus.
     * 
     * @param quorum   * Quorum value set for the deployment.
     * 		       -1 - this deployment didn't set a quorum value.
     * 		       -2 - information not available such as in a 
     *                             scheduled deployment which has not yet
     * started.
     */
    public void setQuorum(int quorum) {
        this.quorum = quorum;
    }


    /**
     * Gets the comment value for this CSDetailDeploymentStatus.
     * 
     * @return comment   * Comments.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CSDetailDeploymentStatus.
     * 
     * @param comment   * Comments.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the targets value for this CSDetailDeploymentStatus.
     * 
     * @return targets   * Array of targets and their detail information.
     */
    public com.interwoven.opendeploy.web.service.CSDetailTargetInfo[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this CSDetailDeploymentStatus.
     * 
     * @param targets   * Array of targets and their detail information.
     */
    public void setTargets(com.interwoven.opendeploy.web.service.CSDetailTargetInfo[] targets) {
        this.targets = targets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSDetailDeploymentStatus)) return false;
        CSDetailDeploymentStatus other = (CSDetailDeploymentStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deploymentBasicInfo==null && other.getDeploymentBasicInfo()==null) || 
             (this.deploymentBasicInfo!=null &&
              this.deploymentBasicInfo.equals(other.getDeploymentBasicInfo()))) &&
            ((this.sourceHost==null && other.getSourceHost()==null) || 
             (this.sourceHost!=null &&
              this.sourceHost.equals(other.getSourceHost()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.deploymentStatus==null && other.getDeploymentStatus()==null) || 
             (this.deploymentStatus!=null &&
              this.deploymentStatus.equals(other.getDeploymentStatus()))) &&
            this.deploymentElapsedTime == other.getDeploymentElapsedTime() &&
            this.quorum == other.getQuorum() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getDeploymentBasicInfo() != null) {
            _hashCode += getDeploymentBasicInfo().hashCode();
        }
        if (getSourceHost() != null) {
            _hashCode += getSourceHost().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getDeploymentStatus() != null) {
            _hashCode += getDeploymentStatus().hashCode();
        }
        _hashCode += new Long(getDeploymentElapsedTime()).hashCode();
        _hashCode += getQuorum();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(CSDetailDeploymentStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailDeploymentStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeployment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeploymentStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentElapsedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deploymentElapsedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quorum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quorum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailTargetInfo"));
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
