package strategy_pattern_1;

import strategy_pattern_1.entities.Duck;
import strategy_pattern_1.entities.ModelDuck;
import strategy_pattern_1.interfaces_realization.FlyRoketPowered;

/**
 * Created by Dimon on 18.02.2017.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
//        Duck mallrdDuck = new MallarDuck();
//        mallrdDuck.prformQuack();
//        mallrdDuck.performFly();

        Duck modelduck = new ModelDuck();

        modelduck.performFly();
        modelduck.setFlyBehavior(new FlyRoketPowered());
        modelduck.performFly();



    }
}
