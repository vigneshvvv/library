package Arrayprograms;

public class Secondlargestinarray {

	public static void main(String[] args) {
		// This program is to find the second largest element in the array
		
		int[] arr= new int[] {1,8,6,5,9};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println(+arr[1]);

	}

}
