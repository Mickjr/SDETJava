package OOP;

public class HumanClass extends MammalClass{
	
	@Override
	public void eat() {
		System.out.println("I am a human, and I eat animals.");
	}
	public static void walk(){
		System.out.println("This human walking");
	}
	@Override
	public void move() {
		System.out.println("This human moving");
		
	}
}
