package Execption;

public class DimensionException implements IException
{
    private String message;
    public void setMessage (String msg)
    {
        message=msg;
    }
    public String getMessage ()
    {
        return message;
    }
}
