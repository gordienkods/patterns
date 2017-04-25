package observer_pattern_2_variant_2.entities;

import observer_pattern_2.interfaces.DisplayElement;

import observer_pattern_2.interfaces.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.err.println("Current conditions: " + temperature + " C, " + humidity + "%");
    }
}
