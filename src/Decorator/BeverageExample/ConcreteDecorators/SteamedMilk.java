package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;
import Decorator.BeverageExample.Size;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage, Size size) {
        this.beverage = beverage;
        setSize(size);
    }

    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return CondimentCost.STEAMED_MILK.getSmallPrice() + beverage.cost();
            case MEDIUM:
                return CondimentCost.STEAMED_MILK.getMediumPrice() + beverage.cost();
            case LARGE:
                return CondimentCost.STEAMED_MILK.getLargePrice() + beverage.cost();
            default:
                return -1;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
        setDescription();
    }

    @Override
    public void setDescription() {
        description = CondimentCost.STEAMED_MILK.getName() + " " + this.size.getSize();
    }
}
