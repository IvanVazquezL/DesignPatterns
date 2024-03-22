package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.BeverageCost;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return BeverageCost.HOUSE_BLEND.getCost();
    }
}
