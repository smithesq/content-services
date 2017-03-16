/**
 * OpenDeployServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public class OpenDeployServiceBindingStub extends org.apache.axis.client.Stub implements com.interwoven.opendeploy.web.service.OpenDeployService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getODWebServiceVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSVersion"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getODWebServiceVersionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getODWebServiceInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSWebServiceInfo"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSWebServiceInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getODWebServiceInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getODServerStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSODServerStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getODServerStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getODServerVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerVersion"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSODServerVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getODServerVersionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("odServerReset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerReset"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSODServerReset.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "odServerResetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startDeployment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDeployParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSStartDeploymentParm"), com.interwoven.opendeploy.web.service.CSStartDeploymentParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralDeploymentStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "startDeploymentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelDeployment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancelDeployParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSCancelDeploymentParm"), com.interwoven.opendeploy.web.service.CSCancelDeploymentParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralDeploymentStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancelDeploymentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeploymentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getDeployListParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetMultipleDeploymentsParm"), com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSDeployment"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSDeployment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getDeploymentListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGeneralStatusForDeployments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getDeployListParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetMultipleDeploymentsParm"), com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSGeneralDeploymentStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getGeneralStatusForDeploymentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDetailStatusForADeployment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getDetailStatusForADeploymentParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetADeploymentParm"), com.interwoven.opendeploy.web.service.CSGetADeploymentParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailDeploymentStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getDetailStatusForADeploymentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scheduleDeploy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleDeploy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy"), com.interwoven.opendeploy.web.service.CSSchedDeploy.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeployStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSSchedDeployStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "scheduleDeployReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scheduleGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleGet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGet"), com.interwoven.opendeploy.web.service.CSSchedGet.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGetStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSSchedGetStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "scheduleGetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scheduleDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleDelete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDelete"), com.interwoven.opendeploy.web.service.CSSchedDelete.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeleteStatus"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSSchedDeleteStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "scheduleDeleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("offerAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offerAddParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSOfferAddParm"), com.interwoven.opendeploy.web.service.CSOfferAddParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "offerAddReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("offerDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSOfferName"), com.interwoven.opendeploy.web.service.CSOfferName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "offerDeleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("offerGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSOfferName"), com.interwoven.opendeploy.web.service.CSOfferName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "offerGetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("offerList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "ArrayOfCSSimpleName"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSSimpleName[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "offerListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionAddParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionAddParm"), com.interwoven.opendeploy.web.service.CSSubscriptionAddParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionAddReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName"), com.interwoven.opendeploy.web.service.CSSimpleName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionDeleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName"), com.interwoven.opendeploy.web.service.CSSimpleName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionGetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionActivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName"), com.interwoven.opendeploy.web.service.CSSimpleName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionActivateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionSuspend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName"), com.interwoven.opendeploy.web.service.CSSimpleName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionSuspendReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionSchedUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionSchedUpdateParm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionSchedUpdateParm"), com.interwoven.opendeploy.web.service.CSSubscriptionSchedUpdateParm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionSchedUpdateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext"), com.interwoven.opendeploy.web.service.CSContext.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "ArrayOfCSSimpleName"));
        oper.setReturnClass(com.interwoven.opendeploy.web.service.CSSimpleName[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscriptionListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "CSException"),
                      "com.interwoven.opendeploy.web.service.CSException",
                      new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException"), 
                      true
                     ));
        _operations[23] = oper;

    }

    public OpenDeployServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OpenDeployServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OpenDeployServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "ArrayOfCSKeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSKeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSKeyValuePair");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSDeployLogLevels");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDeployLogLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odcommon/services1.2.xsd", "CSKeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSKeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSDeployment");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDeployment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeployment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSDetailTargetInfo");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDetailTargetInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailTargetInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSGeneralDeploymentStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralDeploymentStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSGeneralTargetInfo");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGeneralTargetInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralTargetInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "ArrayOfCSTargetProgressPhase");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSTargetProgressPhase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSTargetProgressPhase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSCancelDeploymentParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSCancelDeploymentParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeployment");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDeployment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDeploymentStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDeploymentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailDeploymentStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSDetailTargetInfo");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDetailTargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralDeploymentStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGeneralTargetInfo");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGeneralTargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetADeploymentParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGetADeploymentParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSGetMultipleDeploymentsParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSStartDeploymentParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSStartDeploymentParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/oddeploy/services1.2.xsd", "CSTargetProgressPhase");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSTargetProgressPhase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "ArrayOfCSSimpleName");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSimpleName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSIntellDelvResp");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSIntellDelvResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSOfferAddParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSOfferAddParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSOfferName");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSOfferName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSimpleName");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSimpleName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionAddParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSubscriptionAddParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odintelldelv/services1.2.xsd", "CSSubscriptionSchedUpdateParm");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSubscriptionSchedUpdateParm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "ArrayOfCSDaysOfMonth");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDaysOfMonth[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSDaysOfMonth");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "ArrayOfCSSchedDeploy");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedDeploy[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSDaysOfMonth");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSDaysOfMonth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDelete");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeleteStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedDeleteStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeploy");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedDeploy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedDeployStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedDeployStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGet");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedGet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odsched/services1.2.xsd", "CSSchedGetStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSSchedGetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerReset");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSODServerReset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatus");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSODServerStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerStatusDetails");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSODServerStatusDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/odserver/services1.2.xsd", "CSODServerVersion");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSODServerVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSContext");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSException");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSVersion");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://content-services.org/types/services2.0.xsd", "CSWebServiceInfo");
            cachedSerQNames.add(qName);
            cls = com.interwoven.opendeploy.web.service.CSWebServiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.interwoven.opendeploy.web.service.CSVersion getODWebServiceVersion() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getODWebServiceVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSVersion) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSWebServiceInfo getODWebServiceInfo() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getODWebServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSWebServiceInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSWebServiceInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSWebServiceInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSODServerStatus getODServerStatus(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getODServerStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSODServerStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSODServerStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSODServerStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSODServerVersion getODServerVersion(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getODServerVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSODServerVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSODServerVersion) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSODServerVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSODServerReset odServerReset(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "odServerReset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSODServerReset) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSODServerReset) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSODServerReset.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus startDeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSStartDeploymentParm startDeployParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startDeployment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, startDeployParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus cancelDeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSCancelDeploymentParm cancelDeployParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelDeployment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, cancelDeployParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSDeployment[] getDeploymentList(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm getDeployListParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeploymentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, getDeployListParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSDeployment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSDeployment[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSDeployment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[] getGeneralStatusForDeployments(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm getDeployListParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getGeneralStatusForDeployments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, getDeployListParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus getDetailStatusForADeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetADeploymentParm getDetailStatusForADeploymentParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDetailStatusForADeployment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, getDetailStatusForADeploymentParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSSchedDeployStatus scheduleDeploy(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedDeploy scheduleDeploy) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "scheduleDeploy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, scheduleDeploy});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSSchedDeployStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSSchedDeployStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSSchedDeployStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSSchedGetStatus scheduleGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedGet scheduleGet) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "scheduleGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, scheduleGet});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSSchedGetStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSSchedGetStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSSchedGetStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSSchedDeleteStatus scheduleDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedDelete scheduleDelete) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "scheduleDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, scheduleDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSSchedDeleteStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSSchedDeleteStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSSchedDeleteStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerAdd(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferAddParm offerAddParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "offerAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, offerAddParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferName offerName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "offerDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, offerName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferName offerName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "offerGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, offerName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSSimpleName[] offerList(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "offerList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSSimpleName[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSSimpleName[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSSimpleName[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionAdd(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSubscriptionAddParm subscriptionAddParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionAddParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionActivate(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionActivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionSuspend(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionSuspend"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionSchedUpdate(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSubscriptionSchedUpdateParm subscriptionSchedUpdateParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionSchedUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, subscriptionSchedUpdateParm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSIntellDelvResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSIntellDelvResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.interwoven.opendeploy.web.service.CSSimpleName[] subscriptionList(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriptionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.interwoven.opendeploy.web.service.CSSimpleName[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.interwoven.opendeploy.web.service.CSSimpleName[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.interwoven.opendeploy.web.service.CSSimpleName[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.interwoven.opendeploy.web.service.CSException) {
              throw (com.interwoven.opendeploy.web.service.CSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
