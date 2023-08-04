package org.example.facade;

public class Client {

  public static void main(String[] args) {
    DVDPlayer dvdPlayer = new DVDPlayer("The Avengers");
    Projector projector = new Projector();
    SoundSystem soundSystem = new SoundSystem();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

    homeTheater.watchMovie();

    homeTheater.endMovie();
  }
}
