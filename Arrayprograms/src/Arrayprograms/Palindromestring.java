package Arrayprograms;

public class Palindromestring {
	public static void main(String[] args)
	{
		String str= "RadaR";
		String revstr="";
		
		int strlen= str.length();
		
		for(int i=(strlen-1);i>=0;--i)
		{
			revstr=revstr+ str.charAt(i);
		}
		
		if(str.toLowerCase().equals(revstr.toLowerCase()))
		{
			System.out.println("the name is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
		

		
		
	}	
}
