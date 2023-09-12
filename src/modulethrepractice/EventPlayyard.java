package modulethrepractice;

import java.time.Instant;

public class EventPlayyard {
    public static void main(String[] args) {
        Event footballMatch = new Event("Foot League Match",
                DateUtilClass.getDateFromString("2023-10-30T18:35:24.00Z"), EventType.SPORTS,
                25, "23 Avenue street", 42000);
        footballMatch.setAttendees(33200);

        Event concert = new Event("Cool Singer Concert", DateUtilClass.getDateFromString("2023-10-28T18:35:24.00Z"), EventType.CONCERT, 300, "12 Smith street", 4000);
        Event ecoConference = new Event("Decrease pollution conference", DateUtilClass.getDateFromString("2023-11-30T18:35:24.00Z"), EventType.CONFERENCE, 5, "44 wooden street", 300);
        concert.setAttendees(3788);
        ecoConference.setAttendees(296);

        Event basketBallMatch = null;
        try {
            basketBallMatch = new Event("Elementary school match", DateUtilClass.getDateFromString("2023-08-30T18:35:24.00Z"), EventType.SPORTS, 0.1, "Child street 67", 250);
            basketBallMatch.setAttendees(255);
        } catch (EventCapacityReachedException exception) {
            System.out.println("It is not possible to set values more than " + exception.getCapacity());
            basketBallMatch.setAttendees(exception.getCapacity());
        }
        Event[] events = new Event[]{footballMatch, concert, ecoConference, basketBallMatch};

        for (int i = 0; i < events.length; i++) {
            System.out.println(events[i].toString());
        }

        // I want to return the event name that has the most Revenue ?
        String eventNameWithMostRevenue = events[0].getName();
        double maxRevenue = events[0].calculateRevenue();
        for (int i = 1; i < events.length; i++) {
            double revenue = events[i].calculateRevenue();
            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                eventNameWithMostRevenue = events[i].getName();
            }
        }
        System.out.println("Event with the most revenue is " + eventNameWithMostRevenue);

        // Find the nearest future event
        Event nearestEvent = events[0];
        Instant now = Instant.now();
        long fromNowNanos = events[0].getDate().getEpochSecond() - now.getEpochSecond();
        for (int i = 1; i < events.length; i++) {

            // 2023-10-30T18:35:24.00Z - now
            // 2023-10-30T18:36:44.00Z - fuure
            // rangeTimeInSecondsFromEventDateAndNow = 80
            // 2023-11-30T18:36:44.00Z - fuure 80 + 30 * 24 * 3600
            long rangeTimeInSecondsFromEventDateAndNow = events[i].getDate().getEpochSecond() - now.getEpochSecond();
            if (now.isBefore(events[i].getDate())
                    && rangeTimeInSecondsFromEventDateAndNow < fromNowNanos ) {
                fromNowNanos = rangeTimeInSecondsFromEventDateAndNow;
                nearestEvent = events[i];
            }
        }
        System.out.println("Nearest Event is : " + nearestEvent);
    }


}
