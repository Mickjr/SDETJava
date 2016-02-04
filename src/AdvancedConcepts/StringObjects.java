package AdvancedConcepts;

public class StringObjects {

	public static void main(String[] args) {
		
		String a = new String("20");
		String b = new String("200");
		int i = Integer.valueOf(a) + Integer.valueOf(b);
		System.out.println(i);
		
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.availableProcessors());
		System.out.println(r.freeMemory());
	}
	
}
