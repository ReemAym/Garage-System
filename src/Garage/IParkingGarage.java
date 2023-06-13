package Garage;

public interface IParkingGarage
{
    //Interface methods that will be implemented by the class that implements this interface
    public ParkIn getParkIn ();
    public ParkOut getParkOut ();
    public SlotHandling getSlotHandling();
    public VehicleHandling getVehicleHandling();
    public TotalIncome getTotal ();
    public VehicleCalculation getVehicleCalculation();
}
