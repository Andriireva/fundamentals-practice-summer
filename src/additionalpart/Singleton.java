package additionalpart;

// Singleton is a class that can have ONLY 1 instance
public class Singleton {

    private String name;
    private double balance;
    private static Singleton instance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // it prevents creating instance outside of this class
    private Singleton() {

    }

    public static Singleton getInstance() {
        // code bellow called lazy init
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

}
