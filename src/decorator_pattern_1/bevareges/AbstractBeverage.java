package decorator_pattern_1.bevareges;

public abstract class AbstractBeverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
