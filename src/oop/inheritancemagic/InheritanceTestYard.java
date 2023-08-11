package oop.inheritancemagic;

import oop.Helicopter;
import oop.Vehicle;

public class InheritanceTestYard {
    public static void main(String[] args) {
        A a  = new A();
        Vehicle vehicle = a.getSome();
        System.out.println(vehicle.getDescriptionLastWord());
        System.out.println("==== subA ====");
        SubA subA = new SubA();
        Helicopter helicopter = subA.getSome();

        System.out.println("==== a1 ====");
        A a1 = new SubA();
        // actual type a1 is SubA (not A)
        // a1.getSome will actual method that comes from SubA class
        // vehicle1 type will be that getsome of Sub A returns
        Vehicle vehicle1 = a1.getSome();
        System.out.println(vehicle1 instanceof Helicopter);
    }
}
