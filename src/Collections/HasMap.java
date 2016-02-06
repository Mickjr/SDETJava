package Collections;

import java.util.HashMap;

import java.util.Map;

public class HasMap {
		
	public static void main(String[] args) {
		
	Employee e1 = new Employee(1, "Yekcim");
	Employee e2 = new Employee(1, "Carlen");
	Employee e3 = new Employee(1, "Karen");
	
	Map<Employee, String> map= new HashMap<Employee, String>();
	
	map.put(e1, "employee1");
	map.put(e2, "employee2");
	map.put(e3, "employee3");
	
//	for(HasMap a : map)
//	{
//		System.out.println(a);
//	}
	System.out.println(e1);
  }
	
}

class Employee{
	
	int value;
	String name;
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
		Employee other = (Employee) obj;
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
		return "Employee [value=" + value + ", name=" + name + "]";
	}
	public Employee(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}
	
	
}