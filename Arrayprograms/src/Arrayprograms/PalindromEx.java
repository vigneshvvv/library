package Arrayprograms;

public class PalindromEx {

	public static void main(String[] args) {
		
		int r;
		int sum=0;
		int temp;
		int n=454;
		
		 temp=n;
		 
		 while(n>0)
		 {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
		 if(sum==n)
		 {
			 System.out.println("the number is palindrome");
		 }
		 else
		 {
			 System.out.println("the number is not palindrome");
		 }
		
		

	}

}
