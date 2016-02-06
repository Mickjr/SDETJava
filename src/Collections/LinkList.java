package Collections;

import java.util.LinkedList;

public class LinkList {
	
	public int value;
	public String name;
	
	public static void main(String[] args) {
		LinkedList<LinkList> list = new LinkedList<LinkList>();
		list.add(new LinkList(1,"Yekcim"));
		list.add(new LinkList(2, "Carlen"));
		list.add(new LinkList(3, "Karen"));
		
		for(LinkList a : list)
		{
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
		LinkList other = (LinkList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkList [value=" + value + ", name=" + name + "]";
	}

	public LinkList(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

}
