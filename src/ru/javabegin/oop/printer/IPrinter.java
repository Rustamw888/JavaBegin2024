package ru.javabegin.oop.printer;

public interface IPrinter {

  int getPaintVolume();

  void print(String text);

  void charge(int plus);
}
