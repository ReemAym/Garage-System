package Garage;

public class TotalIncome implements ITotalIncome
{
    //Attributes that the class uses
    private double totalIncome;

    //Apply singleton pattern
    private static TotalIncome instance = null;
    private TotalIncome ()
    {
        totalIncome=0;
    }
    public static TotalIncome getInstance()
    {
        if (instance == null)
        {
            synchronized(TotalIncome.class)
            {
                if (instance == null)
                {
                    instance = new TotalIncome();
                }
            }
        }
        return instance;
    }

    //Increase total income by any vehicle fees
    public void increaseTotalIncome (double fees)
    {
        totalIncome+=fees;
    }

    //return TotalIncome
    public double calculateTotalIncome ()
    {
        return totalIncome;
    }
}
