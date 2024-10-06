package structural.bridge.after.refind_abstraction;

import structural.bridge.after.DefaultChampion;
import structural.bridge.after.Skin;
import structural.bridge.after.concrete_implementation.DefaultSkin;

public class Ari extends DefaultChampion {
    public Ari() {
        super(new DefaultSkin(), "Ari");
    }

    public Ari(Skin skin) {
        super(skin, "Ari");
    }
}
