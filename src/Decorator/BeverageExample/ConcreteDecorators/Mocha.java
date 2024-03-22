package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return CondimentCost.MOCHA.getCost() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
