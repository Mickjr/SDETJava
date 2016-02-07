package question4;

public class MethodsPerameters {
	
	public static void main(String[] args) {
		
		double num1 = 2;
		double num2 = 4;
		System.out.println(sum(num1, num2));
		System.out.println(difference(num1, num2));
		System.out.println(product(num1, num2));
		System.out.println(quot(num1, num2));
		
		
	}
	public static double sum(double x, double y) {
		return x + y;
	}
	public static double difference(double x, double y) {
		return x - y;
	}
	public static double product(double x, double y) {
		return x * y;
	}
	public static double quot(double x, double y) {
		return x / y;
	}
}
