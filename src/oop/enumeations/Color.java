package oop.enumeations;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Optional;

// Enumeration is specific class. it has enum keyword compare to class
// Enum can implement interfaces
// Enum CANNOT extends class
// Another classed cannot be extended by enum class

// Enum is indirectly extends java.lang.Enum class
// Enum can implement Constable, Comparable<E> interfaces (already implemented in java.lang.Enum) but
// method CANNOT be overriden
public enum Color implements ColorableInterface, Constable {
    // As a best practice enum values MUST BE in uppercase
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF"),
    YELLOW("FFFF00", false),
    ORANGE("FF00FF", false);

    private final String hex;  // color code for programming
    private final boolean simple;


    // Enum could have constructors
    Color(String hex) {
        this.hex = hex;
        this.simple = true;
    }

    Color(String hex, boolean simple) {
        this.hex = hex;
        this.simple = simple;
    }

    // enum could have methods
    public String getHex() {
        return hex;
    }

    // regular setter may be added
//    public void setHex(String hex) {
//        this.hex = hex;
//    }

    // Some method
    public void doSomethd() {
        System.out.println("doSomethd is called");
    }

    // return a Color Enum based on color name (case insensitive)
    public static Color getColorByString(String colorname) {
        // if colorname == "rEd" -> Color.RED
        String colorCapitalized = colorname.toUpperCase();
        switch (colorCapitalized) {
            case "RED":
                return Color.RED;
            case "YELLOW":
                return Color.YELLOW;
            case "GREEN":
                return Color.GREEN;
            case "BLUE":
                return Color.BLUE;
            case "ORANGE":
                return Color.ORANGE;
            default:
                return null;
        }

    }

    @Override
    public int value() {
        return 0;
    }

    //FFFFFF - balck
}
