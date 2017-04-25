package observer_pattern_2_variant_2.entities;

import observer_pattern_2.interfaces.Observer;
import observer_pattern_2.interfaces.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Dimon on 21.02.2017.
 */
public class WeatherData extends Observable{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChange(){
        setChanged();
        notifyObservers();
    }

    public void setMesurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
