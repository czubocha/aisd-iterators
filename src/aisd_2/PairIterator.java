package aisd_2;

import java.util.Iterator;

public class PairIterator implements Iterator<Pair<Integer, Object>> {
	
	GroupIterator it  = new GroupIterator();
	FibonacciIterator fib = new FibonacciIterator(Firm.getEmployees().values().size());
	
	public boolean hasNext(){
		return it.hasNext();
	}
	
	public Pair<Integer, Object> next(){
		return new Pair<Integer, Object>(fib.next(), it.next());
	}
	
}
