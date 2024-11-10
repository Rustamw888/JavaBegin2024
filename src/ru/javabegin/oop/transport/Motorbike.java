package ru.javabegin.oop.transport;

public class Motorbike extends Transport {

  private double volume;

  public Motorbike() {
  }

  public Motorbike(double volume) {
    this.volume = volume;
  }

  public Motorbike(String name, String model, String color, double volume) {
    super(name, model, color);
    this.volume = volume;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }
}
