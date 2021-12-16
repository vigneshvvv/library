package Emp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Details {
	Scanner in=new Scanner(System.in);
	Map <Integer,Employee> empp = new HashMap<Integer,Employee>();

	public void dis()
	{

		while(true)
	
		{
		
			Employee em = new Employee();
			System.out.println("Enter the id of employee");
			int id = in.nextInt();
			em.setEmpid(id);
			System.out.println("Enter the name of employee");
			String name = in.next();
			em.setEmpname(name);
			System.out.println("Enter the designation of employee");
			String desg = in.next();
			em.setDesignation(desg);
			empp.put(id,em);
			System.out.println("Whether we want to continue y/n");
			int status = in.nextInt();
			if (status!=1)
			{
				break;
			}
			System.out.println(empp.toString());
			
			}
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d=new Details();
		d.dis();

	}

}
