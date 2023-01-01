package _strategy.character._character;

import _strategy.character._weapon_strategy.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {}

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        System.out.printf("무기 변경\n");
        this.weaponBehavior = weaponBehavior;
    }
    public abstract void display();

}
