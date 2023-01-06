package _strategy.squidGame;

import _strategy.squidGame._after._strategy.Speed;
import _strategy.squidGame._after._strategy.DjSpeed;
import _strategy.squidGame._after._strategy.NormalSpeed;
import _strategy.squidGame._before.GreenLightRedLight;

public class SquidGame {
    public static void main(String[] args) {
        GreenLightRedLight greenLightRedLight = new GreenLightRedLight(1);
        greenLightRedLight.greenRight();
        greenLightRedLight.redLight();

        GreenLightRedLight greenLightRedLight2 = new GreenLightRedLight(2);
        greenLightRedLight2.greenRight();
        greenLightRedLight2.redLight();

        _strategy.squidGame._after.GreenLightRedLight newGreenLightRedLight = new _strategy.squidGame._after.GreenLightRedLight(new DjSpeed());
        newGreenLightRedLight.greenRight();
        newGreenLightRedLight.redLight();

        newGreenLightRedLight.greenRight(new NormalSpeed());
        newGreenLightRedLight.redLight(new DjSpeed());
        newGreenLightRedLight.greenRight(new Speed() {
            @Override
            public void greenLight() {
                System.out.println("복잡한 그린 라이트");
            }

            @Override
            public void redLight() {
                System.out.println("복잡한 레드 라이트");
            }
        });
    }
}
