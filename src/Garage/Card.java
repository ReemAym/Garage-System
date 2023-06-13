package Garage;

public class Card implements ICard
{
    //Attributes that the class uses
    private String id;
    private Slot slot;
    private TimeSetter time;
    private TimeAdapter timeAdapter;
    private Calculation feesCalculation;

    //Constructor to initialize attributes
    public Card ()
    {
        slot = new Slot();
        time = new TimeSetter();
        timeAdapter = new TimeAdapter();
        feesCalculation = new Calculation();
    }

    //setter
    public void setId (String i)
    {
        id=i;
    }
    public void setSlot (Slot s)
    {
        slot = s;
    }

    //getter
    public Slot getSlot ()
    {
        return slot;
    }
    public String getId ()
    {
        return id;
    }
    public TimeSetter getTime ()
    {
        return time;
    }
    public TimeAdapter getTimeAdapter()
    {
        return timeAdapter;
    }
    public Calculation getFeesCalculation ()
    {
        return feesCalculation;
    }

}
