package java8features;

import java.util.function.Function;

// When interface is implemented it is required to implement ONLY ABSTRACT method
public class MyFunction implements Function<String, Long> {
    @Override
    public Long apply(String s) {
        System.out.println();
        return (long) s.length();
    }
}
