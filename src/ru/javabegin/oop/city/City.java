package ru.javabegin.oop.city;

import java.util.ArrayList;
import java.util.List;

public class City implements ICity {

  private String cityName;

  private ArrayList<IHouse> houseList = new ArrayList<>();

  public City() {
  }

  public City(String cityName, ArrayList<IHouse> houseList) {
    this.cityName = cityName;
    this.houseList = houseList;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public void setHouseList(ArrayList<IHouse> houseList) {
    this.houseList = houseList;
  }

  @Override
  public String getCityName() {
    return cityName;
  }

  @Override
  public ArrayList<IHouse> getHouseList() {
    return houseList;
  }

  @Override
  public void addHouse(IHouse iHouse) {
    houseList.add(iHouse);
  }

  @Override
  public void showSettledList() {
    System.out.println("Город: " + cityName);

    houseList.forEach(iHouse -> {
      System.out.println("Дом: " + iHouse.getAddress());
      iHouse.getFlatList().forEach(iFlat -> {
        System.out.println("- Квартира: " + iFlat.getFlatNumber());
        List<Settler> settlers = iFlat.getSettlerList();

        if (settlers.isEmpty()) {
          System.out.println("-- Никто не живет");
        } else if (settlers.size() > 2) {
          System.out.printf("-- !!! Нельзя заселить более 2-х жителей в квартиру %d %n", iFlat.getFlatNumber());
        } else {
          settlers.forEach(settler ->
              System.out.println("-- Житель: " + settler.getSettlerName()));
        }
      });
    });
  }
}
