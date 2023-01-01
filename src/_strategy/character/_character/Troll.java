package _strategy.character._character;

import _strategy.character._weapon_strategy.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("나는 트롤이야~");
    }
}
