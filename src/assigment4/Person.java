package assigment4;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Book> library;

    public Person(String name, int age, List<Book> library) {
        this.name = name;
        this.age = age;
        this.library = library;
    }

    public void addBook(Book book) {

    }

    public Book findBook(String title) {
        return null;
    }

    public List<Book> listBooks() {
        return library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getLibrary() {
        return library;
    }

//    public void setLibrary(List<Book> library) {
//        this.library = library;
//    }
}
