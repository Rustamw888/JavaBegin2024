package ru.javabegin.oop.printer;

import ru.javabegin.oop.computer.Main;

public class MainPrinter {

  public static void main(String[] args) {

    IPrinter printer = new Printer(10);
    printer.print("Hello world");
    printer.charge(5);
    printer.print("Hello world");
    printer.print("test");
    Printer pr = (Printer)printer;
    pr.setPaintVolume(4321423);
    IPrinter pr2 = (IPrinter) new MainPrinter();
  }

}
