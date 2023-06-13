package Garage;

public interface ISlot
{
    //Interface methods that will be implemented by the class that implements this interface
    public void setWidth (double w);
    public void setDepth (double d);
    public void setAvailability (boolean a);
    public void setId (int i);
    public boolean isAvailable ();
    public double getWidth ();
    public double getDepth ();
    public int getId ();
}
