/**
 * OpenDeployService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public interface OpenDeployService_PortType extends java.rmi.Remote {

    /**
     * Get the version number of the OpenDeploy Web Service.
     */
    public com.interwoven.opendeploy.web.service.CSVersion getODWebServiceVersion() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get information on the OpenDeploy Web Service.
     */
    public com.interwoven.opendeploy.web.service.CSWebServiceInfo getODWebServiceInfo() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSODServerStatus getODServerStatus(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSODServerVersion getODServerVersion(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSODServerReset odServerReset(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Start deployment using the specified parameters.
     */
    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus startDeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSStartDeploymentParm startDeployParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Cancel deployment using the specified parameters.
     */
    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus cancelDeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSCancelDeploymentParm cancelDeployParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get the deployment list specified by the parameters.
     */
    public com.interwoven.opendeploy.web.service.CSDeployment[] getDeploymentList(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm getDeployListParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get list of deployments specified by the parameters.
     */
    public com.interwoven.opendeploy.web.service.CSGeneralDeploymentStatus[] getGeneralStatusForDeployments(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetMultipleDeploymentsParm getDeployListParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get the deatiled status for a deployment.
     */
    public com.interwoven.opendeploy.web.service.CSDetailDeploymentStatus getDetailStatusForADeployment(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSGetADeploymentParm getDetailStatusForADeploymentParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Schedule  Deployments .
     */
    public com.interwoven.opendeploy.web.service.CSSchedDeployStatus scheduleDeploy(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedDeploy scheduleDeploy) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get Schedules .
     */
    public com.interwoven.opendeploy.web.service.CSSchedGetStatus scheduleGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedGet scheduleGet) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Delete Schedules .
     */
    public com.interwoven.opendeploy.web.service.CSSchedDeleteStatus scheduleDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSchedDelete scheduleDelete) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerAdd(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferAddParm offerAddParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferName offerName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Server Status .
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp offerGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSOfferName offerName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Offer Listing.
     */
    public com.interwoven.opendeploy.web.service.CSSimpleName[] offerList(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Add subscription
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionAdd(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSubscriptionAddParm subscriptionAddParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Delete subscription
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionDelete(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get subscription
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionGet(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Activate subscription
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionActivate(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Suspend subscription
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionSuspend(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSimpleName subscriptionName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Update subscription schedule
     */
    public com.interwoven.opendeploy.web.service.CSIntellDelvResp subscriptionSchedUpdate(com.interwoven.opendeploy.web.service.CSContext context, com.interwoven.opendeploy.web.service.CSSubscriptionSchedUpdateParm subscriptionSchedUpdateParm) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Subscription Listing.
     */
    public com.interwoven.opendeploy.web.service.CSSimpleName[] subscriptionList(com.interwoven.opendeploy.web.service.CSContext context) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;
}
