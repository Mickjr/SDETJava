package question48;

import java.util.Scanner;

public class NumberFactorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        //Gives Prompt
        System.out.print("Enter a number to find the factorial of it");
        //Enter the times you want to run
        int number = input.nextInt();
        //Declares new int    
        int factor = 1;
        //Runs loop and multiplies factor each time runned     
        for (int i=1; i<=number; i++) {
            factor = factor*i;
        }
        //Prints out final number
        System.out.println(factor);

	}

}
