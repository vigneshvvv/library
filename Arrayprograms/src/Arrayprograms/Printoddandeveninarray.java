package Arrayprograms;

public class Printoddandeveninarray {

	public static void main(String[] args) {
		// This program is to print the odd and even number in array
		
		int[] arr= new int[] {1,5,3,6,8};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		// This is to print the odd number
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
