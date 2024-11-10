package ru.javabegin.oop.music;

public class Song implements ISong {

  private String songName;

  private Author author;

  public Song() {
  }

  public Song(String songName, Author author) {
    this.songName = songName;
    this.author = author;
  }

  @Override
  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  @Override
  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public void play(String name, Author author) {
    System.out.printf("Играет песня: %s, автор: %s %n", name, author.getAuthorName());
  }

  public void play() {
    System.out.printf("Играет песня: %s, автор: %s %n", songName, author.getAuthorName());
  }
}
