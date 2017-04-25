package strategy_pattern_1.entities;

import strategy_pattern_1.interfaces_realization.FlyWithWings;
import strategy_pattern_1.interfaces_realization.Quack;

/**
 * Created by Dimon on 18.02.2017.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.err.println("I'm real mallard duck");
    }
}
