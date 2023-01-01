package _strategy.duck._quack_strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
