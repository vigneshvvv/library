package collectiontypes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequeueex {

	public static void main(String[] args) {
		// This is arraydequeue in this methods specially we can add numbers at the first and last of the array
		
		Deque<String> ad = new ArrayDeque<String>();
		
		ad.add("is");
		ad.add("arraydeque");
		ad.add("method");
		
		System.out.println(ad);
		
		//to add element in the first
		
		ad.addFirst("this");
		
		//to add in the last of the array
		
		ad.addLast("example");
		
		System.out.println(ad);

	}

}
