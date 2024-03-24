package Decorator.BeverageExample.ConcreteComponents;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Size;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription();
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
        setDescription();
    }

    @Override
    public void setDescription() {
        description = BeverageCost.HOUSE_BLEND.getName() + " " + this.size.name();
    }
    @Override
    public double cost() {
        switch(size) {
            case SMALL:
                return BeverageCost.HOUSE_BLEND.getSmallPrice();
            case MEDIUM:
                return BeverageCost.HOUSE_BLEND.getMediumPrice();
            case LARGE:
                return BeverageCost.HOUSE_BLEND.getLargePrice();
            default:
                return -1;
        }
    }
}
