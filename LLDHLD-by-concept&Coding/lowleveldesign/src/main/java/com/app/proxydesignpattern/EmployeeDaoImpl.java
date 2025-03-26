package com.app.proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String user, EmployeeDo obj) {
        System.out.println("From EmployeeDaoImpl Create");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("From EmployeeDaoImpl delete");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) {

        System.out.println("From EmployeeDaoImpl get");
        return new EmployeeDo();
    }
}
