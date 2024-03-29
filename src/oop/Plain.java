package oop;

public class Plain extends FlyVehicle {

    public Plain(long serialNumber) {
        super(serialNumber);
    }

    @Override
    public String getDescription(boolean capitalize) {
        String description = getType() + " " + getName() + " " + getSerialNumber() + " " + getColor() + " " + getCreatedYear();
        if (capitalize) {
            return description.toUpperCase();
        }
        return description;
    }

    @Override
    protected void someCalculation(int x, int y) {

    }

    @Override
    void someCalculations() {

    }
}
