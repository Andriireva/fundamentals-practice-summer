package files;

import collections.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileExample {

    public static void main(String[] args) {
        ReadWriting readWriting = new ReadWriting();
        List<String> strings = readWriting.readSimpleFile();
        strings.forEach(line -> System.out.println(line));

        readWriting.readPersonsFile(",")
                .forEach(person -> System.out.println(person));

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Lise", 123L));
        personSet.add(new Person("Homer", 123123L));
        personSet.add(new Person("Bart", 5552L));
        readWriting.writePersons(personSet, "\\");
    }
}
