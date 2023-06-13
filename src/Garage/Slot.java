package Garage;

public class Slot implements ISlot
{
    //Attributes that the class uses
    private int id;
    private double width;
    private double depth;
    private Boolean availability;

    //Constructor to initialize attribute
    public Slot()
    {
        availability = true;
    }
    //parameterized Constructor takes dimensions
    public Slot(double w,double d)
    {
        width = w;
        depth = d;
        availability = true;
    }

    //Copy Constructor
    public Slot (Slot s)
    {
        width=s.width;
        depth=s.depth;
        id=s.id;
    }

    //setter for attributes
    public void setWidth (double w)
    {
        width=w;
    }
    public void setDepth (double d)
    {
        depth=d;
    }
    public void setAvailability (boolean a)
    {
        availability = a;
    }
    public void setId (int i)
    {
        id=i;
    }

    //getter for attributes
    public boolean isAvailable ()
    {
        return availability;
    }
    public double getWidth ()
    {
        return width;
    }
    public double getDepth ()
    {
        return depth;
    }
    public int getId ()
    {
        return id;
    }
}
