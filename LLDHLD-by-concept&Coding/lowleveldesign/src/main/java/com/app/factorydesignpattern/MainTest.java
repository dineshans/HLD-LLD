package com.app.factorydesignpattern;

public class MainTest {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getFactory("CIRCLE");
        shape.draw();

        Shape shape1 = shapeFactory.getFactory("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getFactory("SQUARE");
        shape2.draw();
    }
}
