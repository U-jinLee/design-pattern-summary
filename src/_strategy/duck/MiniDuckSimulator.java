package _strategy.duck;

import _strategy.duck._duck.Duck;
import _strategy.duck._duck.MallardDuck;
import _strategy.duck._duck.ModelDuck;
import _strategy.duck._fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        System.out.println("---모델 덕---");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();
        modelDuck.setPerformFly(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
