package Decorator.BeverageExample;

public enum BeverageCost {
    ESPRESSO("Espresso",1.94,1.99, 2.04),
    HOUSE_BLEND("House Blend Coffee", 0.84,0.89, 0.94),
    DECAF("Decaf", 1.00,1.05,1.10),
    DARK_ROAST("Dark Roast",0.94,0.99, 1.04);

    private final String name;
    private final double smallPrice;
    private final double mediumPrice;
    private final double largePrice;

    BeverageCost(String name, double smallPrice, double mediumPrice, double largePrice) {
        this.name = name;
        this.smallPrice = smallPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;
    }

    public String getName() {
        return name;
    }

    public double getSmallPrice() {
        return smallPrice;
    }

    public double getMediumPrice() {
        return mediumPrice;
    }

    public double getLargePrice() {
        return largePrice;
    }

    public static void printMenu() {
        System.out.println("Menu:");
        int option = 1;
        for (BeverageCost beverage : values()) {
            System.out.println(option + ") " + beverage.name() + " Small: $" + beverage.getSmallPrice());
            option++;

            System.out.println(option + ") " + beverage.name() + " Medium: $" + beverage.getMediumPrice());
            option++;

            System.out.println(option + ") " + beverage.name() + " Large: $" + beverage.getLargePrice());
            option++;
        }
    }
}
