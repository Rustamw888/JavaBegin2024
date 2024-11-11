package ru.javabegin.oop.city;

import java.util.ArrayList;

public class Flat implements IFlat {

  private int flatNumber;

  private ArrayList<Settler> settlerList = new ArrayList<>();

  public Flat() {
  }

  public Flat(int flatNumber) {
    this.flatNumber = flatNumber;
  }

  public Flat(int flatNumber, ArrayList<Settler> settlerList) {
    this.flatNumber = flatNumber;
    this.settlerList = settlerList;
  }

  @Override
  public int getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(int flatNumber) {
    this.flatNumber = flatNumber;
  }

  @Override
  public ArrayList<Settler> getSettlerList() {
    return settlerList;
  }

  public void setSettlerList(ArrayList<Settler> settlerList) {
    this.settlerList = settlerList;
  }

  @Override
  public void addSettler(Settler settler) {
    settlerList.add(settler);
  }
}
