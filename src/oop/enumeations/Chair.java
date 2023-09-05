package oop.enumeations;

public class Chair {
    private String name;
    private double price;
    private Color color;

    public Chair(String name, double price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
