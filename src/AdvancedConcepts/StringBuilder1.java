package AdvancedConcepts;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		//Create new StringBuilder
		StringBuilder sb = new StringBuilder("car");
		StringBuilder sb1 = new StringBuilder("High");
		StringBuilder sb2 = new StringBuilder("school");
		StringBuilder sb3 = new StringBuilder();
		sb3.append("eIntern");

		//Get substring after the first two characters.
		String omitFirstTwo = sb3.substring(2);
		System.out.println(omitFirstTwo);

		//Get only the first two characters in a substring.
		String firstTwo = sb3.substring(0, 2);
		System.out.println(firstTwo);
		
		//Replace second character with "olo"
		sb.replace(1, 2, "olo");
		System.out.println(sb);
		
		//Combine two StringBuilders.
		sb1.append(sb2);
		System.out.println(sb1);
				
    }

}


