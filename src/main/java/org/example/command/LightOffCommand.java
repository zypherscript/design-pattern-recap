package org.example.command;

// Concrete Command - Light Off
public class LightOffCommand implements Command {

  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOff();
  }
}
