package question66;


import java.util.Scanner;

public class NumberGuess {


	public static void main(String[] args)  {
        int secretNumber = (int)(Math.random()*100);
        int trials = 0;
        
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess: ");
        for(;;) {
            int guess = in.nextInt();
            trials++;
            if(guess > secretNumber)        
            	System.out.println("Try lower");
            else if(guess < secretNumber)   
            	System.out.println("Try higher");
            else    {
                System.out.println("You got it in " + trials + " trial" +
                        (trials == 1 ? "!" : "s!") );
                break;
            }
        }
    }

}
