package StrategyHogwarts.Character;

public class Hermione extends Character{
    public Hermione(String name) {
        this.name = name;
    }

    @Override
    public void dialogue(String dialogueType) {
        switch(dialogueType) {
            case "catch-phrase":
                System.out.println(name + ": A-LO-HO-MO-RA!");
        }
    }
}
