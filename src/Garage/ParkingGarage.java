package Garage;

//Control Class
public class ParkingGarage implements IParkingGarage
{
    //Attributes that the class uses
    private ParkIn parkIn;
    private ParkOut parkOut;
    private VehicleCalculation vehicleCalculation;
    private SlotHandling slotHandling;
    private VehicleHandling vehicleHandling;
    private TotalIncome total;

    //Constructor to initialize attributes
    public ParkingGarage ()
    {
        total = TotalIncome.getInstance();
        slotHandling = SlotHandling.getInstance();
        vehicleHandling =VehicleHandling.getInstance();
        vehicleCalculation = new VehicleCalculation();
        parkIn = new ParkIn();
        parkOut = new ParkOut();
    }

    //getter for all attributes
    public VehicleCalculation getVehicleCalculation()
    {
        return vehicleCalculation;
    }
    public ParkIn getParkIn ()
    {
        return parkIn;
    }
    public ParkOut getParkOut ()
    {
        return parkOut;
    }
    public SlotHandling getSlotHandling()
    {
        return slotHandling;
    }
    public VehicleHandling getVehicleHandling()
    {
        return vehicleHandling;
    }
    public TotalIncome getTotal ()
    {
        return total;
    }
}
