package Decorator.BeverageExample;

public enum CondimentCost {
    STEAMED_MILK("Steamed Milk",0.05,0.10, 0.15),
    MOCHA("Mocha",0.15,0.20, 0.25),
    SOY("Soy",0.10,0.15, 0.20),
    WHIP("Whip",0.05,0.10, 0.15);

    private final String name;
    private final double smallPrice;
    private final double mediumPrice;
    private final double largePrice;

    CondimentCost(String name, double smallPrice, double mediumPrice, double largePrice) {
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
        for (CondimentCost condiment : values()) {
            System.out.println(option + ") " + condiment.name() + " Small: $" + condiment.getSmallPrice());
            option++;

            System.out.println(option + ") " + condiment.name() + " Medium: $" + condiment.getMediumPrice());
            option++;

            System.out.println(option + ") " + condiment.name() + " Large: $" + condiment.getLargePrice());
            option++;
        }
    }
}
