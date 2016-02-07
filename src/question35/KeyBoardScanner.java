package question35;

import java.util.Scanner;

public class KeyBoardScanner {

	public static void main(String[] args) {
		
        KeyBoardScanner aKeyboardScanner = new KeyBoardScanner();
        aKeyboardScanner.runScanner();
	    }
	    
	    private void runScanner() {
	        int    num1;
	        double num2;
	        String name;
	        
			Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        num1 = in.nextInt();
	        
	        System.out.print("Enter a floating point number: ");
	        num2 = in.nextDouble();
	        
	        System.out.print("Enter your name: ");
	        name = in.next();
	        
	      
	        System.out.println("int: "+num1+"double: "+num2+"string: "+name);
	        
	        in.close();
	    }

}
