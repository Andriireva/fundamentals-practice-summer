package java8features;

import collections.Person;

import java.util.function.*;

// Functional interface is interface that has ONLY one ABSTRACT (not implemented) method
// The main point of Functional interface is that it can be implemented "on a fly"
public class InterfacesExmpls {

    public static void main(String[] args) {
        Function<String, Long> functionBeforeJava8 = new MyFunction();
        Function<Long, Long> powerTwoBeforeJava8 = new PowFunction();
        Function<Long, Long> powerThrewBeforeJava8 = new PowThreeFunction();

        System.out.println(functionBeforeJava8.apply("stringQQQ"));
        System.out.println(powerTwoBeforeJava8.apply(16L));
        System.out.println(powerThrewBeforeJava8.apply(16L));

        System.out.println("==== Java 8 way =====");
        //                                      it is treated the same as we do in
        //                                      java8features.PowFunction in body of
        //                                      public Long apply(Long aLong)
        //                                      argument { method body }
        Function<Long, Long> powerTwoJava8Way = value -> value * value;
        System.out.println(powerTwoJava8Way.apply(16L));

        BiFunction<Long, Long, String> powArgArgAndReturnStringValue =
                (v1, v2) -> String.valueOf(Math.pow(v1, v2));
        String resultPow = powArgArgAndReturnStringValue.apply(2L, 10L);
        System.out.println(resultPow);

        Consumer<Person> printPerson = person -> System.out.println(person);
        Person alex = new Person("Alex", 123L);
        Person john = new Person("John", 226L);
        printPerson.accept(alex);
        printPerson.accept(john);

        Supplier<String> supplierExmp = () -> "Return is";
        String supplierExmpRes = supplierExmp.get();
        System.out.println(supplierExmpRes);

        Predicate<Person> isNameStartFromA = person -> person.getName().startsWith("A");
        Predicate<Person> isIdMoreThan200 = person -> person.getId() > 200L;
        System.out.println(isNameStartFromA.test(alex));
        System.out.println(isNameStartFromA.test(john));
        System.out.println(isIdMoreThan200.test(alex));
        System.out.println(isIdMoreThan200.test(john));

        ThreeFunction<Double, Long, Integer, String> customFunInterface
                = (d, l, i) -> (d - l) * i + " the result fisr one";
        System.out.println(customFunInterface.apply(110.5d, 20L, 2));
        System.out.println(customFunInterface.capitalize(110.5d, 20L, 2));

        ThreeFunction<Double, Long, Integer, String> customFunInterface2 = (d, l, i) -> {
            double res = 0;
            if (i != 0) {
                res = (d - l) / i;
            } else {
                res = (d - l);
            }

            return res + " the result";
        };
        System.out.println(customFunInterface2.apply(110.5d, 20L, 2));
        customFunInterface2.callDefaultMethod();
        System.out.println(customFunInterface2.capitalize(110.5d, 20L, 2));

        // here type is not used in <>
        // it means that it will equals to ThreeFunction<Object, Object, Object>
        ThreeFunction someFunc = (Object a,Object b,Object c) -> a.toString();


    }
}
