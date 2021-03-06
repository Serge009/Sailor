
package org.matrix_soft.sailor.soap.login;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LoginServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginServiceSoap {


    /**
     * 
     * @param password
     * @param periodNr
     * @param firmNr
     * @param userName
     * @return
     *     returns org.matrix_soft.sailor.soap.login.LoginServiceResult
     */
    @WebMethod(operationName = "DoLogin", action = "http://tempuri.org/DoLogin")
    @WebResult(name = "DoLoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DoLogin", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.DoLogin")
    @ResponseWrapper(localName = "DoLoginResponse", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.DoLoginResponse")
    public LoginServiceResult doLogin(
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "firmNr", targetNamespace = "http://tempuri.org/")
        int firmNr,
        @WebParam(name = "periodNr", targetNamespace = "http://tempuri.org/")
        int periodNr);

    /**
     * 
     * @param password
     * @param periodNr
     * @param firmNr
     * @param userName
     * @return
     *     returns org.matrix_soft.sailor.soap.login.LoginServiceResult
     */
    @WebMethod(operationName = "Test", action = "http://tempuri.org/Test")
    @WebResult(name = "TestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Test", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.Test")
    @ResponseWrapper(localName = "TestResponse", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.TestResponse")
    public LoginServiceResult test(
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "firmNr", targetNamespace = "http://tempuri.org/")
        int firmNr,
        @WebParam(name = "periodNr", targetNamespace = "http://tempuri.org/")
        int periodNr);

    /**
     * 
     * @return
     *     returns org.matrix_soft.sailor.soap.login.LoginServiceResult
     */
    @WebMethod(operationName = "TestLogoObject", action = "http://tempuri.org/TestLogoObject")
    @WebResult(name = "TestLogoObjectResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TestLogoObject", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.TestLogoObject")
    @ResponseWrapper(localName = "TestLogoObjectResponse", targetNamespace = "http://tempuri.org/", className = "org.matrix_soft.sailor.soap.login.TestLogoObjectResponse")
    public LoginServiceResult testLogoObject();

}
