package Garage;

import Execption.IdException;

public class ParkOut implements IParkOut
{
    //Attributes that the class uses
    private SlotHandling slotHandling;
    private VehicleHandling vehicleHandling;
    private TotalIncome total;

    //Constructor to initialize attributes
    public ParkOut ()
    {
        total = TotalIncome.getInstance();
        slotHandling = SlotHandling.getInstance();
        vehicleHandling =VehicleHandling.getInstance();
    }

    //park out function
    public void park_out (String vehicleID)
    {
        boolean found = false;
        //search for vehicle by id
        for (int i=vehicleHandling.getNumberOfVehicles()-1;i>=0;i--)
        {
            //if found the vehicle
            if (vehicleHandling.getVehicle().get(i).getIdentificationNumber().equals(vehicleID))
            {
                //get this vehicle to set new information to its card
                Vehicle vec = new Vehicle(vehicleHandling.getVehicle().get(i));
                //change boolean to true
                found =true;
                //Set timeout
                vec.getCard().getTime().setTimeOut();
                //Set time of stay
                vec.getCard().getTimeAdapter().CalculateTimeOfStay(vec.getCard().getTime().getTimeIn() , vec.getCard().getTime().getTimeOut());
                //Calculate fees
                vec.getCard().getFeesCalculation().calculateParkingFees(vec.getCard().getTimeAdapter().getTimeOfStay());
                //Increase total income
                total.increaseTotalIncome(vec.getCard().getFeesCalculation().getParkingFees());

                //print TimeOut
                System.out.println("TimeOut: " + vec.getCard().getTime().getTimeOut());
                //Print time of stay
                System.out.println("TimeOfStay: " + vec.getCard().getTimeAdapter().getTimeOfStay() + " minutes");
                //Print fees
                System.out.println("Park Fees: " + vec.getCard().getFeesCalculation().getParkingFees());

                //Add vehicle slot again to available slot array
                slotHandling.addAvailableSlot(vec.getCard().getSlot());
                break;
            }
        }

        //if not found the vehicle has entered id
        if (found==false)
        {
            //Exception
            IdException exp = new IdException();
            exp.setMessage("Id is wrong.");
            System.out.println(exp.getMessage());
        }
    }
}
