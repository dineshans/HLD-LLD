package com.app.strategydesignppattern;

public class MainTest {

    public static void main(String[] args) {

        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new PassangerVehicle();
        vehicle1.drive();

    }


}
