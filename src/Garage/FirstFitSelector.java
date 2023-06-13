package Garage;

import Execption.NoFitSlotException;

public class FirstFitSelector extends SlotSelector
{
    //override function
    //the class implements the body of this function to find first fit slot
    public Slot selectSlot (Slot [] availableSlots,Vehicle v)
    {
        Slot s = new Slot (-1,-1);
        for (int i = 0; i < availableSlots.length; i++)
        {
            if (availableSlots[i].getWidth() >= v.getWidth() && availableSlots[i].getDepth() >= v.getDepth())
            {
                s = availableSlots[i];
                break;
            }
        }

        if (s.getWidth()==-1 && s.getDepth()==-1)
        {
            NoFitSlotException exp = new NoFitSlotException();
            exp.setMessage("No Fit Slot Is Available For This Car");
            System.out.println(exp.getMessage());
        }

        return s;
    }
}
