/**
 * CSGeneralDeploymentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * General status for a deployment.
 */
public class CSGeneralDeploymentStatus  implements java.io.Serializable {
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

    /* Cancel deployment request reply.
     *                       This is used only in a cancel deployment
     *                       request.
     *                       Possible values:
     *                           CANCEL_PENDING - cancel request acceptd
     * 
     *                                  and it is pending.
     *                           CANCEL_DENIED_TOO_LATE - cancel denied 
     *                                  because deployment has passed
     *                                  all cancellable phases.
     *                           CANCEL_DENIED - cancel denied. */
    private java.lang.String cancelReply;

    /* Cancel deployment request message.
     *                       This is used only in a cancel deployment
     *                       request. */
    private java.lang.String cancelMsg;

    /* Array of targets and their information. */
    private com.interwoven.opendeploy.web.service.CSGeneralTargetInfo[] targets;

    public CSGeneralDeploymentStatus() {
    }

    public CSGeneralDeploymentStatus(
           com.interwoven.opendeploy.web.service.CSDeployment deploymentBasicInfo,
           java.lang.String sourceHost,
           java.lang.String ownerName,
           java.util.Calendar startTime,
           com.interwoven.opendeploy.web.service.CSDeploymentStatus deploymentStatus,
           long deploymentElapsedTime,
           int quorum,
           java.lang.String comment,
           java.lang.String cancelReply,
           java.lang.String cancelMsg,
           com.interwoven.opendeploy.web.service.CSGeneralTargetInfo[] targets) {
           this.deploymentBasicInfo = deploymentBasicInfo;
           this.sourceHost = sourceHost;
           this.ownerName = ownerName;
           this.startTime = startTime;
           this.deploymentStatus = deploymentStatus;
           this.deploymentElapsedTime = deploymentElapsedTime;
           this.quorum = quorum;
           this.comment = comment;
           this.cancelReply = cancelReply;
           this.cancelMsg = cancelMsg;
           this.targets = targets;
    }


    /**
     * Gets the deploymentBasicInfo value for this CSGeneralDeploymentStatus.
     * 
     * @return deploymentBasicInfo   * Basic information for a deployment.
     */
    public com.interwoven.opendeploy.web.service.CSDeployment getDeploymentBasicInfo() {
        return deploymentBasicInfo;
    }


    /**
     * Sets the deploymentBasicInfo value for this CSGeneralDeploymentStatus.
     * 
     * @param deploymentBasicInfo   * Basic information for a deployment.
     */
    public void setDeploymentBasicInfo(com.interwoven.opendeploy.web.service.CSDeployment deploymentBasicInfo) {
        this.deploymentBasicInfo = deploymentBasicInfo;
    }


    /**
     * Gets the sourceHost value for this CSGeneralDeploymentStatus.
     * 
     * @return sourceHost   * Source host.
     */
    public java.lang.String getSourceHost() {
        return sourceHost;
    }


    /**
     * Sets the sourceHost value for this CSGeneralDeploymentStatus.
     * 
     * @param sourceHost   * Source host.
     */
    public void setSourceHost(java.lang.String sourceHost) {
        this.sourceHost = sourceHost;
    }


