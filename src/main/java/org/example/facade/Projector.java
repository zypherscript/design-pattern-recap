package org.example.facade;

public class Projector {

  public void on() {
    System.out.println("Projector is on");
  }

  public void setInput(DVDPlayer dvdPlayer) {
    System.out.println("Projector is set to DVD Player input: " + dvdPlayer.toString());
  }

  public void display() {
    System.out.println("Projector is displaying");
  }

  public void off() {
    System.out.println("Projector is off");
  }
}
