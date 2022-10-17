package _factorymethod;

import _factorymethod.pizza.Pizza;
import _factorymethod.store.ChicagoStylePizzaStore;
import _factorymethod.store.NyStylePizzaStore;
import _factorymethod.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " +pizza.getName()+ "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " +pizza.getName()+ "\n");
    }
}
