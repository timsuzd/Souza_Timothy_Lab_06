import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class CtoFConverter{
    public static void main(String[] args)
    {
        //input c and compute f
        Scanner in = new Scanner(System.in);

        double cVal = 0;
        double fVal = 0;
        double roundedFVal = 0;
        boolean done = false;
        String trash = "";

        // F = (C * 9/5) + 32
        do {
            IO.print("Enter the measurement C you would like converted to F: ");
            if(in.hasNextDouble())
            {
                cVal = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer

                fVal = cVal * 9.0/5 + 32;
                roundedFVal = (double) Math.round(fVal * 10) / 10; // prettier
                IO.println("The measurement " + cVal + " C converts to " + roundedFVal + " F");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("Unacceptable. " + trash + " is not a valid input. Try again.");
            }

        }while (!done);
    }
}