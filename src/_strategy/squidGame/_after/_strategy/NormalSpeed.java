package _strategy.squidGame._after._strategy;

import _strategy.squidGame._after.Speed;

public class NormalSpeed implements Speed {
    @Override
    public void greenLight() {
        System.out.println("무궁화 꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("피었습니다.");
    }
}
