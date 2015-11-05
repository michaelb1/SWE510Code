package com.SWE510;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


/**
 * Created by mb on 11/4/15.
 */

public class PrimeFactors
	{
	private int n;
	private boolean isPrime = false;


	public PrimeFactors(int n)
		{
		this.n = n;
		}
	// factorList will number passed in and find its factors by
	//going through a loop and  mod'ing N by every number between 2 and the square root of N.
	// if Mod = 0 it will add that number to the List.
	// The convert the list to a Hash set to get rid of all the duplicates.

	//Find the square root of N by mod'ing the cut paste code below.'


	//if n isPrime() call this method TO list its factors.
	public boolean isItPrime()
		{
		/*BigInteger bigN = new BigInteger(n);
        // perform isProbablePrime on passed in n with certainty of 1
		isPrime = bigN.isProbablePrime(1);
		*/
		return isPrime;
		}

	public Set<Integer> factorList()
		{
		int sqrt = squareroot(n);
		//create new list factorList
		LinkedList<Integer> factorsList = new LinkedList<>();

		//// make this divide n by every number up to
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) {
				factorsList.add(i);
				isPrime = false;
			}
			i++;
		}
		//pass factorList in  'factors' Set
		Set<Integer> set = new HashSet<>(factorsList);
		System.out.println("Factors of " + n + " are:");

		return set;
		//for (int num : set)
			//System.out.print(num + ",");
		}

	public int squareroot(int s)
		{
		//calc square root of n
		//to calculate square root of  number
		int sqrt = s / 2;
		int xNum;

		do {
			xNum = sqrt;
			sqrt = (xNum + (s / xNum)) / 2;
		}
		while ((xNum - sqrt) != 0);

		return sqrt;
		}

	@Override
	public String toString()
		{
		String num = "The number " + n;

		if (isItPrime())
		{
			return num + " is Prime.";
		}
		else
		{
			return num + " is not prime.\n" + num + " factors are: " + factorList();

		}

	}

	public int getN()
		{
		return n;
		}

	public void setN(int n)
		{
		this.n = n;
		}



}
