package java8features.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShapesCalculation {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("Big Square", 25, 25));
        shapes.add(new Rectangle("Regular mini football", 15, 35));
        shapes.add(new Circle("Big one", 33.3d));
        shapes.add(new Rectangle("Regular football", 33, 66));
        shapes.add(new Circle("Small one", 2.5));
        shapes.add(new Circle("Big one two", 33.3d));

        // I want to get the biggest area shape
        double theBiggestArea = shapes.stream()
                .mapToDouble(shape -> shape.area()) // DoubleStream (Stream of double)
                .max() //Optional
                .orElse(0.0d);
        System.out.println("The biggest area is " + theBiggestArea);

        // I want to get name of shape with the biggest Area

        // Solution 1: order by area and take only 1 element
        String theBiggestShapeAreaName = shapes.stream()
                .sorted((shape1, shape2) -> Double.compare(shape2.area(), shape1.area())) // Double.compare(shape2.area(), shape1.area()) compare Descendenly
                .findFirst() // Optional<Shape>
                .map(shape -> shape.getName())
                .orElse("");
        System.out.println("Solution one theBiggestShapeAreaName is " + theBiggestShapeAreaName);

        // Solution 1: order by area and take only 1 element
        String theBiggestShapeAreaName2 = shapes.stream()
                .reduce(((shape1, shape2) -> Double.compare(shape2.area(), shape1.area()) > 0 ? shape2 : shape1))
                .map(shape -> shape.getName())
                .orElse("");
        System.out.println("Solution one theBiggestShapeAreaName is " + theBiggestShapeAreaName2);

        // I want to get the biggest Rectangle area shape
        double theBiggestRectangleArea = shapes.stream()
                .filter(shape -> shape instanceof Rectangle)
                .mapToDouble(shape -> shape.area()) // DoubleStream (Stream of double)
                .max() //Optional
                .orElse(0.0d);
        System.out.println("The biggest rectangle area is " + theBiggestRectangleArea);

        // I want to get a set of circle with non-duplicate perimeters
        System.out.println("==== I want to get a set of circle with non-duplicate perimeters ====");
        Set<Shape> circlesNonDuplicatePerimiters = new HashSet<>(
                shapes.stream()
                        .filter(shape -> shape instanceof Circle)
                        .collect(Collectors.toMap( //  to map where Key is Dobule ( perimter) and value is Shape
                                shape -> shape.perimeter(),
                                shape -> shape,
                                (shape1, shape2) -> shape1 // it is function to resolve duplicated perimeters
                        )) // Return type is Map<Double, Shape>
                        .values() // Collection<Shape>
        );
        circlesNonDuplicatePerimiters.forEach(value -> System.out.println(value.displayInfo()));



    }
}
