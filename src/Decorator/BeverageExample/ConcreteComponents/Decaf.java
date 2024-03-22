package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return BeverageCost.DECAF.getCost();
    }
}
