package modulethrepractice;

public enum EventType {
    CONFERENCE("Conference"), CONCERT("Concert"), SPORTS("Sports");
    private String name;

    EventType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
