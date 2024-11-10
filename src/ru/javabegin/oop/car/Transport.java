package ru.javabegin.oop.car;

import java.util.List;
import ru.javabegin.oop.computer.Main;

public class Transport {

  List<String> name1;
  String name2;

  public Transport() {
    System.out.println("transport");
  }

  public Transport(List<String> name1, String name2) {
    super();
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

  void drive() {
    System.out.println("transport drive" + getName1());
  }

  void stop() {
    System.out.println("transport stop" + getName1());
  }

}
