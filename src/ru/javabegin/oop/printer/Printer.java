package ru.javabegin.oop.printer;

public class Printer implements IPrinter {

  private int paintVolume;

  public Printer() {
  }

  public Printer(int paintVolume) {
    this.paintVolume = paintVolume;
  }

  public void setPaintVolume(int paintVolume) {
    this.paintVolume = paintVolume;
  }

  @Override
  public int getPaintVolume() {
    return paintVolume;
  }

  @Override
  public void print(String text) {
    System.out.printf("На печать отправлен текст: %s, длина: %d %n", text, text.length());
    if (text.length() <= paintVolume) {
      paintVolume = paintVolume - text.length();
      System.out.printf("Текст распечатан: %s, у принтера осталось краски: %d %n", text, paintVolume);
    } else {
      int left = text.length() - paintVolume;
      System.out.printf("Не хватило краски: %d (всего краски в принтере %d) %n", left, paintVolume);
    }

  }

  @Override
  public void charge(int plus) {
    paintVolume = plus + paintVolume;
    System.out.printf("Принтер пополнен на длину текста %d (всего краски в принтере: %d) %n", plus, paintVolume);
  }
}
