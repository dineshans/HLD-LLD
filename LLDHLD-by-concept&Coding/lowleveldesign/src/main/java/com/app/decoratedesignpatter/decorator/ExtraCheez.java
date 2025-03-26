package com.app.decoratedesignpatter.decorator;

import com.app.decoratedesignpatter.BasePizza;

public class ExtraCheez extends ToppinsDecorator {

    BasePizza pizza;

    public ExtraCheez(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
