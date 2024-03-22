package StrategyHogwarts.Spell;

public class BombardaBehavior implements SpellBehavior{
    @Override
    public void useSpell() {
        System.out.println("Bombarda!");
    }
}
