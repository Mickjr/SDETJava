package question7and8;
 
public class MainMethod {

	public static void main(String[] args) {

		CustomerClass mycustomer1 = new CustomerClass();
		CustomerClass mycustomer2 = new CustomerClass();
		
		CustomerClass.myMethod2();
		CustomerClass.myMethod3(0);
		mycustomer1.myMethod();
		mycustomer2.myMethod(1, "okay");

	}
}
