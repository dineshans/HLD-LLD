package com.app.decoratedesignpatter.decorator;

import com.app.decoratedesignpatter.BasePizza;

public class CornCheez extends ToppinsDecorator{

    BasePizza pizza;

    public CornCheez(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 150;
    }
}
