package question6;

public class ForEach {

	public static void main(String[] args) {

		int a = 6;
		int b = 2;
		int c = 5;
		int d = 8;
		
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
		
		//Do/While Loop
		do{
			System.out.println(d);
			d++;
		}while(d < 10);
		
		//For loop
		for(int e = 0; e < 10; e++)
		{
			System.out.println(e);
		}
		
		//Enhanced For loop
		int[] items ={1,2,3,4,5};
		for(int element : items)
		{
			System.out.println(element);
		}
		
		//Break
		for(int f = 0; f < 10; f++){
			if(f == 5)break;
			System.out.println(f);
		}
		System.out.println("Finish Loop!");
		
		//Continue
		for(int i = 0; i < 10; i++)
		{
			if(i == 5)continue;
			System.out.println(i);
			
		}
			
	}

}
