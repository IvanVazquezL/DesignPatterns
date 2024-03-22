package StrategyHogwarts.Spell;

public class IncendioBehavior implements SpellBehavior{

    @Override
    public void useSpell() {
        System.out.println("Incendio!");
    }
}
