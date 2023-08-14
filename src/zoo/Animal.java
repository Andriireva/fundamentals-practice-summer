package zoo;

public abstract class Animal implements Information {
    private String name;
    private double age;
    private String sound;

    public Animal(String name, double age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract String makeSound();

    @Override
    public String getInformation() {
        return getName() + " " + getAge() + " " + getSound();
    }
}
