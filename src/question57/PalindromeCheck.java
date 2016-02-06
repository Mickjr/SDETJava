package question57;

public class PalindromeCheck {

	public static void main(String[] args) {
		check("madam".toLowerCase());
	    check("Whynot".toLowerCase());
	}

	public static void check(String aString) {
	    System.out.print(aString + ": ");
	    char[] chars = aString.toCharArray();
	    for (int i = 0, j = (chars.length - 1); i < (chars.length / 2); i++, j--) {
	        if (chars[i] != chars[j]) {
	            System.out.println("Not a palindrome!");
	            return;
	        }
	    }
	    System.out.println("Found a palindrome!");
	}

}


