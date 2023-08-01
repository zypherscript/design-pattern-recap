package org.example.state2;

public class LightBulbContext {

  private LightState currentState;

  public LightBulbContext() {
    this.currentState = new OffState();
  }

  public void setState(LightState state) {
    this.currentState = state;
  }

  public void toggle() {
    currentState.toggle();
    if (currentState instanceof OffState) {
      setState(new LowState());
    } else if (currentState instanceof LowState) {
      setState(new HighState());
    } else if (currentState instanceof HighState) {
      setState(new OffState());
    }
  }

  public static void main(String[] args) {
    var lightBulb = new LightBulbContext();

    lightBulb.toggle(); // Output: Turning the light on to low.
    lightBulb.toggle(); // Output: Turning the light on to high.
    lightBulb.toggle(); // Output: Turning the light off.
    lightBulb.toggle(); // Output: Turning the light on to low.
  }
}
