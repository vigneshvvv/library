package Arrayprograms;

public class Sumofelementsinarray {

	public static void main(String[] args) {
		// This program is used to find the sum of all the elements present in the array
		
		int[] arr= new int[] {1,5,3,5,2,25,55,98};
		
		int sum= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println(+sum);

	}

}
