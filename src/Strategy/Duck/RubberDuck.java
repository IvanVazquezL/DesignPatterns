package Strategy.Duck;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public class RubberDuck extends Duck{
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("A rubber duck is a small, yellow or brightly colored toy resembling a duck. It typically has a rounded body, flat base, and a friendly, simplistic design with a beak, eyes, and sometimes a tuft of hair on its head.");
    }
}
