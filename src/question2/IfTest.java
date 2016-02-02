/**
 * 
 */
package question2;

public class IfTest {

	public static void main(String[] args) {
		int x = 6;
        int y = 10;
        int z = 28;
        
        if ( x > y && x > z )
           System.out.println("First number is largest.");
        else if ( y > x && y > z )
           System.out.println("Second number is largest.");
        else if ( z > x && z > y )
           System.out.println("Third number is largest.");
        else   
           System.out.println("Entered numbers are not distinct.");
             
	}
}
