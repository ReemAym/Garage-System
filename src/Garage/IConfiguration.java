package Garage;

public interface IConfiguration
{
    //Interface methods that will be implemented by the class that implements this interface
    public SlotSelector setSelector (SlotSelector slotselector);
    public void setConfiguration (int con);
    public int getConfiguration ();
}
