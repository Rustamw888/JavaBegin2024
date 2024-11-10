package ru.javabegin.oop.car;

import java.util.List;
import ru.javabegin.oop.computer.Main;

public class Car extends Transport {

  List<String> name1;
  String name2;

  public Car() {
    System.out.println("car");
  }

  public Car(List<String> name1, String name2, List<String> name11, String name21) {
    super(name1, name2);
    this.name1 = name11;
    this.name2 = name21;
    stop();
    super.drive();
  }

  public Car(List<String> name1, String name2) {
    this.name1 = name1;
    this.name2 = name2;
  }

  public List<String> getName1() {
    return name1;
  }

  public void setName1(List<String> name1) {
    this.name1 = name1;
  }

  private String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  @Override
  void drive() {
    super.drive();
    System.out.println("name1 = " + super.getName1());
    super.setName1(List.of("BMW1"));
    System.out.println("name1 = " + super.getName1());
//    setName1(List.of("BMW2"));
    System.out.println("name2 = " + getName1());

  }

  @Override
  void stop() {
    System.out.println("car stop");
  }

}
