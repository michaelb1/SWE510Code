package com.SWE510;

/**
 * Created by Michael Brashier G00520016 on 9/19/15.
 * SWE 510 HW3
 * you may use output statements that print a single asterisk (*), a single space
 * or a single new line character. Maximize your use of repetition(with nested for statements),
 * and minimize the number of output statements
 */

public class Diamond
	{
	//put instance variables here
	String aster = "*";
	String space = " ";
	Integer spaceIncrement = 3;
	Integer asterIncrement = 9;

	/**
	 * method to create a diamond pattern of asterisks. Maker() generates a diamond pattern my splitting
	 * the task into 2 loops, each containing 2 nested loops.
	 * The first main loop generates each of the 1st five rows of the diamond pattern.
	 * It uses nested loops to print an decreasing number of spaces (4,3,2,1,0) and an
	 * increasing number of asterisks (1,3,5,7,9) to each row.
	 * @return
	 */
	public String Maker()
		{
		/**Loop 1  row 1-5
		 * goes through 2 nested loops 5 times.
		 */
		for (int counter = 1; counter <= 5; counter++)
		{
			/**first nested loop prints spaces for rows 1-5 using
			 * spaceIncrement instance variable to
			 * set the starting point for the loop counter.
			 * The loop runs 4 times printing 1 less space each loop.
			 */
			for (int i = spaceIncrement; i >= 0; i--)
			{

				System.out.print(space);
			}

			spaceIncrement--;

			/**Second nested loop prints *'s for rows 1-5 using
			 * asterIncrement instance variable to
			 * set the starting point for the loop counter.
			 * The loop runs 5 times printing +2 asterisks each loop.
			 */
			for (int x = asterIncrement; x <= 9; x++)
			{
				System.out.print(aster);
			}

			asterIncrement -= 2;
			//}
			System.out.print("\n");

		}


		/**
		Set instance variables for 2nd loop.
		 */
		spaceIncrement = 4;
		asterIncrement = 1;

		/**Loop 2  row 6-9
		 * goes through 2 nested loops 4 times.
		 */
		for (int counter = 1; counter <= 4; counter++)
		{
			/**1st nested loop of 2nd main loop prints spaces for rows 6-9 using
			 * spaceIncrement instance variable to
			 * dset the starting point for the loop counter.
			 * This loop is skipped the first time.
			 * The loop runs 4 times printing +1 space each loop.
			 */
			for (int i = spaceIncrement; i <= 4; i++)
				{
					//System.out.printf("2");
					System.out.print(space);
				}

			spaceIncrement--;

			/**Second nested loop prints *'s for rows 6-9 using
			 * asterIncrement instance variable to
			 * set the starting point for the loop counter.
			 * The loop runs 5 times printing -2 asterisks each loop.
			 */
			for (int x = asterIncrement; x <= 7; x++)
				{
					//System.out.print("3");
					System.out.print(aster);
				}

			asterIncrement+=2;

			System.out.print("\n");

		}

		return null;
		}
	}


