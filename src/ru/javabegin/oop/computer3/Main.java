package ru.javabegin.oop.computer3;

public class Main {

  public static void main(String[] args) {
    IComputer computer = new Computer("MacBook", new Monitor("Samsung"));

    computer.on();
    computer.off();
  }

}
