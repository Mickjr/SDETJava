package question7and8;

public class CustomerClass {
	
	private static final float MYFLOAT = 3.14f;
	
	public CustomerClass(){
		
	}
	
	public CustomerClass(int x){
		
	}
	
	public void myMethod(){
		System.out.println("Hello5");
	}
	
	public void myMethod(int x, String str){
		System.out.println(x + " " + str);
	}
	
	static int counter;
	
	static{
		counter = 0;
	}
	
	public static void myMethod2(){
		System.out.println("Hello1");
	}
	
	public static void myMethod3(float f){
		f = MYFLOAT;
		System.out.println(f);
	}
	
	
	
}
