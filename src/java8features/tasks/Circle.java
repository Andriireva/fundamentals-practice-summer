package java8features.tasks;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI ;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
