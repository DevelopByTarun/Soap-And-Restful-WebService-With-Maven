
package com.employee.server.code;

import java.util.List;
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
@WebService(name = "EmployeeWS", targetNamespace = "http://code.server.employee.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.employee.server.code.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.GetAllEmployeesResponse")
    public List<Employee> getAllEmployees();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.employee.server.code.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeById", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.GetEmployeeById")
    @ResponseWrapper(localName = "getEmployeeByIdResponse", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.GetEmployeeByIdResponse")
    public Employee getEmployeeById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployee", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.DeleteEmployee")
    @ResponseWrapper(localName = "deleteEmployeeResponse", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.DeleteEmployeeResponse")
    public boolean deleteEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.AddEmployee")
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://code.server.employee.com/", className = "com.employee.server.code.AddEmployeeResponse")
    public boolean addEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

}
