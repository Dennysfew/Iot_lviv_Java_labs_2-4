package ua.lviv.iot.vsShop.model;

public class Bras extends Lingerie{

    String size;
    boolean availabilityOfPushUp;

    public Bras (String nameOfCollection, int year, boolean availability, int price,
    String size, boolean availabilityOfPushUp){
        super(nameOfCollection, year, availability, price);
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
}
