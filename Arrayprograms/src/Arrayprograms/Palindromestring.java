package Arrayprograms;

public class Palindromestring {
	public static void main(String[] args)
	{
		String str= "Radar";
		String revstr="";
		
		int strleng= str.length();
		
		for(int i=(strleng-1); i>=0; --i)
		{
			revstr=revstr+ str.charAt(i);
		}
		
		if(str.toLowerCase().equals(revstr.toLowerCase()))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("the string is not palindrome");
		}
	}

}
