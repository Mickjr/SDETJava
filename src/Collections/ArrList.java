package Collections;



import java.util.ArrayList;
import java.util.Collections;
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
	
	//Iterate ArrayList data
	Iterator<String> iterator = list.iterator();
	System.out.println("Array List data: ");
	
	
	//Display Iterated Array List data
	while (iterator.hasNext()){
		System.out.println(iterator.next() +"");
	}
	

	//Unsorted List//
    System.out.println("Before Sorting:");
    for(String counter: list){
		System.out.println(counter);
	}
   
    //Sort statement//
    Collections.sort(list);
   
    //Sorted List//
    System.out.println("After Sorting:");
    for(String counter: list){
		System.out.println(counter);
	 }
  }
}

