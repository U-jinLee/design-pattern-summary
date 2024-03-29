package _decorator.beveragedeco.Condiment;

import _decorator.beveragedeco.beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + beverage.getSize().getCost();
        return cost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 두유 변경";
    }
}
