package librerycollection;

import java.util.Scanner;


public class Mainli {

	public static void main(String[] args) {
		Scanner se= new Scanner(System.in);
		System.out.println("please enter the number of details want to make");
		int num= se.nextInt();
		Books[] details= new Books[num];
		for(int i=0;i<details.length;i++)
		{
			Books bs= new Books();
			System.out.println("please enter the id");
			int id= se.nextInt();
			bs.setId(id);
			System.out.println("please enter the bookname");
			String name= se.next();
			bs.setBookname(name);
			System.out.println("please enter the price");
			int price= se.nextInt();
			bs.setPrice(price);
			
			Author author= new Author();
			
			System.out.println("please enter the authorname");
			String authname= se.next();
			author.setAuhtorname(name);
			System.out.println("please enter the emailid");
			String emailid= se.next();
			author.setEmailid(emailid);
			System.out.println("please enter the place");
			String place= se.next();
			author.setPlace(place);
			System.out.println("please enter the date of release");
			int date= se.nextInt();
			author.setDate(date);
			
			bs.setAuthor(author);
			
			details[i]= bs;
			
			System.out.println(bs.getId()+bs.getBookname()+bs.getAuthor()+bs.getPrice());
			//System.out.println(details);
		}
		for (Books sa:details)
		{
			System.out.println("the details are" +sa);
		}

		// TODO Auto-generated method stub

	}

}
