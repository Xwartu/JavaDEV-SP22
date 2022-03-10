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

    //Print out all the details in car
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
* Single level - Super and subclass
* Multi-level - Chain of two or more classes
* Hierarchical - Many subclasses on the same level from the same super class
* Multiple inheritance - One subclass inherits from two or more super classes.
* Hybrid inheritance - One super class to two subclasses that dissolve back to one lower subclass.
*
* 2b: What are the final and super keyword?
* super is a keyword that refers to an objects direct parent class. In almost all cases this will be applicable,
* though the scope of said class can change depending on the class. Each object has at least the Object class as a parent.
*
* final is not related but another keyword that declares a method or variable to be in it's "final" state and as such
* makes it immutable and unable to be changed by even the programmer. This is useful when working with constants
* and self-imposed constraints.
*
* 2c: Multiple inheritance is not supported by Java. Explain why.
* In general, this is to prevent programmer and thus compiler confusion as the two super classes could have equivalently named methods like an override/polymorphic method,
* and inherently the compiler would not know what class to use for the subclass in this case without further designation. This also is a bad pattern for concepts
* like data encapsulation and would conflict with other reinforcing concepts already present in the language such as the super keyword and the automatic constructor chaining in the subclass.
* Most use cases for this style of inheritance can be reformatted into a multi-level chain of inheritance anyhow.
 */
