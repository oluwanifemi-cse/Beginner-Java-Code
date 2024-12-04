//written by Oluwanifemi Maiorano

package homeworkAssignments;

import java.util.Scanner;

public class Homework04 {

	public static final double PI = 3.14;

	public static void main(String[] args) {

		// area of a circle is pi(r^2)

		int uniqueRadiiCounter = 0;

		Scanner key = new Scanner(System.in);

		boolean validAmount = false;

		int numberOfCircles;

		do { // ask the user how many they circles they want to sort, if the answer is
				// anything but a number greater than 0, it will continue to ask the user for a
				// valid input.

			System.out.println("How many circles do you want to store?");

			numberOfCircles = key.nextInt();

			if (numberOfCircles < 0)

			{

				System.out.println("Invalid amount entered. Please try again and enter a valid amount.");

				System.out.println();
			}

			else if (numberOfCircles == 0) {

				System.out.println("Cannot sort an empty list. Please try again and enter a valid amount.");

				System.out.println();
			}

			else if (numberOfCircles > 0)

			{
				validAmount = true;
			}

		} while (validAmount == false); // this do-while loop will continue until the user enters a number that is
										// greater than 0

		double[] CirclesArray = new double[numberOfCircles];

		// ^ name of Array ^ size of Array

		for (int i = 0; i < CirclesArray.length; i++)

		// do not make condition "i <= CirclesArray.length" because then the CircleArray
		// will attempt
		// to store a value at an index that is out of its range

		{

			System.out.println("Enter the radius of the circle at index " + i + ": ");

			double radius = key.nextDouble();

			double radiusCalculations = PI * (radius * radius);

			CirclesArray[i] = radiusCalculations;

		}

		System.out.println();

		System.out.println(
				"Do you want your list sorted from smallest -> largest(1), or largest -> smallest(2)? (Enter a number)");

		int userResponse = key.nextInt();

		if (userResponse == 1) // smallest -> largest

		{

			for (int i = 0; i < CirclesArray.length; i++)

			{
				int minIndex = i;
				// THIS IS THE INDEX WITH THE SMALLEST VALUE

				double smallestRadius = CirclesArray[i];

				// this will then set the radius of whatever circle that is at index (0), to
				// being the smallest Radius in the list.

				for (int j = i + 1; j < CirclesArray.length; j++)

				// j = i + 1 because if it were simply j = i, this loop would then attempt to
				// sort a piece of the list that has already been sorted, the beginning. for
				// example:
				// i = 1, j = i, now it will check sort for 1, when 1 was already sorted for in
				// the beginning.

				{

					if (CirclesArray[j] < smallestRadius)

					{

						smallestRadius = CirclesArray[j];

						minIndex = j;

						// if the circle radius at (j) index is smaller than the smallestRadius given,
						// then the smallestRadius will then be set to whatever the value at
						// CirclesArray[j] is,
						// and the minIndex will now be set to j, since j represents the index of the
						// array

					}

				}

				if (CirclesArray[i] > smallestRadius)

				{

					double temp = CirclesArray[i];

					CirclesArray[i] = CirclesArray[minIndex]; // this value of the circle at the [i] index will now
					// be swapped with the minIndex

					CirclesArray[minIndex] = temp;

					// this is swapping the indexes, you want to do this so that the smallestRadius
					// reported is now in the very front, in other words, its sorted to the front

				}

			}



			System.out.println();

			System.out.println("List of area of circles provided (duplicates not included)");

			System.out.println();

			double[] uniqueValuesArray = new double[numberOfCircles]; // checking for duplicates in original array by
																		// counting there occurances
			int[] count = new int[CirclesArray.length];

			for (int i = 0; i < CirclesArray.length; i++) {

				if (count[i] == 0) {

					int occurrences = 1;

					for (int j = i + 1; j < CirclesArray.length; j++) {

						if (CirclesArray[i] == CirclesArray[j]) { // let CirclesArray[1] be 3 and j 3. If 3 = 3, then
																	// set
																	// add +1 to the count of this value at [i] index.

							occurrences++;

							count[j] = -1; // so that when we print these values, if the value is anything but (-1) )
											// then it will print

						}

						// now collect and store the unique values
					}

					if (occurrences == 1) { // if the value has only occurred once, then add the value.

						uniqueValuesArray[uniqueRadiiCounter] = CirclesArray[i];

						uniqueRadiiCounter++;

					}
				}

			}

//print the values		
			for (int i = 0; i < uniqueRadiiCounter; i++) {
				System.out.print(uniqueValuesArray[i] + " ");
			}
			
			System.out.println("");
			
			System.out.println("System Sorting Over. Exiting Program");
		}

		if (userResponse == 2) // largest -> smallest

		{

			for (int i = 0; i < CirclesArray.length; i++)

			{
				int maxIndex = i;

				double largestRadius = CirclesArray[i];

				for (int j = i + 1; j < CirclesArray.length; j++)

				{

					if (CirclesArray[j] > largestRadius) {

						largestRadius = CirclesArray[j];

						maxIndex = j;

					}

					if (CirclesArray[i] < largestRadius) // if the value at index [i] is less than the largestRadius,
															// then swap their positions, since it is largest to
															// smallest.

					{

						double temp = CirclesArray[i];

						CirclesArray[i] = CirclesArray[maxIndex]; // this will swap the value of the index [i] with the
																	// value of the maxIndex recorded.

						CirclesArray[maxIndex] = temp; // the value at [maxIndex] is now swapped with whatever the value
														// of CirclesArray[i] was.

					}

				} // exit j loop

			} // exit i loop

			// this is to check for duplicates, if the original list has a duplicate, this
			// code will help to eradicate that problem.

			double[] uniqueValuesArray = new double[numberOfCircles]; // checking for duplicates in original array

			// counting there occurances

			int[] count = new int[CirclesArray.length];

			for (int i = 0; i < CirclesArray.length; i++) {

				if (count[i] == 0) {

					int occurrences = 1;

					for (int j = i + 1; j < CirclesArray.length; j++) {

						if (CirclesArray[i] == CirclesArray[j]) { // let CirclesArray[1] be 3 and j 3. If 3 = 3, then
							// set
							// add +1 to the count of this value at [i] index.

							occurrences++;

							count[j] = -1; // so that when we print these values, if the value is anything but (-1) )
											// then it will print

						}

						// now collect and store the unique values
					}

					if (occurrences == 1) { // if the value has only occurred once, then add the value.

						uniqueValuesArray[uniqueRadiiCounter] = CirclesArray[i];

						uniqueRadiiCounter++;

					}
				}

			}
			
			
			System.out.println();

			System.out.println("List of area of circles provided (duplicates not included)");

			System.out.println();

			// print the values
			for (int i = 0; i < uniqueRadiiCounter; i++) {
				System.out.print(uniqueValuesArray[i] + " ");
			}
			
			System.out.println();
			
			System.out.println("System Sorting Over. Exiting Program");

			// end of largest -> smallest condition
		}  

		else if (userResponse != 1 && userResponse != 2) // if the user types something that is not
															// equal to 1, AND it is not equal to 2,
															// invalid number

		{
			System.out.println();

			System.out.println("Invalid number entered. Please pick between options (1,2). Exiting Program.");

			System.exit(0);

		}

	}

}