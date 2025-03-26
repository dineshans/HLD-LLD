
package com.app.proxydesignpattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDaoObj;

    public EmployeeDaoProxy() {

        employeeDaoObj = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        if (client.equals("ADMIN")) {
            employeeDaoObj.create(client, obj);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        if (client.equals("ADMIN")) {
            employeeDaoObj.delete(client, employeeId);
        }
        throw new Exception("Access Denied");

    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {

        if (client.equals("USER") || client.equals("ADMIN")) {
            return employeeDaoObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");

    }
}
