package ua.lviv.iot.model;

public class Panties extends Lingerie {
    String typeOfPanties;
    String isTransparent;

    public Panties(String nameOfCollection, int year, boolean availability, int price, String type, String typeOfPanties, String isTransparent) {
        super(nameOfCollection, year, availability, price, type);
        this.typeOfPanties = typeOfPanties;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "Panty: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ",  Available: = " + availability
                + ",costs: " + price
                + ", type: " + typeOfPanties
                + ", transparent: " + isTransparent
                + ")";

    }

    public String getTypeOfPanties() {
        return typeOfPanties;
    }

    public String getIsTransparent() {
        return isTransparent;
    }

    @Override
    public String getHeaders() {
        return String.format("%s, %s", super.getHeaders(), "typeOfPanties, isTransparent");
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV(), getTypeOfPanties(), getIsTransparent());
    }


}
