package ru.javabegin.oop.music;

import java.util.ArrayList;

public class Playlist implements IPlaylist {

  private ArrayList<ISong> songList = new ArrayList<>();

  public Playlist() {
  }

  public Playlist(ArrayList<ISong> songList) {
    this.songList = songList;
  }

  @Override
  public ArrayList<ISong> getSongList() {
    return songList;
  }

  public void setSongList(ArrayList<ISong> songList) {
    this.songList = songList;
  }

  @Override
  public void addSong(ISong song) {
    songList.add(song);
  }

  @Override
  public void playAllSongs() {
//    for (ISong iSong : songList) {
//      iSong.play(iSong.getSongName(), iSong.getAuthor());
//    }
    songList.forEach(ISong::play);
  }
}
