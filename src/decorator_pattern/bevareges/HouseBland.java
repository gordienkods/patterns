package decorator_pattern.bevareges;

import decorator_pattern.bevareges.AbstractBeverage;

/**
 * Created by Dimon on 25.04.2017.
 */
public class HouseBland extends AbstractBeverage {

    public HouseBland() {
        description = "House Bland Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
