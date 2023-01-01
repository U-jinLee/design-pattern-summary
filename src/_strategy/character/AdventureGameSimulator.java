package _strategy.character;

import _strategy.character._character.Character;
import _strategy.character._character.King;
import _strategy.character._character.Troll;
import _strategy.character._weapon_strategy.SwordBehavior;

public class AdventureGameSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.display();

        System.out.println("--Troll--");
        Character troll = new Troll();
        troll.fight();
        troll.display();
        troll.setWeapon(new SwordBehavior());
        troll.fight();
        troll.display();
    }
}
