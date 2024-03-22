package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return BeverageCost.DARK_ROAST.getCost();
    }
}
