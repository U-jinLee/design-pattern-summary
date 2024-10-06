package structural.bridge.after.concrete_implementation;

import structural.bridge.after.Skin;

public class PoolParty implements Skin {
    @Override
    public String getName() {
        return "PoolParty";
    }

    @Override
    public String returnAction() {
        return "slide water";
    }
}
