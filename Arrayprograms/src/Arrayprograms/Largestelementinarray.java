package Arrayprograms;

public class Largestelementinarray {

	public static void main(String[] args) {
		//this program is to find the largest element in array
		
		int[] arr= new int[] {1,5,3,4,9,20};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=temp;
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
			}
		}
		System.out.println(+arr[0]);

	}

}
