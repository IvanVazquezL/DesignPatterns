package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Size;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription();
    }

    @Override
    public void setDescription() {
        description = BeverageCost.ESPRESSO.getName() + " " + this.size.name();
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
                return BeverageCost.ESPRESSO.getSmallPrice();
            case MEDIUM:
                return BeverageCost.ESPRESSO.getMediumPrice();
            case LARGE:
                return BeverageCost.ESPRESSO.getLargePrice();
            default:
                return -1;
        }
    }
}
