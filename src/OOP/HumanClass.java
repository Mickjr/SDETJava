package OOP;

public class HumanClass extends MammalClass{
	
	@Override
	public void eat() {
		System.out.println("I eat animals.");
	}
	public static void walk(){
		System.out.println("Human walking");
	}
	@Override
	public void move() {
		System.out.println("I'm moving");
		
	}
}
