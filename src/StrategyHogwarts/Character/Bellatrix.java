package StrategyHogwarts.Character;

public class Bellatrix extends Character{

    public Bellatrix(String name) {
        this.name = name;
    }
    @Override
    public void dialogue(String dialogueType) {
        System.out.println("Itty, bitty baby!");
    }
}
