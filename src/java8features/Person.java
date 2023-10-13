package java8features;

import java.util.Objects;

public class Person {
    private String name;
    private Long id;
    private String notes;
    private Address address;

    private int age;

    public Person(String name, Long id, String notes, Address address, int age) {
        this.name = name;
        this.id = id;
        this.notes = notes;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getId(), person.getId()) && Objects.equals(getNotes(), person.getNotes()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getNotes(), getAddress(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", notes='" + notes + '\'' +
                ", address=" + address +
                '}';
    }
}
