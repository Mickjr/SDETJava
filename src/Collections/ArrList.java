package Collections;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
	
	public static void main(String[] args) {	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Yekcim");
	list.add("Carlen");
	list.add("Karen");
	list.add("Naeem");
	
	//Check if it is empty or not
	if (list.isEmpty()){
		System.out.println("Array List is empty.");
	} else {
		System.out.println("Array List size: "+ list.size());
	}
	
	//Sort ArrayList data
	Iterator<String> iterator = list.iterator();
	System.out.println("Array List data: ");
	
	//Display Array List data
	while (iterator.hasNext()){
		System.out.println(iterator.next() +"");
	}
	}
}

