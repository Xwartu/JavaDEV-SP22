public class Employee extends People
{
    //Instance Variables
    private ThemePark park;

    //Constructor
    public Employee(ThemePark parkTemp, String tempName, int age, boolean sex)
    {
        super(parkTemp, tempName, 1, age, sex);
        park = parkTemp;
    }

    //Methods
    public void fired()
    {
        park.removePeople(super.getIndexPosition());
    }

    // I could create a deeper structure, but with the limited application of this example, I felt it not needed.
    // No hired function because they're hired when created is my takeaway
}
