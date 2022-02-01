package collectiontypes;

import java.util.Iterator;
import java.util.Stack;

public class Stackcollectionex {

	public static void main(String[] args) {
		// This program is to explain the stack method used in the collections
		//stack follows last in and first out method 
		
		Stack<String> s= new Stack<String>();
		
		s.push("stack");
		s.push("project");
		s.push("works");
		s.push("like");
		s.push("this");
		
		Iterator<String> itr= s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}

	}

}
