package StrategyHogwarts;

import StrategyHogwarts.Character.Character;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts Battle");
        System.out.println("Select a hero:");
        System.out.println("1) Harry Potter\n2) Hermione");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        Character hero = Character.getHero(option);
        hero.dialogue("catch-phrase");

        System.out.println("Select a villain:");
        System.out.println("1) Voldemort\n2) Bellatrix");
        String optionVillain = scanner.nextLine();
        Character villain = Character.getVillain(option);
        villain.dialogue("catch-phrase");
    }
}
