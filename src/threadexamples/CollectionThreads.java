package threadexamples;

import java.util.ArrayList;
import java.util.List;

public class CollectionThreads {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Runnable addValues = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                }
                strings.add(String.valueOf(i));
            }
        };

        Runnable deleteValues = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException e) {
                }
                strings.remove(String.valueOf(i));
            }
        };
        Thread thread1 = new Thread(addValues);
        Thread thread2 = new Thread(deleteValues);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
        }
        strings.forEach(s -> System.out.println(s));
    }
}
