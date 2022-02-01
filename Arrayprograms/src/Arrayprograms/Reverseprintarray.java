package Arrayprograms;

public class Reverseprintarray {

	public static void main(String[] args) {
		// This program is to print array in reverse order
		
		int[] arr= new int[] {1,2,6,8,9,5};
		System.out.println("the original array is");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("the reverse order of the array is");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
				
	}			

}
