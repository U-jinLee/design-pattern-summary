package _strategy.duck._fly_strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("하늘을 날 수 없습니다.");
    }
}
