package Garage;
import java.time.LocalDateTime;

public interface ITimeSetter
{
    //Interface methods that will be implemented by the class that implements this interface
    public void setTimeIn ();
    public void setTimeOut ();
    public LocalDateTime getTimeIn ();
    public LocalDateTime getTimeOut ();
}
