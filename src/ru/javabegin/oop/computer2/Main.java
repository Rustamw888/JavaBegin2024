package ru.javabegin.oop.computer2;

import ru.javabegin.oop.car.Car;

public class Main {

  public static void main(String[] args) {

    Computer computer = new Computer("IBM");
    computer.on();
    computer.off();

    Computer computer1 = new Computer();
    computer1.setName("IBM");
    computer1.on();
    computer1.off();

  }
}