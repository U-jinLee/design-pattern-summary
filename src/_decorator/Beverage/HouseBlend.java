package _decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("하우스 블렌드 커피");
    }

    @Override
    public double cost() {
        return .99 + getSize().getCost();
    }
}
