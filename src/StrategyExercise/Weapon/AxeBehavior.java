package StrategyExercise.Weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Axe Attack!");
    }
}
