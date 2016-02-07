package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMap {
		
	public static void main(String[] args) {
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
		
		//Sort HashMap data
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
		
		
	}
}