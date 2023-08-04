package org.example.facade;

public class HomeTheaterFacade {

  private final DVDPlayer dvdPlayer;
  private final Projector projector;
  private final SoundSystem soundSystem;

  public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.soundSystem = soundSystem;
  }

  public void watchMovie() {
    System.out.println("Get ready to watch a movie...");
    dvdPlayer.on();
    dvdPlayer.play();
    projector.on();
    projector.setInput(dvdPlayer);
    projector.display();
    soundSystem.on();
    soundSystem.setVolume(10);
  }

  public void endMovie() {
    System.out.println("Shutting down the home theater...");
    dvdPlayer.stop();
    projector.off();
    soundSystem.off();
  }
}
