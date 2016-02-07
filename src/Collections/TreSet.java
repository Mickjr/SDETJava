package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(60);
		tree.add(38);
		tree.add(37);
		tree.add(23);
		tree.add(18);
		
		
		
		//Check if it is empty or not
		if (tree.isEmpty()){
			System.out.println("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: "+ tree.size());
		}
		
		
		
		//Sort tree set data
		Iterator<Integer> iterator = tree.iterator();
		System.out.println("Tree set data: ");
		
		//Display Tree set data
		while (iterator.hasNext()){
			System.out.println(iterator.next() +"");
		}
				
	}
		
}
