package _strategy.duck._duck;

import _strategy.duck._fly.FlyBehavior;
import _strategy.duck._quack.QuackBehavior;

/**
 * 오리의 추상화 클래스
 * */
public abstract class Duck {
    /*
    * Strategy 전략에 해당하는 나는 행동, 꽥하고 우는 부분을
    * 전략적으로 수정할 수 있다.
    * */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 자손 클래스에서 flyBehavior, quackBehaviord의
     * 전략을 바꿔준다.
     * */
    public Duck() {};

    /**
     * 공통적으로 가지지만 오리에 따라 정의해 줘야하는 부분
     * */
    public abstract void display();
    /*모든 오리가 가지는 공통적 부분*/
    public void swim() {
        System.out.println("모든 오리는 물에 뜬다. 진짜도 가짜도 모두 뜬다.");
    }

    /*
    * 오리의 종류에 따라서 행동이 변경됩니다.
    * */
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 오리의 전략을 변경할 수 있다.
     * */
    public void setPerformFly(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}