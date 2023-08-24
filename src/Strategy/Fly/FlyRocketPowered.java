package Strategy.Fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("BRROOOOOOMMMMMM!!!!");
    }
}
