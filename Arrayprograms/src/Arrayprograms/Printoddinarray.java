package Arrayprograms;

public class Printoddinarray {

	public static void main(String[] args) {
		// This program is to print the even position in the array
		
		int[] arr = new int [] {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
