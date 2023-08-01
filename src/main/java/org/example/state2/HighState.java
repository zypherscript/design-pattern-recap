package org.example.state2;

public class HighState implements LightState {

  @Override
  public void toggle() {
    System.out.println("Turning the light off.");
  }
}
