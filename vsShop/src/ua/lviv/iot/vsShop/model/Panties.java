package ua.lviv.iot.vsShop.model;

public class Panties extends Lingerie{
    String type ;
    String isTransparent;

    public Panties (String nameOfCollection, int year, boolean availability, int price, String type, String isTransparent ) {
        super(nameOfCollection, year, availability, price);
        this.type = type;
        this.isTransparent = isTransparent;
    }
    @Override
    public String toString() {
        return "Panty: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ",  Available: = " + availability
                + ",costs: " + price
                + ", type: " + type
                + ", transparent: " + isTransparent
                + ")";

    }


}
