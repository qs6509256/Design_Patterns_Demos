package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by QS on 14-5-14.
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> list;

    public WeatherData() {
        list = new ArrayList<Observer>();
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = list.indexOf(observer);
        if (i >= 0) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
