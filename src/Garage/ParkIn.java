package Garage;
import Execption.DimensionException;
import Execption.NoFreeSlotException;
import java.util.Scanner;

public class ParkIn implements IParkIn
{
    //Attributes that the class uses
    private SlotSelector slotselector;
    private SlotHandling slotHandling;
    private VehicleHandling vehicleHandling;
    private Configuration configuration;

    //Constructor to initialize attributes
    public ParkIn ()
    {
        //Enter configuration
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Configuration 1 (First Fit) or 2 (Best Fit): ");
        int con = input.nextInt();
        while (con != 1 && con !=2)
        {
            System.out.print("Invalid Number .Enter Configuration 1 (First Fit) or 2 (Best Fit) Again: ");
            con = input.nextInt();
        }
        configuration = new Configuration(con);
        slotselector = configuration.setSelector(slotselector);
        slotHandling = SlotHandling.getInstance();
        vehicleHandling =VehicleHandling.getInstance();
    }

    //park in function
    public void park_in ()
    {
        //Check if there are free slots
        if(slotHandling.getNumberOfAvailableSlots() != 0)
        {
            //Create vehicle to store its information
            Vehicle v =new Vehicle();

            //Enter vehicle information
            Scanner input = new Scanner(System.in);
            System.out.print("Enter model name: ");
            String n = input.next();
            System.out.print("Enter identification number: ");
            String id = input.next();
            System.out.print("Enter model year: ");
            int year = input.nextInt();
            System.out.print("Enter width and depth: ");
            double w = input.nextDouble();
            double d = input.nextDouble();
            //if user enters invalid dimensions
            while (w<1 || d<1)
            {
                //Exception invalid dimensions
                DimensionException exp = new DimensionException();
                exp.setMessage("Slot Dimensions are invalid.");
                System.out.println(exp.getMessage());
                System.out.print("Enter width and depth Again: ");
                w = input.nextDouble();
                d = input.nextDouble();
            }
            //set vehicle attributes
            v.setModelName(n);
            v.setIdentificationNumber(id);
            v.setModelYear(year);
            v.setDimensions(w,d);

            //Pick slot for this vehicle
            Slot s;
            s = slotselector.selectSlot(slotHandling.getAvailableSlots(),v);

            //Check if slotselector found slot or not
            if (s.getWidth()!=-1 && s.getDepth()!=-1)
            {
                //Remove slot from array of available slots
                slotHandling.RemoveAvailableSlot(s);
                //Add vehicle to array
                vehicleHandling.addVehicle(v,s);
                //get last vehicle to set new information to its card
                Vehicle vec = new Vehicle(vehicleHandling.getVehicle().get(vehicleHandling.getNumberOfVehicles()));
                //Set time in to new vehicle
                vec.getCard().getTime().setTimeIn();

                //Print found slot and its information
                System.out.print("The Slot ID in the Garage: ");
                System.out.print(vec.getCard().getSlot().getId());
                System.out.print(" (width x depth) = ");
                System.out.println( "("+vec.getCard().getSlot().getWidth() + " x " +  vec.getCard().getSlot().getDepth()+")");

                //Print TimeIn
                System.out.println("TimeIn: " + vec.getCard().getTime().getTimeIn());

                //Increase number Of vehicles
                vehicleHandling.increaseNumberOfVehicles();
            }
        }
        else
        {
            //Exception if there is no free slot
            NoFreeSlotException exp = new NoFreeSlotException();
            exp.setMessage("No Slots are Available Now");
            System.out.println(exp.getMessage());
        }
    }

    //getter
    public Configuration getConfiguration()
    {
        return configuration;
    }
}
