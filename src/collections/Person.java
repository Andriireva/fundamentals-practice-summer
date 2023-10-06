package collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private Long id;

    public Person(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("Person equals is called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
//        System.out.println("Person hashCode is called");
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (o == null) {
            return 1;
        }

        int compareById = Long.compare(this.id, o.id);

        if (compareById == 0) { // if true
            return this.name.compareTo(o.name);
        } else {
            return compareById;
        }
    }


}
