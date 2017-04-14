package aisd_2;

public class Group implements Comparable<Group> {
	
	private char _name;
	private int _workingHours;
	
	
	Group (char name, int workingHours) {
		set_name(name);
		set_workingHours(workingHours);
	}
	
	public String toString(){
		return String.valueOf(_name)+", "+String.valueOf(_workingHours)+":00-"+(_workingHours+2)+":00";
	}
	
	public char get_name() {
		return _name;
	}

	public void set_name(char _name) {
		this._name = _name;
	}

	public int get_workingHours() {
		return _workingHours;
	}

	public void set_workingHours(int _workingHours) {
		this._workingHours = _workingHours;
	}
	
	public int compareTo(Group g) {
		return Integer.compare(_workingHours, g._workingHours);
	}
}
