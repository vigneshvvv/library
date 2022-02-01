package Arrayprograms;

public class Findthirdlargeinarray {

	public static void main(String[] args) {
		// This program is to find the third lages number in the array
		
		int [] arr= new int[] {1,2,5,3,6,4};
		int temp=0;
		
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
		System.out.println(+arr[arr.length-3]);

	}

}
