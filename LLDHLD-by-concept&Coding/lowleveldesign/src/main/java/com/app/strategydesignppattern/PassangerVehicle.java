package com.app.strategydesignppattern;

import com.app.strategydesignppattern.strategy.NormalDriveStrategy;

public class PassangerVehicle extends Vehicle {

    PassangerVehicle() {
        super(new NormalDriveStrategy());
    }

}
