package question46;

public class IntegerSwap {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;

		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);

		//swapping value of two integers
		a = a*b; 
		b = a/b; 
		a = a/b; 

		System.out.println("value of a and b after swapping using multiplication and division, a: " + a +" b: " + b);

	}

}
