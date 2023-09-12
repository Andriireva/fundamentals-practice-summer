package modulethrepractice;

import java.time.Instant;

public class DateUtilClass {

    public static Instant getDateFromString(String date) {
        return Instant.parse(date);
    }
}
