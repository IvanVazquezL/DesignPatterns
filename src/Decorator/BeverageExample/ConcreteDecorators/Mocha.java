package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;
import Decorator.BeverageExample.Size;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage, Size size) {
        this.beverage = beverage;
        setSize(size);
    }

    @Override
    public void setDescription() {
        description = CondimentCost.MOCHA.getName() + " " + this.size.getSize();
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
        setDescription();
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return CondimentCost.MOCHA.getSmallPrice() + beverage.cost();
            case MEDIUM:
                return CondimentCost.MOCHA.getMediumPrice() + beverage.cost();
            case LARGE:
                return CondimentCost.MOCHA.getLargePrice() + beverage.cost();
            default:
                return -1;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

}
