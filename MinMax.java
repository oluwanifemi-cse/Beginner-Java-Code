package def;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");

		int size = key.nextInt();

		// array creation

		int[] myArray = new int[size];

		for (int i = 0; i < myArray.length; i++) {

			System.out.println("Enter the value of the array at index " + i + ": ");

			myArray[i] = key.nextInt();

		}

		double sum = 0;

		int min = myArray[0];

		int max = myArray[0];

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] < min) {

				min = myArray[i];

			}

			if (myArray[i] > max) {

				max = myArray[i];

			}

			sum += myArray[i]; // sum = sum + myArray[i] (value of MyArray at index(i);

		}

		double average = sum / size; // to find the average of a list group of numbers, you take all numbers, add
										// them up, then divide them by size

		System.out.println();
		
		
		System.out.println("Minimum value = " +min +"\nMaximum value = " +max+ "\nAverage = " +average);
		
		
	}

}
