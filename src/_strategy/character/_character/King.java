package _strategy.character._character;

import _strategy.character._weapon.SwordBehavior;

public class King extends Character {

    public King() {
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("나는 왕이노라 엣헴~");
    }

}
