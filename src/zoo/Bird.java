package zoo;

public class Bird extends Animal {
    private double wingspan;
    private boolean canFly;

    public Bird(String name, double age, String sound,
                double wingspan, boolean canFly) {
        super(name, age, sound);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return getSound().toLowerCase();
    }

    @Override
    public String getInformation() {
        // call parent method + this class variables
        return super.getInformation() + " " + getWingspan() + " " + isCanFly();
    }
}
