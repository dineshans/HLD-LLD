package com.app.proxydesignpattern;

public class MainTest {

    public static void main(String[] args) {


        try {
            EmployeeDao employeeDaoProxy = new EmployeeDaoProxy();
            employeeDaoProxy.create("USER", new EmployeeDo());
            employeeDaoProxy.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
