package oop;


public abstract class FlyVehicle extends Vehicle implements Flyable {
    public FlyVehicle(long serialNumber) {
        super(serialNumber);
    }

    // this comes from interface
    public void fly() {
        System.out.println("Fly.....");
    }

    // It is possible to add protected abstract method
    protected abstract void someCalculation(int x, int y);

    abstract void someCalculations();

    // it is issue bellow
    // private abstract void someCalculation();


}
