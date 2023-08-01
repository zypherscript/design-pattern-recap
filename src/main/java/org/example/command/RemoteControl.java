package org.example.command;

// Invoker - Remote Control
public class RemoteControl {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    if (command != null) {
      command.execute();
    }
  }

  public static void main(String[] args) {
    Light light = new Light();
    Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);

    RemoteControl remote = new RemoteControl();

    // Turning on the light
    remote.setCommand(lightOn);
    remote.pressButton();

    // Turning off the light
    remote.setCommand(lightOff);
    remote.pressButton();
  }
}
