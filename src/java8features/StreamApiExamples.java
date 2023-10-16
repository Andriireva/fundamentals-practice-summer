package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


// Stream has 2 groups of methods:
// - Intermediate methods that returns Steam (map, filter, flatMap, distinct, peek ....)
// - Terminal that does not return Stream (collect, reduce, forEach, .. other )
// Terminal operations start the stream
public class StreamApiExamples {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(
                new Person("Charles Grandinson", 124123L, "   ",
                        new Address("Cool", 44321, "Fur tree street", null), 66)
        );

        personList.add(
                new Person("Charles Grandinson", 4533L, "Coool notes",
                        new Address("oldcity", 667231, "others st", null), 66)
        );

        personList.add(
                new Person("Alex Furguson", 1231233L, "Football trainer",
                        null, 25)
        );

        personList.add(
                new Person("Alex Furguson", 1231233L, "Football trainer",
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

        System.out.println("==== I want to get a set of person names");
        Set<String> names = personList.stream()
                .filter(person -> person != null)
                .map(person -> person.getName()) // Stream<String>
                .collect(Collectors.toSet());

        // stream.forEach() - is almost the same as regular for each loop
//        for (String name: names) {
//            System.out.println(name)
//        }
        // code above is the same as bellow

        names.stream().forEach(name -> System.out.println(name));
        // Same as above
        // names.forEach(name -> System.out.println(name));


        System.out.println("==== I want to get new list of person ordered by name");
        // I want to order some elements { e1, e2, e3, e4, }
        // el1 -10 , e2 11, e3 2 , e4  -44


        Comparator<Person> personNameComparator = (person1, person2) -> {
            if (person1 == null) {
                return Integer.MAX_VALUE;
            }
            return person1.getName().compareTo(person2 != null ? person2.getName() : "");
        };
        List<Person> personOrderedByName = personList.stream()
//                .sorted() // without argument it works based on Comparable
                .sorted(personNameComparator.reversed().thenComparing((p1, p2) -> Long.compare(p1.getId(), p2.getId())))
//                .sorted( with comprator) // without argument it works based on Comparable
                .collect(Collectors.toList());
        printElements(personOrderedByName);

        System.out.println("==== I want limit element");
        List<Person> personLimit3 = personList.stream()
                .skip(2) // does not take into accont 2 elements
                .limit(3) // it will cut other element then limit
                .collect(Collectors.toList());
        printElements(personLimit3);

        System.out.println("==== I want to collect persons by id excluding nulls (to Map)"); // Map<Long, Person>
        Map<Long, Person> personMap = personList.stream()
                .filter(person -> person != null)
                .collect(Collectors.toMap( // by default value by the same key is not overriden
                        person -> person.getId(),
                        Function.identity(), // the same as person -> person,
                        (person1, person2) -> person1    // It is merge BiFunction that handle duplicated keys
                                                        // if returns 1st argument than it does no override, otherwise override
                ));
        System.out.println(personMap.get(1231233L));

        System.out.println("==== Any, all match ====");
        boolean anyPersonIsNull = personList.stream()
                .anyMatch(person -> person == null);
        boolean allPersonsAreNull = personList.stream()
                .allMatch(person -> person == null);
        System.out.println("Any person is null " + anyPersonIsNull);
        System.out.println("All persons is null " + allPersonsAreNull);


        List<String> strings = Arrays.asList("Abc", "hhh", "WWW"); // Arrays.asList creates list

        strings.stream()
                .peek(s -> System.out.println("Peek method is called"));
//                .collect(Collectors.toSet());


    }

    private static void printElements(Collection<Person> personsHasNotes) {
        for (Person p: personsHasNotes) {
            System.out.println(p);
        }
    }
}
