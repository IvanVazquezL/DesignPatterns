package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.Size;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription();
    }

    @Override
    public void setDescription() {
        description = BeverageCost.DARK_ROAST.getName() + " " + this.size.name();
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
                return BeverageCost.DARK_ROAST.getSmallPrice();
            case MEDIUM:
                return BeverageCost.DARK_ROAST.getMediumPrice();
            case LARGE:
                return BeverageCost.DARK_ROAST.getLargePrice();
            default:
                return -1;
        }
    }
}
