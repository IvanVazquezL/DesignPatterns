package Strategy.Quack;

public class DuckCall implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("*Fake Quack*");
    }
}
