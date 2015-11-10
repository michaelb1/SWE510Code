package com.SWE510;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by mb on 11/9/15.
 */
public class BubbleSortTest
	{

	public BubbleSortTest(int[] data)
		{
		int last = data.length;
		int temp;
//start of bubble sorting.
		for(int a = 0; a < last; a++)
		{   //start at first Array index, end at end of array
			for (int b = 1; b < (last - a); b++)
			{//Compare data[0] & data[1], data[1] & data[2]...
				if (data[b - 1] > data[b])
				{
					//swap function
					temp = data[b - 1];
					data[b - 1] = data[b];
					data[b] = temp;
				}
			}
		}

// display array
		//System.out.printf("Bubble sorted array: %s%n%n", Arrays.toString(data));
		}


	//public static void BubbleSortTest(int[] data)


	@Override
	public String toString()
		{
	return 	"Bubble sorted arrays are O(n^2) because the inner loop \n runs though every array index the first time,\n" +
			          " then n-1, n-2, etc. While the outer loop also \nruns thorough every array index, so the total \n" +
			          "work is O(n^2).";

	}


}
/*
					* In bubble sort, we basically traverse the array from first
					* to array_length - 1 position and compare the element with the next one.
					* Element is swapped with the next element if the next element is greater.
					*
					* Bubble sort steps are as follows.
					*
					* 1. Compare array[0] & array[1]
					* 2. If array[0] > array [1] swap it.
					* 3. Compare array[1] & array[2]
					* 4. If array[1] > array[2] swap it.
					* ...
					* 5. Compare array[n-1] & array[n]
					* 6. if [n-1] > array[n] then swap it.
					*
					* After this step we will have largest element at the last index.
					*
					* Repeat the same steps for array[1] to array[n-1]
					*
					*/
