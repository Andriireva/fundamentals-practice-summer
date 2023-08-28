package oop.date;

//
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateExamples {
    public static void main(String[] args) {
        long oneHour = 1000 * 60 * 60 + 15 * 1000;
        long twoDays = 1000 * 60 * 60 * 24 * 2;

        // from jan 1 1970
        // java.util.Date - is legacy type of date
        Date nowDate = new Date(); // new Date() - it creates a data at now time
        // when date is passed to println date type perform convertion from date to string
        // taking into account your system locale (for example en-us )
        System.out.println(nowDate);
        System.out.println(nowDate);
        Date initDate = new Date(0L);
        System.out.println(initDate);
        Date oneHourFromInit = new Date(oneHour);
        System.out.println(oneHourFromInit);
        Date twoDaysbeforeInit = new Date(-twoDays);
        System.out.println(twoDaysbeforeInit);
        System.out.println("Now in miliseconds " + nowDate.getTime());
        long maxMilisShift = Long.MAX_VALUE;  // Long.MAX_VALUE it returns max long value
        Date maxDate = new Date(maxMilisShift / 2);
        System.out.println(maxDate);

        Date nowPlus2Days = new Date(nowDate.getTime() + twoDays);
//        nowPlus2Days.getTime() > otherDate.getTime ....
        System.out.println("now and + 2 dayas " + nowPlus2Days);

        // Instant does not store time zone
        // Instant is new type of date
        // java.time.Instant is new type date
        System.out.println("==== Instant examples =====");
        Instant now = Instant.now(); // creates now date
        System.out.println(now);
        Instant nowPlus3Days = now.plus(3, ChronoUnit.DAYS);
        System.out.println("Now plus 3 days " + nowPlus3Days);
        Instant weekAgo = now.minus(7, ChronoUnit.DAYS);
        System.out.println("Week ago" + weekAgo);
        Instant nowPlus1Hour = now.plus(1, ChronoUnit.HOURS);
        if (nowPlus1Hour.isBefore(nowPlus3Days) && nowPlus1Hour.isAfter(weekAgo) ) {
            System.out.println("yes nowPlus1Hour is between date");
        }

        // Date.toInstant() convert to Instant type
        Instant oneHourFromInitInstant = oneHourFromInit.toInstant();
        System.out.println(oneHourFromInitInstant);

        // OffsetDateTime is instant that store time zone
        OffsetDateTime nowOffsetDateTime = now.atOffset(ZoneOffset.of("+3"));


        // DateTimeFormatter is class that helps format instant
        // it returns hours and minutes via :
        // DateTimeFormatter.ofPattern() it takes format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd-MMMM-yy hh:mm a")
                .localizedBy(Locale.FRANCE);
        // Instant is not suitable for format, use for example OffsetDateTime
        String formattedTime = dateTimeFormatter.format(nowOffsetDateTime);
        System.out.println(formattedTime);

        // Type for storing date without hours minuts ....
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // LocalDateTime does not carry the Zone information
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Duration to store duration of something
        Duration duration = Duration.of(500, ChronoUnit.SECONDS);

    }
}
