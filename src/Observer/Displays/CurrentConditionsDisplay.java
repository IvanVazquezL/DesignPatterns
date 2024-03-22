package Observer.Displays;

import Observer.Interfaces.DisplayElement;
import Observer.Interfaces.Observer;
import Observer.Interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " +temperature + "C, " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
