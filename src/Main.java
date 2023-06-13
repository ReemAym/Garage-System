import Execption.DimensionException;
import Garage.ParkingGarage;
import Garage.Slot;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Create Parking Garage
        ParkingGarage p = new ParkingGarage();

        //Enter number of slots
        System.out.print("Enter number of slots: ");
        int num = input.nextInt();
        p.getSlotHandling().setNumberOfSlots(num);

        //Enter slots
        for (int i = 1 ; i<num+1;i++)
        {
            Slot s = new Slot();
            System.out.print("Enter "+i+" Slot width and depth: ");
            double w = input.nextDouble();
            double d = input.nextDouble();
            while (w<1 || d<1)
            {
                //Exception invalid dimensions
                DimensionException exp = new DimensionException();
                exp.setMessage("Slot Dimensions are invalid.");
                System.out.println(exp.getMessage());
                System.out.print("Enter "+i+" Slot width and depth Again: ");
                w = input.nextDouble();
                d = input.nextDouble();
            }
            s.setWidth(w);
            s.setDepth(d);
            s.setId(i);
            p.getSlotHandling().setSlot(s);
        }

        //Menu
        System.out.println("\n The Menu: ");
        System.out.println("1) Park In");
        System.out.println("2) Park Out");
        System.out.println("3) Display Available Slots");
        System.out.println("4) Calculate Total Income");
        System.out.println("5) Calculate Total number of vehicles");
        System.out.println("6) Exit");
        System.out.print("Enter option number: ");
        int option = input.nextInt();

        while (option!=6)
        {
            if (option==1)
            {
                //Park In
                p.getParkIn().park_in();
            }
            else if (option==2)
            {
                //Park Out
                System.out.print("Enter identification number: ");
                String id = input.next();
                p.getParkOut().park_out(id);
            }

            else if (option==3)
            {
                //Display Available Slots
                p.getSlotHandling().displayAvailableSlots();
            }

            else if (option==4)
            {
                //Display Available Slots
                System.out.println("Total Income: " + p.getTotal().calculateTotalIncome());

            }

            else if (option==5)
            {
                //Number Of Vehicles
                System.out.println("Number of Vehicles In Garage Now: "+ p.getVehicleCalculation().calculateNumberOfVehicles(p.getSlotHandling()));
                System.out.println("Number of ALL Vehicles: "+ p.getVehicleHandling().getNumberOfVehicles());
            }

            //Menu
            System.out.println("\n The Menu: ");
            System.out.println("1) Park In");
            System.out.println("2) Park Out");
            System.out.println("3) Display Available Slots");
            System.out.println("4) Calculate Total Income");
            System.out.println("5) Calculate Total number of vehicles");
            System.out.println("6) Exit");
            System.out.print("Enter option number: ");
            option = input.nextInt();

            }

        }
}
