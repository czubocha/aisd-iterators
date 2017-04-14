package aisd_2;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class GroupIterator implements Iterator<Group> {

	Set<Group> set = new TreeSet<Group>(Firm.getEmployees().values());
	Iterator<Group> it = set.iterator();

	
	public boolean hasNext() {
		return it.hasNext();
	}

	public Group next() {
		return it.next();
	}

}
