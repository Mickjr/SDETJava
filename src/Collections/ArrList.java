package Collections;

import java.util.ArrayList;

public class ArrList {
	
	public int value;
	public String name;

	public static void main(String[] args) {
		
		//Create an Arraylist of objects
		ArrayList<ArrList> list = new ArrayList<ArrList>();
		list.add(new ArrList(1,"Yekcim"));
		list.add(new ArrList(2, "Carlen"));
		list.add(new ArrList(3, "Karen"));
		
		//Iterate over each object in the ArrayList
		for (ArrList a : list){
			System.out.println(a);
		}

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ArrList [value=" + value + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrList other = (ArrList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public ArrList(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}
	
	
}
