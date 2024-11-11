package ru.javabegin.oop.city;

import java.util.ArrayList;

public interface IFlat {

  int getFlatNumber();

  ArrayList<Settler> getSettlerList();

  void addSettler(Settler settler);
}
