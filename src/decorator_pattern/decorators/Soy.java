package decorator_pattern.decorators;

import decorator_pattern.bevareges.AbstractBeverage;
import decorator_pattern.bevareges.CondimentDecorator;

/**
 * Created by Dimon on 25.04.2017.
 */
public class Soy extends CondimentDecorator {

    AbstractBeverage abstractBeverage;

    public Soy(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", soya";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.15;
    }
}
