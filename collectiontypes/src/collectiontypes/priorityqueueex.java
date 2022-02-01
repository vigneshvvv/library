package collectiontypes;

import java.util.PriorityQueue;

public class priorityqueueex {

	public static void main(String[] args) {
		// This method is to explain the priorityqueue in collections
		//the method is to give priority to the elements stores it uses poll,peek method to get elements
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(15);
		
		System.out.println(pq.peek());
		
		//now i am going to remove the priority element fromthe list
		
		System.out.println(pq.poll());
		
		//now after removing i am going to print the priority now
		
		System.out.println(pq.peek());
		

	}

}
