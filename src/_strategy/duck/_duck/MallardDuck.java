package _strategy.duck._duck;

import _strategy.duck._fly_strategy.FlyWithWings;
import _strategy.duck._quack_strategy.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
