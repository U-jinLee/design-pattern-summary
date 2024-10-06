package structural.bridge.after;

import structural.bridge.after.concrete_implementation.Dominator;
import structural.bridge.after.concrete_implementation.PoolParty;
import structural.bridge.after.refind_abstraction.Akali;
import structural.bridge.after.refind_abstraction.Ari;

public class App {

    public static void main(String[] args) {
        Champion ari = new Ari();
        ari.move();
        ari.skillQ();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.move();
        poolPartyAri.skillQ();

        Ari dominatorAri = new Ari(new Dominator());
        dominatorAri.move();
        dominatorAri.skillQ();

        Champion poolPartyAkali = new Akali(new PoolParty());
        poolPartyAkali.move();
        poolPartyAkali.skillQ();

    }
}
