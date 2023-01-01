package _strategy.character._weapon_strategy;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 쾅!");
    }
}
