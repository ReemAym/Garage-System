package Garage;
import java.time.Duration;

public class Calculation implements ICalculation
{
    //Attribute that the class uses
    private double parkingFees;

    //Function calculate fees by multiply time of stay by 5
    public void calculateParkingFees (double timeOfStay)
    {
        parkingFees =Math.ceil(timeOfStay/60.0)*5;
    }

    //getter for parkingFees attribute
    public double getParkingFees ()
    {
        return parkingFees;
    }
}
