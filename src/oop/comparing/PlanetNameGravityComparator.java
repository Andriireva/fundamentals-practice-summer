package oop.comparing;

import java.util.Comparator;
import java.util.Objects;

// Comparator is interfaces that helps u to compare objects by some/any fields
// in <> you should put A class type
// result of compare is greater or less or equals (0)
public class PlanetNameGravityComparator implements Comparator<Planet> {

    @Override
    public int compare(Planet o1, Planet o2) {
        int byName = 0;
        if (o1.getName() == null) {
            byName = -1;
        } else if ( o2.getName() == null) {
            byName = 1;
        } else {
            byName = o1.getName().compareTo(o2.getName());
        }
        return Double.compare(o1.getGravity(), o2.getGravity()) + byName;
    }
}
