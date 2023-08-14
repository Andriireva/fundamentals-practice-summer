package zoo;

public class Playground {
    public static void main(String[] args) {
        Zoo villageZoo = new Zoo("Village Zoo", 20);

        Animal shark = new Fish("Sharky", 45.6, "Arhggggg", "salted", true);
        Animal shark2 = new Fish("Sharky2", 35.6, "Arhggggg", "salted", true);
        Animal shark3 = new Fish("Sharky3", 3.6, "Arhggggg", "salted", true);

        Animal elephant = new Mammal("Dambp", 2.1, "Errrhhhh", "grey", 4);
        Animal fox = new Mammal("Foxie", 2.1, null, "orage", 4);
        Animal penguin = new Bird("Rorry", 2.1, "arh arh", 4.5, false);
        Animal parrot = new Bird("Hurry", 5.7, "khar khar", 0.55, true);
        Animal whale = new Mammal("Willy", 3.2, "eyeyeyeye", "black", 0);

        villageZoo.addAnimal(shark);
        villageZoo.addAnimal(shark2);
        villageZoo.addAnimal(shark3);
        villageZoo.addAnimal(elephant);
        villageZoo.addAnimal(fox);
        villageZoo.addAnimal(penguin);
        villageZoo.addAnimal(parrot);
        villageZoo.addAnimal(whale);

        villageZoo.displayInformation();
        villageZoo.makeAnimalsSound();

    }
}
