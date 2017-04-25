package decorator_pattern.bevareges;

import decorator_pattern.bevareges.AbstractBeverage;

/**
 * Created by Dimon on 25.04.2017.
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
