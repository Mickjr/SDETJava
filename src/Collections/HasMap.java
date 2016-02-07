package Collections;


import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HasMap {
		
	public static void main(String[] args) throws ParseException{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(45,"Yekcim");
		map.put(23,"Jordan");
		map.put(1,"Cam");
		map.put(18,"Chalet");
		map.put(22,"Carlen");
		map.put(40,"Kourtney");
		
		//Check if it is empty or not
		if (map.isEmpty()){
			System.out.println("Array List is empty.");
		} else {
			System.out.println("Array List size: "+ map.size());
		}
		
		//Iterate HashMap data
		@SuppressWarnings("rawtypes")
		Set set = map.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: "+ mentry.getKey() +" Name is: ");
			System.out.println(mentry.getValue());
		}
		
		//Unsorted HashMap//
		System.out.println("Hashmap before sorting");
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries){
			System.out.println("Key is: " + entry.getKey() +" Name is: "  + entry.getValue());
		}
		
		
		//Sorted HashMap using treemap
		System.out.println("Hashmap after sorting");
		TreeMap<Integer, String> sorted = new TreeMap<>(map);
		Set<Entry<Integer, String>> mappings = sorted.entrySet();
		
		for(Entry<Integer, String> mapping : mappings){
			System.out.println("Key is: "+ mapping.getKey() + " Name is: " + mapping.getValue());
		}
				
		
	}
}