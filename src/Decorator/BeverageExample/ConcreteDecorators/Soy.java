package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return CondimentCost.SOY.getCost() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
