package com.SWE510;

/**
 * Created by mb on 11/12/15.  This class takes in an array of integers
 * and bubble sorts it.
 */
public class BubbleSort
	{
	private int swapcount = 0;
	private int innercount = 0;
	private int outercount = 0;
	private int last = 0;

	public BubbleSort(int[] data)
		{
		last = data.length;

		int temp;

//start of bubble sorting.
		for (int a = 0; a < last; a++) {
			//start at first Array index, end at last index of array
			for (int b = 1; b < (last - a); b++)

			{ //Compare data[0] & data[1], data[1] & data[2]...
				if (data[b-1] > data[b])
				{
					//swap function
					temp = data[b - 1];
					data[b - 1] = data[b];
					data[b] = temp;
					swapcount++;
				}
				innercount++;
			}
			outercount++;
		}

		}

	@Override
	public String toString()
		{
		return "Bubble sorted arrays are O(n^2) because for every iteration of the outer loop\n" +
				       "the inner loop iterates many times. 99 times on the first outer loop, 97 on the\n" +
				       "second and continues n-2 times for each iteration of the outer loop so the total " +
				       "work is O (n^2).";

		}

	public static void printArray(int[] data)
		{
		int last = data.length;

		for (int b = 1; b <= last; b++)
		{   //add a comma for every 1-9th index and line return for multiple of 10 indices

			if (b % 10 != 0) {
				System.out.print(data[b - 1] + ", ");
			}
			else {
				System.out.println(data[b - 1]);
			}
		}
		System.out.println();

		}


	public int getSwapcount()
		{
		return swapcount;
		}

	public int getInnercount()
		{
		return innercount;
		}

	public int getOutercount()
		{
		return outercount;
		}

	public int getLast()
		{
		return last;
		}



	}
