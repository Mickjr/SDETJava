package question6;

public class ForEach {

	public static void main(String[] args) {

		int a = 6;
		int b = 2;
		int c = 5;
		
		//If/Else
		if(a>7){
			System.out.println("greater than 7");
		}
		else{
			System.out.println("less than 7");
		}
		
		//Switch/Case
		switch(b){
		case 0:
			System.out.println("Zero");
		break;
		case 1:
			System.out.println("One");
		break;
		case 2:
			System.out.println("Two");
		break;
		default:
			System.out.println("greater than 3");
		}
		
		//While Loop
		while(c < 10){
			System.out.println(c);
			c++;
		}
		
	}

}
