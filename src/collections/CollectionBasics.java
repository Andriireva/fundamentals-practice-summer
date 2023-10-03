package collections;

import java.util.*;

// Collection is a structure that helps to store objects the way you want
// Iterable -> Collection(Interface)   -> List (Interface)
//                                          -> ArrayList (Class)
//                                          -> LinkedList (Class)
//                                  -> Set
//                                          -> HashSet (Class)
//                                          -> LinkedHashSet (Class)
//                                          -> TreeSet (Class)
//                                  -> Queue
//                                          -> ....
// Map
//      -> HashMap (class)
//      -> TreeMap (class)
public class CollectionBasics {

    public static void main(String[] args) {
        String[] strings = new String[10];
        // how to make it flex


        // Collection< >  - <> - it says that this class or interface is generic
        Collection<String> stringCollection = new ArrayList<>();
        Collection<Double> doubleCollection = new ArrayList<>();
        doubleCollection.add(45.61d);
        doubleCollection.add(22.123d);
        stringCollection.add("Abc");

        System.out.println("Size of collection " + stringCollection.size());
        stringCollection.add("abc");
        stringCollection.add("rrrr");
        System.out.println("Size of collection " + stringCollection.size());
        // remove operation tries to remove if it exists. But it returns false if such element is not found
        boolean isRRRRRemoved = stringCollection.remove("rrrr");
        System.out.println("Is elem rrrr removed from collection " + isRRRRRemoved);
        boolean isOtherRemoved = stringCollection.remove("other");
        System.out.println("Is elem other removed from collection " + isOtherRemoved);
        boolean isAbcInColltion = stringCollection.contains("abc");
        System.out.println("Does collection contain abc " + isAbcInColltion);

        // bulk operation
        Collection<String> stringsToAdd = new ArrayList<>();
        stringsToAdd.add("Another One");
        stringsToAdd.add("Another two");
        stringCollection.addAll(stringsToAdd);
        System.out.println("Size of collection, after addAll " + stringCollection.size());

        System.out.println("Size of collection " + stringCollection.size());
        stringCollection.clear();


        System.out.println("===== Iterator Examples ===== ");
        // each collection has .iterator()
        Iterator<Double> iterator = doubleCollection.iterator();
        while (iterator.hasNext()) {
            Double nextItemInIterator = iterator.next();
            System.out.println(nextItemInIterator);
        }


        System.out.println("==== I want to exclude duplicated from List and safe order ===");
        // I want to exclude duplicated from List and safe order
        // A, G, T, A, R, W, R - > A, G, T, R, W
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("G");
        list.add("T");
        list.add("A");
        list.add("R");
        list.add("W");
        list.add("R");

        Set<String> set = new LinkedHashSet<>(list);
        List<String> sameOrderExcludeDuplicates = new ArrayList<>(set);

        for (String resultValue: sameOrderExcludeDuplicates) {
            System.out.println(resultValue);
        }


        System.out.println("====  I want to get a map of person mapped by id  =======");
        // I want to get a map of person mapped by id
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Gustav", 123L));
        personList.add(new Person("Alex", 43L));
        personList.add(new Person("John", 33L));

        Map<Long, Person> personMap = new HashMap<>();
        for (Person person: personList) {
            personMap.put(person.getId(), person);
        }

        Person person = personMap.get(43L);
        System.out.println(person);
        //

    }
}
