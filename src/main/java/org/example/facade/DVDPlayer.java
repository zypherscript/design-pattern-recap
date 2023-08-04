package org.example.facade;

public class DVDPlayer {

  private final String movieName;

  public DVDPlayer(String movieName) {
    this.movieName = movieName;
  }

  public void on() {
    System.out.println("DVD Player is on");
  }

  public void play() {
    System.out.println("DVD Player is playing: " + this.movieName);
  }

  public void stop() {
    System.out.println("DVD Player stopped");
  }

  @Override
  public String toString() {
    return this.movieName;
  }
}
