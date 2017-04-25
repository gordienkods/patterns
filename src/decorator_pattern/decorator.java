package decorator_pattern;

import decorator_pattern.bevareges.AbstractBeverage;
import decorator_pattern.bevareges.DarkRoast;
import decorator_pattern.bevareges.Espresso;
import decorator_pattern.bevareges.HouseBland;
import decorator_pattern.decorators.Mocha;
import decorator_pattern.decorators.Soy;
import decorator_pattern.decorators.Whip;

/**
 * Created by Dimon on 25.04.2017.
 */
public class decorator {
    public static void main(String[] args) {
        AbstractBeverage abstractBeverage = new Espresso();
        System.err.println(abstractBeverage.getDescription() + " $" + abstractBeverage.cost());

        AbstractBeverage abstractBeverage2 = new DarkRoast();
        abstractBeverage2 = new Mocha(abstractBeverage2);
        abstractBeverage2 = new Mocha(abstractBeverage2);
        abstractBeverage2 = new Whip(abstractBeverage2);
        System.err.println(abstractBeverage2.getDescription() + " $" + abstractBeverage2.cost());

        AbstractBeverage abstractBeverage3 = new HouseBland();
        abstractBeverage3 = new Soy(abstractBeverage3);
        abstractBeverage3 = new Mocha(abstractBeverage3);
        abstractBeverage3 = new Whip(abstractBeverage3);
        System.err.println(abstractBeverage3.getDescription() + " $" + abstractBeverage3.cost());
    }
}
