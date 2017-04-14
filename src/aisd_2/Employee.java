package aisd_2;

public class Employee {
	private final String _name, _surname;
	
	Employee (String name, String surname) {
		_name = name;
		_surname = surname;
	}
	
	public String toString(){
		return _name+" "+_surname;
	}
	
}
