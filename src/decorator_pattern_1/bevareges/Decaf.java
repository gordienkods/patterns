package decorator_pattern_1.bevareges;

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
