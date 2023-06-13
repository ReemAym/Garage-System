package Garage;

public interface IVehicle
{
    //Interface methods that will be implemented by the class that implements this interface
    public void setModelName (String model);
    public void setIdentificationNumber (String id);
    public void setModelYear (int year);
    public void setDimensions (double w,double d);
    public void setWidth (double w);
    public void setDepth (double d);
    public String getModelName ();
    public String getIdentificationNumber ();
    public int getModelYear ();
    public double getWidth ();
    public double getDepth ();
    public Card getCard();
}
