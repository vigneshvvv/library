package Arrayprograms;

public class StringPlaindromebuilder {

	public static void main(String[] args) {
		// This program is to check whether the string given is palindrome using stringbuilder
		
		String str= "Radar";
		
		StringBuilder sb= new StringBuilder(str);
		  sb.reverse();
		
		if(str.toLowerCase().equals(sb))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the String is not palindrome");
		}

	}

}
