package Arrayprograms;

public class Copyonearray {

	public static void main(String[] args) {
		// copying one array into another
		
		int[] array1= new int[] {4,5,20,5,6};
		
		int array2[] = new int[array1.length];
		
		for(int i=0; i<array1.length;i++)
		{
			array2[i] = array1[i];
		}
		
		System.out.println("the original array element is");
		
		for(int i=0; i<array1.length;i++)
		{
			System.out.print(array1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]+ " ");
		}

	}

}
