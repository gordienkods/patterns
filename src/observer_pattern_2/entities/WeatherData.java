package observer_pattern_2.entities;

import observer_pattern_2.interfaces.Observer;
import observer_pattern_2.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by Dimon on 21.02.2017.
 */
public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(0);
        if (i>=0) observers.remove(i);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurmentChange(){
        notifyObservers();
    }

    public void setMesurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
