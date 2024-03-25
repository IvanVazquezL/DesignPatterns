package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;
import Decorator.BeverageExample.Size;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage, Size size) {
        this.beverage = beverage;
        setSize(size);
    }

    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return CondimentCost.WHIP.getSmallPrice() + beverage.cost();
            case MEDIUM:
                return CondimentCost.WHIP.getMediumPrice() + beverage.cost();
            case LARGE:
                return CondimentCost.WHIP.getLargePrice() + beverage.cost();
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
        description = CondimentCost.WHIP.getName() + " " + this.size.getSize();
    }
}
