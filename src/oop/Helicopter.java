package oop;

public class Helicopter extends FlyVehicle {
    public Helicopter(long serialNumber) {
        super(serialNumber);
    }

    @Override
    protected void someCalculation(int x, int y) {

    }

    @Override
    void someCalculations() {

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
