package aisd_2;

public class Main {
		
	public static void main(String[] args){
	
	Firm.addEmployee("Jan", "Kowalski", 'Z', 6);
	Firm.addEmployee("Tomasz", "Czubocha", 'Z');
	Firm.addEmployee("Ludek", "Android", 'Q', 8);
	Firm.addEmployee("Maciej", "Woüniak", 'E', 10);
	Firm.addEmployee("Robert", "Nowak", 'R', 12);
	Firm.addEmployee("Tadeusz", "Matejko", 'F', 14);
	Firm.addEmployee("Aneta", "Kozak", 'J', 16);
	
	System.out.println(Firm.getEmployees());
	
	System.out.println();
	
	GroupIterator it = new GroupIterator();
	while(it.hasNext())
		System.out.println(it.next());
	
	System.out.println();
	
	FibonacciIterator fib = new FibonacciIterator(10);
	while(fib.hasNext())
		System.out.print(" " + fib.next());
	
	System.out.println();
	System.out.println();
	
	SectionIterator sit = new SectionIterator();
	while(sit.hasNext())
		System.out.println(sit.next());
	
	System.out.println();

	PairIterator pit = new PairIterator();
	while(pit.hasNext())
		System.out.println(pit.next());
	
	}
}
