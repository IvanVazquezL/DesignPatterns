package StrategyHogwarts.Character;

public class HarryPotter extends Character{
    public HarryPotter(String name) {
        this.name = name;
    }

    @Override
    public void dialogue(String dialogueType) {
        switch(dialogueType) {
            case "catch-phrase":
                System.out.println(name + ": Expelliarmus!");
        }
    }

}
