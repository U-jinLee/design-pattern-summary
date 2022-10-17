package _factorymethod.store;

import _factorymethod.pizza.ChicagoStyleCheesePizza;
import _factorymethod.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new ChicagoStyleCheesePizza();
        return null;
    }
}