    /**
     * Gets the ownerName value for this CSGeneralDeploymentStatus.
     * 
     * @return ownerName   * Name of the user started or scheduled 
     *                         this deployment.
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this CSGeneralDeploymentStatus.
     * 
     * @param ownerName   * Name of the user started or scheduled 
     *                         this deployment.
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the startTime value for this CSGeneralDeploymentStatus.
     * 
     * @return startTime   * Deployment start date-time.
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CSGeneralDeploymentStatus.
     * 
     * @param startTime   * Deployment start date-time.
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the deploymentStatus value for this CSGeneralDeploymentStatus.
     * 
     * @return deploymentStatus   * Current status of the deployment.
     */
    public com.interwoven.opendeploy.web.service.CSDeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }


    /**
     * Sets the deploymentStatus value for this CSGeneralDeploymentStatus.
     * 
     * @param deploymentStatus   * Current status of the deployment.
     */
    public void setDeploymentStatus(com.interwoven.opendeploy.web.service.CSDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }


    /**
     * Gets the deploymentElapsedTime value for this CSGeneralDeploymentStatus.
     * 
     * @return deploymentElapsedTime   * Elasped time (milleseconds) this deployment 
     *                         has been running.
     */
    public long getDeploymentElapsedTime() {
        return deploymentElapsedTime;
    }


    /**
     * Sets the deploymentElapsedTime value for this CSGeneralDeploymentStatus.
     * 
     * @param deploymentElapsedTime   * Elasped time (milleseconds) this deployment 
     *                         has been running.
     */
    public void setDeploymentElapsedTime(long deploymentElapsedTime) {
        this.deploymentElapsedTime = deploymentElapsedTime;
    }


    /**
     * Gets the quorum value for this CSGeneralDeploymentStatus.
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
     * Sets the quorum value for this CSGeneralDeploymentStatus.
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
     * Gets the comment value for this CSGeneralDeploymentStatus.
     * 
     * @return comment   * Comments.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CSGeneralDeploymentStatus.
     * 
     * @param comment   * Comments.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the cancelReply value for this CSGeneralDeploymentStatus.
     * 
     * @return cancelReply   * Cancel deployment request reply.
     *                       This is used only in a cancel deployment
     *                       request.
     *                       Possible values:
     *                           CANCEL_PENDING - cancel request acceptd
     * 
     *                                  and it is pending.
     *                           CANCEL_DENIED_TOO_LATE - cancel denied 
     *                                  because deployment has passed
     *                                  all cancellable phases.
     *                           CANCEL_DENIED - cancel denied.
     */
    public java.lang.String getCancelReply() {
        return cancelReply;
    }


    /**
     * Sets the cancelReply value for this CSGeneralDeploymentStatus.
     * 
     * @param cancelReply   * Cancel deployment request reply.
     *                       This is used only in a cancel deployment
     *                       request.
     *                       Possible values:
     *                           CANCEL_PENDING - cancel request acceptd
     * 
     *                                  and it is pending.
     *                           CANCEL_DENIED_TOO_LATE - cancel denied 
     *                                  because deployment has passed
     *                                  all cancellable phases.
     *                           CANCEL_DENIED - cancel denied.
     */
    public void setCancelReply(java.lang.String cancelReply) {
        this.cancelReply = cancelReply;
    }


    /**
     * Gets the cancelMsg value for this CSGeneralDeploymentStatus.
     * 
     * @return cancelMsg   * Cancel deployment request message.
     *                       This is used only in a cancel deployment
     *                       request.
     */
    public java.lang.String getCancelMsg() {
        return cancelMsg;
    }


    /**
     * Sets the cancelMsg value for this CSGeneralDeploymentStatus.
     * 
     * @param cancelMsg   * Cancel deployment request message.
     *                       This is used only in a cancel deployment
     *                       request.
     */
    public void setCancelMsg(java.lang.String cancelMsg) {
        this.cancelMsg = cancelMsg;
    }


    /**
     * Gets the targets value for this CSGeneralDeploymentStatus.
     * 
     * @return targets   * Array of targets and their information.
     */
    public com.interwoven.opendeploy.web.service.CSGeneralTargetInfo[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this CSGeneralDeploymentStatus.
     * 
     * @param targets   * Array of targets and their information.
     */
    public void setTargets(com.interwoven.opendeploy.web.service.CSGeneralTargetInfo[] targets) {
        this.targets = targets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSGeneralDeploymentStatus)) return false;
        CSGeneralDeploymentStatus other = (CSGeneralDeploymentStatus) obj;
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
            ((this.cancelReply==null && other.getCancelReply()==null) || 
             (this.cancelReply!=null &&
              this.cancelReply.equals(other.getCancelReply()))) &&
            ((this.cancelMsg==null && other.getCancelMsg()==null) || 
             (this.cancelMsg!=null &&
              this.cancelMsg.equals(other.getCancelMsg()))) &&
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
        if (getCancelReply() != null) {
            _hashCode += getCancelReply().hashCode();
        }
        if (getCancelMsg() != null) {
            _hashCode += getCancelMsg().hashCode();
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
        new org.apache.axis.description.TypeDesc(CSGeneralDeploymentStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralDeploymentStatus"));
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
        elemField.setFieldName("cancelReply");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralTargetInfo"));
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
