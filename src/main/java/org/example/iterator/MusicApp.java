package org.example.iterator;

public class MusicApp {

  public static void main(String[] args) {
    Playlist playlist = new Playlist();
    playlist.addSong(new Song("Song 1", "Artist 1"));
    playlist.addSong(new Song("Song 2", "Artist 2"));
    playlist.addSong(new Song("Song 3", "Artist 3"));

    while (playlist.hasNext()) {
      Song song = playlist.next();
      System.out.println(song);
    }
  }
}
