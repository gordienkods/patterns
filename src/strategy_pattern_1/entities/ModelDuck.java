package strategy_pattern_1.entities;

import strategy_pattern_1.interfaces_realization.FlyNoWay;
import strategy_pattern_1.interfaces_realization.Quack;

/**
 * Created by Dimon on 18.02.2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.err.println("I'm model duck!");
    }
}
