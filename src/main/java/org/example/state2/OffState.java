package org.example.state2;

public class OffState implements LightState {

  @Override
  public void toggle() {
    System.out.println("Turning the light on to low.");
  }
}
