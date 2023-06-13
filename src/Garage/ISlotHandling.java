package Garage;
import java.util.ArrayList;

public interface ISlotHandling
{
    //Interface methods that will be implemented by the class that implements this interface
    public void RemoveAvailableSlot (Slot s);
    void addAvailableSlot (Slot s);
    void setSlot (Slot s);
    public void setNumberOfSlots (int num);
    public void displayAvailableSlots ();
    public Slot [] getAvailableSlots ();
    public int getNumberOfAvailableSlots ();
    public int getNumberOfSlots ();

}
