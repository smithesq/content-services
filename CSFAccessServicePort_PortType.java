/**
 * CSFAccessServicePort_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 18, 2009 (02:45:10 IST) WSDL2Java emitter.
 */

package com.interwoven.opendeploy.web.service;

public interface CSFAccessServicePort_PortType extends java.rmi.Remote {

    /**
     * Authenticate user. This returns CSContext which contains
     *         context information that can be used to access a server. The
     * server will validate the context
     *         before carrying out the attempted operation.
     */
    public com.interwoven.opendeploy.web.service.CSContext getCSContext(java.lang.String serviceName, java.lang.String userName, java.lang.String appData, java.lang.String password, java.lang.String locale, java.lang.String appContext, java.lang.String serverName, int lifeTime) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Authenticate user. Password can be given in encoded format.
     * This returns CSContext which contains
     *         context information that can be used to access a server. The
     * server will validate the context
     *         before carrying out the attempted operation.
     */
    public com.interwoven.opendeploy.web.service.CSContext getCSContextPasswordEncoded(java.lang.String serviceName, java.lang.String userName, java.lang.String appData, java.lang.String password, java.lang.String locale, java.lang.String appContext, java.lang.String serverName, int lifeTime, boolean isPasswdEnc) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get CSContext from session string.
     */
    public com.interwoven.opendeploy.web.service.CSContext getCSContextFromSessionString(java.lang.String serviceName, java.lang.String sessionString, java.lang.String locale, java.lang.String appContext, java.lang.String serverName) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get attributes for csContext.
     */
    public com.interwoven.opendeploy.web.service.CSContextAttributes getCSContextAttributes(java.lang.String serviceName, com.interwoven.opendeploy.web.service.CSContext csContext) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Invalidate csContext.
     */
    public com.interwoven.opendeploy.web.service.CSContext invalidateCSContext(java.lang.String serviceName, com.interwoven.opendeploy.web.service.CSContext csContext) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get foundation service version number.
     */
    public com.interwoven.opendeploy.web.service.CSVersion getCSFAccessServiceVersion() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get cookie name that web application need to set in browsers
     * for SSO
     */
    public java.lang.String getCSFCookieName() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get cookie domain that the SSO cookie is assocaited with
     */
    public java.lang.String getCSFCookieDomain() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Get information on the CSF Access Service.
     */
    public com.interwoven.opendeploy.web.service.CSWebServiceInfo getCSWebServiceInfo() throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Is CSContext expired?
     */
    public boolean isExpired(java.lang.String serviceName, com.interwoven.opendeploy.web.service.CSContext csContext) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;

    /**
     * Is CSContext valid?
     */
    public boolean isValid(java.lang.String serviceName, com.interwoven.opendeploy.web.service.CSContext csContext) throws java.rmi.RemoteException, com.interwoven.opendeploy.web.service.CSException;
}
