package ru.javabegin.oop.transport;

public class Kawasaki extends Motorbike implements Iras, Idva {

  private int year;

  public Kawasaki() {
  }

  public Kawasaki(int year) {
    this.year = year;
  }

  public Kawasaki(double volume, int year) {
    super(volume);
    this.year = year;
  }

  public Kawasaki(String name, String model, String color, double volume, int year) {
    super(name, model, color, volume);
    this.year = year;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void jump() {
    System.out.println("Kawasaki jump");
  }
}
