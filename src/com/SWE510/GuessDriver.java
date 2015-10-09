package com.SWE510;
//Michael Brashier
//SWE 510 HW4
//Sept 27, 2015
/**This class is a "guess the number game". It asks the user to guess a number between 1-1000 and compares their guess
 * to a randomly generated number. If the guess is incorrect the program displays too high try again or too low try
 * again to help the player zero in on the number. The user is informed when they guess correctly.
 * Created by mb on 9/27/15.
 */
import java.util.Scanner;

public class GuessDriver
	{
	public static void main(String[] args)
		{
//new scanner object
		Scanner userInput = new Scanner(System.in);

//used for loop control and to hold value to send to numCompare method
		int guess;

		//new Guess object to access Guess class methods and instance variables.
		Guess guessGame = new Guess();

		//ask for user's guess);
		System.out.println("Guess a number between 1 and 1000.");

		//start a loop to store user's guess, check value to see if they want to quit, if not pass it
		// in to the numCompare() method
		do {
			guess = userInput.nextInt();

			if (guess == -1) {
				System.out.println("Goodbye.");
			}
			else {
				guessGame.numCompare(guess);
			}
		}
		while (guess != -1);
		}
	}







