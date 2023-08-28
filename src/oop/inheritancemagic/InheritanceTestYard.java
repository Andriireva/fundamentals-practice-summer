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
        
        Calculation calculation = new Calculation();
        A anotherA = new A();
        Inheratable inheratable = new Inheratable();
        Inheratable inheratable2 = new A();


        calculation.takeArg(inheratable);
        calculation.takeArg(anotherA);
        // it will call takeArg(Inheratable arg) because inheratable2 DECLARED type is Inheratable.
        // Actual class does not meter
        calculation.takeArg(inheratable2);
        // If null is passed than method that uses the "lowest" class from hierarcy will be used as declared type
        calculation.takeArg(null);
        // Now it is not clear what type is the "lowest" one from possible cases [A clas, B class]
        // So if we want to used doSOme with null we must cast null to Some of [A or B] class
        calculation.doSome((B)null);
    }
}
