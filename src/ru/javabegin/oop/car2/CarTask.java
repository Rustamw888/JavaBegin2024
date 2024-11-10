package ru.javabegin.oop.car2;

public class CarTask implements ICarTask {

  private String name;

  public CarTask() {
  }

  public CarTask(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void drive() {
    System.out.println("Class drive");
  }

  @Override
  public void stop() {
    System.out.println("Class stop");
  }
}
