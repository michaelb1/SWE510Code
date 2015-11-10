package com.SWE510;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mb on 11/4/15. 16.19 This class asks the user to input an integer value tells the user if it is prime.
 * If the number is not prime it displays the numbers unique prime factors.
 *
 */
public class PrimeTest
	{

	public static void main (String[] args)
		{

		//call constructor for new object of PrimeFactors

		Scanner scanner = new Scanner(System.in);

		boolean loopIt = true;
		do {
			System.out.println("Enter a number:");
			try {
				int n = scanner.nextInt();
				PrimeFactors p = new PrimeFactors(n);
				//call implicit toString on object
				System.out.println(p);
				loopIt = false;
				//p.factorList();
			}
			catch (InputMismatchException e) {
				System.out.println("Error. Enter an integer number.");
				scanner.next();
			}
		}
			while (loopIt);


		}

}
