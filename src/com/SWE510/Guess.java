package com.SWE510;

/**This class compares an integer to a randomly generated number between 1 and 1000.
 * It outputs to the console to inform the user if their guess is too high or too low.
 * You must pass an interger to the  numCompare(int) method to get a result.
 * Created by mb on 9/27/15.
 */
import java.security.SecureRandom;
public class Guess
	{

	//This new SecureRandom object is used to create an integer named 'random' between 1 and 1000
	SecureRandom randomNumGen = new SecureRandom();
	private int random = 1+ randomNumGen.nextInt(1000);


	public Guess()
		{

		}


//this method takes in an int and compares it to a random integer between 1-1000 then outputs feedback to the console
//for the user to guess again or stop the program.

	public void numCompare(int guess)
	{

	if (guess == random)
		{   //if the user guesses correctly, tell them to play again or quit, then make a new random number
			System.out.println("Congratulations. You guessed the number! Play again or enter -1 to quit");
			random = 1+ randomNumGen.nextInt(1000);
		}
	else if (guess > random)
		{
			System.out.println("Too high. Try again.");
		}
	else if (guess < random)
		{
			System.out.println("Too low. Try again.");
		}

	}


	}





