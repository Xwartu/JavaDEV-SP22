public class Facilities extends ThemePark
{
    //Instance variable
    private String name;
    private double itemsCost;
    private int indexPosition;
    private String item;

    //Constructor
    public Facilities(ThemePark park, String nameTemp, double itemCostTemp, String itemTemp)
    {
        park.addFacility(this);
        name = nameTemp;
        itemsCost = itemCostTemp;
        item = itemTemp;
    }

    //Methods
    public String getName()
    {
        return name;
    }

    public double getItemsCost()
    {
        return itemsCost;
    }

    public String getItem()
    {
        return item;
    }

    public void setIndexPosition(int n)
    {
        indexPosition = n;
    }
}
