package AdvancedConcepts;

import java.util.StringTokenizer;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		//String for Tokenizer
		String str = "pickles:ketchup:mustard:onion";
		
		//StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(str, ":");
		
		//Create new StringBuilder
		StringBuilder sb = new StringBuilder("car");
		StringBuilder sb1 = new StringBuilder("High");
		StringBuilder sb2 = new StringBuilder("school");
		StringBuilder sb3 = new StringBuilder();
		
		//Use Tokenizer
		while(tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken());
		}
		
		//Append eIntern to sb3
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
		
		//Request garbage Collection
		System.gc();
				
    }

}


