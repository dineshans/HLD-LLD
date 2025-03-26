package com.app.strategydesignppattern;

import com.app.strategydesignppattern.strategy.SportsStrategy;

public class OffRoadingVehicle extends Vehicle {

    OffRoadingVehicle() {
        super(new SportsStrategy());
    }
}
