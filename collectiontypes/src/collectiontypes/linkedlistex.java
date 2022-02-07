package collectiontypes;

import java.util.LinkedList;
import java.util.List;

public class linkedlistex {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(20);
		ll.add(50);
		ll.add(10);
		ll.add(90);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
				// TODO Auto-generated method stub
	}

}