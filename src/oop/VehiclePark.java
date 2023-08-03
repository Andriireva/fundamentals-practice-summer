package oop;

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

        // it is possible to create a variable of type A but an actual type can be sub type of A
        // but not vice versa code bellow cannot be complited
        // Bicycle bicyclePrime = new Vehicle(444444L);
        Vehicle bicycle = new Bicycle("orange", 1985, 55.55, "SmallOne", 423423423L, false, true);
        System.out.println("My first bicycle color is " + bicycle.getColor());
        System.out.println("My first bicycle price is " + bicycle.getPrice());
        // bicycle declared type is Vehicle, but actual class is Bicycle
        // instanceof - [variable] instanceof [ClassName] it check is variable [ClassName] tyoe
        if (bicycle instanceof Bicycle) {
            // it possible to used variable as some other child class.
            // We should use casting approach - (([ClassName])[variable]).callClassNAmeMethods()
            System.out.println("My favorite bicycle has child chair " + ((Bicycle)bicycle).isHasChildChair());
        }
        // if you will try to cast a variable to not appropraite Class - java.lang.ClassCastException appear
//        System.out.println("My favorite bicycle has child chair " + ((Bicycle)car).isHasChildChair());
        // without casting it does not work. Code bellow has issue
//        System.out.println("My favorite bicycle has child chair " + bicycle.isHasChildChair());


        Bicycle myFavoriteBicycle = new Bicycle("black", 1985, 55.55, "SmallOne", 423423423L, false, true);
        System.out.println("My favorite bicycle color is " + myFavoriteBicycle.getColor());
        System.out.println("My favorite bicycle has child chair " + myFavoriteBicycle.isHasChildChair());
        System.out.println("My favorite description " + myFavoriteBicycle.getBicycleDescription());

        Vehicle adultBicycle = new Bicycle("yellow", 2021, 66.55, "null", 423423423L, false, false);

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
