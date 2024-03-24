package Decorator.BeverageExample.Decorator;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.Size;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public abstract Size getSize();
}
