package ru.javabegin.oop.car;

public class Bmw extends Car {

  public Bmw() {
    System.out.println("bmw");
  }

  @Override
  void drive() {
  }

  @Override
  void stop() {
    super.stop();
  }
}
