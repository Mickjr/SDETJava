package question66;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Random random = new Random();
        long from = 1;
        long to = 99;
        int randomNumber = (int) (random.nextInt((int) (to - from + 1)) + from);
        int guessedNumber = 0;
 
        System.out.printf("The number is between %d and %d.\n", from, to);
 
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Try lower");
            else if (guessedNumber < randomNumber)
                System.out.println("Try higher");
            else
                System.out.println("You got it in " + guessedNumber + " trials");
        } while (guessedNumber != randomNumber);
	}

}
