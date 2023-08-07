package oop;

// Method that are exist in parent class can be used from child class.
// In simple words method are inherited
// Constructors are NOT inherited
public class Bicycle extends Vehicle {
    private boolean hasChildChair;

    public boolean isHasChildChair() {
        return hasChildChair;
    }

    public void setHasChildChair(boolean hasChildChair) {
        this.hasChildChair = hasChildChair;
    }

    // we need to create a constructor for this class and
    // Child class constructor MUST call Parent constructor at FIRST line of this constructor
    Bicycle(String color, int year, double price,
            String name, long serialNumber, boolean hasSeats, boolean hasChildChair) {
        // super is keyword to call parent functionality
        // in code beloow it call constructor of Parent class
        super(color, year, price, "BICYCLE", name, serialNumber, hasSeats);
//        super.getColor();
        this.hasChildChair = hasChildChair;
//        System.out.println("Hello");
    }

    public String getBicycleDescription() {
        // privateVehicleMethod() cannot be called because it private
        protectedVehicleMethod(); // call parent method
        return color + " " + getSerialNumber() + " " + getName();
    }

    // we Want to specify the move operation another way then in Parent class
    // We overwrote parent functionality
    public void move(String direction, double power) {
        if (!direction.equals("forward")) {
            System.out.println("Bicycle cannot move other then forward");
        } else {
            System.out.println("Moving using legs, direction = " + direction + ", power = " + power);
        }
    }

    // this method is NOT overriden
    public void move(String direction, int power) {
        System.out.println("move(String direction, int power)");
    }
}
