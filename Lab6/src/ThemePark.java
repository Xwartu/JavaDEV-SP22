public class ThemePark
{
    // Instance variables
    private Rides[] rideArray;
    private Facilities[] facilityArray;
    private People[] peopleArray;
    private double moneySpentAtPark;
    private String name;

    //Constructor
    public ThemePark()
    {
        // Initialize the arrays
        rideArray = new Rides[5];
        facilityArray = new Facilities[5];
        peopleArray = new People[5];

        //Ride Array Filler
        for(int i = 0; i < 5; i++)
        {
            rideArray[i] = null;
        }

        //Facility Array Filler
        for(int i = 0; i < 5; i++)
        {
            facilityArray[i] = null;
        }

        //People Array Filler
        for(int i = 0; i < 5; i++)
        {
            peopleArray[i] = null;
        }
    }

    //Method for adding money
    public void moneySpent(double moneySpent)
    {
        moneySpentAtPark += moneySpent;
    }

    //Methods for adding
    protected void addRide(Rides addedRide)
    {
        boolean boolToStop = false;
        int i = 0;
        while (!boolToStop)
        {
            if(rideArray[i] == null)
            {
                rideArray[i] = addedRide;
                addedRide.setIndexPosition(i);
                boolToStop = true;
            }
            else
            {
                i++;
            }
        }
    }

    protected void addFacility(Facilities addedFacility)
    {
        boolean boolToStop = false;
        int i = 0;
        while (!boolToStop)
        {
            if(facilityArray[i] == null)
            {
                facilityArray[i] = addedFacility;
                addedFacility.setIndexPosition(i);
                boolToStop = true;
            }
            else
            {
                i++;
            }
        }
    }

    protected void addPeople(People addedPerson)
    {
        boolean boolToStop = false;
        int i = 0;
        while (!boolToStop)
        {
            if(peopleArray[i] == null)
            {
                peopleArray[i] = addedPerson;
                addedPerson.setIndexPosition(i);
                boolToStop = true;
            }
            else
            {
                i++;
            }
        }
    }

    //Methods for removing
    protected void removeRide(int index)
    {
        rideArray[index] = null;
    }

    protected void removeFacility(int index)
    {
        facilityArray[index] = null;
    }

    protected void removePeople(int index)
    {
        peopleArray[index] = null;
    }

    //Methods for printing
    public void printRides()
    {
        System.out.println("\nRides at the park: ");
        for (Rides i : rideArray)
        {
            if(i != null)
            {
                System.out.println(i.getRideName());
            }
        }
    }

    public void printFacilities()
    {
        System.out.println("\nFacilities at the park: ");
        for (Facilities i : facilityArray)
        {
            if(i != null)
            {
                System.out.println(i.getName());
            }
        }
    }

    public void printCustomers()
    {
        System.out.println("\nCustomers at the park: ");
        for(People i : peopleArray)
        {
            if(i != null)
            {
                if(i.isCustomer)
                {
                    System.out.println("Customer " + i.getName());
                }
            }
        }
    }

    public void printEmployees()
    {
        System.out.println("\nEmployees at the park: ");
        for(People i : peopleArray)
        {
            if(i != null)
            {
                if(i.isEmployee)
                {
                    System.out.println("Employee " + i.getName());
                }
            }
        }
    }

    public void printProfits()
    {
        System.out.println("\nPark's Profits: $" + moneySpentAtPark);
    }

    public void setName(String nameTemp)
    {
        name = nameTemp;
    }

    public String getName()
    {
        return name;
    }

}

