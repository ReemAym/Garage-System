package Garage;
import Execption.NoFreeSlotException;

public class SlotHandling implements ISlotHandling
{
    //Attributes that the class uses
    private int numberOfSlots;
    private Slot [] allSlots;
    private int numberOfAvailableSlots;
    private Slot [] availableSlots;

    //Apply singleton pattern
    private static SlotHandling instance = null;
    private SlotHandling ()
    {
        numberOfAvailableSlots=0;
    }

    public static SlotHandling getInstance()
    {
        if (instance == null)
        {
            synchronized(SlotHandling.class)
            {
                if (instance == null)
                {
                    instance = new SlotHandling();
                }
            }
        }
        return instance;
    }

    //Print all available slots
    public void displayAvailableSlots ()
    {
        //if no available slots
        if (numberOfAvailableSlots==0)
        {
            NoFreeSlotException exp = new NoFreeSlotException();
            exp.setMessage("No Slots are Available Now");
            System.out.println(exp.getMessage());
        }
        else
        {
            System.out.println("Available Slots: ");
            for (int i = 0; i < numberOfAvailableSlots; i++)
            {
                System.out.println((i + 1) + ") Slot");
                System.out.print("Width x Depth = ");
                System.out.println(availableSlots[i].getWidth() + " x " + availableSlots[i].getDepth());
            }
        }
    }

    //remove slot from array
    public void RemoveAvailableSlot (Slot s)
    {
        //remove slot
        for (int i = 0; i < numberOfAvailableSlots; i++)
        {
            //if found the slot
            if (availableSlots[i].getId() == s.getId())
            {
                //change its availability to false
                availableSlots[i].setAvailability(false);
                //shift the array
                for (int j = i; j < numberOfAvailableSlots - 1; j++)
                {
                    availableSlots[j] = availableSlots[j + 1];
                }
                //decrease number of available slots
                numberOfAvailableSlots--;
                break;
            }
        }
    }

    //add slot to array
    public void addAvailableSlot (Slot s)
    {
        //add slot at the end of array
        availableSlots[numberOfAvailableSlots]=s;
        //change its availability to true
        availableSlots[numberOfAvailableSlots].setAvailability(true);
        //increase number of available slots
        numberOfAvailableSlots++;
    }

    //set number of all slots at the start of program
    public void setNumberOfSlots (int num)
    {
        numberOfSlots = num;
        //initialize attributes
        allSlots=new Slot[numberOfSlots];
        availableSlots=new Slot[numberOfSlots];
    }

    //set slot in array at the start of program
    public void setSlot (Slot s)
    {
        availableSlots[numberOfAvailableSlots]=s;
        allSlots[numberOfAvailableSlots]=s;
        numberOfAvailableSlots++;
    }

    //getter for attributes
    public Slot [] getAvailableSlots ()
    {
        return availableSlots;
    }

    public int getNumberOfAvailableSlots ()
    {
        return numberOfAvailableSlots;
    }

    public  Slot [] getAllSlots ()
    {
        return allSlots;
    }

    public int getNumberOfSlots ()
    {
        return numberOfSlots;
    }


}
