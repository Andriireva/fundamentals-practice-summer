package oop;

public class Boat extends Vehicle {
    public Boat(String color, int year, double price,
         String name, long serialNumber, boolean hasSeats) {
        super(color, year, price, "BOAT", name, serialNumber, hasSeats);
    }

    @Override
    public String getDescription(boolean capitalize) {
        String description = getType() + " " + getName() + " " + getSerialNumber() + " " + getColor() + " " + getCreatedYear();
        if (capitalize) {
            return description.toUpperCase();
        }
        return description;
    }
}
