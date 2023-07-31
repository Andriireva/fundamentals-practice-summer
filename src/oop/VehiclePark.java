package oop;

import java.util.Arrays;

public class VehiclePark {
    public static void main(String[] args) {
        // I want to create a particular instance on Vehicle (red porche car, my first cycle)
        int currentYear = 2023;

        //            it means that please create a new instance of Vehicle type
        Vehicle car = new Vehicle(33200001231230L);
        car.setColor("Red");
        car.setCreatedYear(2023);
        car.setPrice(100050.50);
        car.setHasPassengerSeat(true);
        car.setType("CAR");
        System.out.println("My car color is " + car.getColor());

        Vehicle bicycle = new Vehicle(434234234234L);
        bicycle.setColor("orange");
        bicycle.setCreatedYear(1985);
        bicycle.setPrice(55.55);
        bicycle.setHasPassengerSeat(false);
        bicycle.setType("BICYCLE");
        System.out.println("My first bicycle color is " + bicycle.getColor());
        System.out.println("My first bicycle price is " + bicycle.getPrice());

        Vehicle adultBicycle = new Vehicle(22222222231230L);
        adultBicycle.setColor("yellow");
        adultBicycle.setCreatedYear(2021);
        adultBicycle.setPrice(0.55);
        adultBicycle.setHasPassengerSeat(false);
        adultBicycle.setType("BICYCLE");
        adultBicycle.setName("null");

        Vehicle ship = new Vehicle("Green", 1989, 1000022.66, "BOAT", "Pefrect shiip", 43125555123L, true);
        Vehicle ship2 = new Vehicle("Green", 1989, 1000022.66, "BOAT", "Another one", 43123123123L, true);
        ship.setName("RENAMED NAME");
        if (ship.getCreatedYear() == 1989 && ship.getColor() == "Green") {
            System.out.println("YES ship is 1989 years created");
        }

        // is some vehicle is orange
        if (car.getColor() == "orange") {
            System.out.println("yes it orange");
        }

        Vehicle myFutureVehicle = null;

        Vehicle[] garage = { car, bicycle, adultBicycle, myFutureVehicle, ship, ship2 }; // an array of custom types
        // I want to get a color of the cheapest Bicycle from my garage
        double minPrice = garage[0].getPrice();
        String cheapesBicycleColor = "";
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null && garage[i].getPrice() < minPrice && garage[i].getType() == "BICYCLE") {
                minPrice = garage[i].getPrice();
                cheapesBicycleColor = garage[i].getColor();
            }
        }

        System.out.println("cheapesBicycleColor is  " + cheapesBicycleColor);

        // car name was not assigned any how, in this case it will have a default value
        // Empty string is not the same as null (not assigned)
        System.out.println("My car name is " + car.getName());
        System.out.println("My adultBicycle name is " + adultBicycle.getName());

        if (car.getName() == null) {
            System.out.println("Car name is null");
        }

        if (adultBicycle.getName() == null) {
            System.out.println("adultBicycle name is null");
        }

        String myFirstShipName = "";
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null && garage[i].getType() == "BOAT"){
                myFirstShipName = garage[i].getName();
                break;
            }
        }
        System.out.println("My 1st ship name is " + myFirstShipName);
        System.out.println("My ship serial number is " + ship.getSerialNumber());

    }
}
