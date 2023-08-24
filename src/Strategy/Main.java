package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MexicanDuck;
import Strategy.Duck.RubberDuck;
import Strategy.Fly.FlyNoWay;
import Strategy.Fly.FlyRocketPowered;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.DuckCall;
import Strategy.Quack.MuteQuack;
import Strategy.Quack.Quack;

public class Main {
    public static void main(String[] args) {
        MexicanDuck mexicanDuck = new MexicanDuck(
                new FlyWithWings(),
                new Quack()
        );
        RubberDuck rubberDuck = new RubberDuck(
                new FlyNoWay(),
                new MuteQuack()
        );

        doDuckStuff(mexicanDuck);
        doDuckStuff(rubberDuck);
        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.setQuackBehavior(new DuckCall());
        doDuckStuff(rubberDuck);

    }

    public static void doDuckStuff(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        System.out.println("\n");
    }

}
