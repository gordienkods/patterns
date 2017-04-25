package strategy_pattern_1.interfaces_realization;

import strategy_pattern_1.interfaces.QuackBehavior;

/**
 * Created by Dimon on 18.02.2017.
 */
public class Squeak implements QuackBehavior {

    public void quack(){
        System.err.println("Squeak!");
    }

}
