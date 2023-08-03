package org.example.iterator;

public record Song(String name, String artist) {

  @Override
  public String toString() {
    return name + " by " + artist;
  }
}
