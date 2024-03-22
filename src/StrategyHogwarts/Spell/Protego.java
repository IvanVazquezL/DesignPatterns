package StrategyHogwarts.Spell;

public class Protego implements SpellBehavior{

    @Override
    public void useSpell() {
        System.out.println("Protego!");
    }
}
