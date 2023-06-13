package Execption;

public class NoFitSlotException implements IException
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
