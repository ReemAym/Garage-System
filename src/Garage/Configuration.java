package Garage;

public class Configuration implements IConfiguration
{
    //Attribute that the class uses
    int configuration;

    //parameterized Constructor takes integer to set configuration
    public Configuration (int con)
    {
        configuration=con;
    }

    //Set SlotSelector based on configuration
    public SlotSelector setSelector (SlotSelector slotselector)
    {
        if (configuration==1)
        {
            slotselector=new FirstFitSelector();
        }
        else if (configuration==2)
        {
            slotselector=new BestFitSelector();
        }
        return slotselector;
    }

    //setter for configuration
    public void setConfiguration (int con)
    {
        configuration=con;
    }
    //getter for configuration
    public int getConfiguration ()
{
    return configuration;
}
}
