package Decorator.BeverageExample.ConcreteDecorators;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.CondimentCost;
import Decorator.BeverageExample.Decorator.CondimentDecorator;
import Decorator.BeverageExample.Size;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage, Size size) {
        this.beverage = beverage;
        setSize(size);
    }

    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return CondimentCost.SOY.getSmallPrice() + beverage.cost();
            case MEDIUM:
                return CondimentCost.SOY.getMediumPrice() + beverage.cost();
            case LARGE:
                return CondimentCost.SOY.getLargePrice() + beverage.cost();
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
        description = CondimentCost.SOY.getName() + " " + this.size.getSize();
    }
}
