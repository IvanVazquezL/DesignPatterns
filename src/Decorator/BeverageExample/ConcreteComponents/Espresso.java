package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.BeverageCost;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return BeverageCost.ESPRESSO.getCost();
    }
}
