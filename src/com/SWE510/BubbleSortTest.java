package com.SWE510;

import java.security.SecureRandom;

/**
 * Created by mb on 11/9/15. This class tests the BubbleSort object by generating an array of random numbers
 * and creating a BubbleSort object to send the random array to.
 * Some information about the array and bubble sort is calucalted and returned to the user.
 */
public class BubbleSortTest
	{
	public static void main(String[] args)
		{
		//create a 100 element array
		int[] testData = new int[50]; // create array
		SecureRandom numbergen = new SecureRandom();
		int length = testData.length;


		// fill array with 100 random numbers
		for (int i = 0; i < testData.length; i++)
		{
			testData[i] = 1 + numbergen.nextInt(50);
		}

		// display random unsorted array
		System.out.printf(length + " index array of random unsorted numbers:%n");

		BubbleSort.printArray(testData);

		//creat new BubbleSort object and pass in the unsorted random array
		BubbleSort mySort = new BubbleSort(testData);

		System.out.printf("The same array bubble-sorted: %n");
		BubbleSort.printArray(testData);

		//Print out some stats about the bubble array instance that just ran
		System.out.println("Array length: " + mySort.getLast());
		System.out.println("Outer loop: " + mySort.getOutercount() + " times.");
		System.out.println("Inner loop: " + mySort.getInnercount() + " times.");
		System.out.println(("Number of times index values swapped:" + mySort.getSwapcount()));
		System.out.println("Total loops:" + mySort.getOutercount()*mySort.getInnercount()+ "\n");

		//call toString on object
		System.out.println(mySort);

		}

	}
