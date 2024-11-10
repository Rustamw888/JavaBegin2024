package ru.javabegin.oop.car2;

public interface ICarTask {

  String getName();

  default void drive() {
    System.out.println("Interface drive");
  }

  default void stop() {
    System.out.println("Interface stop");
  }
}
