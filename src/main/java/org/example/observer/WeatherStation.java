package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

  private final List<Observer> observers;
  private float temperature;
  private float humidity;

  public WeatherStation() {
    observers = new ArrayList<>();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity);
    }
  }

  public void setMeasurements(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;
    measurementsChanged();
  }

  private void measurementsChanged() {
    notifyObservers();
  }
}

