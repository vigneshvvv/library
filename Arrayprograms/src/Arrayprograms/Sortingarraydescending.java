package Arrayprograms;

public class Sortingarraydescending {

	public static void main(String[] args) {
		// This program is to print the elements in the descending order
		
		int[] arr= new int[] {5,2,3,1,8,6};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp= arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
