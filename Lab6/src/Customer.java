public class Customer extends People
{
    //Instance Variables
    private double money;
    private String[] inventory;
    int inventoryIndex;
    private ThemePark park;

    //Constructor
    public Customer(ThemePark parkTemp, String tempName, double moneyTemp, int age, boolean sex)
    {
        super(parkTemp, tempName, 0, age, sex);
        money = moneyTemp;
        inventory = new String[15];
        inventoryIndex = 0;
        park = parkTemp;
    }

    //Methods
    public boolean purchaseItemAtFacility(Facilities facility)
    {
        boolean moneyCheck = false;
        if(money >= facility.getItemsCost())
        {
            moneyCheck = true;
        }
        if(moneyCheck)
        {
            money -= facility.getItemsCost();
            park.moneySpent(facility.getItemsCost());
            inventory[inventoryIndex] = facility.getItem();
            inventoryIndex += 1;
            System.out.println("\n" + super.getName() + " bought " + facility.getItem());
            return true;
        }
        else
        {
            System.out.println("\n" + super.getName() + " didn't have enough money to buy " + facility.getItem() + "!");
            return false;
        }
    }

    public boolean rideRide(Rides ride) // Alliteration is always good, right?
    {
        boolean moneyCheck = false;
        if(money >= ride.getCost())
        {
            moneyCheck = true;
        }
        if(moneyCheck)
        {
            money -= ride.getCost();
            park.moneySpent(ride.getCost());
            System.out.println("\n" +super.getName() + " rode " + ride.getRideName());
            return true;
        }
        else
        {
            System.out.println("\n" + super.getName() + " didn't have enough money to ride " + ride.getRideName() + "!");
            return false;
        }
    }

    public void printInventory()
    {
        System.out.println("\n" + super.getName() + "'s Items: ");
        for(String i : inventory)
        {
            if (i != null)
            {
                System.out.println(i);
            }
        }
    }

    public double getMoney()
    {
        return money;
    }
}
