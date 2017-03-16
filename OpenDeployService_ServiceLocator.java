/**
 * OpenDeployService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public class OpenDeployService_ServiceLocator extends org.apache.axis.client.Service implements com.interwoven.opendeploy.web.service.OpenDeployService_Service {

    public OpenDeployService_ServiceLocator() {
    }


    public OpenDeployService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpenDeployService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpenDeployService
    private java.lang.String OpenDeployService_address = "http://localhost:80/iw/services/cd/1.2/opendeployservice";

    public java.lang.String getOpenDeployServiceAddress() {
        return OpenDeployService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpenDeployServiceWSDDServiceName = "OpenDeployService";

    public java.lang.String getOpenDeployServiceWSDDServiceName() {
        return OpenDeployServiceWSDDServiceName;
    }

    public void setOpenDeployServiceWSDDServiceName(java.lang.String name) {
        OpenDeployServiceWSDDServiceName = name;
    }

    public com.interwoven.opendeploy.web.service.OpenDeployService_PortType getOpenDeployService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpenDeployService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpenDeployService(endpoint);
    }

    public com.interwoven.opendeploy.web.service.OpenDeployService_PortType getOpenDeployService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.interwoven.opendeploy.web.service.OpenDeployServiceBindingStub _stub = new com.interwoven.opendeploy.web.service.OpenDeployServiceBindingStub(portAddress, this);
            _stub.setPortName(getOpenDeployServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpenDeployServiceEndpointAddress(java.lang.String address) {
        OpenDeployService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.interwoven.opendeploy.web.service.OpenDeployService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.interwoven.opendeploy.web.service.OpenDeployServiceBindingStub _stub = new com.interwoven.opendeploy.web.service.OpenDeployServiceBindingStub(new java.net.URL(OpenDeployService_address), this);
                _stub.setPortName(getOpenDeployServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OpenDeployService".equals(inputPortName)) {
            return getOpenDeployService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://content-services.org/opendeploy/services1.2.wsdl", "OpenDeployService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://content-services.org/opendeploy/services1.2.wsdl", "OpenDeployService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpenDeployService".equals(portName)) {
            setOpenDeployServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
