package oop;


public class FlyVehicle extends Vehicle implements Flyable {
    public FlyVehicle(long serialNumber) {
        super(serialNumber);
    }

    // this comes from interface
    public void fly() {
        System.out.println("Fly.....");
    }
}
