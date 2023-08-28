package oop.inheritancemagic;

public class Calculation {

    // It is possible to pass variable of type Inheratable or ANY class that Inherit Inheratable
    public void takeArg(Inheratable arg) {
        System.out.println("takeArg is called");
    }

    public void takeArg(A arg) {
        System.out.println("takeArg(A arg) is called");
    }

    public void doSome(A a) {
        System.out.println("A is called");
    };
    public void doSome(B a) {
        System.out.println("B is called");
    };
}
