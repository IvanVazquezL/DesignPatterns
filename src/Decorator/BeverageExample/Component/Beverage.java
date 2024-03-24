package Decorator.BeverageExample.Component;

import Decorator.BeverageExample.BeverageCost;
import Decorator.BeverageExample.Size;

public abstract class Beverage {
    protected String description = "";
    protected Size size = Size.MEDIUM;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void setSize(Size size);

    public abstract void setDescription();

    public abstract double cost();
}
