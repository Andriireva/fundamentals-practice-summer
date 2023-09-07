package oop.comparing;

import java.util.Objects;

//  ALL classes Explicitly extends Object class
// if you want to have a defalue comparing, less, more, equals based YOUR needs
// you can impletem Comparable interfaces
public class Planet extends Object implements Comparable<Planet> {
    private String name;
    private double radius;
    private double gravity;

    public Planet(String name, double radius, double gravity) {
        this.name = name;
        this.radius = radius;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Planet)) {
//            return false;
//        }
//        Planet objToCompare = (Planet) obj;
//        return objToCompare.getGravity() == this.gravity
//                && objToCompare.getRadius() == this.radius
//                && objToCompare.getName().equals(this.name);
//    }


    // What is relation between equals and hashCode
    // the answer is: if two objects are equals by equals method, their hashCode are the same, but NOT VICE VERSA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() is check the exact class
        if (o == null || getClass() != o.getClass()) return false; // getClass() returns class of object
        Planet planet = (Planet) o;
        // Double.compare it returns bigger(1), smaller(-1), or equals(0) between dobule values
        return Double.compare(planet.radius, radius) == 0
                && Double.compare(planet.gravity, gravity) == 0
                && Objects.equals(name, planet.name);
        // Objects equals is checks also on nulls and then compare by equals
    }

    // if you override equals you MUST override hashCode as well, and vice versa
    // hashCode serves as a "soft" representation of value
    // hashCode core can return a limited possible values, based on int capacity
    // hashCode might retun the same hashCode for "diferent" (different set of args that passed to the contructor) objects
    @Override
    public int hashCode() {
        return Objects.hash(name, radius, gravity);
    }

    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.getGravity(), o.getGravity()) +
                Double.compare(this.getRadius(), o.getRadius());
    }
}
