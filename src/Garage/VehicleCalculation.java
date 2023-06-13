package Garage;

public class VehicleCalculation implements IVehicleCalculation
{
    //Number of vehicles in garage now
    public int calculateNumberOfVehicles (SlotHandling sh)
    {
        return (sh.getNumberOfSlots()-sh.getNumberOfAvailableSlots());
    }
}
