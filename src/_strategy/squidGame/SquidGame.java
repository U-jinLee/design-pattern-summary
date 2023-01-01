package _strategy.squidGame;

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
    }
}
