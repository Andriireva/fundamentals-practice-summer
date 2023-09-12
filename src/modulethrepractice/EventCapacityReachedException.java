package modulethrepractice;

public class EventCapacityReachedException extends RuntimeException {
    private final int attendees;
    private final int capacity;

    public EventCapacityReachedException(int attendees, int capacity) {
        this.attendees = attendees;
        this.capacity = capacity;
    }

    public int getAttendees() {
        return attendees;
    }

    public int getCapacity() {
        return capacity;
    }
}
