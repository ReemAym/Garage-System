package Garage;
import java.time.LocalDateTime;

public class TimeSetter implements ITimeSetter
{
    //Attributes that the class uses
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;

    //capture TimeIn
    public void setTimeIn ()
    {
        timeIn = LocalDateTime.now();
    }
    //capture TimeOut
    public void setTimeOut ()
    {
        timeOut = LocalDateTime.now();
    }
    //getter TimeIn
    public LocalDateTime getTimeIn ()
    {
        return timeIn;
    }
    //getter TimeOut
    public LocalDateTime getTimeOut ()
    {
        return timeOut;
    }
}
