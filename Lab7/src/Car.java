public class Car extends Vehicle
{
    /*
    This class is to make a representative class of a type of vehicle and how it inherits properties from vehicles
     */

    //Instance Variables\\
    private String bodyStyle;
    private int topSpeed;
    private int currSpeed;

    //Parameterized Constructor
    public Car(String makeInst, String colorInst, int yearInst, String modelInst, String bodyStyleInst, int topSpeedInst, int currSpeedInst)
    {
        //Super constructor
        super(makeInst, colorInst, yearInst, modelInst);

        //Instance Variables
        setBodyStyle(bodyStyleInst);
        setTopSpeed(topSpeedInst);
        setCurrSpeed(currSpeedInst);
    }

    //Setters\\

    //Set Body Style
    protected void setBodyStyle(String newBodyStyle)
    {
        bodyStyle = newBodyStyle;
    }

    //Set Top Speed
    protected void setTopSpeed(int newTopSpeed)
    {
        topSpeed = newTopSpeed;
    }

    //Set Current Speed
    protected void setCurrSpeed(int newCurrSpeed)
    {
        currSpeed = newCurrSpeed;
    }

    //Getters\\

    //Get Body Style
    protected String getBodyStyle()
    {
        return bodyStyle;
    }

    //Get Top Speed
    protected int getTopSpeed()
    {
        return topSpeed;
    }

    //Get Current Speed
    protected int getCurrSpeed()
    {
        return currSpeed;
    }

    //Methods\\

    //Accelerate the car
    public int accelerate()
    {
        return (getCurrSpeed() + getTopSpeed());
    }

    // Print all details of car and vehicle, and accelerate
    public void carDetails()
    {
        //Print from super first
        super.printDetails();

        //Now the child class attributes
        System.out.println("BodyStyle: " + getBodyStyle());
        System.out.println("Accelerate! Speed is: " + accelerate());
    }
}
