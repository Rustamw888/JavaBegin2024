package ru.javabegin.oop.city;

import java.util.ArrayList;

public interface ICity {

  String getCityName();

  ArrayList<IHouse> getHouseList();

  void showSettledList();

  void addHouse(IHouse iHouse);
}
