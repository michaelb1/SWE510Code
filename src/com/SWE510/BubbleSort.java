package com.SWE510;

import java.security.SecureRandom;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mb on 11/9/15.
 */
public class BubbleSort
	{
	public static void main(String[] args)
			{
			//create a 100 element array
			int[] testData = new int[50]; // create array
			SecureRandom numbergen = new SecureRandom();

			// fill array with 100 random numbers
			for (int i = 0; i < testData.length; i++)
			{
				testData[i] = 1 + numbergen.nextInt(50);
			}

			// display array
			System.out.printf("Non-sorted data:%n");
			//BubbleSort.printArray(testData);
			printArray(testData);

			//}

			BubbleSortTest mySort = new BubbleSortTest(testData);

			System.out.printf("Bubble sorted array: %n");

			printArray(testData);
			System.out.println(mySort);

			}
	public static void printArray(int[] data)
		{
		int last = data.length;

		for (int b=1; b<=last; b++)
		{
			if (b % 10 != 0){
				System.out.print(data[b-1]+",");
			}
			else{
				System.out.println(data[b-1]);
			}
		}
		System.out.println();

		}

	}
