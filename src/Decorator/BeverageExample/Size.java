package Decorator.BeverageExample;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    Size(String size) {
        this.size = size;
    }
}
