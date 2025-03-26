package com.app.strategydesignppattern.strategy;

public class SportsStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
