package Arrayprograms;

public class Printevenpositioninarray {

	public static void main(String[] args) {
		// This method is used to print even position in array
		
		int[] arr= new int[] {1,2,3,4,5,6,7,8};
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
