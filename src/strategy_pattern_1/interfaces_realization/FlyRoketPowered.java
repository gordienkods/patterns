package strategy_pattern_1.interfaces_realization;

import strategy_pattern_1.interfaces.FlyBehavior;

/**
 * Created by Dimon on 18.02.2017.
 */
public class FlyRoketPowered implements FlyBehavior {

    public void fly() {
        System.err.println("I'm flying with a rocket!");
    }
}
