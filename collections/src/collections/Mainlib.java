package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mainlib {
	
	
	Scanner se= new Scanner(System.in);
	
	Map<Integer,Bookdetails> booklis= new HashMap<Integer,Bookdetails>();
	
	public void insert()
	{
		while(true)
		{
			Bookdetails bd= new Bookdetails();
			
			System.out.println("please enter the bookname");
			String bookna= se.next();
			bd.setBookname(bookna);
			
			System.out.println("please enter the date");
			int date= se.nextInt();
			bd.setDate(date);
			
			System.out.println("please enter the id");
			int id = se.nextInt();
			bd.setId(id);
			
			System.out.println("please enter  the price");
			int price= se.nextInt();
			bd.setPrice(price);
			
			Author au= new Author();
			
			System.out.println("please enter the authorname");
			String authorname= se.next();
			au.setAuthorname(authorname);
			
			System.out.println("please enter the address");
			String address= se.next();
			au.setAddress(address);
			
			System.out.println("please enter the mobno");
			int mobno =se.nextInt();
			au.setMobno(mobno);
			bd.setAuthor(au);
			
			booklis.put(id,bd);
			
			System.out.println("do you want to continue y/n");
			String stat= se.next();
			
			if(!stat.equalsIgnoreCase("y"))
			{
				break;
			}
			
			//System.out.println(booklis.toString());
		}
		System.out.println(booklis.toString());
	}
	
	
	public void update()
	{
		System.out.println("please enter the bookid to be updated");
		int idup= se.nextInt();
		Bookdetails upd = booklis.get(idup);
		
		System.out.println("the informations in id"+upd);
		
		String newval= se.next();
		
		switch(newval) {
		case "bookname":
			System.out.println("please enter the bookname");
			String bn= se.next();
			upd.setBookname(bn);
			break;
			
		case "date":
			System.out.println("please enter the date");
			int da= se.nextInt();
			upd.setDate(da);
			break;
			
		case "price":
			System.out.println("please enter the price");
			int pr= se.nextInt();
			upd.setPrice(pr);
			break;
		}
		
		System.out.println(upd.toString());
	}

	public static void main(String[] args) {
		
		Mainlib ml= new Mainlib();
		ml.insert();
		ml.update();
		
		
		
		// TODO Auto-generated method stub

	}

}
