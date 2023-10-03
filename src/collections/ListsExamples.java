package collections;

import zoo.Animal;
import zoo.Bird;
import zoo.Fish;
import zoo.Mammal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// List is an ordered and indexed collection
// It means that it is possible to get item by index and put item at index
// Items are ALWAYS internally stored the way it was added
// list can contain duplicates

// java.lang.IndexOutOfBoundsException appears when you try to use index that does not exist
public class ListsExamples {
    public static void main(String[] args) {

        // Big O notation - complexity over algorithm
        List<String> stringList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        // There only valueable case when LinkedList is "better" than ArrayList
        linkedList.add(5, "Aaa");


        stringList.add("A"); // add method on LIST (!!!) add element to the end of list
        stringList.add("B");
        stringList.add("Another one");
        stringList.add("A");
        printList(stringList);

        System.out.println("list.set example");
//        stringList.get(100);
        stringList.set(1, "Repllacing"); // Replace value at index
        printList(stringList);

        System.out.println("add at index");
        stringList.add(1, "Inserted Value");
        printList(stringList);

        // it retuns actual index or -1 if such elem does not exist in collection
        int indexOfB = stringList.indexOf("Inserted Value");
        System.out.println("index of B is " + indexOfB);

        // In the example bellow we can add and Classes that is Animal of extended from Animal
        List<Animal> animals = new ArrayList<>();

        Fish shark = new Fish("Sharky", 45.6, "Arhggggg", "salted", true);
        Animal shark2 = new Fish("Sharky2", 35.6, "Arhggggg", "salted", true);
        Animal shark3 = new Fish("Sharky3", 3.6, "Arhggggg", "salted", true);

        Mammal elephant = new Mammal("Dambp", 2.1, "Errrhhhh", "grey", 4);
        Animal whale = new Mammal("Willy", 3.2, "eyeyeyeye", "black", 0);

        //
        animals.add(shark);
        animals.add(shark3);
        animals.add(shark2);
        animals.add(whale);
        animals.add(elephant);

        Animal animal = animals.get(0); // get method will return a type of list type, the type in <>

        System.out.println("Extract fishes from animals");
        // I want to get new list of fish from animal list
        List<Fish> fishes = getFish(animals);
        printAnimals(fishes);

        System.out.println("Sub list example");
        List<Animal> subList = animals.subList(1, 4);
        printAnimals(subList);

        System.out.println("Contains examples ");
        Fish sharkTheSameAsSark = new Fish("Sharky", 45.6, "Arhggggg", "salted", true);

        // contains works based on equals method
        boolean containsShark = animals.contains(sharkTheSameAsSark);
        System.out.println("Contains sharkTheSameAsSark " + containsShark);
    }

    // List<? extends Animal> it means it can be ant list of type that extends Animal
    private static void printAnimals(List<? extends Animal> fishes) {
        for (int i = 0; i < fishes.size(); i++) {
            System.out.println(fishes.get(i).getInformation());
        }
    }

    private static List<Fish> getFish(List<Animal> animals) {
        List<Fish> fishList = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Fish) {
                Animal animal = animals.get(i);
                fishList.add((Fish) animal);
            }
        }
        return fishList;
    }

    private static void printList(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Index " + i + " Value " + stringList.get(i));
        }
    }
}
