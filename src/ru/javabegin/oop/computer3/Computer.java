package ru.javabegin.oop.computer3;

public class Computer implements IComputer {

  private String computerName;
  private IMonitor monitor;

  public Computer() {
  }

  public Computer(String computerName, IMonitor monitor) {
    this.computerName = computerName;
    this.monitor = monitor;
  }

  @Override
  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  @Override
  public IMonitor getMonitor() {
    return monitor;
  }

  public void setMonitor(IMonitor monitor) {
    this.monitor = monitor;
  }

  @Override
  public void on() {
    System.out.printf("Компьютер включился %s, используется монитор %s %n", computerName, monitor.getMonitorName());
  }

  @Override
  public void off() {
    System.out.printf("Компьютер выключился %s, используется монитор %s %n", computerName, monitor.getMonitorName());
  }
}
