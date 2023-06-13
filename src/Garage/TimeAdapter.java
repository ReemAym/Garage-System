package Garage;
import java.time.Duration;
import java.time.LocalDateTime;

//it takes TimeIn and TimeOut with data type LocalDateTime and calculate Duration and returned it as double value
public class TimeAdapter
{
    //Attributes that the class uses
    Duration timeOfStay;

    //Calculate Duration between TimeIn and TimeOut
    public void CalculateTimeOfStay (LocalDateTime in, LocalDateTime out)
    {
        timeOfStay = Duration.between(in, out);
    }

    //getter for timeOfStay in double value
    public double getTimeOfStay ()
    {
        return timeOfStay.toMinutes();
    }
}
