import jdk.swing.interop.SwingInterOpUtils;

public class Vehicle
{
    /*
    This class serves as an example of how base attributes can be disseminated to a proper parent class
     */

    //Instance Variables\\
    private String make;
    private String color;
    private int year;
    private String model;

    //Parameterized Constructor
    public Vehicle(String makeInst, String colorInst, int yearInst, String modelInst)
    {
        //Set Instance Variables
        setMake(makeInst);
        setColor(colorInst);
        setYear(yearInst);
        setModel(modelInst);
    }

    //Setters\\

    //Set Make
    protected void setMake(String newMake)
    {
        make = newMake;
    }

    //Set Color
    protected void setColor(String newColor)
    {
        color = newColor;
    }

    //Set Year
    protected void setYear(int newYear)
    {
        year = newYear;
    }

    //Set Color
    protected void setModel(String newModel)
    {
        model = newModel;
    }

    //Getters\\

    //Get Make
    protected String getMake()
    {
        return make;
    }

    //Get Color
    protected String getColor()
    {
        return color;
    }

    //Get Year
    protected int getYear()
    {
        return year;
    }

    //Get Model
    protected String getModel()
    {
        return model;
    }

    //Methods\\

    public void printDetails()
    {
        //Print all details
        System.out.println("Make: " + getMake());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + getModel());
    }
}

/*
* Questions for Part 1:
*
* 2a: What are the different types of inheritance?
*
* 2b: What are the final and super keyword?
*
* 2c: Multiple inheritance is not supported by Java. Explain why?
*
 */
