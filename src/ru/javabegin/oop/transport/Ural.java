package ru.javabegin.oop.transport;

public class Ural extends Motorbike {

  private boolean firstAidKit;

  public Ural() {
  }

  public Ural(boolean firstAidKit) {
    this.firstAidKit = firstAidKit;
  }

  public Ural(double volume, boolean firstAidKit) {
    super(volume);
    this.firstAidKit = firstAidKit;
  }

  public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
    super(name, model, color, volume);
    this.firstAidKit = firstAidKit;
  }

  public boolean isFirstAidKit() {
    return firstAidKit;
  }

  public void setFirstAidKit(boolean firstAidKit) {
    this.firstAidKit = firstAidKit;
  }

  public void showInfo() {
    System.out.println("Показ информации");
  }

}
