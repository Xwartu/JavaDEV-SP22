public class People
{
    //Instance Variables
    private String name;
    private int indexPosition;
    protected boolean isCustomer;
    protected boolean isEmployee;
    private int age;
    private boolean sex; //True if male, female if false

    public People(ThemePark park, String tempName, int personCheck, int ageTemp, boolean sexTemp)
    {
        park.addPeople(this);
        if(personCheck == 0)
        {
            isCustomer = true;
            isEmployee = false;
        }
        else
        {
            isCustomer = false;
            isEmployee = true;
        }
        name = tempName;
        age = ageTemp;
        sex = sexTemp;
    }

    //Methods
    public String getName()
    {
        return name;
    }

    protected int getAge()
    {
        return age;
    }

    protected boolean getSex()
    {
        return sex;
    }

    protected void setIndexPosition(int n)
    {
        indexPosition = n;
    }

    protected int getIndexPosition()
    {
        return indexPosition;
    }

    public void printSex()
    {
        if(sex == true)
        {
            System.out.println("\n" + name + "'s sex is male.");
        }
        else
        {
            System.out.println("\n" + name + "'s sex is female.");
        }
    }

    public void printAge()
    {
        System.out.println("\n" + name + "'s age is " + age);
    }
}
