package java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExamples {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(
                new Person("Charles Grandinson", 124123L, "   ",
                        new Address("Cool", 44321, "Fur tree street", null), 66)
        );

        personList.add(
                new Person("Alex Furguson ", 1231233L, "Football trainer",
                        null, 25)
        );

        personList.add(
                new Person("Alex Furguson ", 1231233L, "Football trainer",
                        null, 25)
        );

        personList.add(null);

        personList.add(
                new Person("Foxie Smartson", 5345343L, "Fitness trainer",
                        new Address("Fitcity", 423421, "greyst", 211), 41)
        );

        personList.add(
                new Person("Alex", 777773L, null,
                        new Address("Greygeourge", 33101, null, null), 21)
        );

        // I want to get all persons that has notes  ( not null and not empty)
        System.out.println("=== Java pre 8 way ===");
        List<Person> personsHasNotes = new ArrayList<>();
        for (Person p: personList) {
            if (p != null && p.getNotes() != null && !p.getNotes().isBlank()) {
                personsHasNotes.add(p);
            }
        }
        printElements(personsHasNotes);

        System.out.println("=== Java 8 way (using StreamApi) ===");
        List<Person> personsHasNotesJava8Way = personList.stream() // Stream<Person>
                .filter(person -> person != null) // it retruns Stream<Person> but it apply a predicate function to each element
                .filter(person -> person.getNotes() != null)
                // Explain one more time
                .peek(person -> System.out.println(person)) // It does not affect the stream elements numbers of changing type
                .filter(person -> !person.getNotes().isBlank())
                    //.limit(5)
                .distinct() // it will exclude duplicates (works based on equals and hashCode)
                .collect(Collectors.toList());// it collection items to a structure
        printElements(personsHasNotesJava8Way);

        System.out.println("=== Collect to Set ===");
        Set<Person> personsSetHasNotesJava8Way = personList.stream() // Stream<Person>
                .filter(person -> person != null) // it retruns Stream<Person> but it apply a predicate function to each element
                .filter(person -> person.getNotes() != null)
                .filter(person -> !person.getNotes().isBlank())
                .collect(Collectors.toSet());// it collection items to a structure

        printElements(personsSetHasNotesJava8Way);

        // I want to get average age of person
        System.out.println("==== I want to get average age of person ===");

        double averageAge = personList.stream()
                .filter(person -> person != null)
                .mapToInt(person -> person.getAge()) // Map used to convert from 1 type to another. E.g. Stream of Person to IntStream of Integer
                .average() // Return is DoubleOptional (a kind of "sub type" of Optional
                .orElse(0);
        System.out.println("Average age is " + averageAge);
    }

    private static void printElements(Collection<Person> personsHasNotes) {
        for (Person p: personsHasNotes) {
            System.out.println(p);
        }
    }
}
