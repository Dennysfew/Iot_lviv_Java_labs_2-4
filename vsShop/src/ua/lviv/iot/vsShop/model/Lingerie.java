package ua.lviv.iot.vsShop.model;

import com.sun.jdi.connect.Connector;

public abstract class Lingerie {
    String nameOfCollection;
    int year;
    boolean availability;
    int price;

    public Lingerie(String nameOfCollection, int year, boolean availability, int price){
        this.nameOfCollection = nameOfCollection;
        this.year = year;
        this.availability = availability;
        this.price = price;
        }


}
