public class ThemeParkExample
{
    public static void main(String[] args)
    {
        //Create park
        ThemePark testPark = new ThemePark();
        testPark.setName("Charlie's Chillin' Park");

        System.out.println("\nWelcome to " + testPark.getName() + "!");

        //Create Facilities
        Facilities popCornStand = new Facilities(testPark, "Popcorn Stand", 2.00, "Popcorn");
        Facilities shirtStore = new Facilities(testPark, "T-Shirt Store", 25.00, "T-Shirt");

        // Create Rides
        Rides rocketBlaster = new Rides(testPark, "Rocket Blaster", 3.00);
        Rides ferrisWheel = new Rides(testPark, "Ferris Wheel", 7.00);

        // Create customers
        Customer jerry = new Customer(testPark, "Jerry", 200.00, 47, true);
        Customer carl = new Customer(testPark, "Carl", 10.00, 12, true);

        // Create Employees
        Employee sarah = new Employee(testPark, "Sarah", 19, false);
        Employee jennifer = new Employee(testPark, "Jennifer", 37, false);

        testPark.printRides();
        testPark.printFacilities();

        testPark.printCustomers();
        testPark.printEmployees();

        jerry.rideRide(rocketBlaster);
        jerry.rideRide(rocketBlaster);
        jerry.purchaseItemAtFacility(popCornStand);
        jerry.purchaseItemAtFacility(shirtStore);
        System.out.println("\nJerry's money now: $" + jerry.getMoney());

        //Person/customer prints
        jerry.printInventory();

        // People details
        jerry.printSex();
        sarah.printSex();
        carl.printAge();
        jennifer.printAge();

        carl.rideRide(rocketBlaster);
        carl.rideRide(ferrisWheel);
        System.out.println("\nCarl's money now $" + carl.getMoney());
        carl.purchaseItemAtFacility(popCornStand);
        carl.rideRide(rocketBlaster);

        jennifer.fired();
        System.out.println("\nJennifer was fired!");
        testPark.printEmployees();

        //Money test
        testPark.printProfits();
    }
}
