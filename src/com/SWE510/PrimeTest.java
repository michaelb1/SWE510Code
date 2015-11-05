package com.SWE510;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mb on 11/4/15. 16.19 (Prime Numbers and Prime Factors) Write a program that takes a whole number
 * input from a user and determines whether it’s prime. If the number is not prime, display its unique prime factors.
 * Remember that a prime number’s factors are only 1 and the prime number itself. Every number that’s not prime has
 * a unique prime factorization. For example, consider the number 54. The prime factors of 54 are 2, 3, 3 and 3.
 * When the values are multiplied together, the result is 54. For the number 54, the prime factors output should
 * be 2 and 3. Use Sets as part of your solution.
 */
public class PrimeTest
	{

	public static void main (String[] args)
		{

	//create a scanner object to get number from the user
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scanner.nextInt();

	//call constructor for new object of PrimeFactors
	PrimeFactors p = new PrimeFactors(n);

	System.out.println(p);
	//p.isItPrime();
	//p.factorList();




		}
}
