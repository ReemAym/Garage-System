package Garage;
import java.util.ArrayList;

public class VehicleHandling implements IVehicleHandling
{
    //Attributes that the class uses
    private int numberOfVehicles;
    private ArrayList<Vehicle> vehicle;

    //Apply singleton pattern
    private static VehicleHandling instance = null;
    private VehicleHandling()
    {
        numberOfVehicles=0;
        vehicle = new ArrayList<>();
    }
    public static VehicleHandling getInstance()
    {
        if (instance == null)
        {
            synchronized(VehicleHandling.class)
            {
                if (instance == null)
                {
                    instance = new VehicleHandling();
                }
            }
        }
        return instance;
    }

    //getter list of vehicles
    public ArrayList<Vehicle> getVehicle ()
    {
        return vehicle;
    }

    //get number of vehicles
    public int getNumberOfVehicles ()
    {
        return numberOfVehicles;
    }

    //increase number of vehicles after park in
    public void increaseNumberOfVehicles ()
    {
        numberOfVehicles++;
    }

    //Add vehicle to list
    public void addVehicle (Vehicle v,Slot s)
    {
        //add vehicle
        vehicle.add(new Vehicle(v));
        vehicle.get(numberOfVehicles).getCard().setSlot(s);
    }

}
