package com.app.factorydesignpattern;

public class ShapeFactory {

    public Shape getFactory(String input) {

        switch(input) {

            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
