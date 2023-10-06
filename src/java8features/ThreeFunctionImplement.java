package java8features;

public class ThreeFunctionImplement implements ThreeFunction<Double, Long, Integer, String> {
    @Override
    public String apply(Double d, Long l, Integer i) {
        double res = 0;
        if (i != 0) {
            res = (d - l) / i;
        } else {
            res = (d - l);
        }

        return res + " the result";
    }
}
