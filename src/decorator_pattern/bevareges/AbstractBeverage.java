package decorator_pattern.bevareges;

public abstract class AbstractBeverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
