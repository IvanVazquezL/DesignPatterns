package Strategy.Duck;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public class MexicanDuck extends Duck{
    public MexicanDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println(
                "The Mexican Duck has a glossy green head, white neck ring, chestnut-brown chest, and gray body in males. Females are mottled brown with streaked underparts. Both have blue wing patches and are similar to Mallards.");
    }
}
