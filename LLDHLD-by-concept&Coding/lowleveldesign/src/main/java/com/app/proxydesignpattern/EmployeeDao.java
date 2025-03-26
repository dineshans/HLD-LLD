package com.app.proxydesignpattern;

public interface EmployeeDao {

    void create(String client, EmployeeDo obj) throws Exception;
    void delete(String client, int employeeId) throws Exception;
    public EmployeeDo get(String client, int employeeId) throws Exception;
}
