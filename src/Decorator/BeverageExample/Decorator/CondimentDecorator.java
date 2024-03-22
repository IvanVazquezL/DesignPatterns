package Decorator.BeverageExample.Decorator;

import Decorator.BeverageExample.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
