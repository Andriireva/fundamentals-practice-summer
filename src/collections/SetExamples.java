package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


// Set is may not be ordered collection
// Set does not contain duplicated items
public class SetExamples {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); // HashSet is implementation of Set
        names.add("John");
        names.add("Andrii");
        names.add("Sonya");
        names.add("Sonya");
        names.add("Sonya");
        names.add("Dalal");
        names.add("Sophiya");

        System.out.println("Set size " + names.size());

        // Convert to array
//        String[] namesArray = names.toArray(new String[]{});

        // This loop calls for-each
        // In for-each loop variable that implements Iterable can be used
        // name here is temporary argument name for each element in names
        for (String name: names) {
            System.out.println(name);
        }

        // just example
//        MyCustomClass myCustomClass = new MyCustomClass();
//        for (String somearg: myCustomClass) {
//
//        }

        System.out.println("==== HashSet ====");
        // HashSet works based on hashCode and Equals
        Set<Person> personSet = new HashSet<>();
        Person alexOne = new Person("Alex", 55L);
        Person alexTwo = new Person("Alex", 55L);
//        System.out.println(alexOne == alexTwo);
//        System.out.println(alexOne.equals(alexTwo));
//        System.out.println(alexOne.hashCode() == alexTwo.hashCode());

        personSet.add(new Person("John", 66L));
        personSet.add(alexOne);
        personSet.add(alexTwo);
        System.out.println(personSet.size());

        for (Person p: personSet) {
            System.out.println(p);
        }

        System.out.println("==== LinkedHashSet ====");
        // LinkedHashSet is the same ad HashSet but it stored order
        Set<Person> personSetLinked = new LinkedHashSet<>();
        personSetLinked.add(new Person("Gustav", 123L));
        personSetLinked.add(alexOne);
        personSetLinked.add(new Person("John", 66L));
        personSetLinked.add(alexTwo);
        System.out.println(personSet.size());

        for (Person p: personSetLinked) {
            System.out.println(p);
        }

        // Tree set works based on Comparable or Comparator
        // It means that element must implements Comparable
        // or Comparator should be passed to TreeSet contructor

        System.out.println("==== TreeSet ====");
        // if nothing is passed than cast Exception is thrown
        Set<Person> personSetTree = new TreeSet<>();
        personSetTree.add(new Person("Gustav", 44L));
        personSetTree.add(new Person("Gustav", 44L));
        personSetTree.add(new Person("Bobby", 44L));
        personSetTree.add(alexOne);
        personSetTree.add(alexTwo);
        for (Person p: personSetTree) {
            System.out.println(p);
        }

    }
}
