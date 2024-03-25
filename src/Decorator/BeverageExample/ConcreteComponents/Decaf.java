package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.Size;

public class Decaf extends Beverage {
    public Decaf(Size size) {
        setSize(size);
    }

    @Override
    public void setDescription() {
        description = BeverageCost.DECAF.getName() + " " + this.size.getSize();
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
        setDescription();
    }

    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return BeverageCost.DECAF.getSmallPrice();
            case MEDIUM:
                return BeverageCost.DECAF.getMediumPrice();
            case LARGE:
                return BeverageCost.DECAF.getLargePrice();
            default:
                return -1;
        }
    }
}
