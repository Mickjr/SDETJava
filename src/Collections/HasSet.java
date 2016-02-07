package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(45);
		set.add(23);
		set.add(37);
		set.add(127);
		set.add(12);
		
		//Check if it is empty or not
		if (set.isEmpty()){
			System.out.println("Hash Set is empty.");
		} else {
			System.out.println("Hash Set size: "+ set.size());
		}
		
		//Sort HashSet data
		Iterator<Integer> iterator = set.iterator();
		System.out.println("Hash Set data: ");
		
		//Display Hash set data
		while (iterator.hasNext()){
			System.out.println(iterator.next() +"");
		}
		
	}

	
	
}
