package java8features;

// @FunctionalInterface it checks on complication phase that this interface HAS ONLY 1 abstract method
// default method does not count as abstract
// Functional Interface can have 1 abstract method and as many you want default methods
@FunctionalInterface
public interface ThreeFunction<ARG1, ARG2, ARG3, R> {
    R apply(ARG1 arg1, ARG2 arg2, ARG3 arg3);

    // default methods are public by default
    default void callDefaultMethod() {
        System.out.println("callDefaultMethod is called");
    }

    default String capitalize(ARG1 arg1, ARG2 arg2, ARG3 arg3) {
        R applied = apply(arg1, arg2, arg3);
        return applied
                .toString()
                .toUpperCase();
    }
}
