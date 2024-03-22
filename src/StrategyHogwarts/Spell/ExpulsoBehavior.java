package StrategyHogwarts.Spell;

public class ExpulsoBehavior implements  SpellBehavior{

    @Override
    public void useSpell() {
        System.out.println("Expulso!");
    }
}
