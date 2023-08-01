package org.example.state;

public class HighState implements LightState {

  @Override
  public void toggle(LightBulbContext context) {
    System.out.println("Turning the light off.");
    context.setState(new OffState());
  }
}
