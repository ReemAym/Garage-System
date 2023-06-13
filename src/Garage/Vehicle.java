package Garage;

public class Vehicle implements IVehicle
{
    //Attributes that the class uses
    private String modelName;
    private String identificationNumber;
    private int modelYear;
    private double width;
    private double depth;
    private Card card;

    //Constructor to initialize attribute
    public Vehicle ()
    {
        card = new Card();
    }

    //Copy Constructor
    public Vehicle (Vehicle v)
    {
        modelName=v.modelName;
        identificationNumber=v.identificationNumber;
        modelYear=v.modelYear;
        width=v.width;
        depth=v.depth;
        card = new Card();
        card = v.card;
    }

    //setter
    public void setModelName (String model)
    {
        modelName=model;
    }
    public void setIdentificationNumber (String id)
    {
        identificationNumber=id;
        card.setId(identificationNumber);
    }
    public void setModelYear (int year)
    {
        modelYear=year;
    }
    public void setDimensions (double w,double d)
    {
        width=w;
        depth=d;
    }
    public void setWidth (double w)
    {
        width=w;
    }
    public void setDepth (double d)
    {
        depth=d;
    }

    //getter
    public String getModelName ()
    {
        return modelName;
    }
    public String getIdentificationNumber ()
    {
        return identificationNumber;
    }
    public int getModelYear ()
    {
        return modelYear;
    }
    public double getWidth ()
    {
        return width;
    }
    public double getDepth ()
    {
        return depth;
    }

    public Card getCard()
    {
        return card;
    }
}
