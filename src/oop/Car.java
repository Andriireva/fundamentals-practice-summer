package oop;


// cannot be used outside of oop package
class Car extends Vehicle {

    public Car(long serialNumber) {
        super(serialNumber);
    }

    Car(String color, int year, double price, String type, String name, long serialNumber, boolean hasSeats) {
        super(color, year, price, type, name, serialNumber, hasSeats);
    }

    // Something that starts from @ - is annotation
    // "help" functionality that do checks, or some "generic" job on the background
    // @Override - marks method that it is Overriden from parent
    @Override
    public void move(String direction, double power) {
        super.move(direction, power); // it calls Vehicle.move method as it is
        System.out.println("Car is moving");
    }

    @Override
    public String getDescription(boolean capitalize) {
        String description = getType() + " " + getSerialNumber() + " " + getName() + " " + getColor() + " " + getCreatedYear();
        if (capitalize) {
            return description.toUpperCase();
        }
        return description;
    }

}
