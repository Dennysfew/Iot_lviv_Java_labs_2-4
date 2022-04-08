package ua.lviv.iot.vsShop.model;

public class SportWear extends Lingerie {
    String styles;
    boolean isSlinky;

    public SportWear (String nameOfCollection, int year, boolean availability,int price, String styles, boolean isSlinky){
        super(nameOfCollection, year, availability, price);
        this.styles = styles;
        this.isSlinky = isSlinky;
    }
    @Override
    public String toString() {
        return "Sport wear: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ",  Available: = " + availability
                + ",costs: " + price
                + ", style:: " + styles
                + ", Slinky: " + isSlinky
                + ")";

    }
}
