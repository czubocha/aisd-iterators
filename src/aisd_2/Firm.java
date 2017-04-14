package aisd_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Firm {

	private static Map<Pair<Integer, Object>, Group> employees = new HashMap<Pair<Integer, Object>, Group>();	
	
	static Integer counter = 1;
	
	static int getCounter(){
		return counter;
	}
	
	public static Map<Pair<Integer, Object>, Group> getEmployees() {
		return employees;
	}
	
	static void addEmployee(String name, String surname, char groupName){
		if (findGroup(groupName)!=null)
			getEmployees().put(new Pair<Integer, Object>(new Employee(name, surname)), findGroup(groupName));
		else System.out.println("There is no such group!");
	}
	
	static void addEmployee(String name, String surname, char groupName, int workingHours){
		if (findGroup(groupName) == null)
			getEmployees().put(new Pair<Integer, Object>(new Employee(name, surname)), new Group(groupName, workingHours));
		else System.out.println("The group already exists!");
	}
	
	static Group findGroup(char name){
		for (Group x : employees.values())
			if (x.get_name() == name) return x;
		return null;
	}
	
	static void showGroups(){
		Iterator<Group> it = employees.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	

	static void test(){
	double tab[] = new double[20];
    tab[1]=1;
    tab[0]=1;
    for (int i=2; i<20; i++)
        tab[i]=tab[i-2]+tab[i-1];
    
    for (int i=0; i<20; i++)  
        System.out.println(i+1 + " liczba = " + tab[i]); 
	}
}
