package _strategy.squidGame._after._strategy;

public class DjSpeed implements Speed {
    @Override
    public void greenLight() {
        System.out.println("무궁화 둠칫 둠칫");
    }

    @Override
    public void redLight() {
        System.out.println("피었채키라웃");
    }
}
