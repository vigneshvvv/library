package Arrayprograms;

public class Vowelscount {

	public static void main(String[] args) {
		// This program is to print number of vowels in the string
		
		String str= "radarssene";
		long vowels;
		long countd;
		long counts;
		long counte;
		
		str= str.toLowerCase();
		
		vowels= str.chars().filter(ch -> (ch == 'a')).count();
		
		System.out.println(+vowels);
		
		countd= str.chars().filter(ch -> (ch == 'd')).count();
		System.out.println(+countd);
		
		counts= str.chars().filter(ch -> (ch == 's')).count();
		System.out.println(+counts);
		

	}

}
