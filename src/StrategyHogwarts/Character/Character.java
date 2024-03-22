package StrategyHogwarts.Character;

import StrategyHogwarts.Spell.SpellBehavior;

import java.util.ArrayList;

public abstract class Character {
    private ArrayList<SpellBehavior> spells = new ArrayList<>();
    private int health = 100;
    protected String name;

    public Character() {
    }

    public static Character getHero(String option) {
        switch (option) {
            case "1": return new HarryPotter("Harry Potter");
            case "2": return new Hermione("Hermione");
        }
        return null;
    }

    public static Character getVillain(String option) {
        switch (option) {
            case "1": return new Voldemort("Voldemort");
            case "2": return new Bellatrix("Bellatrix");
        }
        return null;
    }

    public abstract void dialogue(String dialogueType);


}
