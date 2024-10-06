package structural.bridge.after.concrete_implementation;

import structural.bridge.after.Skin;

public class Dominator implements Skin {
    @Override
    public String getName() {
        return "Dominator";
    }

    @Override
    public String returnAction() {
        return "ride horse";
    }
}
