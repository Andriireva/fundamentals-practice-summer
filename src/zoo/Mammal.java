package zoo;

public class Mammal extends Animal {

    private String furColor;
    private int numberOfLegs;

    public Mammal(String name, double age, String sound,
                  String furColor, int numberOfLegs) {
        super(name, age, sound);
        this.furColor = furColor;
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String makeSound() {
        if (getSound() != null) {
            return getSound().toUpperCase();
        } else {
            return null;
        }
    }

    @Override
    public String getInformation() {
        // call parent method + this class variables
        return super.getInformation() + " " + getFurColor() + " " + getNumberOfLegs();
    }
}
