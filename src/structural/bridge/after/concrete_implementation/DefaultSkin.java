package structural.bridge.after.concrete_implementation;

import structural.bridge.after.Skin;

public class DefaultSkin implements Skin {
    @Override
    public String getName() {
        return "Default";
    }

    @Override
    public String returnAction() {
        return "walking";
    }
}
