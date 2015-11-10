package com.SWE510;

import java.util.*;

/**
 * Created by mb on 11/4/15. 16.19 This class takes an integer value greater than 1
 * passed in from user input and determines whether it’s prime. If the number is not prime, it displays its
 * unique prime
 * factors.
 *
 */



public class PrimeFactors
	{
	private int n;
	private boolean isPrime = false;

//constructor
	public PrimeFactors(int n)
		{
		this.n = n;
		}
	// factorList will number passed in and find its factors by
	//going through a loop and  mod'ing N by every number between 2 and N. Not the most
	// efficient but it will work.
	// if Mod = 0 it will add that number to the List.
	// The convert the list to a Hash set to get rid of all the duplicates.
	//Find the square root of N by mod'ing the cut paste code below.'
	//if n isPrime() call this method TO list its factors.

	//precondition: this method requires an integer greater than 0 in the n value as initiated
	//by the constructor
	boolean isItPrime(int p)
		{
			for(int i = 2; 2 * i <= p; i++)

			{
				if(p%i==0)
				{
					//this.isPrime = false;
					return false;
				}
			}
		//this.isPrime = true;
		return true;

		}
	//post condition: this method will set a boolean value based on integer n value


//precondition: this method requires an integer greater than 0 in the n value as initiated
	//by the constructor
	public Set<Integer> factorList()
		{
		//create new list factorList
		LinkedList<Integer> factorsList = new LinkedList<>();

		//// make this divide n by every number up to

			for (int i = 2; i < n; i++)
			{

				if (n % i == 0 && isItPrime(i))
				{
						factorsList.add(i);

					}

			}

		//pass factorList in  'factors' Set
		Set<Integer> set = new HashSet<>(factorsList);
		return set;
		}

	@Override
	public String toString()
		{

		if (isItPrime(n))
		{
			return n + " is Prime.";
		}
		else
		{
			return n + " is not prime.\nPrime factors of " + n + " are: " + factorList();

		}

	}


	}
