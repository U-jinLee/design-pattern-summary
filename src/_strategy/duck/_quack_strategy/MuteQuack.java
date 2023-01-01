package _strategy.duck._quack_strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
