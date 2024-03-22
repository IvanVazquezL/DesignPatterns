package Decorator.BeverageExample;

public enum CondimentCost {
    STEAMED_MILK(0.10),
    MOCHA(0.20),
    SOY(0.15),
    WHIP(0.10);

    private final double cost;

    CondimentCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
