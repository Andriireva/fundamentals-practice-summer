package additionalpart;

// static applicable to variables, methods and (inner classes (?))
public class Planet {


    // Constant
    // Code style that constants SHOULD_BE_LIKE_THIS
    public static final double EARTH_G = 9.8; // ea


//    private final long identity = 5645564L; // final variable // inlince init
    private final long identity; // final variable // or EVERY constructor MUST init final variables

    private String name;
    public static int counter; // by default value is 0

    public Planet(long identity) {
        this.identity = identity;
        // via this it is not possible to call static methods or variables
        counter++;
    }

    public Planet(long identity, String name) {
        this(identity); // call constructor above
        this.name = name;
    }

    public long getIdentity() {
        return identity;
    }

//    public void setIdentity(long identity) {
//        //this.identity = identity; // final cannot be reassigned
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        priStatiMethod();
        this.name = name;
    }

    // var arg example
    public String varArgsMethod(String... strings) { // in method body it is same to String[] strings
        // var args param is actulally array of type
//        strings.length;
//        strings[1]
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            s = s + strings[i];
        }
        return s;
    }

    // very important rule: Vararg parameter must be the last in the list
    public String varArgsMethod(boolean capitalize, String... strings) { // in method body it is same to String[] strings
        // var args param is actulally array of type
//        strings.length;
//        strings[1]
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            s = s + strings[i];
        }
        if (capitalize) {
            return s.toUpperCase();
        } else {
            return s;
        }
    }

    public String oneStringOrMOre(String one, String... strings) {
        return "";
    }

    private static void priStatiMethod() {
        // setName("asdasd"); // it is not possible because non-static (dynamic) is called from static method
        System.out.println("priStatiMethod method is called");
    }

    public static void staticMethod() {
        priStatiMethod();
        System.out.println("Static method is called");
    }

    public static int getCounter() {
        return counter;
    }
}
