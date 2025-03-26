package com.app.decoratedesignpatter.decorator;

import com.app.decoratedesignpatter.BasePizza;

public class Mushroom extends ToppinsDecorator {

    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 50;
    }
}
