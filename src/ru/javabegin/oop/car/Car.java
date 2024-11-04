package ru.javabegin.oop.car;

import ru.javabegin.oop.computer.Main;

public class Car {

  String name1;
  String name2;

  protected String getName1() {
    return name1;
  }

  void setName1(String name1) {
    this.name1 = name1;
  }

  private String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  void drive() {
    String name = new Main().toString();
  }

}
