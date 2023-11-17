package DisplayImpl;

import ObserverImpl.Observer;
import SubjectImpl.WeatherData;

public class StatisticsDisplay implements Observer,DisplayElement{

    private float maximumTemperature = 0.0f;
    private float minimumTemperature = 200;
    private float sumTemperature = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/min/max Temperature = "+ (sumTemperature/numReadings)+"/"+minimumTemperature+"/"+maximumTemperature);
    }

    @Override
    public void update( ) {
       float temperature = weatherData.getTemperature();
       sumTemperature += temperature;
       numReadings++;

       if(temperature>maximumTemperature){
          maximumTemperature = temperature;
       }

       if(temperature < minimumTemperature){
          minimumTemperature = temperature;
       }

       display();
    }
    
}
