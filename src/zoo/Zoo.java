package zoo;

public class Zoo {

    private String name;
    private Animal[] animals; // variable where we store ALL animals
    private int animalCount;

    public Zoo(String name, int zooCapacity) {
        this.name = name;
        // new Animal[4] equals to { null, null, null, null }
        animals = new Animal[zooCapacity]; // animals will have zooCapacity elements
        animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animalToAdd) {
        if (animalCount < animals.length) {
            animals[animalCount] = animalToAdd;
            animalCount++;
        } else {
            System.out.println("it is not possible to add new animal to " + getName());
        }
    }

    public void displayInformation() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].getInformation());
            }
        }
    }

    public void makeAnimalsSound() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getSound() != null) {
                System.out.println(animals[i].makeSound());
            }
        }
    }

}
