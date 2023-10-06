package java8features;

import java.util.Optional;
import java.util.function.Function;

public class OptionalEmpls {

    public static void main(String[] args) {
        String value = getValue(101);
//        Integer resCap;
//        if (value != null) {
//            resCap = calculationOf(value);
//        } else {
//            resCap = 0;
//        }


        // Optional helps to handle null cases in a "function style"

//        Function<String, Integer> function = str -> calculationOf(str);

        Integer i = Optional.ofNullable(value) //
                .map(string -> {
                    System.out.println("calculationOf is executed");
                    return calculationOf(string);
                }) // map will return Optional<Interg>
                .map(intvalue -> {
                    System.out.println("18 % intvalue == 0 ? null : intvalue * intvalue");
                    return 18 % intvalue == 0 ? null : intvalue * intvalue;
                })
                .orElse(0); // orElse is executed if ANY previous step returns null

//        System.out.println(resCap);
        System.out.println(i);

    }

    private static String captitalize(String value) {
        return value.toUpperCase();
    }

    private static Integer calculationOf(String value) {
        if (value.length() > 10) {
            return null;
        }
        return value.length();
    }

    private static String getValue(int i) {
        if (i % 5 == 0) {
            return null;
        }
        return "Result" + (i * i);
    }
}
