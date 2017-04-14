package aisd_2;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

	private int _n;
	private int _i;
	private int suma = 0;
	
	public FibonacciIterator(int n){
		_n = n;
	}
 
	int fibonacciIter(int n) {
		int a = 0; 
		int b = 1;
		int wynik = 0;
		if (n < 2) return n; 
			for(int i = 2; i <= n; i++){
				wynik = a + b;
				a = b;
				b = wynik;
				suma+=wynik;
			}
		return suma;
	}
	
	private int fibonacci(int n){
		return n>1 ? fibonacci(n-1)+fibonacci(n-2) : n;
	}
	
	private int sumafibonacci(int n){
		suma += fibonacci(_i++);
		return suma;
	}
	
	public Iterator<Integer> iterator(int n){
		return new FibonacciIterator(n);
	}
	
	public boolean hasNext(){
		return _i < _n;
	}
	
	public Integer next(){
		if(hasNext())	
			return sumafibonacci(_i);
		return null;
	}
}