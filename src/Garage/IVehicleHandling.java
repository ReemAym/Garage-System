package Garage;

import java.util.ArrayList;

public interface IVehicleHandling
{
    //Interface methods that will be implemented by the class that implements this interface
    public ArrayList<Vehicle> getVehicle(); //get list of vehicles
    public void addVehicle (Vehicle v,Slot s); //Add new vehicle to list
    public int getNumberOfVehicles (); //Number of all vehicles
    public void increaseNumberOfVehicles(); //Increase number of vehicles after park in
}
