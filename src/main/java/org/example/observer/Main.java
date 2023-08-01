package org.example.observer;

public class Main {

  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    WeatherDisplay display1 = new WeatherDisplay();
    WeatherDisplay display2 = new WeatherDisplay();

    weatherStation.addObserver(display1);
    weatherStation.addObserver(display2);

    weatherStation.setMeasurements(25.5f, 60.0f);
    // Output:
    // Weather Display: Temperature = 25.5°C, Humidity = 60.0%

    weatherStation.setMeasurements(28.0f, 55.5f);
    // Output:
    // Weather Display: Temperature = 28.0°C, Humidity = 55.5%
    // Weather Display: Temperature = 28.0°C, Humidity = 55.5%

    weatherStation.removeObserver(display1);

    weatherStation.setMeasurements(30.5f, 50.0f);
    // Output:
    // Weather Display: Temperature = 30.5°C, Humidity = 50.0%
  }
}
