package question53;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] a = {3,5,5,8,9,9,9};

		  Set<Integer> encounteredNumbers = new HashSet<Integer>();
		  // LinkedHashSet to keep in same order as encountered.
		  Set<Integer> duplicateNumbers = new LinkedHashSet<Integer>();
		  for (int i : a) {
		    if (encounteredNumbers.contains(i)) {
		      duplicateNumbers.add(i);
		    }
		    encounteredNumbers.add(i);
		  }

		  System.out.println(duplicateNumbers);

	}

}
