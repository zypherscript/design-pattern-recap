package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements SongIterator {

  private final List<Song> songs;
  private int currentIndex;

  public Playlist() {
    songs = new ArrayList<>();
  }

  public void addSong(Song song) {
    songs.add(song);
  }

  @Override
  public boolean hasNext() {
    return currentIndex < songs.size();
  }

  @Override
  public Song next() {
    if (hasNext()) {
      return songs.get(currentIndex++);
    }
    return null;
  }
}
