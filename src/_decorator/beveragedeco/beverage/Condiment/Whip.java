package _decorator.beveragedeco.beverage.Condiment;

import _decorator.beveragedeco.beverage.Beverage;

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
