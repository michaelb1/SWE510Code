package com.SWE510;

/**
 * Created by Michael Brashier G00520016 on 9/19/15.
 * SWE 510 HW3
 * you may use output statements that print a single asterisk (*), a single space
 * or a single new line character. Maximize your use of repetition(with nested for statements),
 * and minimize the number of output statements
 */
public class DiamondDriver
	{
	public static void main(String[] args)
		{

		//create new object of Diamond class
		Diamond diamondStar = new Diamond();

		//Call Maker method of diamondStar object which will print out asterisks
		// in a  diamond
		// shape
		diamondStar.Maker();

		}
	}
