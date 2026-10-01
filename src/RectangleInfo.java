import java.util.Scanner;

class RectangleInfo {
    void main()
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        double roundedHypotenuse = 0;
        String trash = "";
        boolean done = false;
        do {
            IO.print("Enter the width: ");
            if (in.hasNextDouble())
            {
            width = in.nextDouble();
            in.nextLine();
            done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.print(trash + "is not a valid input. Enter the width: ");
            }
        }while (!done);

        done = false;

        do {
            IO.print("Enter the height: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.print(trash + "is not a valid input. Enter the height: ");
            }
        }while (!done);

        //area, perimeter, hypotenuse
        area = height * width;
        perimeter = height * 2 + width * 2;
        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        roundedHypotenuse = (double) Math.round(hypotenuse * 100 / 100);

        IO.println("The area is " + area + "un^2");
        IO.println("The perimeter is " + perimeter + "un");
        IO.println("The length of the hypotenuse is " + roundedHypotenuse + "un");
    }
}
