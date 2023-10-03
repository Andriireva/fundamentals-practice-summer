package collections;

import java.util.Objects;

// when we desing a class that will be used as a KEY for hashMap.
// Class must be immutable.
// Immutable means that it is not possible to change internal state
//
public final class Key {
    private final String name;
    private final Long id;

    public Key(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(name, key.name) && Objects.equals(id, key.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
