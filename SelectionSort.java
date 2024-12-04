package def;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// sort ALWAYS in acsending order ---> smallest to largest

		System.out.println("How many numbers would you like to sort?");

		int size = key.nextInt();

		// create the array (how to do it)

		int[] myArray = new int[size];

		// 0, 1 , 2 , 3
		for(int i = 0; i < myArray.length; i++)
	
		{
			System.out.println("Enter the value of the array at index "+i+": ");
			
			myArray[i] = key.nextInt();
			
		
		}
			//selection sort
		
		for(int i = 0; i < myArray.length; i++)
		{
			int minIndex = i;

			int smallest = myArray[i];
		
		
			for(int j = i+1; j < myArray.length; j++)
			{
				
				if(myArray[j] < smallest)
				
				{
					
					smallest = myArray[j];
					
					minIndex = j;
					
				}
				
			}
				//exxited j loop
			
			if(smallest < myArray[i]) 
			
			{
				
				//temporary variable
				
				int temp = myArray[i];
				
				myArray[i] = myArray[minIndex];
				
				myArray[minIndex] = temp;
				
			}
		
		
		}
		
		//print the contents of the array
		
		for(int i = 0; i < myArray.length; i++)
			
		{
			
			System.out.print(myArray[i] + " ");
			
		}
	
	
	}
	
	

}
