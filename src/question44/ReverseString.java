package question44;

public class ReverseString {
    
	//Program the reverses a string without using the api
	public static void main(String[] args) {
		String s = "Manton";
		char c[] = s.toCharArray();

		for( int i = c.length -1; i>=0; i--)
		    System.out.print(c[i]);

	}

}
