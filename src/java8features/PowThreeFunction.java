package java8features;

import java.util.function.Function;

public class PowThreeFunction implements Function<Long, Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong * aLong * aLong;
    }
}
