package OOP;

public class MainClass {

	public static void main(String[] args) {
		Animal one = new HumanClass();
		MammalClass two = new HumanClass();
		HumanClass three = new HumanClass();
		
		one.eat();
		one.move();
		two.eat();
		two.move();
		MammalClass.walk();
		three.eat();
		three.move();
		HumanClass.walk();
		
	}

}
