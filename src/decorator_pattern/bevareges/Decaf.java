package decorator_pattern.bevareges;

import decorator_pattern.bevareges.AbstractBeverage;

/**
 * Created by Dimon on 25.04.2017.
 */
public class Decaf extends AbstractBeverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
