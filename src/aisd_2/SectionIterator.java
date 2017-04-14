package aisd_2;

import java.util.Iterator;
import java.io.File;

public class SectionIterator implements Iterator<String> {
	
	private static int i = 0;
	
	File directory = new File("oddzia³y");
	File[] files = directory.listFiles();
	
	public boolean hasNext() {
		if (i<files.length)
			return true;
		return false;
	}

	public String next() {
		return files[i].getName().substring(0, files[i++].getName().lastIndexOf('.'));
	}
}
