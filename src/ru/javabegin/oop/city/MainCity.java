package ru.javabegin.oop.city;

import java.util.ArrayList;

public class MainCity {

  public static void main(String[] args) {

    Settler settler1 = new Settler("settler1");
    Settler settler2 = new Settler("settler2");
    Settler settler3 = new Settler("settler3");
    Settler settler4 = new Settler("settler4");
    Settler settler5 = new Settler("settler5");
    Settler settler6 = new Settler("settler6");
    Settler settler7 = new Settler("settler7");
    Settler settler8 = new Settler("settler8");
    Settler settler9 = new Settler("settler9");
    Settler settler10 = new Settler("settler10");
    Settler settler11 = new Settler("settler11");
    Settler settler12 = new Settler("settler12");
    Settler settler13 = new Settler("settler13");
    Settler settler14 = new Settler("settler14");
    Settler settler15 = new Settler("settler15");
    Settler settler16 = new Settler("settler16");
    Settler settler17 = new Settler("settler17");
    Settler settler18 = new Settler("settler18");

    IFlat iFlat1 = new Flat(1);
    IFlat iFlat2 = new Flat(2);
    IFlat iFlat3 = new Flat(3);
    IFlat iFlat4 = new Flat(4);
    IFlat iFlat5 = new Flat(5);
    IFlat iFlat6 = new Flat(6);
    IFlat iFlat7 = new Flat(7);
    IFlat iFlat8 = new Flat(8);
    IFlat iFlat9 = new Flat(9);
    IFlat iFlat10 = new Flat(10);

    iFlat1.addSettler(settler1);
    iFlat1.addSettler(settler2);

    iFlat2.addSettler(settler3);
    iFlat2.addSettler(settler4);

    iFlat3.addSettler(settler6);

    iFlat4.addSettler(settler7);
    iFlat4.addSettler(settler8);

    iFlat5.addSettler(settler9);
    iFlat5.addSettler(settler10);

    iFlat6.addSettler(settler11);

    iFlat7.addSettler(settler12);
    iFlat7.addSettler(settler13);

    iFlat8.addSettler(settler14);
    iFlat8.addSettler(settler15);

    iFlat9.addSettler(settler16);
    iFlat9.addSettler(settler17);
    iFlat9.addSettler(settler18);

    IHouse iHouse1 = new House("ул. Иванова, д.5");
    IHouse iHouse2 = new House("ул. Петрова, д.28");
    IHouse iHouse3 = new House("ул. Павлова, д.17");
    IHouse iHouse4 = new House("ул. Лапочкина, д.2");
    IHouse iHouse5 = new House("ул. Королева, д.153");

    iHouse1.addFlat(iFlat1);
    iHouse1.addFlat(iFlat2);

    iHouse2.addFlat(iFlat3);
    iHouse2.addFlat(iFlat4);

    iHouse3.addFlat(iFlat5);
    iHouse3.addFlat(iFlat6);

    iHouse4.addFlat(iFlat7);
    iHouse4.addFlat(iFlat8);

    iHouse5.addFlat(iFlat9);
    iHouse5.addFlat(iFlat10);

    ArrayList<IHouse> houseList = new ArrayList<>();

    houseList.add(iHouse1);
    houseList.add(iHouse2);
    houseList.add(iHouse3);
    houseList.add(iHouse4);
    houseList.add(iHouse5);

    ICity city = new City("Москва", houseList);

    city.showSettledList();
  }

}
