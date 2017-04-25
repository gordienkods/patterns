package observer_pattern_2.entities;

import observer_pattern_2.interfaces.DisplayElement;
import observer_pattern_2.interfaces.Observer;
import observer_pattern_2.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.err.println("Current conditions: " + temperature + " C, " + humidity + "%");
    }
}
