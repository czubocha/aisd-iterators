package aisd_2;

public class Pair<Integer, Object> {

	private final Integer _id;
	private final Object _object;
	
	Pair(Integer id, Object object){
		_id = id;
		_object = object;
	}
	
	Pair(Object object){
		_id = (Integer) Firm.counter++;
		_object = object;
	}
	
	public Pair(Integer size, Group group) {
		_id = size;
		_object = (Object)group;
	}

	Integer getKey(){
		return _id;
	}
	
	Object getObject(){
		return _object;
	}
	
	public String toString(){
		return _id+"."+_object;
	}

}
