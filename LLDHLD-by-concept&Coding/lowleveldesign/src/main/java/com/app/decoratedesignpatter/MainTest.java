package com.app.decoratedesignpatter;

import com.app.decoratedesignpatter.decorator.CornCheez;
import com.app.decoratedesignpatter.decorator.ExtraCheez;
import com.app.decoratedesignpatter.decorator.Mushroom;

public class MainTest {

    public static void main(String[] args) {

        BasePizza pizza = new ExtraCheez(new Megarita());

        System.out.println("Megarita wth Extra Cheez : " + pizza.cost());

        BasePizza pizza1 = new Mushroom(new ExtraCheez(new Megarita()));

        System.out.println("Megarita + Extra Cheez + Mushroom  : " + pizza1.cost());

        BasePizza pizza2 = new CornCheez(new Mushroom(new ExtraCheez(new Megarita())));

        System.out.println("Megarita + Extra Cheez + Mushroom + CornCheez : " +pizza2.cost());
    }
}
