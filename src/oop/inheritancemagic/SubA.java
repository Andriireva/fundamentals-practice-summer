package oop.inheritancemagic;

import oop.Helicopter;
import oop.Vehicle;

public class SubA extends A {

    public SubA() {
        super();
        System.out.println("SubA constructor");
    }

    // Still inheritance
    // It is possible to change return type to Sub type of
    // return type of original method
    @Override
    public Helicopter getSome() {
        Helicopter h = new Helicopter(23423234L);
        return h;
    }
}
