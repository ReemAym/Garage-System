package Execption;

public class IdException implements IException
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
