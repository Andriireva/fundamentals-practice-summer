package oop;

// when class implements any interfaces class
// MUST override (implements all methods from interface)
public class FlyCar extends Car implements Flyable {
    public FlyCar(long serialNumber) {
        super(serialNumber);
    }


    @Override
    public void fly() {
        System.out.println("Car can fly");
    }
}
