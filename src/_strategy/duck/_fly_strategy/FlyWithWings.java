package _strategy.duck._fly_strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("하늘을 나는 중입니다.");
    }
}
