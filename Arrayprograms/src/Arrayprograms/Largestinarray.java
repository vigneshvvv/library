package Arrayprograms;

public class Largestinarray {

	public static void main(String[] args) {
		// This program is to find the largest element present in the array
		
		int[] arr = new int[] {20,40,50,22,88};
		
		int max= arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(+max);

	}

}
