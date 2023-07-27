package oop;

public class VehiclePark {
    public static void main(String[] args) {
        // I want to create a particular instance on Vehicle (red porche car, my first cycle)
        int currentYear = 2023;

        //            it means that please create a new instance of Vehicle type
        Vehicle car = new Vehicle();
        car.color = "Red";
        car.serialNumber = 33200001231230L;
        car.createdYear = 2023;
        car.price = 100050.50;
        car.hasPassengerSeat = true;
        car.type = "CAR";
        System.out.println("My car color is " + car.color );

        Vehicle bicycle = new Vehicle();
        bicycle.color = "orange";
        bicycle.createdYear = 1985;
        bicycle.price = 55.55;
        bicycle.hasPassengerSeat = false;
        bicycle.type = "BICYCLE";
        System.out.println("My first bicycle color is " + bicycle.color );
        System.out.println("My first bicycle price is " + bicycle.price );

        Vehicle adultBicycle = new Vehicle();
        adultBicycle.color = "yellow";
        adultBicycle.createdYear = 2021;
        adultBicycle.price = 0.55;
        adultBicycle.hasPassengerSeat = false;
        adultBicycle.type = "BICYCLE";
        adultBicycle.name = "null";

        // is some vehicle is orange
        if (car.color == "orange") {
            System.out.println("yes it orange");
        }

        Vehicle myFutureVehicle = null;

        Vehicle[] garage = { car, bicycle, adultBicycle, myFutureVehicle }; // an array of custom types
        // I want to get a color of the cheapest Bicycle from my garage
        double minPrice = garage[0].price;
        String cheapesBicycleColor = "";
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null && garage[i].price < minPrice && garage[i].type == "BICYCLE") {
                minPrice = garage[i].price;
                cheapesBicycleColor = garage[i].color;
            }
        }
        System.out.println("cheapesBicycleColor is  " + cheapesBicycleColor);

        // car name was not assigned any how, in this case it will have a default value
        // Empty string is not the same as null (not assigned)
        System.out.println("My car name is " + car.name);
        System.out.println("My adultBicycle name is " + adultBicycle.name);

        if (car.name == null) {
            System.out.println("Car name is null");
        }

        if (adultBicycle.name == null) {
            System.out.println("adultBicycle name is null");
        }




    }
}
