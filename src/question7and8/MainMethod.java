package question7and8;

public class MainMethod {

	public static void main(String[] args) {

		CustomerClass mycustomer1 = new CustomerClass();
		CustomerClass mycustomer2 = new CustomerClass();
		
		mycustomer1.myMethod2();
		mycustomer2.myMethod3(0);
		mycustomer1.myMethod();
		mycustomer2.myMethod(1, "okay");

	}
}
