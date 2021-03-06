
package com.myserver;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "myServer", targetNamespace = "http://www.myServer.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyServer {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://www.myServer.com", className = "com.myserver.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.AddUserResponse")
    @Action(input = "http://www.myServer.com/myServer/addUserRequest", output = "http://www.myServer.com/myServer/addUserResponse")
    public boolean addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteProject", targetNamespace = "http://www.myServer.com", className = "com.myserver.DeleteProject")
    @ResponseWrapper(localName = "deleteProjectResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.DeleteProjectResponse")
    @Action(input = "http://www.myServer.com/myServer/deleteProjectRequest", output = "http://www.myServer.com/myServer/deleteProjectResponse")
    public boolean deleteProject(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProject", targetNamespace = "http://www.myServer.com", className = "com.myserver.AddProject")
    @ResponseWrapper(localName = "addProjectResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.AddProjectResponse")
    @Action(input = "http://www.myServer.com/myServer/addProjectRequest", output = "http://www.myServer.com/myServer/addProjectResponse")
    public int addProject(
        @WebParam(name = "arg0", targetNamespace = "")
        Project arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.myserver.Project>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryProject", targetNamespace = "http://www.myServer.com", className = "com.myserver.QueryProject")
    @ResponseWrapper(localName = "queryProjectResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.QueryProjectResponse")
    @Action(input = "http://www.myServer.com/myServer/queryProjectRequest", output = "http://www.myServer.com/myServer/queryProjectResponse")
    public List<Project> queryProject(
        @WebParam(name = "arg0", targetNamespace = "")
        XMLGregorianCalendar arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        XMLGregorianCalendar arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.myserver.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryUser", targetNamespace = "http://www.myServer.com", className = "com.myserver.QueryUser")
    @ResponseWrapper(localName = "queryUserResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.QueryUserResponse")
    @Action(input = "http://www.myServer.com/myServer/queryUserRequest", output = "http://www.myServer.com/myServer/queryUserResponse")
    public User queryUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "clearProject", targetNamespace = "http://www.myServer.com", className = "com.myserver.ClearProject")
    @ResponseWrapper(localName = "clearProjectResponse", targetNamespace = "http://www.myServer.com", className = "com.myserver.ClearProjectResponse")
    @Action(input = "http://www.myServer.com/myServer/clearProjectRequest", output = "http://www.myServer.com/myServer/clearProjectResponse")
    public boolean clearProject(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
