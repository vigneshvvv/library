package Arrayprograms;

public class Smallestinarray {

	public static void main(String[] args) {
		// This progam is used to print the smallest element in the array
		
		int[] arr= new int[] {12,20,50,60};
		
		int min= arr[0];
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(+min);

	}

}
