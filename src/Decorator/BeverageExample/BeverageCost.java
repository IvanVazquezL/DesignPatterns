package Decorator.BeverageExample;

public enum BeverageCost {
    ESPRESSO(1.99),
    HOUSE_BLEND(0.89),
    DECAF(1.05),
    DARK_ROAST(0.99);

    private final double cost;

    BeverageCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public static void printMenu() {
        System.out.println("Menu:");
        int option = 1;
        for (BeverageCost beverage : values()) {
            System.out.println(option + ") " + beverage.name() + ": $" + beverage.getCost());
        }
    }
}
