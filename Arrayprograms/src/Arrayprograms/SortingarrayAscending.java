package Arrayprograms;

public class SortingarrayAscending {

	public static void main(String[] args) {
		// This method is to arrange the elements of array in ascending order
		
		int[] arr= new int[] {1,5,2,36,4,6};
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
		
		System.out.println("the ascending orderd array is");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}
		
		

	}

}
