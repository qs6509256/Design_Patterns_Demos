package Observer;

/**
 * Created by QS on 14-5-14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData1) {
        this.weatherData = weatherData1;
        weatherData1.register(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {

    }
}
