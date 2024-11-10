package ru.javabegin.oop.car2;

public class MainCar {

  public static void main(String[] args) {
    CarTask carTask = new CarTask();
    carTask.setName("BMW");
    carTask.drive();
    carTask.stop();
  }
}
