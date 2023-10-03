package collections;

import java.util.*;

// Map is structure to store key and value pair
// Key is unique, but value can be duplicated
public class MapsExample {

    public static void main(String[] args) {
        // <KEY, VALUE>
        // HashMap key verification on duplication works based on equals and hashCode
        Map<String, Double> simpleMap = new HashMap<>();
        simpleMap.put("Earth", 9.8);
        simpleMap.put("Uranus", 3.2);
        simpleMap.put("Moon", 2.2);
        // put method it add element if not exist or replace if exist
        simpleMap.put("Earth", 10.1);
        simpleMap.put("Venus", 3.2);

        System.out.println("Size of map " + simpleMap.size());

        // map.get - returns value by key or null if it not exists
        System.out.println("Earth gravity is " + simpleMap.get("Earth"));
        System.out.println("Another planet gravity is " + simpleMap.get("Another planet"));

        System.out.println("Is Moon key used in map " + simpleMap.containsKey("Moon"));
        System.out.println("Is Mars key used in map " + simpleMap.containsKey("Mars"));
        System.out.println("Is any planet has gravity 3.2 " + simpleMap.containsValue(3.2));
        // keySet returs Set of Keys
        // The actual return type is unmodified set
        Set<String> planetNames = simpleMap.keySet();

        // if you want to use set values as a regular set, you should copy it
        Set<String> planetNamesCopy = new HashSet<>(planetNames);
        planetNamesCopy.add("Mercury");

        for (String planet : planetNamesCopy) {
            System.out.println(planet);
        }
        // Exception appears
        //
//        planetNames.add("Mercury");

        // The actual return type is unmodified collection
        Collection<Double> gravities = simpleMap.values();
        for (Double gravity : gravities) {
            System.out.println(gravity);
        }


        Map<Key, String> myCustomMap = new HashMap<>();
        Key keyOne = new Key("One", 1L);
        Key keyTwo = new Key("One", 1L);
        myCustomMap.put(keyOne, "A");
        myCustomMap.put(keyTwo, "B");

//        KeyExtanded keyExtanded = new KeyExtanded("A", 2L, 33);
//        keyExtanded.setK(777);
//        myCustomMap.put(keyExtanded, "C");

        Key keyThree = new Key("One", 1L);
        System.out.println("myCustomMap key " + myCustomMap.size());
        System.out.println("myCustomMap value by key " + myCustomMap.get(keyThree));
    }
}
