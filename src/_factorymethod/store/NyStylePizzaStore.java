package _factorymethod.store;

import _factorymethod.pizza.NyStyleCheesePizza;
import _factorymethod.pizza.Pizza;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new NyStyleCheesePizza();
        return null;
    }
}
