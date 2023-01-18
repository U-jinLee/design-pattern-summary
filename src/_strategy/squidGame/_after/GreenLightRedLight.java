package _strategy.squidGame._after;

import _strategy.squidGame._after._strategy.Speed;

public class GreenLightRedLight {
    private Speed speed;

    public GreenLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void greenRight() {
        this.speed.greenLight();
    }

    public void redLight() {
        this.speed.redLight();
    }

    /**
     * 메서드 파라미터로 넘겨주는 방법
     * */
    public void greenRight(Speed speed) {
        speed.greenLight();
    }
    public void redLight(Speed speed) {
        speed.redLight();
    }

}
