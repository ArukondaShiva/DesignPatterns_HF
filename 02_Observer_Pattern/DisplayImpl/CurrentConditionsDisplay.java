package DisplayImpl;

import ObserverImpl.Observer;
import SubjectImpl.WeatherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       this.pressure = weatherData.getPressure();
       display();
    }
    
    @Override
    public void display() {
       System.out.println("Current Conditions: "+"temperature-"+temperature+"F degrees, humidity-"+humidity+", pressure-"+pressure);
    }

}
