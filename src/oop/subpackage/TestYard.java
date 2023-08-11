package oop.subpackage;

// import oop.Car; // canot be used

// imports helps to simplify acces to the class type
import oop.FlyVehicle;
import oop.Plain;
import oop.packone.PerfectClass;

public class TestYard {
    public static void main(String[] args) {
        FlyVehicle flyVehicle = new Plain(443434);
        PerfectClass pone = new PerfectClass();
//        pone.importantMethod(); it does not exist
        // since we 2 classes with the same name but in diffrent packages
        // One of it should be used as "full" name
        oop.packtwo.PerfectClass ptwo = new oop.packtwo.PerfectClass();
        ptwo.importantMethod();
        // flyVehicle.someCalculations(); // we cannot call it

       // Car car = w
    }
}
