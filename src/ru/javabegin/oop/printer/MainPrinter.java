package ru.javabegin.oop.printer;

public class MainPrinter {

  public static void main(String[] args) {

    IPrinter printer = new Printer(10);
    printer.print("Hello world");
    printer.charge(5);
    printer.print("Hello world");
    printer.print("test");
  }

}
