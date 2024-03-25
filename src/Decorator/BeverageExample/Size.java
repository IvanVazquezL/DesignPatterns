package Decorator.BeverageExample;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    public String getSize() {
        return size;
    }

    Size(String size) {
        this.size = size;
    }
}
