package ua.lviv.iot.model;

import com.sun.jdi.connect.Connector;

public abstract class Lingerie {
    String nameOfCollection;
    int year;
    boolean availability;
    int price;
    String type;

    public Lingerie(String nameOfCollection, int year, boolean availability, int price, String type) {
        this.nameOfCollection = nameOfCollection;
        this.year = year;
        this.availability = availability;
        this.price = price;
        this.type = type;
    }

    public int getLingeriePrice() {
        return price;
    }

    public int getLingerieYear() {
        return year;
    }

    public String getNameOfCollection() {
        return nameOfCollection;
    }

    public String getLingerieType() {
        return type;
    }

    public boolean getLingerieAvailability() {
        return availability;
    }

    public String getHeaders() {
        return "nameOfCollection, year, availability, price, type";
    }

    public String toCSV() {
        return String.format("%s, %s, %s, %s, %s", getNameOfCollection(), getLingerieYear(), getLingerieAvailability(), getLingeriePrice(), getLingerieType());
    }
}
