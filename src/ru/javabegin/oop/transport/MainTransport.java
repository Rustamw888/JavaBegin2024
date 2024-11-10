package ru.javabegin.oop.transport;

public class MainTransport {

  public static void main(String[] args) {

    Kawasaki kawasaki = new Kawasaki("name1", "model1", "color1", 10.5, 2024);
    kawasaki.jump();

    Ural ural = new Ural("name2", "model2", "color2", 15.5,true);
    ural.showInfo();
  }

}
