package _decorator.Condiment;

import _decorator.Beverage.Beverage;
import _decorator.Condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑 크림";
    }

}
