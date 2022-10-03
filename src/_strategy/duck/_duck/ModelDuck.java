package _strategy.duck._duck;

import _strategy.duck._fly.FlyNoWay;
import _strategy.duck._quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
