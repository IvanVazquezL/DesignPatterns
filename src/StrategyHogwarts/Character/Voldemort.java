package StrategyHogwarts.Character;

public class Voldemort extends Character{

    public Voldemort(String name) {
        this.name = name;
    }

    @Override
    public void dialogue(String dialogueType) {
        switch(dialogueType) {
            case "catch-phrase":
                System.out.println(name + ": Only I can live forever!");
        }
    }

}
