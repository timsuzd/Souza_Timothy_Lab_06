import java.util.Scanner;

public class FuelCosts
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        double mpg = 0;
        double capacity = 0;
        double costPerGallon = 0;
        double costHundredMiles = 0;
        double roundedCostHundredMiles = 0;
        double milesPerTank = 0;
        boolean done = false;
        String trash = "";

        //get the mpg?

        do {
            IO.print("Enter the fuel efficiency in MPG: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer

                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid mpg, not " + trash + ". Try again: ");
            }

        }while (!done);
        done = false;

        // get the tank capacity

        do {
            IO.print("Enter the tank capacity in gallons: ");
            if(in.hasNextDouble())
            {
                capacity = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer

                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid capacity, not " + trash + ". Try again: ");
            }

        }while (!done);
        done = false;


        // get the $ p G


        do {
            IO.print("Enter the price per gallon: ");
            if(in.hasNextDouble())
            {
                costPerGallon = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer

                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid PPG, not " + trash + ". Try again: ");
            }

        }while (!done);
        //•	the cost to drive 100 miles and
        //•	how far the car can go with a full tank of gas.

        costHundredMiles = 100 / mpg * costPerGallon;
        milesPerTank = capacity * mpg;
        roundedCostHundredMiles = (double) Math.round(costHundredMiles * 100) / 100; // prettier

        IO.println("It would cost $" + roundedCostHundredMiles + " to travel 100 miles.");
        IO.println("One tank would get you " + milesPerTank + " miles.");
    }
}