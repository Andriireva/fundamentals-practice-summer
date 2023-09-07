package oop.comparing;

import java.util.Arrays;
import java.util.Objects;

public class CompareExamples {
    public static void main(String[] args) {
        int valueOne = 55;
        int valueTwo = 55;
        if (valueTwo == valueOne) {
            System.out.println("Two int values are the same");
        }
        Planet one = new Planet("Earth", 34343343.33d, 9.8d);
        Planet two = new Planet("Earth", 34343343.33d, 9.8d);
        Planet tree = two;
        Planet fouth = new Planet(null, 34343343.33d, 9.8d);
        Planet fifth = null;
        // == on objects compares the address (reference) of this object
        System.out.println("Planets compare by == is (one and two) " + (one == two));
        System.out.println("Planets compare by == is (tree and two) " + (tree == two));

        // Object equals by default works as ==
        // In case we want to compare by actual object state we should
        // override the equals method
        // Object equals should like this obj.equals(null) always returns false
        // equals method should be compare objects by ALL fields
        System.out.println("Planets compare by equals is (one and two) " + one.equals(two));
        // one.getGravity() == two.getGrav/.. **
        System.out.println("Planets compare by equals is (tree and two) " + tree.equals(two));
        System.out.println("Planets compare by equals is (fouth and two) " + two.equals(fouth));
        System.out.println("Planets compare by equals is (fouth and two) " + two.equals(fouth));
        System.out.println("Planets compare by equals is (three and fifth) " +  tree.equals(fifth));
        System.out.println("Planets compare by Objects.equals is (three and fifth) " + Objects.equals(fifth, tree));
        System.out.println("one hashCode " + one.hashCode());
        System.out.println("two hashCode " + two.hashCode());
        System.out.println("fouth hashCode " + fouth.hashCode());
        System.out.println("Planets compare by hachCode is (one and two) " + (one.hashCode() == two.hashCode()));

        // I want to first compare planets by name and gravity and do some code
        // Then I want to compare planets by gravity and radius and do other code
        PlanetNameGravityComparator planetNameGravityComparator = new PlanetNameGravityComparator();
        int oneTwoCompare = planetNameGravityComparator.compare(one, two);
        System.out.println("Planets compare by custom Comparator: " + oneTwoCompare);
        int fouthTwoCompare = planetNameGravityComparator.compare(fouth, two);
        System.out.println("Planets fouth Two compare by custom Comparator: " + fouthTwoCompare);
        System.out.println("Planets one and two compare by compareTo method: " + one.compareTo(two));
        System.out.println("Planets fouth and two compare by compareTo method: " + fouth.compareTo(two));
    }

}
