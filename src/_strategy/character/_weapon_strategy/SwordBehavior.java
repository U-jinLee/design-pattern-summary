package _strategy.character._weapon_strategy;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("칼로 댕강~!");
    }

}