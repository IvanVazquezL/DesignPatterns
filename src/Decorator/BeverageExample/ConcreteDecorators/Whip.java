package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return CondimentCost.WHIP.getCost() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
