package oop.inheritancemagic;

import oop.Boat;
import oop.Vehicle;

public class A extends Inheratable {

    public A() {
        System.out.println("A constructor");
    }

    public Vehicle getSome() {
        Vehicle v = new Boat("Green", 1989, 1000022.66, "Another one", 43123123123L, true);
        return v;
    }
}
