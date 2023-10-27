package threadexamples;

import java.util.ArrayList;
import java.util.List;

public class SomeCalculationMain {
    public static void main(String[] args) {
//        Thread threadMain = Thread.currentThread(); // this one is not the same instance as simpleThreadExample
//        System.out.println("Main thread started: " + threadMain.getName());
//
//        Runnable runnable = () -> {
//            Thread simpleThreadExample = Thread.currentThread();
//            System.out.println("Hello from thread: " + simpleThreadExample.getName());
//        };
//        Thread threadMain2 = Thread.currentThread();
//
//        Thread thread = new Thread(runnable); // What the new thread will do internally
//        Thread thread2 = new Thread(runnable); // What the new thread will do internally
//        Thread thread3 = new Thread(runnable); // What the new thread will do internally
//        thread.setName("Another thread");
//        thread.start(); // to start a thread
//        thread2.start(); // to start a thread
//        thread3.start(); // to start a thread
//
//        System.out.println("Thread is started");

        System.out.println("Calculation");
        Calculation calculation = new Calculation(10);

        Runnable hardCalculation = () -> calculation.doCalculation();
        Thread calOneThread = new Thread(hardCalculation);
        Thread calTwoThread = new Thread(hardCalculation);
        calOneThread.start();
//        calTwoThread.start();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
        }
        System.out.println("calculation: " + calculation.getValue());



//        try {
//            Thread.sleep(3000L); // It pause CURRENT thread for 2 seconds
//        } catch (InterruptedException e) {
//        }
//        System.out.println("calculation: " + calculation.getValue());
    }
}
