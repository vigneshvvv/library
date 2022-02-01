package collectiontypes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkeshashsetex {

	public static void main(String[] args) {
		// This is linkedhashset program where the output will be displayed as the order we have inserted
		
		Set<String> ls= new LinkedHashSet<String>();
		
		ls.add("this");
		ls.add("is");
		ls.add("linked");
		ls.add("hashset");
		ls.add("program");
		
		Iterator<String> itr= ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
