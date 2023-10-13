package java8features;

import java.util.Optional;

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


        Address address = new Address("Cool", 44321, "Fur tree street", null);
//        Person person = new Person("Charles Grandinson", 124123L, "Some important person", address);
        Person person = new Person("Charles Grandinson", 124123L, "Some important person", address, 25);

        System.out.println("=== more complex example pre java 8 way ===");
        // I want to get a city name 2nd name capitalized of a person
        String city = null;
        if (person != null
                && person.getAddress() != null
                && person.getAddress().getCityName() != null) {
            String fullCity = person.getAddress().getCityName();
            String[] s = fullCity.split(" ");
            if (s.length > 1) {
                city = s[1].toUpperCase();
            }
        }

        if (person != null) {
            // pring it
        }
        System.out.println("City second name " + city);

        System.out.println("=== more complex example java 8 way ===");
        String cityJava8Way = Optional.ofNullable(person) // Optional<Person>
                .map(p -> p.getAddress()) // Optional<Address>
                .map(address1 -> address1.getCityName()) // Optional<String>
                .map(cityName -> cityName.split(" ")) // Optional<String[]>
                .filter(cityWords -> cityWords.length > 1) // Optional<String[]>
                .map(cityWords -> cityWords[1].toUpperCase())
//                .or(() -> Optional.ofNullable("qdqwdq")) // is neede when we need to switch to another Optional
                .orElseGet(() -> {
                    System.out.println("orElseGet called");
                    return "Deafult Value";
                }); // Lazy return
//                .orElse("Deafult Value"); // Immediate return
        System.out.println("City second name " + cityJava8Way);
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
