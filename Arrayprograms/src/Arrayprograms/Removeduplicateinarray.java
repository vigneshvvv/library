package Arrayprograms;

public class Removeduplicateinarray {

	public static void main(String[] args) {
		// This program is remove the duplicate elements present in the array
		
		int[] arr= new int[] {1,5,3,2,8};
		
		int[]temp= new int[arr.length];
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]= arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = temp[i];
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}

	}

}
