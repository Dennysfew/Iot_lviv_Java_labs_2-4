package ua.lviv.iot.model;

public class SleepWear extends Lingerie {
    String fabric;
    String isSet;
    boolean hasPattern;

    public SleepWear(String nameOfCollection, int year, boolean availability, int price, String type, String fabric, String isSet, boolean hasPattern) {
        super(nameOfCollection, year, availability, price, type);
        this.fabric = fabric;
        this.isSet = isSet;
        this.hasPattern = hasPattern;
    }

    @Override
    public String toString() {
        return "Pajamas: Collection is: " + nameOfCollection
                + ", was presented in: " + year
                + ",  Available: = " + availability
                + ",costs: " + price
                + ", made of: " + fabric
                + ", Sets: " + isSet
                + "has some pattern: " + hasPattern
                + ")";

    }

    public String getFabric() {
        return fabric;
    }

    public String getIsSet() {
        return isSet;
    }

    public boolean getIsHasPattern() {
        return hasPattern;
    }

    @Override
    public String getHeaders() {
        return String.format("%s, %s", super.getHeaders(), "fabric, isSet, hasPattern");
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s, %s", super.toCSV(), getFabric(), getIsSet(), getIsHasPattern());
    }
}
