package threadexamples;

public class Calculation {

    private Object syncObject = new Object();

    private int value;

    public Calculation(int value) {
        this.value = value;
    }

    public int getValue() {
        System.out.println("getValue is executed");
        synchronized (syncObject) {
            System.out.println("getValue actual is executed");
            return value;
        }
    }

    public void doCalculation() {
        System.out.println("doCalculation is executed");
        synchronized (syncObject) {
            System.out.println("doCalculation actual is executed");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            value++;
        }
    }
}
