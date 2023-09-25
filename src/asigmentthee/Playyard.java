package asigmentthee;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Playyard {

    public static void main(String[] args) {
        Instant someDate = null;
        Instant addedMinutes = DateUtils.addMinutes(someDate, 30L);
        System.out.println(addedMinutes);

        DateUtils.isAfter(someDate);

        Instant date = Instant.now().minus(367 * 20, ChronoUnit.DAYS);
        Employee employee = new Employee(444L, "Alex", date, Gender.FEMALE, "HR", 100000);
        employee.calculateAge();
    }
}
