package org.example.observer;

public class WeatherDisplay implements Observer {

  private float temperature;
  private float humidity;

  @Override
  public void update(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println(
        "Weather Display: Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
  }
}
