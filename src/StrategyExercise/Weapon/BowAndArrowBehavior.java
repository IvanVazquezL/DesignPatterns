package StrategyExercise.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow Attack!");
    }
}
