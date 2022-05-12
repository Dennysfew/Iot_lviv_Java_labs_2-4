package ua.lviv.iot.model;

public class SportWear extends Lingerie {


    String styles;
    boolean isSlinky;

    public SportWear(String nameOfCollection, int year, boolean availability, int price, String type, String styles, boolean isSlinky) {
        super(nameOfCollection, year, availability, price, type);
        this.styles = styles;
        this.isSlinky = isSlinky;
    }

    @Override
    public String toString() {
        return "Sport wear: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ", Available: = " + availability
                + ", costs: " + price
                + ", style:: " + styles
                + ", Slinky: " + isSlinky
                + ")";

    }

    public boolean getIsSlinky() {
        return isSlinky;
    }

    public String getStyles() {
        return styles;
    }

    @Override
    public String getHeaders() {
        return String.format("%s, %s", super.getHeaders(), "styles, isSlinky");
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV(), getStyles(), getIsSlinky());
    }

}
