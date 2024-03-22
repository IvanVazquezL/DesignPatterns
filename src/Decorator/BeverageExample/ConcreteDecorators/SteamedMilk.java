package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return CondimentCost.STEAMED_MILK.getCost() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
