package Arrayprograms;

public class Reversestr {

	public static void main(String[] args) {
		
		String str="Radar";
		
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
		
//		int strlength= str.length();
//		
//		for(int i=(strlength-1);i<=0; --i)
//		{
//			revstr=revstr+str.charAt(i);
//			System.out.println(revstr.toString());
//		}
		
		
		

	}

}
