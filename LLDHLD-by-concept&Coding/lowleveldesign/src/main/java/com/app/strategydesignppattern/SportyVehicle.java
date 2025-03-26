package com.app.strategydesignppattern;

import com.app.strategydesignppattern.strategy.SportsStrategy;

public class SportyVehicle extends  Vehicle {

    SportyVehicle() {
        super(new SportsStrategy());
    }
}
