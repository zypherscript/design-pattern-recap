package org.example.state;

public class LightBulbContext {

  private LightState currentState;

  public LightBulbContext() {
    this.currentState = new OffState();
  }

  public void setState(LightState state) {
    this.currentState = state;
  }

  public void toggle() {
    currentState.toggle(this);
  }

  public static void main(String[] args) {
    LightBulbContext lightBulb = new LightBulbContext();

    lightBulb.toggle(); // Output: Turning the light on to low.
    lightBulb.toggle(); // Output: Turning the light on to high.
    lightBulb.toggle(); // Output: Turning the light off.
    lightBulb.toggle(); // Output: Turning the light on to low.
  }
}
