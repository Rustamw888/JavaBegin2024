package ru.javabegin.oop.music;

public interface ISong {

  String getSongName();

  Author getAuthor();

  void play(String name, Author author);
  void play();
}
