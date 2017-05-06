package decorator_pattern_1.bevareges;

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
