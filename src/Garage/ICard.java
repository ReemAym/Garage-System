package Garage;

public interface ICard
{
    //Interface methods that will be implemented by the class that implements this interface
    public void setId (String i);
    public void setSlot (Slot s);
    public Slot getSlot ();
    public String getId ();
    public TimeSetter getTime ();
    public TimeAdapter getTimeAdapter();
    public Calculation getFeesCalculation ();
}
