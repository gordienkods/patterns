package observer_pattern_2;

import observer_pattern_2.entities.CurrentConditionsDisplay;
import observer_pattern_2.entities.WeatherData;

/**
 * Created by Dimon on 21.02.2017.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMesurements(1,1,1);
        weatherData.setMesurements(2,2,2);
        weatherData.setMesurements(3,3,3);
    }
}
