import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    void main()
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int guess = 0;
        int playAgain = 0;
        String trash = "";
        boolean done = false;
        boolean donePlaying = false;
        IO.println("Let's play a game. I'll choose a number 1-10, and you try to guess it.");
        do{
            int rInt = random.nextInt(1,10);
            do{
                IO.print("Guess my number, 0-10: ");
                if (in.hasNextInt()){
                    guess = in.nextInt();
                    in.nextLine();
                    if (guess >= 1 && guess <= 10)
                    {
                        if (guess > rInt)
                        {
                            IO.println("You guessed high.");
                        }
                        else if (guess < rInt)
                        {
                            IO.println("You guessed low.");
                        }
                        else
                        {
                            IO.println("Correct!");
                            done = true;
                        }
                    }
                    else
                    {
                        IO.println("Enter a valid input [1-10]. " + guess + " is invalid.");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    IO.println("Enter a valid input [1-10]. " + trash + " is invalid.");
                }
            }while (!done);
            done = false;

            IO.print("Would you like to play again? 0 for NO. 1 for YES. [0-1]");
            playAgain = in.nextInt();
            if (playAgain >= 1)
            {
                IO.println("Excellent choice, let's play again.");
            }
            else {
                donePlaying = true;
                IO.println("See you next time!.");
            }

        }while (!donePlaying);

    }
}

/*Write a program that has the computer generate a random int value between 1 to 10 inclusive
.
The program then asks the user to guess the number with a single guess.

The program displays the random number and then indicates if the users guess was high low or on the money!

Use the do while loop again to bulletproof the guess which must be an int from 1 to 10 inclusive.

Paste a screenshot or output window copy of INTELLIJ documenting your program test run(s) here.

* */
