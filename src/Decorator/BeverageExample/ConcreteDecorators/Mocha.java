package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;
import Decorator.BeverageExample.Size;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        setDescription();
    }

    @Override
    public void setDescription() {
        description = CondimentCost.MOCHA.getName() + " " + this.size.name();
    }

    @Override
    public void setSize(Size size) {

    }

    @Override
    public Size getSize() {
        return size;
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
