package org.example.state;

public class LowState implements LightState {

  @Override
  public void toggle(LightBulbContext context) {
    System.out.println("Turning the light on to high.");
    context.setState(new HighState());
  }
}
