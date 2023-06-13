package Garage;

import java.time.Duration;

public interface ICalculation
{
    //Interface methods that will be implemented by the class that implements this interface
    public void calculateParkingFees (double timeOfStay);
    public double getParkingFees ();
}
