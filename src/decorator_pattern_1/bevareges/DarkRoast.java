package decorator_pattern_1.bevareges;

/**
 * Created by Dimon on 25.04.2017.
 */
public class DarkRoast extends AbstractBeverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
