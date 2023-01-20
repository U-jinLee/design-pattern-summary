package _decorator.beveragedeco.beverage.Condiment;

import _decorator.beveragedeco.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
    public Size getSize() {
        return beverage.getSize();
    }

}
