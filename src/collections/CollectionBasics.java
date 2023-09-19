package collections;

import java.util.ArrayList;
import java.util.Collection;

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


    }
}
