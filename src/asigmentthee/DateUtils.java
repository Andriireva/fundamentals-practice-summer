package asigmentthee;

import java.time.Instant;
import java.time.temporal.ChronoUnit;



public class DateUtils {

    public static Instant addMinutes(Instant date, Long minutes) {
        if (date == null) {
            return null;
        }
        return date.plus(minutes, ChronoUnit.MINUTES);
    }

    public static boolean isAfter(Instant date) {
        if (date == null) {
            return false;
        }
        return Instant.now().isBefore(date);
    }
}
