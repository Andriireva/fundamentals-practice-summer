package java8features.tasks;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    public String displayInfo() {
        return "Name is " + this.name +
                ". Area = " + area() +
                ". Perimeter = " + perimeter();
    }

}
