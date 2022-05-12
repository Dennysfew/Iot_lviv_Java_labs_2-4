package ua.lviv.iot.model;

public class Bras extends Lingerie {
    String size;
    boolean availabilityOfPushUp;

    public Bras(String nameOfCollection, int year, boolean availability, int price, String type,
                String size, boolean availabilityOfPushUp) {
        super(nameOfCollection, year, availability, price, type);
        this.size = size;
        this.availabilityOfPushUp = availabilityOfPushUp;
    }

    @Override
    public String toString() {
        return "Bra: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ",  Available: = " + availability
                + ",costs: " + price
                + ", size: " + size
                + ", push-up: " + availabilityOfPushUp
                + ")";

    }

    public String getSize() {
        return size;
    }

    public boolean getIsAvailabilityOfPushUp() {
        return availabilityOfPushUp;
    }

    @Override
    public String getHeaders() {
        return String.format("%s, %s", super.getHeaders(), "size, availabilityOfPushUp");
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV(), getSize(), getIsAvailabilityOfPushUp());
    }
}
