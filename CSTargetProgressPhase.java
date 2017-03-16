/**
 * CSTargetProgressPhase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;


/**
 * Target progress phase.
 */
public class CSTargetProgressPhase  implements java.io.Serializable {
    /* A deployment phase. Possible values:
     *                           Setting up
     *                           Setup done
     *                           Comparing
     *                           Compared
     *                           Transferring
     *                           Transferred
     *                           Committing
     *                           Committed
     *                           Cleaning up
     *                           Cleaned up
     *                           Rolling back
     *                           Rolled back
     *                           Cancel pending
     *                           Start to cancel
     *                           Cancelling
     *                           Cancelled
     *                           Waiting
     *                           Waiting for next tier deployment
     *                           Next tier deployment done
     *                           Blocked
     *                           Completed
     *                           Failed
     *                           Undefined */
    private java.lang.String phaseName;

    public CSTargetProgressPhase() {
    }

    public CSTargetProgressPhase(
           java.lang.String phaseName) {
           this.phaseName = phaseName;
    }


    /**
     * Gets the phaseName value for this CSTargetProgressPhase.
     * 
     * @return phaseName   * A deployment phase. Possible values:
     *                           Setting up
     *                           Setup done
     *                           Comparing
     *                           Compared
     *                           Transferring
     *                           Transferred
     *                           Committing
     *                           Committed
     *                           Cleaning up
     *                           Cleaned up
     *                           Rolling back
     *                           Rolled back
     *                           Cancel pending
     *                           Start to cancel
     *                           Cancelling
     *                           Cancelled
     *                           Waiting
     *                           Waiting for next tier deployment
     *                           Next tier deployment done
     *                           Blocked
     *                           Completed
     *                           Failed
     *                           Undefined
     */
    public java.lang.String getPhaseName() {
        return phaseName;
    }


    /**
     * Sets the phaseName value for this CSTargetProgressPhase.
     * 
     * @param phaseName   * A deployment phase. Possible values:
     *                           Setting up
     *                           Setup done
     *                           Comparing
     *                           Compared
     *                           Transferring
     *                           Transferred
     *                           Committing
     *                           Committed
     *                           Cleaning up
     *                           Cleaned up
     *                           Rolling back
     *                           Rolled back
     *                           Cancel pending
     *                           Start to cancel
     *                           Cancelling
     *                           Cancelled
     *                           Waiting
     *                           Waiting for next tier deployment
     *                           Next tier deployment done
     *                           Blocked
     *                           Completed
     *                           Failed
     *                           Undefined
     */
    public void setPhaseName(java.lang.String phaseName) {
        this.phaseName = phaseName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSTargetProgressPhase)) return false;
        CSTargetProgressPhase other = (CSTargetProgressPhase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phaseName==null && other.getPhaseName()==null) || 
             (this.phaseName!=null &&
              this.phaseName.equals(other.getPhaseName())));
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
        if (getPhaseName() != null) {
            _hashCode += getPhaseName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSTargetProgressPhase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSTargetProgressPhase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phaseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phaseName"));
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
