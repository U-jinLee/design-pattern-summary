package _strategy.duck._duck;

import _strategy.duck._fly.FlyWithWings;
import _strategy.duck._quack.Quack;

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
