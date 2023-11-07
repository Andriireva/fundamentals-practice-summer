package assigment4;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main4 {

    static Map<Person, List<Book>> personsAndBooks = new HashMap<>();  //A Map with persons and books
    static Map<Seniority,List<Person>> seniorityList = new HashMap<>(); //A Map with Seniority and persons
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        List<Book> annLibrary = new ArrayList<>(); // camel case - likeThisExample
        List<Book> JohnLibrary = new ArrayList<>();
        List<Book> PeterLibrary = new ArrayList<>();
        List<Book> DanielLibrary = new ArrayList<>();

        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 1844);
        Book book2 = new Book("Atomic Habits", "James Clear", 2018);
        Book book3 = new Book("limitless", "Jim Kwik",2020);
        Book book4 = new Book("Who Moved My Cheese?","Spencer Johnson", 1999);
        Book book5 = new Book("Rich Dad Poor Dad", "Robert T.Kiyosaki", 2017);
        Book book6 = new Book("Ikigai","Francesc Miralles & Hector Garcia", 2017);

        Person Ann = new Person("Ann",62, annLibrary  );
        Person John = new Person("John", 30, JohnLibrary);
        Person John3 = new Person("John", 22, JohnLibrary);
        Person Ann2 = new Person("ann",62, annLibrary  );
        Person Ann3 = new Person("john",62, annLibrary  );
    }

    static public Person findPerson(Map<Person, List<Book>> personsAndBooks, String name){
        Set<Person> personSet = personsAndBooks.keySet();   // returns a Set of the keys contained in the map.
        return personSet.stream()
                .filter( y -> y.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    //
    public static Person findPersonByName2(List<Person> persons, String name) {
        Person result = null;

//        for(int i = 0; i < persons.size() ; i++) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                result = person;
                break;
            }
        }
        return result;
    }

    public static List<String> getAllNamesSortedAlphabetically(List<Person> persons) {
        return persons.stream()
                .map(person -> person.getName())
                // Redundant 'sorted()' call: subsequent 'toSet()' call doesn't depend on the sort order
                .sorted(String.CASE_INSENSITIVE_ORDER)
//                        .collect(Collectors.toSet()); actulal type will be HashSet
//                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
                .collect(Collectors.toList());
    }

    public static double getAveragePersonAge(List<Person> persons) {
        // legacy way
//        double ageSum = 0;
//        for (Person person : persons) {

//            ageSum += person.getAge();
//        }
//        return ageSum / persons.size();
        return persons.stream()
                .mapToDouble(person -> person.getAge())
                .average()
                .orElse(0);
    }

    public static List<Person> sortByAgeDesc(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing((Person person) -> person.getAge())) // Person::getAge same as (Person person) -> person.getAge()
                .collect(Collectors.toList());

//        List <Integer> ages = personSet.stream().map(y -> y.getPersonAge()).collect(Collectors.toList());
//        // Sorting ages in descending Order using Collection.sort() method, by passing Collections.reverseOrder() as comparator
//        Collections.sort(ages, Collections.reverseOrder());
//        // Print the sorted ages
//        System.out.println("Ages sorted in Descending order : " + ages);
    }

    public static List<Person> findPersonOwnBookName(List<Person> persons, String bookName) {
        return persons.stream()
                .filter(person -> person.getLibrary() != null
                        ? person.getLibrary().stream()
                            .filter(book -> book.getTitle().equals(bookName))
                            .findFirst()
                            .map(book -> true)
                            .orElse(false)
                        : false

                )
                .collect(Collectors.toList());
    }

    // Where Seniority is children (1-16 age), adults (17-60 age), seniors (61 + age)
    public static Map<Seniority, List<Person>> groupBySeniority(List<Person> persons) {
        Map<Seniority, List<Person>> seniorityListMap = new HashMap<>();

        persons.stream()
                .filter(person -> person != null)
                .forEach(person -> {
                    if (person.getAge() <= 16) { // children
                        putPerson(seniorityListMap, person, Seniority.CHILDREN);
                    } else if (person.getAge() >= 17 && person.getAge() <= 60) { // adults
                        putPerson(seniorityListMap, person, Seniority.ADULTS);
                    } else { // seniors
                        putPerson(seniorityListMap, person, Seniority.SENIORS);
                    }
                });
        return seniorityListMap;

    }

    private static void putPerson(Map<Seniority, List<Person>> seniorityListMap, Person person, Seniority seniority) {
        List<Person> personList = seniorityListMap.get(seniority);
        if (personList == null) {
            List<Person> newPersonList = new ArrayList<>();
            newPersonList.add(person);
            seniorityListMap.put(seniority, newPersonList);
        } else {
            personList.add(person);
        }
    }

}
