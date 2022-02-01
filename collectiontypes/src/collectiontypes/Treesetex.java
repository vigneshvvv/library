package collectiontypes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treesetex {

	public static void main(String[] args) {
		// Treeset method follows the natural order and arrange the input given in ordered manner
		//if the input is string it will order according to the alphebetical order
		
		Set<String> ts= new TreeSet<String>();
		ts.add("this");
		ts.add("is");
		ts.add("treeset");
		ts.add("program");
		
		Iterator<String> itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		Set<Integer> ti= new TreeSet<Integer>();
		ti.add(20);
		ti.add(10);
		ti.add(5);
		ti.add(1);
		ti.add(15);
		
		Iterator<Integer> it= ti.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
