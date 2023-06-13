package Garage;

abstract public class SlotSelector
{
    //abstract function will be implemented in classes which will extend this abstract class
    abstract public Slot selectSlot (Slot [] availableSlots,Vehicle v);
}
