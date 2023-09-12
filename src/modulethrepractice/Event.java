package modulethrepractice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// - Event Name: A string that represents the name or title of the event.
// - Event Date: A date data type (you can use the java.util.Date class or the newer java.time.LocalDate class) to store the date of the event.
// - Event Type: An enum type that represents the type of event.
//   Define an enum called EventType with options like "Conference," "Concert," "Sports," etc.
// - Ticket Price: A double data type that represents the cost of a ticket for the event.
// - Location: A string that specifies the location or venue of the event.
// - Capacity: An integer that indicates the maximum number of attendees the event can accommodate.
public class Event {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter
            .ofPattern("dd-MM-yy hh:mm a")
            .withZone(ZoneId.systemDefault());

    private String name;
    private Instant date;
    private EventType type;
    private double ticketPrice;
    private String location;
    private int capacity;
    private int attendees;

    public Event(String name, Instant date, EventType type, double ticketPrice, String location, int capacity) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.ticketPrice = ticketPrice;
        this.location = location;
        this.capacity = capacity;
        this.attendees = 0;
    }

    public Event(String name, Instant date, EventType type, double ticketPrice, String location, int capacity, int attendees) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.ticketPrice = ticketPrice;
        this.location = location;
        this.capacity = capacity;
        setAttendees(attendees);
    }

    public void setAttendees(int attendees) {
        if (attendees > capacity) {
            throw new EventCapacityReachedException(attendees, capacity);
        }
        this.attendees = attendees;
    }

    public String getName() {
        return name;
    }

    public Instant getDate() {
        return date;
    }

    public EventType getType() {
        return type;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public double calculateRevenue() {
        return this.ticketPrice * this.attendees;
    }

    public boolean checkAvailability() {
//        return (capacity - attendees) > 0;
        return capacity > attendees;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + DATE_FORMATTER.format(date) +
                ", type=" + type.getName() +
                ", ticketPrice=" + ticketPrice +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
