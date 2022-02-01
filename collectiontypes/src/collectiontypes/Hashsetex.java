package collectiontypes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetex {

	public static void main(String[] args) {
		// This is hashset example where addition of duplicate elements is not allowed and no ordeer is maintained
		
		Set<String> se= new HashSet<String>();
		
		se.add("This");
		se.add("is");
		se.add("hasset");
		se.add("program");
		
		Iterator<String> itr= se.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//at the runtime you cansee it will not print in the same order as printed

	}

}
