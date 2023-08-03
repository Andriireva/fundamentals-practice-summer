package oop; // on the fisr line of java class file package should be (optional)


// java file MUST have a class NAME
// Class is something that is describes object from "world"
// there are 3 (4)
// Encapsulation - hiding from "above" internal execution (logic)
// Inheritance -
public class Vehicle {

    // What class has
    // 1. variables (are set of basic (other) types that can describe a single instance of this model (class)
    // 2. Constructors
    // 3. Method (functions)

    // private means that this variable, Constructors, or Method CAN be used ONLY in this class (not inherited)
    // protected means that this varialbe (const, method) can be called here or in sub class
    protected String color; // color variable. it can be accessed from Bicycle class
    private String name;
    private long serialNumber; // it must be initialized only one
    private String type; // “trucks, buses, cars, plain, ship.. “
    private int createdYear;
    private double price;
    private boolean hasPassengerSeat;

    // it is a new constructor
//    public Vehicle() {
//
//    }

    // "Green", 1989, 1000022.66, "BOAR", "Pefrect shiip", 43123123123L, true
    // Variables in () are variables that can be used ONLY in logic block code {}
    Vehicle(String color, int year, double price,
            String type, String name, long serialNumber, boolean hasSeats) {

        // this is a reference to the instance of this class (or other stuff )

        this.color = color;
        createdYear = year;
        this.price = price;
        this.type = type;
        this.serialNumber = serialNumber;
        this.hasPassengerSeat = hasSeats; // this. here is optional
        this.name = name;
    }

    public Vehicle(long serialNumber) {
        this.serialNumber = serialNumber;
    }


    private void privateVehicleMethod() {
        System.out.println("privateVehicleMethod is called");
        ///
    }

    protected void protectedVehicleMethod() {
        System.out.println("protectedVehicleMethod is called");
        ///
    }


    // Method if a function that can be called on instance of this calls
    // [ACCESS TYPE ]( public, private .... ) [return type] [nameMethod]()
    public long getSerialNumber() {
        // inside {} is method body
        // return means that this method (function) return something
        return serialNumber;
    }

    public String doHardCalculation() {
        /// there are 50 lines of code....
        // instead 50 line code we will splt to a 5 private methods:
        // 1 step do som
        // 2nd doAnother
        // ,.....
        // doSomethWithNameANdPrice();
        // getAvarageofBlblabla();
        return "";
    }

    public String getName() {
        return name;
    }

    // this method has 1 varialbe
//     void means that this method DOES NOT return any value
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(int createdYear) {
        this.createdYear = createdYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasPassengerSeat() {
        return hasPassengerSeat;
    }

    public void setHasPassengerSeat(boolean hasPassengerSeat) {
        this.hasPassengerSeat = hasPassengerSeat;
    }
}
