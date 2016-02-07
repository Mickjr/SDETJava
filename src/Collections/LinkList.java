package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Yekcim");
		list.add("Cathy");
		list.add("Manton");
		list.add("Donald");
		
		//Check if it empty or not
		if (list.isEmpty()){
			System.out.println("Linked List is empty.");
		} else {
			System.out.println("Linked List size: "+ list.size());
		}
		
		//Sort LinkedList data
		Iterator<String> iterator = list.iterator();
		System.out.println("Linked List data: ");
		
		//Display LinkedList data
		while (iterator.hasNext()){
			System.out.println(iterator.next() +"");
		}
		
	}
}
