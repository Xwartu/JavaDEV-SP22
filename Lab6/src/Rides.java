public class Rides extends ThemePark
{
    //Instance Variables
    private String rideName;
    private double rideCost;
    private int indexPosition;

    //Constructor
    public Rides(ThemePark park, String name, double rideCostTemp)
    {
        park.addRide(this);
        rideName = name;
        rideCost = rideCostTemp;
    }

    //Methods
    public double getCost()
    {
        return rideCost;
    }

    public String getRideName()
    {
        return rideName;
    }

    public void setIndexPosition(int n)
    {
        indexPosition = n;
    }

    // I could create a deeper structure, but with the limited application of this example, I felt it not needed because of planning to always instance only 2 rides.
}
