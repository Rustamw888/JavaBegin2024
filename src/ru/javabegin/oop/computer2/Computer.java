package ru.javabegin.oop.computer2;

public class Computer {

  private String name;

  public Computer() {
  }

  public Computer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(STR."\{name} ON");
  }

  public void off() {
    System.out.println(STR."\{name} OFF");
  }
}
