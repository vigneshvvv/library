package Arrayprograms;

public class duplicateinarray {

	public static void main(String[] args) {
		// This program is to find the duplicate elements in the array
		
		int[] arr= new int[] {1,2,3,2,5,4,5,8,9,9};
		System.out.println("the duplicate elements in the array are");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
