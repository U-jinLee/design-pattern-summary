package _strategy;

import _strategy._before.GreenLightRedLight;

public class SquidGame {
    public static void main(String[] args) {
        GreenLightRedLight greenLightRedLight = new GreenLightRedLight(1);
        greenLightRedLight.greenRight();
        greenLightRedLight.redright();

        GreenLightRedLight greenLightRedLight2 = new GreenLightRedLight(2);
        greenLightRedLight2.greenRight();
        greenLightRedLight2.redright();
    }
}
