package Garage;

import Execption.NoFitSlotException;

public class BestFitSelector extends SlotSelector
{
    //override function
    //the class implements the body of this function to find best fit slot
    public Slot selectSlot (Slot [] availableSlots,Vehicle v)
    {
        int j;
        Slot s;
        for (j = 0; j < availableSlots.length; j++)
        {
            if (availableSlots[j].getWidth() >= v.getWidth() && availableSlots[j].getDepth() >= v.getDepth())
            {
                break;
            }
        }

        if (j==availableSlots.length)
            s = new Slot(-1,-1);

        else
        {
            s = new Slot(availableSlots[j]);
            for (int i = j; i < availableSlots.length; i++) {
                if (availableSlots[i].getWidth() >= v.getWidth() && availableSlots[i].getDepth() >= v.getDepth())
                {
                    if (availableSlots[i].getWidth() <= s.getWidth() && availableSlots[i].getDepth() <= s.getDepth())
                    {
                        s = availableSlots[i];
                    }
                }
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


