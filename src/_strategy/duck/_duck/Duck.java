package _strategy.duck._duck;

import _strategy.duck._fly.FlyBehavior;
import _strategy.duck._quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {};

    public abstract void display();
    /*
    * 오리의 종류에 따라서 행동이 변경됩니다.
    * */
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    /*모든 오리가 가지는 공통적 부분*/
    public void swim() {
        System.out.println("모든 오리는 물에 뜬다. 진짜도 가짜도 모두 뜬다.");
    }

    public void setPerformFly(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}