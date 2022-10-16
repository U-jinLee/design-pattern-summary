package _decorator;

import _decorator.Beverage.Beverage;
import _decorator.Beverage.Espresso;
import _decorator.Beverage.HouseBlend;
import _decorator.Condiment.Mocha;
import _decorator.Condiment.Soy;

public class StarBuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage1 = new HouseBlend();
        System.out.println(beverage1.getDescription()
                + " $" + String.format("%.2f", beverage1.cost()));

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + String.format("%.2f", beverage3.cost()));

    }
}
