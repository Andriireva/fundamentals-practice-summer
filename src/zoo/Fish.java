package zoo;

import java.util.Objects;

public class Fish extends Animal {
    private String waterType;
    private boolean isPredator;

    public Fish(String name, double age, String sound,
                String waterType, boolean isPredator) {
        super(name, age, sound);
        this.waterType = waterType;
        this.isPredator = isPredator;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public String makeSound() {
        return getSound();
    }

    @Override
    public String getInformation() {
        // call parent method + this class variables
        return super.getInformation() + " " + getWaterType() + " " + isPredator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return isPredator() == fish.isPredator() && Objects.equals(getWaterType(), fish.getWaterType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWaterType(), isPredator());
    }
}
