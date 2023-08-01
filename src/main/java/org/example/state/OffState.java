package org.example.state;

public class OffState implements LightState {

  @Override
  public void toggle(LightBulbContext context) {
    System.out.println("Turning the light on to low.");
    context.setState(new LowState());
  }
}
