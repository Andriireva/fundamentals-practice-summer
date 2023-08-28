package additionalpart;

import oop.inheritancemagic.B;

// Static methods are used in case where class state (set of class variables are not changed)
// Static methods can call other static methods and static variables, BUT cannot call non-static (dynamic) methods
// Non-Static (dynamic) methods can call other static methods and static variables, and dymic method
//
public class Playyard {
    public static void main(String[] args) {
        Planet earth = new Planet(1L, "Earth");
        String earthName = earth.getName();
        earth.staticMethod();
        // It is possible to call static method without creating instance
        // ClassName.callStaticMethod()
        Planet.staticMethod();
        int counter = Planet.counter;
        // Planet.getName();// it is not possible because getName() is not static
        Planet p2 = new Planet(123123123L, "Earth");
        new Planet(1231231231L, "Mars");
        new Planet(12312312312L, "Venara");
        new Planet(123123123123L, "Uranius");
        new Planet(1231231231234L, "Uranius");
        System.out.println(earth.getIdentity());
        System.out.println(p2.getIdentity());
        System.out.println("Eath gravity is " + Planet.EARTH_G);
        System.out.println("Eath gravity is " + p2.EARTH_G);
        System.out.println("Eath gravity is " + earth.EARTH_G);
        System.out.println("Planet counter = " + Planet.getCounter());

        System.out.println(p2.varArgsMethod("HHH", "s2", "s3"));
        System.out.println(p2.varArgsMethod(true, "HHH", "s2", "s3"));
        System.out.println(p2.oneStringOrMOre("s", "dqwd", "ano"));
        String[] strings = {"dqwd", "ano"}; // String[] strings equals the same as code above
        System.out.println(p2.oneStringOrMOre("s", strings));

        Singleton singleton = Singleton.getInstance();
        singleton.setName("John");
        singleton.setBalance(123.56d);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2.getName());
        singleton2.setBalance(5555);
        System.out.println(singleton.getBalance());
    }
}
