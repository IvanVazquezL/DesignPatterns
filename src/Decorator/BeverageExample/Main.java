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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many beverages do you want?");
        int numberOfBeverages = Integer.parseInt(scanner.nextLine());
        List<Beverage> beverages = new ArrayList<>();

        for(int i = 0; i < numberOfBeverages; i++) {
            BeverageCost.printMenu();
            System.out.println("Select a coffee:");
            String optionBeverage = scanner.nextLine();
            Beverage beverage = getBeverageByOption(optionBeverage);

            CondimentCost.printMenu();
            String optionCondiment = scanner.nextLine();
            List<String> listOfCondiments = new ArrayList<>(Arrays.asList(optionCondiment.split(" ")));
            Beverage beverageWithCondiments = beverage;

            for (String condiment : listOfCondiments) {
                beverageWithCondiments = addCondimentToBeverage(beverageWithCondiments, condiment);
            }

            beverages.add(beverageWithCondiments);
        }

        double total = 0;

        for (Beverage beverage : beverages) {
            System.out.println(beverage.getDescription() + " $ " + beverage.cost());
            total+= beverage.cost();
        }

        System.out.println("Total: $ " + total);



    }

    public static Beverage getBeverageByOption(String option) {
        switch (option) {
            case "1":
            case "2":
            case "3":
                return new Espresso(getBeverageSize(option));
            case "4":
            case "5":
            case "6":
                return new HouseBlend(getBeverageSize(option));
            case "7":
            case "8":
            case "9":
                return new Decaf(getBeverageSize(option));
            case "10":
            case "11":
            case "12":
                return new DarkRoast(getBeverageSize(option));
            default:
                return null;
        }
    }

    public static Size getBeverageSize(String option) {
        switch(option) {
            case "1":
            case "4":
            case "7":
            case "10":
                return Size.SMALL;
            case "2":
            case "5":
            case "8":
            case "11":
                return Size.MEDIUM;
            case "3":
            case "6":
            case "9":
            case "12":
                return Size.LARGE;
            default:
                return null;
        }
    }

    public static Beverage addCondimentToBeverage(Beverage beverage, String option) {
        switch(option) {
            case "1":
            case "2":
            case "3":
                return new SteamedMilk(beverage, getCondimentSize(option));
            case "4":
            case "5":
            case "6":
                return new Mocha(beverage, getCondimentSize(option));
            case "7":
            case "8":
            case "9":
                return new Soy(beverage, getCondimentSize(option));
            case "10":
            case "11":
            case "12":
                return new Whip(beverage, getCondimentSize(option));
        }

        return null;
    }

    public static Size getCondimentSize(String option) {
        switch(option) {
            case "1":
            case "4":
            case "7":
            case "10":
                return Size.SMALL;
            case "2":
            case "5":
            case "8":
            case "11":
                return Size.MEDIUM;
            case "3":
            case "6":
            case "9":
            case "12":
                return Size.LARGE;
            default:
                return null;
        }
    }
}
