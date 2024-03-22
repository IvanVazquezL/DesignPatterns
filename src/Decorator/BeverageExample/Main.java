package Decorator.BeverageExample;

import Decorator.BeverageExample.Component.Beverage;
import Decorator.BeverageExample.ConcreteComponents.DarkRoast;
import Decorator.BeverageExample.ConcreteComponents.Decaf;
import Decorator.BeverageExample.ConcreteComponents.Espresso;
import Decorator.BeverageExample.ConcreteComponents.HouseBlend;
import Decorator.BeverageExample.ConcreteDecorators.Mocha;
import Decorator.BeverageExample.ConcreteDecorators.Soy;
import Decorator.BeverageExample.ConcreteDecorators.SteamedMilk;
import Decorator.BeverageExample.ConcreteDecorators.Whip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BeverageCost.printMenu();
        System.out.println("Select a coffee:");
        String optionBeverage = scanner.nextLine();

        Beverage beverage = getBeverageByOption(optionBeverage);
        CondimentCost.printMenu();
        String optionCondiment = scanner.nextLine();
        Beverage beverageWithCondiment = addCondimentToBeverage(beverage, optionCondiment);

        System.out.println(beverageWithCondiment.getDescription());
        System.out.println(beverageWithCondiment.cost());
    }

    public static Beverage getBeverageByOption(String option) {
        switch (option) {
            case "1":
                return new Espresso();
            case "2":
                return new HouseBlend();
            case "3":
                return new Decaf();
            case "4":
                return new DarkRoast();
            default:
                return null;
        }
    }

    public static Beverage addCondimentToBeverage(Beverage beverage, String option) {
        switch(option) {
            case "1":
                return new SteamedMilk(beverage);
            case "2":
                return new Mocha(beverage);
            case "3":
                return new Soy(beverage);
            case "4":
                return new Whip(beverage);
        }

        return null;
    }
}
