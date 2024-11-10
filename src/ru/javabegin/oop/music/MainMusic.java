package ru.javabegin.oop.music;

public class MainMusic {

  public static void main(String[] args) {

    IPlaylist playlist = new Playlist();

    ISong song1 = new Song("Щелкунчик", new Author("Чайковский"));
    ISong song2 = new Song("Лебединое", new Author("Чайковский"));
    ISong song3 = new Song("Времена года", new Author("Вивальди"));
    ISong song4 = new Song("Цвет настроения синий", new Author("Киркоров"));
    ISong song5 = new Song("Shape of My Heart", new Author("Sting"));
    ISong song6 = new Song("Show must go on", new Author("Queen"));
    ISong song7 = new Song("We will rock you", new Author("Queen"));

    playlist.addSong(song1);
    playlist.addSong(song2);
    playlist.addSong(song3);
    playlist.addSong(song4);
    playlist.addSong(song5);
    playlist.addSong(song6);
    playlist.addSong(song7);

    playlist.playAllSongs();
  }

}
